package guia10.servicios;

import guia10.entidades.E5_Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
    
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
    
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
*/
public class E5_PaisService {
    public HashSet<E5_Pais> crearPaises(Scanner leer){
        HashSet<E5_Pais> paises = new HashSet();
        
        do {
            System.out.println("Pais a ingresar:");
            paises.add(new E5_Pais(leer.nextLine()));
            
            System.out.println("Desea añadir otro pais? s/n");
        } while (leer.nextLine().equalsIgnoreCase("s"));
        
        mostrarPaises(paises);
        System.out.println("");
        mostrarPaisesAlfa(paises);
        
        return paises;
    }
    
    public HashSet<E5_Pais> crearPaisesAuto(){
        HashSet<E5_Pais> paises = new HashSet();
        
        paises.add(new E5_Pais("Argentina"));
        paises.add(new E5_Pais("Brazil"));
        paises.add(new E5_Pais("Peru"));
        paises.add(new E5_Pais("Chile"));
        
        mostrarPaises(paises);
        System.out.println("");
        mostrarPaisesAlfa(paises);
        
        return paises;
    }
    
    public void mostrarPaises(HashSet<E5_Pais> paises){
        System.out.println("Paises:");
        paises.forEach((pais) -> {
            System.out.println(pais);
        });
    }
    
    public void mostrarPaisesAlfa(HashSet<E5_Pais> paises){
        
        ArrayList<E5_Pais> listaPaises = new ArrayList<>(paises);
        listaPaises.sort(E5_Pais.ordenarPorNombrePais);
        
        System.out.println("Paises ordenados alfabeticamente:");
        listaPaises.forEach((pais) -> {
            System.out.println(pais);
        });
    }
    
    /*
    Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
    */
    
    public void eliminarPais(Scanner leer, HashSet<E5_Pais> paises){
        ArrayList<E5_Pais> listaPaises = new ArrayList<>(paises);
        
        System.out.println("Pais a eliminar:");
        String pais = leer.nextLine();

        boolean b = false;
        
        for (int i = 0; i < listaPaises.size(); i++) {
            if (listaPaises.get(i).getNombre().equalsIgnoreCase(pais)) {
                listaPaises.remove(i);
                b = true;
                break;
            }
        }
        
        paises = new HashSet<>(listaPaises);
        
        if (!b) {
            System.out.println("El pais no se encontro.");
        }
        
        mostrarPaisesAlfa(paises);
    }
    
}
