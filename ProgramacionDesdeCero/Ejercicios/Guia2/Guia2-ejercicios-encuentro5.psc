////Realiza un programa que sólo permita introducir los caracteres S y N. Si el usuario
////ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla que
////diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO".

//Algoritmo sin_titulo
//	Definir l Como Caracter
//	Escribir "Ingresa uno de estos caracteres: `S` o `N`"
//	Leer l
//	
//	Si l == "S" | l == "N" Entonces
//		Escribir "CORRECTO"
//	SiNo
//		Escribir "INCORRECTO"
//	Fin Si
//	
//FinAlgoritmo

////Realizar un programa que pida un número y determine si ese número es par o impar.
////Mostrar en pantalla un mensaje que indique si el número es par o impar. (para que un
////número sea par, se debe dividir entre dos y su resto debe ser igual a 0). Nota: investigar
////la función mod de PseInt.
//
//Algoritmo asd
//	Definir n Como Entero
//	Escribir "Ingresa un numero"
//	Leer n
//	
//	Si n MOD 2 == 0 Entonces
//		Escribir "Es par"
//	SiNo
//		Escribir "Es inpar"
//	Fin Si
//FinAlgoritmo

////Realizar un programa que pida introducir solo frases o palabras de 6 caracteres. Si el
////usuario ingresa una frase o palabra de 6 caracteres se deberá de imprimir un mensaje por
////pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO".
////Nota: investigar la función Longitud() de PseInt.

//Algoritmo asd
//	Definir f Como Caracter
//	Escribir "Ingresa solamente una frase de 6 caracteres"
//	Leer f
//	
//	Si Longitud(f) == 6 Entonces
//		Escribir "CORRECTO"
//	SiNo
//		Escribir "INCORRECTO"
//	Fin Si
//FinAlgoritmo

////Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4
////caracteres de largo, el programa le concatenara un signo de exclamación al final, y si no
////es de 4 caracteres el programa le concatenara un signo de interrogación al final. El
////programa mostrará después la frase final. Nota: investigar la función Longitud() y
////Concatenar() de PseInt.

//Algoritmo sad
//	Definir f Como Caracter
//	Escribir "Ingresa solamente una frase de 4 caracteres"
//	Leer f
//	
//	Si Longitud(f) == 4 Entonces
//		Escribir Concatenar(f, "!")
//	SiNo
//		Escribir Concatenar(f, "?")
//	Fin Si
//FinAlgoritmo

////Escriba un programa que pida 3 notas y valide si esas notas están entre 1 y 10. Si están
////entre esos parámetros se debe poner en verdadero una variable de tipo lógico y si no
////ponerla en falso. Al final el programa debe decir si las 3 notas son correctas usando la
////variable de tipo lógico.

//Algoritmo asd
//	Definir b Como Logico
//	Definir n1, n2, n3 Como Entero
//	Escribir "Ingresa la nota 1"
//	Leer n1
//	Escribir "Ingresa la nota 2"
//	Leer n2
//	Escribir "Ingresa la nota 3"
//	Leer n3
//	
//	b = (n1 > 0 & n1 < 11) & (n2 > 0 & n2 < 11) & (n3 > 0 & n3 < 11)
//	
//	Escribir "Las notas ingresadas tienen un valor de " b
//	
//	
//FinAlgoritmo

////Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
////es una A. Si la primera letra es una A, se deberá de imprimir un mensaje por pantalla
////que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO". Nota:
////investigar la función Subcadena de PseInt.

//Algoritmo asd
//Definir f Como Caracter
//Escribir "Ingresa una frase que comience con la letra `a`"
//Leer f
//
//Si Subcadena(Minusculas(f), 0, 0) == "a" Entonces
//	Escribir "CORRECTO"
//SiNo
//	Escribir "INCORRECTO"
//Fin Si
//	
//FinAlgoritmo

////Continuando el ejercicio anterior, ahora se pedirá una frase o palabra y se validara si la
////primera letra de la frase es igual a la última letra de la frase. Se deberá de imprimir un
////mensaje por pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir
////"INCORRECTO".

Algoritmo asd
	Definir f, lF Como Caracter
	Escribir "Ingresa una frase"
	Leer f

	Si Subcadena(Minusculas(f), 0, 0) == Subcadena(Minusculas(f), Longitud(f) - 1, Longitud(f) - 1) Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	Fin Si
FinAlgoritmo
	