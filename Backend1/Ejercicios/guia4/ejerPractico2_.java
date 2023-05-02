package guia4;
import java.util.Scanner;

public class ejerPractico2_ {
    /*
        Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
    validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, 
    sino informe que no lo son.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n1, n2;
        
        System.out.println("Ingresa dos numeros.");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        while (n2 == 0) {
            System.out.println("ERROR! No se puede dividir por 0.");
            n2 = leer.nextInt();
        }
        
        EsMultiplo(n1, n2);
    }
    
    public static void EsMultiplo(int n1, int n2){
        if (n1 % n2 == 0) {
            System.out.println("Es multiplo.");
        }else{
            System.out.println("No es multiplo.");
        }
    }

}
