package entidades;

/*
Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. 
*/
public class Gato extends Animal{
    @Override
    public void hacerRuido(){
        System.out.println("Miau");
    }
    
}
