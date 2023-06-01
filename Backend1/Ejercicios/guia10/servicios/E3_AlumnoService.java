package guia10.servicios;

import guia10.entidades.E3_Alumno;
import guia10.utilidades.E3_AlumnoUtilidad;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
public class E3_AlumnoService {

    private static final int cantNotas = 3;

    private E3_Alumno crearAlumno(Scanner leer, Random rand) {
        E3_Alumno a = new E3_Alumno();
        ArrayList<Integer> notas = new ArrayList();

        System.out.println("Nombre del alumno:");
        a.setNombre(leer.nextLine());

        for (int i = 0; i < cantNotas; i++) {
            notas.add(rand.nextInt(10) + 1);
        }
        a.setNotas(notas);

        return a;
    }

    public ArrayList<E3_Alumno> crearAlumnos(Scanner leer, Random rand) {
        ArrayList<E3_Alumno> alumnos = new ArrayList();

        do {
            alumnos.add(crearAlumno(leer, rand));

            System.out.println("Quieres agregar otro alumno? s/n");
        } while (leer.nextLine().equalsIgnoreCase("s"));

        return alumnos;
    }

    public double notaFinal(Scanner leer, ArrayList<E3_Alumno> alumnos) {
        double suma = 0;

        System.out.println("Nombre del alumno a calcular nota final:");
        String nombre = leer.nextLine();

        for (E3_Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                for (Integer nota : alumno.getNotas()) {
                    suma += nota;
                }
                break;
            }
        }

        return suma / cantNotas;
    }

    public void mostrarAlumno(E3_Alumno a) {
        System.out.println(a);
    }

    public void mostrarAlumnos(ArrayList<E3_Alumno> alumnos, int orden) {
        switch (orden) {
            case 1:// NOMBRES DE MENOR A MAYOR
                alumnos.sort(E3_AlumnoUtilidad.compararNombreAsc);
                break;
            case 2:// NOMBRES DE MAYOR A MENOR
                alumnos.sort(E3_AlumnoUtilidad.compararNombreDesc);
                break;
            case 3:// PROMEDIOS DE MAYOR A MENOR
                alumnos.sort(E3_AlumnoUtilidad.compararPromedioAsc);
                break;
            case 4:// PROMEDIOS DE MAYOR A MENOR
                alumnos.sort(E3_AlumnoUtilidad.compararPromedioDesc);
                break;
        }

        alumnos.forEach((alumno) -> {
            System.out.println(alumno);
        });
    }
}
