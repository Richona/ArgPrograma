package principal;

import entidades.Edificio;
import entidades.EdificioDeOficinas;
import entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class EE2_EDIFICIOS {

    /*
        Crear una superclase llamada Edificio con los siguientes 
    atributos: ancho, alto y largo. 
    
        La clase edificio tendrá como métodos:
• Método calcularSuperficie(): 
    calcula la superficie del edificio.
    
• Método calcularVolumen(): 
    calcula el volumen del edifico.
    
Estos métodos serán abstractos y los implementarán estas clases:
• Clase Polideportivo:
    con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
    
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
    
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
    
    Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
    
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
     */
    static Random rand = new Random();
    final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList();

        edificios.add(new Polideportivo("Diego Maradona", true, 20, 6, 10));
        edificios.add(new Polideportivo("Lionel Messi", false, 20, 3, 10));

        edificios.add(new EdificioDeOficinas(0, 0, 0, 15, 3, 8));
        edificios.add(new EdificioDeOficinas(0, 0, 0, 20, 3, 8));

        int cantTechado = 0, cantAbierto = 0;

        for (Edificio edificio : edificios) {
            System.out.println("Superficie: " + edificio.calcularSuperficie());
            System.out.println("Volumen: " + edificio.calcularVolumen());

            if (edificio instanceof Polideportivo) {
                Polideportivo poli = (Polideportivo) edificio;
                
                if (poli.isTechado()) {
                    cantTechado++;
                } else {
                    cantAbierto++;
                }

            }

            if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas ediOfi = (EdificioDeOficinas) edificio;

                ediOfi.cantPersonasAuto();
            }
        }

        System.out.println("Cantidad polideportivos techados: " + cantTechado);
        System.out.println("Cantidad polideportivos abiertos: " + cantTechado);

    }

}
