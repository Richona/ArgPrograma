package guia8.principales;
import guia8.entidades.E3_Persona;
import guia8.servicios.E3_PersonaServicio;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class E3_persona {
    /* 
    
    A continuación, en la clase main hacer lo siguiente:

Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, 
    deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar 
    para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), 
    para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, 
    cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. 
    Para esto, podemos crear unos métodos adicionales.
    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        E3_Persona personas[] = new E3_Persona[4];
        int acuIMC[] = new int[3];
        int acuEdad[] = new int[2];
        
        for (int i = 0; i < 4; i++) {
            E3_PersonaServicio pers = new E3_PersonaServicio();
            personas[i] = pers.crearPersona();
            
            System.out.println("*** Persona N°" + (i+1) + " ***");
            switch (pers.calcularIMC()) {
                case 0:
                    System.out.println("La persona tiene sobrepeso.");
                    acuIMC[0]++;
                    break;
                case 1:
                    System.out.println("La persona esta en su peso ideal");
                    acuIMC[1]++;
                    break;
                case -1:
                    System.out.println("La persona esta por debajo de su peso ideal.");
                    acuIMC[2]++;
                    break;
            }
            
            if (pers.esMayorDeEdad()) {
                System.out.println("Es mayor de edad.");
                acuEdad[0]++;
            }else{
                System.out.println("Es menor de edad");
                acuEdad[1]++;
            }
            
            System.out.println("");
            
            if (i == 3) {
                System.out.println("*** PORCENTAJES IMC ***");
                System.out.println("Con sobre peso: " + pers.calcularPorcentajes(acuIMC[0]) + "%");
                System.out.println("En su peso ideal: " + pers.calcularPorcentajes(acuIMC[1]) + "%");
                System.out.println("Por debajo de su peso ideal: " + pers.calcularPorcentajes(acuIMC[2]) + "%\n");
                
                System.out.println("*** PORCENTAJES EDAD ***");
                System.out.println("Mayores de edad: " + pers.calcularPorcentajes(acuEdad[0])+ "%");
                System.out.println("Menores de edad: " + pers.calcularPorcentajes(acuEdad[1])+ "%");
            }
        }
        
        
    }

}
