package entidades;

import interfaces.PruebaInterfaz;

/*

*/
public class ApartePrueba implements PruebaInterfaz{

    @Override
    public void hablar() {
        System.out.println(NOMBRE + " Hablo");
    }

    @Override
    public void caminar() {
        System.out.println(NOMBRE + " Camino");
    }

    @Override
    public void comer() {
        System.out.println(NOMBRE + " Comio.");
    }
    
    
}
