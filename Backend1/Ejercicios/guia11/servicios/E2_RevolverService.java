package guia11.servicios;

import guia11.entidades.E2_Revolver;
import java.util.Random;

/*
*** Clase Revolver de agua: ***
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
*/
public class E2_RevolverService {
    private static final Random rand = new Random();
    private final int tamTambor = 6;
    
    public void llenarRevolver(E2_Revolver r){
        r.setPosActual(rand.nextInt(tamTambor) +1);
        r.setPosAgua(rand.nextInt(tamTambor) +1);
    }
    
    public boolean mojar(E2_Revolver r){
        return r.getPosAgua() == r.getPosActual();
    }
    
    public void siguienteChorro(E2_Revolver r){
        if (r.getPosActual() > tamTambor) {
            r.setPosActual(1);
        }else{
            r.setPosActual(r.getPosActual() +1);
        }
    }
    
    public String mostrarRevolver(E2_Revolver r) {
        return "La posición actual es: " + r.getPosActual() + " y la posición del agua es: " + r.getPosAgua();
    }
}
