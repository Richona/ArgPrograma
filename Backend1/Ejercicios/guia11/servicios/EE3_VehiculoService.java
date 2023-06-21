package guia11.servicios;

import guia11.entidades.EE3_Vehiculo;

/*

*/
public class EE3_VehiculoService {
    public EE3_Vehiculo crearVehiculoAuto(){
        EE3_Vehiculo v = new EE3_Vehiculo();

        v.setMarca("Toyota");

        v.setModelo("la mejor");

        v.setColor("rojo");
        
        v.setTipo("camioneta");

        v.setAnio(2023);

        v.setNumMotor(21443);

        v.setNumChasis(21440);
        
        return v;
    }
    
    public void mostrarVehiculo(EE3_Vehiculo v){
        System.out.println(v);
    }
    
}
