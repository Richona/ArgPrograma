package guia9.entidades;

import java.util.Arrays;
import java.util.Scanner;

/*
Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán: 
    nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  
    precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de 
    dimensión 5 (cinco), donde se alojarán los nombres de cada alumno. 
    A continuación, se implementarán los siguientes métodos:
    
1-Un constructor por defecto.
    
2-Un constructor con todos los atributos como parámetro.
    
3-Métodos getters y setters de cada atributo.
    
4-Método cargarAlumnos(): este método le permitirá al usuario ingresar 
    los alumnos que asisten a las clases. Nosotros nos encargaremos de 
    almacenar esta información en un arreglo e iterar con un bucle, 
    solicitando en cada repetición que se ingrese el nombre de cada alumno.
    
5-Método crearCurso(): el método crear curso, le pide los valores 
    de los atributos al usuario y después se le asignan a sus respectivos 
    atributos para llenar el objeto Curso. En este método invocamos 
    al método cargarAlumnos() para asignarle valor al atributo alumnos
    
6-Método calcularGananciaSemanal(): este método se encarga de calcular la 
    ganancia en una semana por curso. Para ello, se deben multiplicar la 
    cantidad de horas por día, el precio por hora, la cantidad de alumnos 
    y la cantidad de días a la semana que se repite el encuentro.
*/
public class E6_Curso {
    private String nombreCurso, turno;
    private int cantidadHorasPorDia, cantidadDiasPorSemana;
    private double precioPorHora;
    private String alumnos[] = new String[5];

    public E6_Curso() {
    }

    public E6_Curso(String nombreCurso, String turno, int cantidadHorasPorDia, int cantidadDiasPorSemana, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "E6_Curso{" + "nombreCurso=" + nombreCurso + ", turno=" + turno + ", cantidadHorasPorDia=" + cantidadHorasPorDia + ", cantidadDiasPorSemana=" + cantidadDiasPorSemana + ", precioPorHora=" + precioPorHora + ", alumnos=" + Arrays.toString(alumnos) + '}';
    }
    
//    4-Método cargarAlumnos(): este método le permitirá al usuario ingresar 
//    los alumnos que asisten a las clases. Nosotros nos encargaremos de 
//    almacenar esta información en un arreglo e iterar con un bucle, 
//    solicitando en cada repetición que se ingrese el nombre de cada alumno.
    public void cargarAlumnos(Scanner leer){
        leer.nextLine();
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingresa el nombre del alumno "+ (i+1));
            alumnos[i] = leer.nextLine();
        }
    }
    
//    5-Método crearCurso(): el método crear curso, le pide los valores 
//    de los atributos al usuario y después se le asignan a sus respectivos 
//    atributos para llenar el objeto Curso. En este método invocamos 
//    al método cargarAlumnos() para asignarle valor al atributo alumnos
    public E6_Curso crearCurso(Scanner leer){
        E6_Curso c = new E6_Curso();
        
        System.out.println("Ingrese nombre del curso:");
        c.setNombreCurso(leer.nextLine());
        
        System.out.println("Cantidad de horas por dia:");
        c.setCantidadHorasPorDia(leer.nextInt());
        
        System.out.println("Cantidad de dias a la semana:");
        c.setCantidadDiasPorSemana(leer.nextInt());
        
        System.out.println("Turno: \n1- Mañana. \n2-Tarde.");
        c.setTurno(leer.nextInt() == 1 ? "mañana":"tarde");
        
        System.out.println("Precio por hora:");
        c.setPrecioPorHora(leer.nextDouble());
        
        System.out.println("Alumnos:");
        cargarAlumnos(leer);
        
        return c;
    }
    
//    -Método calcularGananciaSemanal(): este método se encarga de calcular la 
//    ganancia en una semana por curso. Para ello, se deben multiplicar la 
//    cantidad de horas por día, el precio por hora, la cantidad de alumnos 
//    y la cantidad de días a la semana que se repite el encuentro.
    public double calcularGananciaSemanal(E6_Curso c){
        return c.getCantidadHorasPorDia() * c.getPrecioPorHora() * c.getAlumnos().length * c.getCantidadDiasPorSemana();
    }
}
