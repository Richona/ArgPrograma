package guia10.servicios;

import guia10.entidades.E2_Perro;
import java.util.ArrayList;
import java.util.Scanner;

/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
*/
public class E2_PerroService {
    private E2_Perro crearRaza(Scanner leer){
        System.out.println("Ingresa nombre de raza:");
        return new E2_Perro(leer.nextLine());
    }
    
    public ArrayList<E2_Perro> crearRazas(Scanner leer){
        ArrayList<E2_Perro> razas = new ArrayList();
                
        do {
            razas.add(crearRaza(leer));
            
            System.out.println("Quieres seguir agregando razas? S/N");
        } while (leer.nextLine().equalsIgnoreCase("s"));
        
        mostrarRazas(razas);
          
        return razas;
    }
    
    public void eliminarRaza(Scanner leer, ArrayList<E2_Perro> razas){
        System.out.println("Nombre de la raza a eliminar.");
        String raza = leer.nextLine();
        
        boolean b = false;
        
        for (int i = 0; i < razas.size(); i++) {
            if (raza.equalsIgnoreCase(String.valueOf(razas.get(i).getRaza()))) {
                razas.remove(i);
                b = true;
                i--;
            }
        }
        
        if (!b) {
            System.out.println("La raza no se encontro.");
        }
        
        mostrarRazasOrdenDesc(razas);
    }
    
    private void mostrarRazas(ArrayList<E2_Perro> razas){
        razas.forEach((raza) -> {
            System.out.println(raza.getRaza());
        });
    }
    
    private void mostrarRazasOrdenAsc(ArrayList<E2_Perro> razas){
        razas.sort(E2_Perro.compararRazaAsc);
        razas.forEach(System.out::println);
    }
    
    private void mostrarRazasOrdenDesc(ArrayList<E2_Perro> razas){
        razas.sort(E2_Perro.compararRazaDesc);
        razas.forEach(System.out::println);
    }
    
}
