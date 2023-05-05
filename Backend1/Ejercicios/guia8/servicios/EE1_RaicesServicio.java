package guia8.servicios;

import guia8.entidades.EE1_Raices;
import java.util.Random;
import java.util.Scanner;

/*
Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:

1-Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2) - 4 * a * c
    
2-Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones reales distintas. Para que esto ocurra, el discriminante debe ser mayor que 0.
    
3-Método tieneRaiz(): devuelve un booleano indicando si ambas soluciones son iguales. Para que esto ocurra, el discriminante debe ser igual que 0.
    
4-Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles soluciones.
    
5-Método obtenerRaiz(): llama a tieneRaiz(). Si este retorna true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
    
6-Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles 
    soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), 
    según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
    
Nota: Fórmula ecuación 2o grado: (-b ± √((b^2) - (4 * a * c))) / (2 * a) Solo varía el signo luego de -b
*/
public class EE1_RaicesServicio {
    static Scanner leer = new Scanner(System.in);
    static Random rand = new Random();
    
    
    
    public EE1_Raices crearCalculo(){
        EE1_Raices r = new EE1_Raices();
        
//        System.out.println("Ingrese a, b y c para buscar raices.");
//        r.setA(leer.nextDouble());
//        r.setB(leer.nextDouble());
//        r.setC(leer.nextDouble());
        
        r.setA(rand.nextInt(10));
        System.out.println("A:" + r.getA());
        r.setB(rand.nextInt(10));
        System.out.println("B:" + r.getB());
        r.setC(rand.nextInt(10));
        System.out.println("C:" + r.getC());
        
        return r;
    }

    public double getDiscriminante(EE1_Raices r){
        return Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();
    }
    
    public boolean tieneRaices(EE1_Raices r){
        return getDiscriminante(r) > 0;
    }
    
    public boolean tieneRaiz(EE1_Raices r){
        return getDiscriminante(r) == 0;
    }
    
    public void obtenerRaices(EE1_Raices r){
        if (tieneRaices(r)) {
            System.out.printf("Raiz 1: %.2f\n", (-(r.getB()) - Math.sqrt(getDiscriminante(r))) / (2 * r.getA()));
            System.out.printf("Raiz 2: %.2f\n", (-(r.getB()) + Math.sqrt(getDiscriminante(r))) / (2 * r.getA()));
        }
    }
    
    public void obtenerRaiz(EE1_Raices r){
        if (tieneRaiz(r)) {
            System.out.printf("Raices: %.2f\n", (-(r.getB()) / (2 * r.getA())));
        }
    }
    
    public void calcular(EE1_Raices r){
        if (tieneRaices(r)) {
            obtenerRaices(r);
        }else if(tieneRaiz(r)){
            obtenerRaiz(r);
        }else{
            System.out.println("No existe solucion :C.");
        }
    }
}
