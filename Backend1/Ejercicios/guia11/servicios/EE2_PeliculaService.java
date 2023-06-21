package guia11.servicios;

import guia11.entidades.EE2_Pelicula;
import java.util.Scanner;

/*

*/
public class EE2_PeliculaService {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public EE2_Pelicula crearPelicula(){
        EE2_Pelicula p = new EE2_Pelicula();
        System.out.println("INFO DE LA PELI:");
        System.out.println("Nombre: Silencio 3.");
        p.setTitulo("Silencio 3");
        
        System.out.println("Nombre del director: QSY");
        p.setDirector("QSY");
        
        System.out.println("Duracion: 2 horas");
        p.setDuracion(2);
        
        System.out.println("Edad minima: 18 años");
        p.setEdadMinima(18);
        
        return p;
    }
    
    public void mostrarPelicula(EE2_Pelicula p){
        System.out.println(p);
    }
}
