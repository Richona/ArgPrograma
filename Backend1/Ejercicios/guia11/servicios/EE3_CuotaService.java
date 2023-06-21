package guia11.servicios;

import guia11.entidades.EE3_Cuota;
import java.util.ArrayList;
import java.util.Date;

/*

*/
public class EE3_CuotaService {
    public ArrayList<EE3_Cuota> crearCuotasAuto(){
        ArrayList<EE3_Cuota> cuotas = new ArrayList();
        
        for (int i = 0; i < 3; i++) {
            cuotas.add(new EE3_Cuota(i + 1, (i + 1) * 100, true, new Date(), "Efectivo"));
        }
        
        return cuotas;
    }
    
    public void mostrasCuotas(ArrayList<EE3_Cuota> cuotas){
        for (EE3_Cuota cuota : cuotas) {
            System.out.println(cuota);
        }
    }
    
}
