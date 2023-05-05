package guia8.servicios;

import guia8.entidades.E3_Persona;
import java.util.Random;
import java.util.Scanner;

/*
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:

1-Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    
2-Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y 
    después se le asignan a sus respectivos atributos para llenar el objeto Persona. 
    Además, comprueba que el sexo introducido sea correcto, es decir, H, M u O. 
    Si no es correcto se deberá mostrar un mensaje.
    
3-Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
    Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo 
    de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 
    significa que la persona está en su peso ideal y la función devuelve un 0. 
    Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 */
public class E3_PersonaServicio {

    static Scanner leer = new Scanner(System.in);
    static Random rand = new Random();
    

    public boolean esMayorDeEdad(E3_Persona pers) {
        return pers.getEdad() >= 18;
    }

    public E3_Persona crearPersona() {
//        System.out.println("*** DATOS DE LA PERSONA ***");
//        System.out.println("Nombre:");
//        pers.setNombre(leer.nextLine());
//
//        do {
//            System.out.println("Sexo: H, M u O");
//            char carac = leer.next().charAt(0);
//
//            if (Character.toUpperCase(carac) != 'H' && Character.toUpperCase(carac) != 'M' && Character.toUpperCase(carac) != 'O') {
//                System.out.println("ERROR! Opcion incorrecta. H, M u O");
//            } else {
//                pers.setSexo(Character.toUpperCase(carac));
//                break;
//            }
//
//        } while (true);
        
//        System.out.println("Edad:");
//        pers.setEdad(leer.nextInt());
//
//        System.out.println("Peso:");
//        pers.setPeso(leer.nextDouble());
//
//        System.out.println("Altura:");
//        pers.setAltura(leer.nextDouble());

        E3_Persona pers = new E3_Persona();
        
        pers.setNombre("sadsa");
        pers.setSexo('H');
        pers.setEdad(rand.nextInt(99) +1);
//        System.out.println("Edad: " + pers.getEdad());
        pers.setPeso(rand.nextDouble() * 200);
//        System.out.printf("Peso: %.2f%n", pers.getPeso());
        pers.setAltura(rand.nextDouble() * 2 + .3);
//        System.out.printf("Altura: %.2f%n", pers.getAltura());
        
        return pers;
    }

    public int calcularIMC(E3_Persona pers) {
        double calculo = pers.getPeso() / Math.pow(pers.getAltura(), 2);
        int retorno;

        if (calculo < 20) {
            retorno = -1;
        } else if (calculo >= 20 && calculo <= 25) {
            retorno = 0;
        } else {
            retorno = 1;
        }
        
        return retorno;
    }
    
    public int calcularPorcentajes(int acu){
        return (acu * 100) / 4;
    }
}
