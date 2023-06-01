package guia10.servicios;

import guia10.entidades.E1_Perro;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

*/
public class E1_PerroService {
    private final Scanner leer = new Scanner(System.in);
    
    private E1_Perro crearRaza(){
        System.out.println("Ingresa nombre de raza:");
        return new E1_Perro(leer.nextLine());
    }
    
    public ArrayList<E1_Perro> crearRazas(){
        ArrayList<E1_Perro> razas = new ArrayList();
                
        do {
            razas.add(crearRaza());
            
            System.out.println("Quieres seguir agregando razas? S/N");
        } while (leer.nextLine().equalsIgnoreCase("s"));
        
        razas.sort(E1_Perro.ordenarRazaDesc);
        mostrarRazas(razas);
          
        return razas;
    }
    
    /*
    Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
    */
    public void aniquilarPerro(ArrayList<E1_Perro> razas){
        System.out.println("Ingrese la raza que quiere aniquilar...");
        String perroEliminar = leer.nextLine();
        
        boolean bandera = false;
        
        Iterator<E1_Perro> it = razas.iterator();
        
        while (it.hasNext()) {
            String raza = it.next().getRaza();

            if (raza.equalsIgnoreCase(perroEliminar)) {
                it.remove();
                bandera = true;
            }
        }
        
        if (bandera){
            System.out.println("Se elimino la raza: " + perroEliminar);
        } else{
            System.out.println("No se encontro el perro en la lista");
        }
        
        System.out.println("La lista queda conformada asi:");
        razas.sort(E1_Perro.ordenarRazaAsc);
        mostrarRazas(razas);
        
    }
    
    private void mostrarRazas(ArrayList<E1_Perro> razas){
        razas.forEach((raza) -> {
            System.out.println(raza.getRaza());
        });
    }
}
