package guia8.entidades;

import java.util.Scanner;

/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente letra (NIF). Los atributos serán el número de DNI
(entero largo) y la letra (String o char) que le corresponde junto a los métodos getters y setters para el número de DNI y la letra.
*/
public class EE2_NIF {
    static Scanner leer = new Scanner(System.in);

    private long DNI;
    private char letra;

    public EE2_NIF() {
    }

    public EE2_NIF(long DNI, char letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "EE2_NIF{" + "DNI=" + DNI + ", letra=" + letra + '}';
    }
    
    
}
