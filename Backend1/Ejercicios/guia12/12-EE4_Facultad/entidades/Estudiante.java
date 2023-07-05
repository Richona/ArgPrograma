package entidades;

import constantes.Constantes;
import java.util.Random;
import java.util.Scanner;

/*

 */
public final class Estudiante extends Persona {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();

    private String curso;

    public Estudiante() {
    }

    public Estudiante(String curso, String nombre, String apellido, String estadoCivil, int dni) {
        super(nombre, apellido, estadoCivil, dni);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiante{" + "curso=" + curso + '}';
    }

    public void crearEstudianteAuto() {
        super.crearPersonaAuto();

        curso = Constantes.CURSOS[rand.nextInt(Constantes.CURSOS.length)];
    }
    //Matriculación de un estudiante en un nuevo curso.
    public void matriculacionCursoNuevo(){
        String msg = "*** MATRICULACION A UN NUEVO CURSO ***\n";
        int opc;
        
        for (int i = 0; i < Constantes.CURSOS.length; i++) {
            msg += (i +1) + "- " + Constantes.CURSOS[i] + "\n";
        }
        
        msg += "Elija una opcion...";
        
        do {
            System.out.println(msg);
            opc = leer.nextInt();
        } while (opc < 1 || opc > Constantes.CURSOS.length);
        
        this.curso = Constantes.CURSOS[opc -1];
    }

    public void mostrarEstudiante() {
        System.out.println("*** ESTUDIANTE ***\n"
                + "Nombre: " + nombre + "\n"
                + "Apellido: " + apellido + "\n"
                + "DNI: " + dni + "\n"
                + "Estado civil: " + estadoCivil + "\n"
                + "Curso: " + curso + "\n");
    }
}
