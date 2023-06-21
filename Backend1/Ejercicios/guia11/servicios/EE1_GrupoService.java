package guia11.servicios;

import guia11.entidades.EE1_Grupo;
import guia11.entidades.EE1_Perro;
import guia11.entidades.EE1_Persona;
import guia11.entidades.EE1_Refugio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
*/
public class EE1_GrupoService {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final EE1_RefugioService rs = new EE1_RefugioService();
    
    public EE1_Grupo crearPersonas(){
        ArrayList<EE1_Persona> personas = new ArrayList();
        
        String opc;
        int acu = 1;
        do {
            EE1_Persona p = new EE1_Persona();
            
            System.out.println("Persona N° " + acu);
            
            System.out.println("Nombre:");
            p.setNombre(leer.next());
            
            System.out.println("Apellido");
            p.setApellido(leer.next());
            
            System.out.println("Edad:");
            p.setEdad(leer.nextInt());
            
            System.out.println("Documento:");
            p.setDocumento(acu);
            
            personas.add(p);
            
            acu++;
            System.out.println("Quieres continuar? s/n");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("s"));
        
        
        return new EE1_Grupo(personas);
    }
    
    public EE1_Grupo crearPersonasAuto(){
        ArrayList<EE1_Persona> personas = new ArrayList();
        
        String[] nombres = {"Richard", "Lili", "Nadia", "Daniel"};
        String[] apellidos = {"Cuevas", "Loncopan", "Cuevas", "Cuevas"};
        int[] edades = {25, 58, 20, 60};
        long[] documentos = {123, 321, 456, 654};
        
        for (int i = 0; i < nombres.length; i++) {
            EE1_Persona p = new EE1_Persona();

            p.setNombre(nombres[i]);
            p.setApellido(apellidos[i]);
            p.setEdad(edades[i]);
            p.setDocumento(documentos[i]);
            
            personas.add(p);
        }
        
        return new EE1_Grupo(personas);
    }
    
    public ArrayList<String> nombresPerros(EE1_Refugio refugio){
        ArrayList<String> perros = new ArrayList();
        
        for (int i = 0; i < refugio.getPerros().size(); i++) {
            perros.add(refugio.getPerros().get(i).getNombre());
        }
        
        return perros;
    }
    
    //Validacion para que encuentre un perro si o si. Si no quiere adoptar no ingresa nada.
    public String validarNombre(EE1_Refugio refugio, ArrayList<EE1_Persona> personas, int indice){
        ArrayList<String> nombres = nombresPerros(refugio);
        
        String dato;
            do {
                System.out.printf("%s adopta a un perro por su nombre. No ingreses nada si no quieres adoptar.%n", personas.get(indice).getNombre());
                dato = leer.next().toLowerCase().trim();
                
                if (!nombres.contains(dato) && !dato.equalsIgnoreCase("")) {
                    System.out.println("Perro no encontrado");
                }
            } while (!nombres.contains(dato) && !dato.equalsIgnoreCase(""));
            
        return dato;
    }
    
    public void adopcion(){
        EE1_Grupo grupo = crearPersonasAuto();
        EE1_Refugio refugio = rs.crearPerrosAuto();
        
        ArrayList<EE1_Persona> personas = grupo.getPersonas();
        ArrayList<EE1_Perro> perros = refugio.getPerros();
        
        
        
        for (int i = 0; i < personas.size(); i++) {
            boolean b = false;
            do {
                String nombre = validarNombre(refugio, personas, i);
                
                if (nombre.equalsIgnoreCase("")) {
                    break;
                }
                
                for (int j = 0; j < perros.size(); j++) {
                    if (perros.get(j).getNombre().equalsIgnoreCase(nombre) && !perros.get(j).isAdoptado()) {
                        b = true;
                        perros.get(j).setAdoptado(b);
                        personas.get(i).setPerro(perros.get(j));
                    }
                }
                
                if (!b) {
                    System.out.println("El perro se encuentra adoptado.");
                }
            } while (!b);
  
        }
        
        mostrarPersonas(grupo);
        rs.mostrasPerros(refugio);
    }
    
    public void mostrarPersonas(EE1_Grupo personas){
        for (int i = 0; i < personas.getPersonas().size(); i++) {
            System.out.printf("Persona N° %d: %s.%n", i+1, personas.getPersonas().get(i));
        }
    }
    
}
