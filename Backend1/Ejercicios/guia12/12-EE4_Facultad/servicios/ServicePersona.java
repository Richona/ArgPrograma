package servicios;

import constantes.Constantes;
import entidades.Auxiliar;
import entidades.Empleado;
import entidades.Estudiante;
import entidades.Persona;
import entidades.Profesor;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*

 */
public class ServicePersona {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();

    public void crearPersonas(ArrayList<Persona> personas) {

        System.out.println("Cuantos estudiantes quieres que se generen?");
        int cantEstu = leer.nextInt();

        for (int i = 0; i < cantEstu; i++) {
            Estudiante estu = new Estudiante();
            estu.crearEstudianteAuto();
            personas.add(estu);
        }

        int cantProfe;
        do {
            System.out.println("Cuantos profes quieres que se generen? 80 como maximo.");
            cantProfe = leer.nextInt();
        } while (cantProfe > 80);

        for (int i = 0; i < cantProfe; i++) {
            Profesor profe = new Profesor();
            profe.crearProfesorAuto();
            personas.add(profe);
        }

        int cantAux;
        do {
            System.out.println("Cuantos auxiliares quieres que se generen? 20 como maximo.");
            cantAux = leer.nextInt();
        } while (cantAux > 20);

        for (int i = 0; i < cantAux; i++) {
            Auxiliar aux = new Auxiliar();
            aux.crearAuxiliarAuto();
            personas.add(aux);
        }
    }

    public boolean cambiarEstadoCivil(ArrayList<Persona> personas) {
        if (personas.isEmpty()) {
            System.out.println("ERROR! Ingrese las personas.");
            return false;
        }

        int dni;
        do {
            System.out.println("Ingrese el DNI de la persona: ");
            dni = leer.nextInt();
        } while (!Constantes.DNIS.contains(dni));

        for (Persona persona : personas) {
            if (persona.getDni() == dni) {
                persona.cambiarEstadoCivil();
                System.out.println("ESTADO CIVIL HA SIDO CAMBIADO CON EXITO!");
                break;
            }
        }

        return true;
    }

    public boolean reasignacionDespacho(ArrayList<Persona> personas) {
        if (personas.isEmpty()) {
            System.out.println("ERROR! Ingrese las personas.");
            return false;
        }

        int dni;
        do {
            System.out.println("Ingrese el DNI de la persona: ");
            dni = leer.nextInt();
        } while (!Constantes.DNIS.contains(dni));

        for (Persona persona : personas) {
            if (persona.getDni() == dni) {
                if (persona instanceof Estudiante) {
                    System.out.println("ERROR! No tiene derecho a despacho.");
                    return false;
                }

                Empleado emple = (Empleado) persona;
                emple.reasignacionDespacho();
                System.out.println("DESPACHO HA SIDO CAMBIADO CON EXITO!");
                break;
            }
        }

        return true;
    }

    public boolean matriculacionDeCurso(ArrayList<Persona> personas) {
        if (personas.isEmpty()) {
            System.out.println("ERROR! Ingrese las personas.");
            return false;
        }

        int dni;
        do {
            System.out.println("Ingrese el DNI de la persona: ");
            dni = leer.nextInt();
        } while (!Constantes.DNIS.contains(dni));

        for (Persona persona : personas) {
            if (persona.getDni() == dni) {
                if (persona instanceof Empleado) {
                    System.out.println("ERROR! No se le puede asignar un curso.");
                    return false;
                }

                Estudiante estu = (Estudiante) persona;
                estu.matriculacionCursoNuevo();
                System.out.println("TU MATRICULA HA SIDO EFECTUADA CON EXITO!");
                break;
            }
        }

        return true;
    }

    public boolean cambiarDepartamento(ArrayList<Persona> personas) {
        if (personas.isEmpty()) {
            System.out.println("ERROR! Ingrese las personas.");
            return false;
        }

        int dni;
        do {
            System.out.println("Ingrese el DNI de la persona: ");
            dni = leer.nextInt();
        } while (!Constantes.DNIS.contains(dni));

        for (Persona persona : personas) {
            if (persona.getDni() == dni) {
                if (persona instanceof Estudiante || persona instanceof Auxiliar) {
                    System.out.println("ERROR! Usted no puede realizar esta accion.");
                    return false;
                }

                Profesor profe = (Profesor) persona;
                profe.cambiarDepartamento();
                System.out.println("DEPARTAMENTO HA SIDO CAMBIADO CON EXITO!");
                break;
            }
        }

        return true;
    }

    public boolean trasladoDeSeccion(ArrayList<Persona> personas) {
        if (personas.isEmpty()) {
            System.out.println("ERROR! Ingrese las personas.");
            return false;
        }

        int dni;
        do {
            System.out.println("Ingrese el DNI de la persona: ");
            dni = leer.nextInt();
        } while (!Constantes.DNIS.contains(dni));

        for (Persona persona : personas) {
            if (persona.getDni() == dni) {
                if (persona instanceof Estudiante || persona instanceof Profesor) {
                    System.out.println("ERROR! Usted no puede realizar esta accion.");
                    return false;
                }

                Auxiliar aux = (Auxiliar) persona;
                aux.trasladoSeccion();
                System.out.println("SU SECCION HA SIDO CAMBIADO CON EXITO!");
                break;
            }
        }

        return true;
    }

    public void mostrarPersonas(ArrayList<Persona> personas) {
        for (Persona persona : personas) {
            if (persona instanceof Estudiante) {
                Estudiante estu = (Estudiante) persona;
                estu.mostrarEstudiante();
                continue;
            }

            if (persona instanceof Profesor) {
                Profesor profe = (Profesor) persona;
                profe.mostrarProfesor();
                continue;
            }

            if (persona instanceof Auxiliar) {
                Auxiliar aux = (Auxiliar) persona;
                aux.mostrarAuxiliar();
            }
        }
    }

    public boolean mostrarPersonaConDNI(ArrayList<Persona> personas) {
        if (personas.isEmpty()) {
            System.out.println("ERROR! Ingrese las personas.");
            return false;
        }

        int dni;
        do {
            System.out.println("Ingrese el DNI de la persona: ");
            dni = leer.nextInt();
        } while (!Constantes.DNIS.contains(dni));

        for (Persona persona : personas) {
            if (persona.getDni() == dni) {
                if (persona instanceof Estudiante) {
                    Estudiante estu = (Estudiante) persona;
                    estu.mostrarEstudiante();
                    break;
                }

                if (persona instanceof Profesor) {
                    Profesor profe = (Profesor) persona;
                    profe.mostrarProfesor();
                    break;
                }

                if (persona instanceof Auxiliar) {
                    Auxiliar aux = (Auxiliar) persona;
                    aux.mostrarAuxiliar();
                    break;
                }
            }
        }

        return true;
    }
}
