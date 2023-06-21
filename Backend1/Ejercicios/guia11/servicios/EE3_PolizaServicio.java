package guia11.servicios;

import guia11.entidades.EE3_Poliza;
import java.util.Date;

/*

*/
public class EE3_PolizaServicio {
    private final EE3_VehiculoService vServ = new EE3_VehiculoService();
    private final EE3_ClienteService cliServ = new EE3_ClienteService();
    private final EE3_CuotaService cuoServ = new EE3_CuotaService();
    
    public EE3_Poliza crearPoliza(){
        return new EE3_Poliza(cliServ.crearClienteAuto(), vServ.crearVehiculoAuto(), cuoServ.crearCuotasAuto(), 
                123, new Date(), new Date(), "Efectivo", "contra todo", 1000000, 100000, true);
    }
    
    public void poliza(){
        EE3_Poliza p = crearPoliza();
        
        mostrarPoliza(p);
    }
    
    public void mostrarPoliza(EE3_Poliza p){
        System.out.println(p);
    }
    
}
