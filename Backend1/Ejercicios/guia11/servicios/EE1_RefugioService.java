package guia11.servicios;

import guia11.entidades.EE1_Perro;
import guia11.entidades.EE1_Refugio;
import java.util.ArrayList;
import java.util.Collection;
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
public class EE1_RefugioService {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public EE1_Refugio crearPerros(){
        ArrayList<EE1_Perro> perros = new ArrayList();
        
        int acu = 1;
        String opc;
        do {            
            EE1_Perro p = new EE1_Perro();
            
            System.out.println("Perro N° " + acu);
            
            System.out.println("Nombre:");
            p.setNombre(leer.next());
            
            System.out.println("Raza:");
            p.setRaza(leer.next());
            
            System.out.println("Edad:");
            p.setEdad(leer.nextInt());
            
            System.out.println("Tamaño:");
            p.setTamanio(leer.nextInt());
            
            perros.add(p);
            
            acu++;
            
            System.out.println("Quieres continuar? s/n");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("s"));
        
        return new EE1_Refugio(perros);
    }
    
    public EE1_Refugio crearPerrosAuto(){
        ArrayList<EE1_Perro> perros = new ArrayList();
        
        String[] nombres = {"Bagucha", "Osito", "Priscila", "Luli"};
        String[] razas = {"Galgo", "Caniche", "Pitbull", "Dogo"};
        Integer[] edades = {3, 5, 7, 9};
        Integer[] tamanios = {90, 24, 60, 100};
        
        for (int i = 0; i < 4; i++) {
            perros.add(new EE1_Perro(nombres[i].toLowerCase(), razas[i], edades[i], tamanios[i], false));
        }
        
        return new EE1_Refugio(perros);
    }
    
    public void mostrasPerros(EE1_Refugio perros){
        for (int i = 0; i < perros.getPerros().size(); i++) {
            System.out.printf("Perro N° %d: %s.%n", i+1, perros.getPerros().get(i));
        }
    }
}
