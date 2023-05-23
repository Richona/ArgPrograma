package integradorBE1.Servicios;

import integradorBE1.entidades.Estudiante;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 estudiantes
con sus respectivas notas.
    
Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo de 
objetos tipo Estudiante, usando ese arreglo tenemos que realizar las dos tareas 
que nos ha pedido la escuela.
    
1-Calcular y mostrar el promedio de notas de todo el curso
    
2-Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor 
al promedio del curso
    
3-Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
*/
public class EstudianteService {
    public Estudiante[] crearEstudiantes(Random rand){
        final String nombres[] = {"Juan", "Aldana", "Nadia", "choni", "Kevin", "Richard", "Bagucha", "qsy"};
        
        Estudiante estudiantes[] = new Estudiante[8];
        
        for (int i = 0; i < 8; i++) {
            estudiantes[i] = new Estudiante(nombres[i], rand.nextInt(10)+1);
        }
        
        return estudiantes;
    }
    
    public double calcularPromedio(Estudiante[] estudiantes){
        double suma = 0;
        
        for (Estudiante estudiante : estudiantes) {
            suma+= estudiante.getNota();
        }
        
        return suma / estudiantes.length;
    }
    
    //2-Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
    public List<String> mayorPromedio(Estudiante[] estudiantes){
        double promedio = calcularPromedio(estudiantes);
        
        List<String> nombres = new ArrayList<>();
        
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                nombres.add(estudiante.getNombre() + ": " + estudiante.getNota());
            }
        }
        
        return nombres;
    }
    
    //3-Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
    public void mostrar(Estudiante[] estudiantes){
        List<String> nombres = mayorPromedio(estudiantes);
        
        System.out.println("Alumnos con nota mayor al promedio " + calcularPromedio(estudiantes) + ":");
        
        nombres.forEach((nombre) -> {
            System.out.println(nombre);
        });
    }
}
