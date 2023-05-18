package guia9.servicios;

import guia9.entidades.EE1_Mes;
import java.util.Random;
import java.util.Scanner;

/*
El programa debe pedir al usuario que adivine el mes secreto. 
    Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva 
    a intentar adivinar el mes secreto.  
    
    Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
*/
public class EE1_MesService {
    public void adivinar(Random rand, Scanner leer){
        EE1_Mes ms = new EE1_Mes(rand);
        
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
        do {
            if (leer.nextLine().equals(ms.getMesSecreto())) {
                System.out.println("¡Ha acertado! \nQuieres seguir jugando? s/n");
                
                if (leer.nextLine().equalsIgnoreCase("n")) {
                    break;
                }else{
                    adivinar(rand, leer);
                }
            }else{
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            }
            
        } while (true);
        
    }
    
}
