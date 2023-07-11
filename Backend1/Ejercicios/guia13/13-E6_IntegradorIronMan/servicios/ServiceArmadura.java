package servicios;

import constantes.Const;
import entidades.Armadura;
import entidades.ObjetosRadar;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ServiceArmadura {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();

    /*
    Mostrando Estado
        Hacer un método que JARVIS muestre el estado de todos los dispositivos y 
    toda la información de la Armadura.
     */
    public void mostrarEstado(Armadura arma) {
        System.out.println("* ARMADURA *\n"
                + "Color primario: " + arma.getColorPrimario() + "\n"
                + "Color secundario: " + arma.getColorSecundario() + "\n"
                + "Propulsor derecho en buen estado: " + (arma.isPropulsorDer() ? "SI" : "NO") + "\n"
                + "Propulsor izquierdo en buen estado: " + (arma.isPropulsorIzq() ? "SI" : "NO") + "\n"
                + "Repulsor derecho en buen estado: " + (arma.isRepulsorDer() ? "SI" : "NO") + "\n"
                + "Repulsor izquierdo en buen estado: " + (arma.isRepulsorIzq() ? "SI" : "NO") + "\n"
                + "Consola en buen estado: " + (arma.isConsola() ? "SI" : "NO") + "\n"
                + "Sintetizador en buen estado: " + (arma.isSintetizador() ? "SI" : "NO") + "\n"
                + "Bateria: " + arma.getBateria() + "%\n"
                + "Salud: " + arma.getSalud() + "\n"
                + "Resistencia: " + arma.getResistencia() + "\n");
    }

    public boolean acciones(Armadura arma) {
        double energiaGastada = 0;
        int opc, segundos;
        String resp, dispositivo;

        try {
            System.out.println("Accion que deseas realizar:\n"
                    + "1- Caminar\n"
                    + "2- Correr\n"
                    + "3- Propulsarse\n"
                    + "4- Volar\n");
            opc = leer.nextInt();

            System.out.println("Quieres disparar? s/n");
            resp = leer.next();

            System.out.println("Cuantos segundos?");
            segundos = 120;

            switch (opc) {
                case 1:
                    energiaGastada = resp.equalsIgnoreCase("s") ? arma.disparar("caminar", segundos) : arma.caminar(segundos);
                    break;
                case 2:
                    energiaGastada = resp.equalsIgnoreCase("s") ? arma.disparar("correr", segundos) : arma.correr(segundos);
                    break;
                case 3:
                    energiaGastada = resp.equalsIgnoreCase("s") ? arma.disparar("propulsarse", segundos) : arma.propulsarse(segundos);
                    break;
                case 4:
                    energiaGastada = resp.equalsIgnoreCase("s") ? arma.disparar("volar", segundos) : arma.volar(segundos);
                    break;

                default:
                    System.out.println("Error! opcion incorrecta");
            }

        } catch (Exception e) {
            leer.next();
            System.out.println("Ingresa numeros por favor");
        } finally {
            System.out.println(energiaGastada == 0 ? "Error! Dispositivo dañado.\n" : "Energia gastada: " + energiaGastada + ".\n");
        }

        return energiaGastada == 0;
    }

    /*
    Estado de la Batería
        Hacer un método para que JARVIS informe el estado de la batería en porcentaje 
    a través de la consola. Poner como carga máxima del reactor el mayor float 
    posible. Ejecutar varias acciones y mostrar el estado de la misma.
     */
    public void MostrarBateriaEnBarra(double bateria) {
        String[] bat = new String[100];
        System.out.print("0-[");
        for (int i = 0; i < 100; i += 5) {

            if (i < bateria) {
                System.out.print("/");
            } else {
                System.out.print("-");
            }
        }
        System.out.print("]-100. \n");
        System.out.println("");
    }

    public void estadoBateria(Armadura arma) {
        System.out.println("* CONSOLA *\n"
                + "La bateria se encuentra en: " + arma.getBateria() + "%.\n");

        if (arma.getBateria() < 50.0) {
            try {
                System.out.println("Quieres cargar la bateria? s/n");
                if (leer.next().equalsIgnoreCase("s")) {
                    arma.setBateria(Const.BATERIAMAX);
                }
            } catch (Exception e) {
                System.out.println("ERROR! Ingrese bien los datos.");
            }
        }
    }

    /*
        
Reparando Daños
        Hay veces que se puede reparar los daños de un dispositivo, en general es el 
    40% de las veces que se puede hacer. Utilizar la clase Random para modelar este 
    comportamiento. En caso de estar dentro de la probabilidad (es decir probabilidad 
    menor o igual al 40%) marcar el dispositivo como sano. Si no dejarlo dañado.
     */
    public boolean repararDaños(Armadura arma) {
        boolean reparar;
        int acu = 1, opc;
        String msg = "* Dispositivos dañados *\n";
        ArrayList<String> dispositivosMsg = new ArrayList();
        ArrayList<String> dispositivosDañados = new ArrayList();

        dispositivosMsg.add(arma.isPropulsorDer() ? null : "Propulsor derecho");
        dispositivosMsg.add(arma.isPropulsorIzq() ? null : "Propulsor izquierdo");
        dispositivosMsg.add(arma.isRepulsorDer() ? null : "Repulsor derecho");
        dispositivosMsg.add(arma.isRepulsorIzq() ? null : "Repulsor izquierdo");
        dispositivosMsg.add(arma.isConsola() ? null : "Consola");
        dispositivosMsg.add(arma.isSintetizador() ? null : "Sintetizador");

        for (String dispo : dispositivosMsg) {
            if (dispo != null) {
                msg += acu + "- " + dispo + ".\n";
                dispositivosDañados.add(dispo);
                acu++;
            }
        }

        if (acu == 1) {
            msg += "No hay dispositivos para reparar.\n";
            System.out.println(msg);
            return false;
        }

        msg += "Elegi un dispositivo para reparar...";

        reparar = arma.probabilidad(4);

        try {
            System.out.println(msg);
            opc = leer.nextInt();

            switch (dispositivosDañados.get(opc - 1)) {
                case "Propulsor derecho":
                    if (reparar) {
                        arma.setPropulsorDer(true);
                    }
                    break;
                case "Propulsor izquierdo":
                    if (reparar) {
                        arma.setPropulsorIzq(true);
                    }
                    break;
                case "Repulsor derecho":
                    if (reparar) {
                        arma.setRepulsorDer(true);
                    }
                    break;
                case "Repulsor izquierdo":
                    if (reparar) {
                        arma.setRepulsorIzq(true);
                    }
                    break;
                case "Consola":
                    if (reparar) {
                        arma.setConsola(true);
                    }
                    break;
                case "Sintetizador":
                    if (reparar) {
                        arma.setSintetizador(true);
                    }
                    break;
                default:
                    System.out.println("ERROR! Opcion incorrecta.");
            }
        } catch (Exception e) {
            System.out.println("Ingresa numeros por favor.");
        }

        System.out.println(reparar ? "El dispositivo esta reparado. \n" : "Estas mufado, no se reparo. \n");
        return true;

    }

    /*
    Revisando Dispositivos
        Los dispositivos son revisados por JARVIS para ver si se encuentran dañados. 
    En caso de encontrar un dispositivo dañado se debe intentar arreglarlo de manera 
    insistente. Para esos intentos hay un 30% de posibilidades de que el dispositivo 
    quede destruido, pero se deberá intentar arreglarlo hasta que lo repare, o bien 
    hasta que quede destruido.
        Hacer un método llamado revisar dispositivos que efectúe lo anteriormente 
    descrito, el mecanismo insistente debe efectuarlo con un bucle do while.
     */
    
    public static void danioRecibido() throws InterruptedException{
    
        System.out.println(" ___         ___");
        System.out.println(" |x1| Noo!  |1_| Pum!");
        System.out.println(" \\||/*    o--||-/");
        System.out.println("  ||         ||");
        System.out.println("  /|         ||");
        Thread.sleep(500);
        
        System.out.println(" ___         ___");
        System.out.println(" |_1| pium! |1 x| Ahhh!");
        System.out.println("  ||==0---   \\||-/");
        System.out.println("  ||          ||");
        System.out.println("  /|          ||");
        Thread.sleep(500);
    }
    
    public boolean revisarDispositos(Armadura arma) {
        boolean b = false;

        System.out.println("Al utilizar este metodo, puede que tu armadura quede totalmente destruida. \nAun quieres continuar? s/n");
        if (leer.next().equalsIgnoreCase("n")) {
            return true;
        }

        do {
            if (arma.probabilidad(3)) {
                System.out.println("A tu casa pa. Tu armadura ripeo.");
                return false;
            }

            b = repararDaños(arma);
        } while (b);

        return true;
    }

    /*
    Simulador
        Hacer un método en JARVIS que agregue en radar objetos, hacer que la 
    resistencia, las coordenadas y la hostilidad sean aleatorios utilizando la clase 
    random. Utilizar la clase Random.
    ¿Qué ocurre si quiero añadir más de 10 objetos?
    ¿Qué ocurre si cuando llevo 8 enemigos aumento la capacidad del vector?
     */
    public boolean simulador(Armadura arma) {
        arma.getRadar().clear();

        int objetosAlea = rand.nextInt(11);

        for (int i = 0; i < objetosAlea; i++) {
            ObjetosRadar obj = new ObjetosRadar();
            obj.crearObjetoAuto();
            arma.getRadar().add(obj);
        }

        return true;
    }

    /*
    Radar Versión 1.0
        JARVIS posee también incorporado un sistema que usa ondas electromagnéticas 
    para medir distancias, altitudes, ubicaciones de objetos estáticos o móviles como 
    aeronaves barcos, vehículos motorizados, formaciones meteorológicas y por su 
    puesto enemigos de otro planeta.
        Su funcionamiento se basa en emitir un impulso de radio, que se refleja en el 
    objetivo y se recibe típicamente en la misma posición del emisor.
        Las ubicaciones de los objetos están dadas por las coordenadas X, Y y Z. Los 
    objetos pueden ser marcados o no como hostiles. JARVIS también puede detectar la 
    resistencia del objeto, y puede detectar hasta 10 objetos de manera simultánea.
        JARVIS puede calcular la distancia a la que se encuentra cada uno de los 
    objetos, para esto siempre considera que la armadura se encuentra situada en la 
    coordenada (0,0,0).
        Hacer un método que informen a qué distancia se encuentra cada uno de los 
    enemigos. Usar la clase Math de Java.
     */
    public void radar(Armadura arma) {
        System.out.println("Escanear? s/n");
        if (leer.next().equalsIgnoreCase("s")) {
            simulador(arma);
        }

        int acu = 1;
        for (ObjetosRadar obj : arma.getRadar()) {
            obj.mostrarObjeto(acu);

            acu++;
        }

        if (acu == 1) {
            System.out.println("No hay objetos en el radar. \n");
        }

    }

    /*
    Destruyendo Enemigos
        Desarrollar un método para que JARVIS que analice todos los objetos del radar 
    y si son hostiles que les dispare. El alcance de los guantes es de 5000 metros, 
    si el objeto se encuentra fuera de ese rango no dispara.
        JARVIS al detectar un enemigo lo atacará hasta destruirlo, la potencia del 
    disparo es inversamente proporcional a la distancia al a que se encuentra el 
    enemigo y se descontará de la resistencia del enemigo. El enemigo se considera 
    destruido si su resistencia es menor o igual a cero.
        JARVIS solo podrá disparar si el dispositivo está sano y si su nivel de 
    batería lo permite. Si tiene los dos guantes sanos podrá disparar con ambos 
    guantes haciendo más daño. Resolver utilizando un for each para recorrer el 
    arreglo y un while para destruir al enemigo.
     */
    public boolean destruirEnemigos(Armadura arma) throws InterruptedException {
        if (arma.getRadar().isEmpty()) {
            System.out.println("No hay enemigos en el area.\n");
            return false;
        }

        if (arma.getBateria() <= 10) {
            arma.getRadar().clear();
            System.out.println("Bateria baja. Recomendacion cargarlo.\n");
            return false;
        }

        for (int i = 0; i < arma.getRadar().size(); i++) {
            ObjetosRadar obj = arma.getRadar().get(i);

            obj.mostrarObjeto(i + 1);

            if (!obj.isHostil()) {
                System.out.println("El objeto n° " + (i + 1) + " es buenito.\n");
                continue;
            }

            if (obj.getDistancia() > 5000) {
                System.out.println("El objeto n° " + (i + 1) + " esta muy lejos.\n");
                continue;
            }

            boolean b = false;
            System.out.println("DESTRUYENDO AL ENEMIGO n° " + (i + 1) + ": resistencia inicial " + obj.getResistencia());
            do {
                
                b = acciones(arma);

                if (b) {
                    break;
                }
                
                danioRecibido();
                System.out.println("Daño causado: " + (int) obj.getDistancia());

                obj.setResistencia(obj.getResistencia() - (int) obj.getDistancia());
            } while (obj.getResistencia() > 0);

            if (b) {
                break;
            }

            arma.getRadar().remove(obj);
            System.out.println("ENEMIGO n° " + (i + 1) + " DESTRUIDO.\n");
        }

        return true;
    }

    public void menuJARVIS() throws InterruptedException {
        boolean b = true;
        System.out.println("Creando armadura...\n");
        System.out.println("   ___-------------___");
        System.out.println("  /       ||||||      \\");
        System.out.println(" |        ||||||       |");
        System.out.println("|          ||||         |");
        System.out.println("|  ______      ______   |");
        System.out.println("|  \\___--      --___//  |");
        System.out.println("|                       |");
        System.out.println("|           |           |");
        System.out.println(" \\          |          /");
        System.out.println("  \\         |         /");
        System.out.println("   \\      __|__      /");
        System.out.println("    \\___/_______\\___/");
        System.out.println("      \\___________/");
        System.out.println("JARVIS V1.0\n");

        Armadura arma = new Armadura();
        arma.crearArmaduraAuto();
        
        int opc;
        do {
            try {
                System.out.println("*** MENU J.A.R.V.I.S ***\n"
                        + "1- Mostrar estado.\n"
                        + "2- Acciones.\n"
                        + "3- Mostrar bateria.\n"
                        + "4- Reparar daños.\n"
                        + "5- Revisar dispositivos.\n"
                        + "6- Radar. \n"
                        + "7- Destruir enemigos.\n"
                        + "8- Mostrar bateria en barras.\n"
                        + "9- Salir.");

                opc = leer.nextInt();

                switch (opc) {
                    case 1:
                        mostrarEstado(arma);
                        break;
                    case 2:
                        acciones(arma);
                        break;
                    case 3:
                        estadoBateria(arma);
                        break;
                    case 4:
                        repararDaños(arma);
                        break;
                    case 5:
                        b = revisarDispositos(arma);
                        break;
                    case 6:
                        radar(arma);
                        break;
                    case 7:
                        destruirEnemigos(arma);
                        break;
                    case 8:
                        MostrarBateriaEnBarra(arma.getBateria());
                        break;
                    case 9:
                        System.out.println("Gracias por usar J.A.R.V.I.S");
                        b = false;
                        break;
                    default:
                        System.out.println("Error! Opcion incorrecta.");
                }
            } catch (Exception e) {
                leer.next();
                System.out.println("Ingresa numeros por favor");
            }
        } while (b);

    }
}
