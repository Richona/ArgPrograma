package servicios;

import java.util.Random;
import java.util.Scanner;

/*

*/
public class DivisionNumero {
    //    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //    private final Random rand = new Random();
    
    public double divisionNumero(int n1, int n2) throws Exception{
        if (n1 == 0) {
            throw new Exception("N1 no puede ser 0");
        }
        
        return n1 / n2;
    }
}
