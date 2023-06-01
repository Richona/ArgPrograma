package guia10.servicios;

import guia10.entidades.E4_Pelicula;
import guia10.utilidades.E4_PeliculasUtility;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
    
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
    
Después de ese bucle realizaremos las siguientes acciones:
    • Mostrar en pantalla todas las películas.
    • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
    • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
    • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
public class E4_PeliculaService {

    private E4_Pelicula crearPelicula(Scanner leer) {
        E4_Pelicula p = new E4_Pelicula();

        System.out.println("***Datos de la pelicula***");
        System.out.println("Titulo:");
        p.setTitulo(leer.nextLine());
        System.out.println("Director:");
        p.setDirector(leer.nextLine());
        System.out.println("Duracion:");
        p.setDuracion(leer.nextDouble());
        leer.nextLine();

        return p;
    }

    public ArrayList<E4_Pelicula> crearPeliculas(Scanner leer) {
        ArrayList<E4_Pelicula> pelis = new ArrayList();

        do {
            pelis.add(crearPelicula(leer));

            System.out.println("Desea añadir otra pelicula? s/n");
        } while (leer.nextLine().equalsIgnoreCase("s"));

        return pelis;
    }

    public ArrayList<E4_Pelicula> crearPeliculasAuto(Random rand) {
        ArrayList<E4_Pelicula> pelis = new ArrayList();
        String[] titulos = {"hola", "chau", "mañana", "hasta luego", "nos vemos"};
        String[] directores = {"richard", "bagucha", "mafalda", "tiger", "colo"};

        for (int i = 0; i < 5; i++) {
            pelis.add(new E4_Pelicula(titulos[i], directores[i], Double.valueOf(rand.nextInt(4))));
        }

        return pelis;
    }

    public void mostrarPeliculas(ArrayList<E4_Pelicula> pelis) {
        
        for (E4_Pelicula peli : pelis) {
            System.out.println(peli);
        }
        System.out.println("PELICULAS MOSTRADAS.");
    }

    public void menuPeliculas(Scanner leer, ArrayList<E4_Pelicula> pelis) {
        int opc;
        do {
            System.out.println("***Menu de peliculas*** \n"
                    + "1- Mostrar todas las peliculas. \n"
                    + "2- Mostrar peliculas con una duracion mayor a 1 hora. \n"
                    + "3- Mostrar peliculas ordenadas de mayor a menor en cuanto a duracion. \n"
                    + "4- Mostrar peliculas ordenadas de menor a mayor en cuanto a duracion. \n"
                    + "5- Mostrar peliculas ordenadas por titulo alfabeticamente. \n"
                    + "6- Mostrar peliculas ordenadas por director alfabeticamente. \n"
                    + "7- Salir.\n"
                    + "Elegi una opcion:");
            opc = leer.nextInt(); leer.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("Mostrando peliculas...");
                    mostrarPeliculas(pelis);
                    opc = subMenu(leer);
                    break;
                case 2:
                    System.out.println("Mostrando peliculas con duracion mayor a 1 hora...");
                    //stream permite filtrar y mostrar al mismo tiempo.
                    pelis.stream().filter(peli -> peli.getDuracion() >= 1).forEach(peli -> System.out.println(peli));
                    System.out.println("PELICULAS MOSTRADAS.");
                    opc = subMenu(leer);
                    break;
                case 3:
                    System.out.println("Mostrando peliculas ordenadas de mayor a menor en cuanto a duracion...");
                    pelis.sort(E4_PeliculasUtility.compararDuracionDesc);
                    mostrarPeliculas(pelis);
                    opc = subMenu(leer);
                    break;
                case 4:
                    System.out.println("Mostrando peliculas ordenadas de menor a mayor en cuanto a duracion...");
                    pelis.sort(E4_PeliculasUtility.compararDuracionAsc);
                    mostrarPeliculas(pelis);
                    opc = subMenu(leer);
                    break;
                case 5:
                    System.out.println("Mostrando peliculas ordenadas por titulo alfabeticamente...");
                    pelis.sort(E4_PeliculasUtility.compararTituloAlfa);
                    mostrarPeliculas(pelis);
                    opc = subMenu(leer);
                    break;
                case 6:
                    System.out.println("Mostrando peliculas ordenadas por director alfabeticamente...");
                    pelis.sort(E4_PeliculasUtility.compararDirectorAlfa);
                    mostrarPeliculas(pelis);
                    opc = subMenu(leer);
                    break;
                case 7:
                    System.out.println("Gracias por usar nuestra app.");
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }

        } while (opc != 7);

    }
    
    public int subMenu(Scanner leer){
        int opc = 7;
        
        System.out.println("___Deseas continuar? s/n___");
        if (leer.nextLine().equalsIgnoreCase("s")) {
            opc = 0;
        }
        
        return opc;
    }

}
