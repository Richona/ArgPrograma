package guia11.servicios;

import guia11.entidades.EE4_Alumno;
import guia11.entidades.EE4_Voto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/*
• La clase Simulador debe tener un método que genere un listado de alumnos manera
    aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser 
    generadas de manera aleatoria. Nota: usar listas de tipo String para generar 
    los nombres y los apellidos.
    
• Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro 
    de un rango real de números de documentos. Y agregar a los alumnos su DNI. 
    Este método debe retornar la lista de dnis.
    
• Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad 
    de objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis 
    de las dos listas a cada objeto Alumno. No puede haber dos alumnos con el mismo 
    dni, pero si con el mismo nombre.
    
• Se debe imprimir por pantalla el listado de alumnos.
    
• Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como 
    atributos, un objeto Alumno que será el alumno que vota y una lista de los 
    alumnos a los que votó.
    
• Crearemos un método votación en la clase Simulador que, recibe el listado de 
    alumnos y a los alumnos a los que votó y sumarle uno a la cantidad de votos a 
    cada alumno que reciba un voto, que es un atributo de la clase Alumno.
    Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez 
    al mismo alumno. Utilizar un hashset para resolver esto.
    
• Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales
    fueron sus 3 votos.

• Se debe crear un método que haga el recuento de votos, este recibe la lista de 
    Alumnos y comienza a hacer el recuento de votos.
    
• Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear
    5 facilitadores suplentes con los 5 segundos alumnos más votados. A continuación, 
    mostrar los 5 facilitadores y los 5 facilitadores suplentes.
 */
public class EE4_Simulador {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();

    public ArrayList<String> generadorNombres(int cant) {
        ArrayList<String> nombresCompletos = new ArrayList();

        ArrayList<String> nombresAlea = new ArrayList(Arrays.asList("Richard Cuevas", "Lionel Messi", "Lautaro Martinez", "Julian Alvarez", "Emiliano Martinez", "Cristian Romero", "Nicolas Otamendi", "Marcos Acuña", "Enzo Fernandez", "Leandro Paredes", "Alexis Mac Allister", "Angel Di Maria", "Juan Quintana", "Carlos Alarcón", "Julio Flores", "Pedro Díaz Mari", "Ciro Alegría", "Jesús Aroca", "Pablo Coracha", "Hermelinda Boa Pasta", "Wilson Díaz Santona", "Noé Pachigua", "Príncipe Jara María", "Mario Arrosca", "Santos Gonzales", "Santos Quispe"));
        Collections.shuffle(nombresAlea);

        if (cant > nombresAlea.size()) {
            System.out.println("No hay tantas personas. Se agregaron " + nombresAlea.size());
            cant = nombresAlea.size();
        }

        for (int i = 0; i < cant; i++) {
            nombresCompletos.add(nombresAlea.get(i));
        }

        return nombresCompletos;
    }

    public ArrayList<Integer> generadorDnis(ArrayList<String> nombresCompletos) {
        ArrayList<Integer> dnis = new ArrayList();

        for (int i = 0; i < nombresCompletos.size(); i++) {
            Integer dniAlea;
            do {
                dniAlea = rand.nextInt(50000000) + 1;
            } while (dnis.contains(dniAlea));

            dnis.add(dniAlea);
        }

        return dnis;
    }

    public HashMap<Integer, EE4_Alumno> crearAlumnos() {
        HashMap<Integer, EE4_Alumno> alumnos = new HashMap();

        //System.out.println("Cantidad:");
        //int cant = leer.nextInt();
        int cant = rand.nextInt(40) + 1;
        System.out.println("Cantidad: " + cant);

        ArrayList<String> nombresCompletos = generadorNombres(cant);
        ArrayList<Integer> dnis = generadorDnis(nombresCompletos);

        for (int i = 0; i < nombresCompletos.size(); i++) {
            alumnos.put(dnis.get(i), new EE4_Alumno(nombresCompletos.get(i), dnis.get(i)));
        }

        return alumnos;
    }

    public void mostrarAlumnos(HashMap<Integer, EE4_Alumno> alumnos) {
        int acu = 1;
        for (Map.Entry<Integer, EE4_Alumno> entry : alumnos.entrySet()) {
            System.out.println("*** ALUMNO N°" + acu + " ***");
            System.out.println("ID: " + entry.getKey());
            System.out.println("Datos: " + entry.getValue());
            acu++;
        }
    }

    public HashSet<EE4_Voto> votacion(HashMap<Integer, EE4_Alumno> alumnos) {
        HashSet<EE4_Voto> votos = new HashSet();

        ArrayList<EE4_Alumno> alumnosAlea = new ArrayList(alumnos.values());

        for (Map.Entry<Integer, EE4_Alumno> entry : alumnos.entrySet()) {
            EE4_Voto voto = new EE4_Voto();
            voto.setAlumno(entry.getValue());

            Collections.shuffle(alumnosAlea);

            int acu = 0;
            for (EE4_Alumno a : alumnosAlea) {
                if (acu == 3) {
                    break;
                }

                if (Objects.equals(a.getDni(), voto.getAlumno().getDni())) {
                    continue;
                }

                if (voto.getListaVotos().contains(a)) {
                    continue;
                }

                voto.getListaVotos().add(a);
                acu++;
            }

            votos.add(voto);
        }

        return votos;
    }

    public void mostrarAlumnosVotos(HashSet<EE4_Voto> votos) {
        for (EE4_Voto voto : votos) {
            System.out.println(voto);
        }
    }

    public void recuentoVotos(HashMap<Integer, EE4_Alumno> alumnos, HashSet<EE4_Voto> votos) {
        for (EE4_Voto voto : votos) {
            for (EE4_Alumno alumnoVotado : voto.getListaVotos()) {
                EE4_Alumno alumno = alumnos.get(alumnoVotado.getDni());
                alumno.setCantVotos(alumno.getCantVotos() + 1);
            }
        }
    }
    
    /*
    • Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear
    5 facilitadores suplentes con los 5 segundos alumnos más votados. A continuación, 
    mostrar los 5 facilitadores y los 5 facilitadores suplentes.
    */
    public void facilitadores(HashMap<Integer, EE4_Alumno> alumnos){
        ArrayList<EE4_Alumno> candidatos = new ArrayList(alumnos.values());
        ArrayList<EE4_Alumno> facilitadoresTitulares = new ArrayList();
        ArrayList<EE4_Alumno> facilitadoresSuplentes = new ArrayList();
        
        candidatos.sort(EE4_Alumno.ordenarCantVotosDesc);
        
        int acuTitu=0, acuSuple=0;
        for (EE4_Alumno candidato : candidatos) {
            if (acuTitu == 5 && acuSuple !=5) {
                facilitadoresSuplentes.add(candidato);
                acuSuple++;
            }
            
            if (acuTitu != 5) {
                facilitadoresTitulares.add(candidato);
                
                acuTitu++;
            }
            
            
        }
        
        System.out.println("*** FACILITADORES TITULARES ***");
        for (EE4_Alumno facilitador : facilitadoresTitulares) {
            System.out.println(facilitador);
        }
        
        System.out.println("");
        
        System.out.println("*** FACILITADORES SUPLENTES ***");
        for (EE4_Alumno facilitador : facilitadoresSuplentes) {
            System.out.println(facilitador);
        }
    }

    public void simulador() {
        HashMap<Integer, EE4_Alumno> alumnos = crearAlumnos();

        HashSet<EE4_Voto> votos = votacion(alumnos);
        
        recuentoVotos(alumnos, votos);
        
        facilitadores(alumnos);
    }

}
