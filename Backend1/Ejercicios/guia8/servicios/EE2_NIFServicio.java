package guia8.servicios;

import guia8.entidades.EE2_NIF;
import java.util.Scanner;

/*
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
public class EE2_NIFServicio {
    private static final char letrasNIF[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    
    public EE2_NIF crearNif(Scanner leerNS){
        EE2_NIF nif = new EE2_NIF();
        
        System.out.println("Ingrese su DNI:");
        nif.setDNI(leerNS.nextLong());
        
        nif.setLetra(letrasNIF[(int)nif.getDNI() % 23]);
        
        return nif;
    }
    
    public void mostrar(EE2_NIF nif){
        System.out.printf("NIF: %d-%c%n", nif.getDNI(), nif.getLetra());
    }
}
