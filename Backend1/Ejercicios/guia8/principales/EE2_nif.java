package guia8.principales;
import guia8.entidades.EE2_NIF;
import guia8.servicios.EE2_NIFServicio;
import java.util.Random;//numeros aleatorios.
import javax.swing.JOptionPane;//entrada y salida de datos en modal.
import java.util.Scanner;

public class EE2_nif {
    /*
        Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente letra (NIF). Los atributos serán el número de DNI
	(entero largo) y la letra (String o char) que le corresponde junto a los métodos getters y setters para el número de DNI y la letra.
	En NIFService se dispondrá de los siguientes métodos:
	
	b) Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. Una vez calculado, le asigna la letra que
	le corresponde según
	c) Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).
	La letra correspondiente al dígito verificador se calculará a traves de un método que funciona de la siguiente manera: Para calcular la letra se
	toma el resto de dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en un array (vector) de
	caracteres la posición que corresponda al resto de la división paraobtener la letra correspondiente.
	La tabla de caracteres es la siguiente:
		POSICIÓN LETRA		POSICIÓN LETRA
		0			T		12			N
		1			R		13			J
		2			W		14			Z
		3			A		15			S
		4			G		16			Q
		5			M		17			V
		6			Y		18			H
		7			F		19			L
		8			P		20			C
		9			D		21			K
		10			X		22			E
		11			B
    */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        EE2_NIFServicio nif = new EE2_NIFServicio();

        EE2_NIF n = nif.crearNif(leer);
        
        nif.mostrar(n);
    }

}
