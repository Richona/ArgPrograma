package interfaces;

/*
Vamos a crear una interfaz con un método abstracto. Luego desde el main intentaremos instanciar
un objeto a partir de la interfaz
*/
public interface PruebaInterfaz {
    public final String NOMBRE = "qsy";
    
    public abstract void hablar();
    public abstract void caminar();
    public abstract void comer();
    
}
