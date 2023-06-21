package guia11.servicios;

import guia11.constantes.EE2_Constantes;
import guia11.entidades.EE2_Asiento;

/*

*/
public class EE2_AsientoService {
    public EE2_Asiento[][] crearSala(){
        EE2_Asiento[][] sala = new EE2_Asiento[EE2_Constantes.FILAS][EE2_Constantes.COLUMNAS];

        for (int i = EE2_Constantes.FILAS -1; i >= 0; i--) {
            for (int j = 0; j < EE2_Constantes.COLUMNAS; j++) {
                sala[i][j] = new EE2_Asiento(i+1, EE2_Constantes.LETRAS[j]);
            }
        }
        
        return sala;
    }
    
    public void mostrarSala(EE2_Asiento[][] sala){
        for (int i = EE2_Constantes.FILAS -1; i >= 0; i--) {
            System.out.print("|");
            for (int j = 0; j < EE2_Constantes.COLUMNAS; j++) {
                System.out.print("  " +sala[i][j] + " |");
            }
            System.out.println("");
        }
    }
}
