package entidades;

import constantes.Constantes;
import java.util.Random;
import java.util.Scanner;

/*

*/
public final class Auxiliar extends Empleado {
        private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
        private final Random rand = new Random();
    
    private String seccion;

    public Auxiliar() {
    }

    public Auxiliar(String seccion, int anioIncorporacion, int numDespacho, String nombre, String apellido, String estadoCivil, int dni) {
        super(anioIncorporacion, numDespacho, nombre, apellido, estadoCivil, dni);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + "Auxiliar{" + "seccion=" + seccion + '}';
    }
    
    public void crearAuxiliarAuto(){
        super.crearEmpleadoAuto();
        
        seccion = Constantes.SECCIONES[rand.nextInt(Constantes.SECCIONES.length)];
    }
    
    //Traslado de sección de un empleado del personal de servicio.
    public void trasladoSeccion(){
        String msg = "*** TRASLADO DE SECCION ***\n";
        int opc;
        
        for (int i = 0; i < Constantes.SECCIONES.length; i++) {
            msg += (i +1) + "- " + Constantes.SECCIONES[i] + "\n";
        }
        
        msg += "Elija una opcion...";
        
        do {
            System.out.println(msg);
            opc = leer.nextInt();
        } while (opc < 1 || opc > Constantes.SECCIONES.length);
        
        this.seccion = Constantes.SECCIONES[opc -1];
    }
    
    public void mostrarAuxiliar() {
        System.out.println("*** AUXILIAR ***\n"
                + "Nombre: " + nombre + "\n"
                + "Apellido: " + apellido + "\n"
                + "DNI: " + dni + "\n"
                + "Estado civil: " + estadoCivil + "\n"
                + "Año de incorporacion: " + anioIncorporacion + "\n"
                + "Numero de despacho: " + numDespacho + "\n"
                + "Seccion: " + seccion + "\n");
    }
    
}
