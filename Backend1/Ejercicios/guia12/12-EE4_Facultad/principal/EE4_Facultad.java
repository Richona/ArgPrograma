package principal;

import constantes.Constantes;
import entidades.Auxiliar;
import entidades.Estudiante;
import entidades.Persona;
import entidades.Profesor;
import java.util.ArrayList;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;
import servicios.ServicePersona;

public class EE4_Facultad {

    /*
        Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. 
    
    A continuación, se detalla qué tipo de información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
    
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
     */
    static Random rand = new Random();
    static final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    static final ServicePersona servPersona = new ServicePersona();

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList();

        int opc, avance = 0;
        
        do {
            System.out.println("*** MENU FACULTAD MESSI ***\n"
                    + "1- Crear personas.\n"
                    + "2- Cambiar estado civil de una persona.\n"
                    + "3- Reasignación de despacho a un empleado.\n"
                    + "4- Matriculación de un estudiante en un nuevo curso.\n"
                    + "5- Cambiar departamento de un profesor.\n"
                    + "6- Traslado de sección de un empleado del personal de servicio.\n"
                    + "7- Mostrar todas las personas.\n"
                    + "8- Mostrar persona con su dni.\n"
                    + "9- Salir.\n");
            opc = leer.nextInt();
            
            if (opc >= 1 && opc <= 8 && avance >= 3) {
                System.out.println("Desea continuar? s/n");
                opc = leer.next().equalsIgnoreCase("s") ? opc : 9;
            }
            
            switch (opc) {
                case 1:
                    servPersona.crearPersonas(personas);
                    break;
                case 2:
                    servPersona.cambiarEstadoCivil(personas);
                    break;
                case 3:
                    servPersona.reasignacionDespacho(personas);
                    break;
                case 4:
                    servPersona.matriculacionDeCurso(personas);
                    break;
                case 5:
                    servPersona.cambiarDepartamento(personas);
                    break;
                case 6:
                    servPersona.trasladoDeSeccion(personas);
                    break;
                case 7:
                    servPersona.mostrarPersonas(personas);
                    break;
                case 8:
                    servPersona.mostrarPersonaConDNI(personas);
                    break;
                case 9:
                    System.out.println("Gracias por usar nuestra app :)");
                    break;
                default:
                    System.out.println("ERROR! Vuelve a intentarlo.");
            }
            avance++;
        } while (opc != 9);

    }

}
