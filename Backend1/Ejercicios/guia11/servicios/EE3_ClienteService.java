package guia11.servicios;

import guia11.entidades.EE3_Cliente;

/*

*/
public class EE3_ClienteService {
    public EE3_Cliente crearClienteAuto(){
        return new EE3_Cliente("Richard", "Cuevas", "richona@gmail.com", "su casa", 123, 12345);
    }
    
    public void mostrarCliente(EE3_Cliente c){
        System.out.println(c);
    }
}
