package entidades;

/*

*/
public abstract class Animal {
    protected String nombre, alimento, raza;
    protected int edad;

    public Animal() {
    }

   public Animal(String nombre, String alimento, String raza, int edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }

    public abstract void alimentarse();
    
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", raza=" + raza + ", edad=" + edad + '}';
    }
}
