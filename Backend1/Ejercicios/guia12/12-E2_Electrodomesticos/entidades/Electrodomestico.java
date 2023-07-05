package entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
Crear una superclase llamada Electrodoméstico con los 
    siguientes atributos: precio, color, consumo energético 
    (letras entre A y F) y peso.
    
*** Los constructores a hacer son los siguientes: ***
• Un constructor vacío.
    
• Un constructor con todos los atributos pasados por parámetro.
    
*** Los métodos a implementar son: ***
• Métodos getters y setters de todos los atributos.
    
• Método comprobarConsumoEnergetico(char letra): 
    comprueba que la letra es correcta, sino es correcta usara 
    la letra F por defecto. Este método se debe invocar al 
    crear el objeto y no será visible.
    
• Método comprobarColor(String color): 
    comprueba que el color es correcto, y si no lo es, usa el 
    color blanco por defecto. Los colores disponibles para los 
    electrodomésticos son blanco, negro, rojo, azul y gris. 
    No importa si el nombre está en mayúsculas o en minúsculas. 
    Este método se invocará al crear el objeto y no será visible.
    
• Metodo crearElectrodomestico(): 
    le pide la información al usuario y llena el electrodoméstico, 
    también llama los métodos para comprobar el color y el consumo. 
    Al precio se le da un valor base de $1000.
    
• Método precioFinal(): 
    según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
    LETRA      PRECIO           PESO                    PRECIO
    A    ->    $1000            Entre 1 y 19 kg    ->   $100
    B    ->    $800             Entre 20 y 49 kg   ->   $500
    C    ->    $600             Entre 50 y 79 kg   ->   $800
    D    ->    $500             Mayor que 80 kg    ->   $1000
    E    ->    $300
    F    ->    $100
 */
public class Electrodomestico {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Random rand = new Random();

    private final List<String> COLORES = Arrays.asList("blanco", "negro", "rojo", "azul", "gris");
    private final List<Character> LETRAS = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F');

    protected double precio;
    protected String color;
    protected char consumoElectrico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoElectrico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoElectrico = consumoElectrico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(char consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    protected void comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            this.consumoElectrico = letra;
        } else {
            this.consumoElectrico = 'F';
        }
    }

    protected void comprobarColor(String color) {
        if (COLORES.contains(color.toLowerCase())) {
            this.color = color;
        } else {
            this.color = "Blanco";
        }
    }

    public void crearElectrodomestico() {
        System.out.println("Precio:");
        this.precio = leer.nextDouble() + 1000;

        System.out.println("Color:");
        comprobarColor(leer.next());

        System.out.println("Consumo electrico:");
        comprobarConsumoEnergetico(leer.next().toUpperCase().charAt(0));

        System.out.println("Peso:");
        this.peso = leer.nextInt();
    }

    public void crearElectrodomesticoAuto() {
        this.precio = rand.nextInt(200000) + 1;

        this.color = COLORES.get(rand.nextInt(5));

        this.consumoElectrico = LETRAS.get(rand.nextInt(6));

        this.peso = rand.nextInt(200) + 1;
    }

    public void precioFinal() {
        switch (this.consumoElectrico) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;
        }
        
        if (this.peso >= 1 && this.peso <= 19) {
            this.precio += 100;
        }
        
        if (this.peso >= 20 && this.peso <= 49){
            this.precio += 500;
        }
        
        if (this.peso >= 50 && this.peso <= 79) {
            this.precio += 800;
        }
        
        if (this.peso >= 80){
            this.precio += 1000;
        }
                
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoElectrico=" + consumoElectrico + ", peso=" + peso + '}';
    }
}
