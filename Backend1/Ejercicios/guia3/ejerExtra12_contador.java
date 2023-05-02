package ejercicios.guia3;
import java.util.Scanner;

public class ejerExtra12_contador {
    /*
        Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, 
    con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingresa una cantidad");
        n = leer.nextInt();
        
        for (int i = 0; i <= n; i++) {
            
            for (int j = 0; j < 3; j++) {
                switch (j) {
                    case 0:
                        if (i / 100 % 10 == 3) {
                            System.out.print("E");
                        }else{
                             System.out.print(i / 100 % 10);
                        }
                        System.out.print("-");
                        break;
                    case 1:
                        if (i / 10 % 10 == 3) {
                            System.out.print("E");
                        }else{
                             System.out.print(i / 10 % 10);
                        }
                        System.out.print("-");
                        break;
                    case 2:
                        if (i % 10 == 3) {
                            System.out.print("E");
                        }else{
                             System.out.print(i % 10);
                        }
                        break;
                }
                
            }
            System.out.println("");
        }
    }

}
