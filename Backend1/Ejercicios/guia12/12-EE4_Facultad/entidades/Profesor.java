package entidades;

import constantes.Constantes;
import java.util.Random;
import java.util.Scanner;

/*

 */
public final class Profesor extends Empleado {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();

    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, int anioIncorporacion, int numDespacho, String nombre, String apellido, String estadoCivil, int dni) {
        super(anioIncorporacion, numDespacho, nombre, apellido, estadoCivil, dni);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "departamento=" + departamento + '}';
    }

    public void crearProfesorAuto() {
        super.crearEmpleadoAuto();

        departamento = Constantes.DEPARTAMENTOS[rand.nextInt(Constantes.DEPARTAMENTOS.length)];
    }
    
    //Cambio de departamento de un profesor.
    public void cambiarDepartamento(){
        String msg = "*** CAMBIO DE DEPARTAMENTO ***\n";
        int opc;
        
        for (int i = 0; i < Constantes.DEPARTAMENTOS.length; i++) {
            msg += (i +1) + "- " + Constantes.DEPARTAMENTOS[i] + "\n";
        }
        
        msg += "Elija una opcion...";
        
        do {
            System.out.println(msg);
            opc = leer.nextInt();
        } while (opc < 1 || opc > Constantes.DEPARTAMENTOS.length);
        
        this.departamento = Constantes.DEPARTAMENTOS[opc -1];
    }

    public void mostrarProfesor() {
        System.out.println("*** PROFESOR ***\n"
                + "Nombre: " + nombre + "\n"
                + "Apellido: " + apellido + "\n"
                + "DNI: " + dni + "\n"
                + "Estado civil: " + estadoCivil + "\n"
                + "Año de incorporacion: " + anioIncorporacion + "\n"
                + "Numero de despacho: " + numDespacho + "\n"
                + "Departamento: " + departamento + "\n");
    }
}
