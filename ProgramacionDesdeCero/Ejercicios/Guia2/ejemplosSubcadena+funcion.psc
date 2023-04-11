Funcion letras ( text, f, p1, p2 )
	
	Si text <> "0" Entonces
		Escribir text
		Escribir Subcadena(f, p1, p2)
		Escribir "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
		
	SiNo
		Definir i Como Entero
		
		Para i = 0 Hasta Longitud(f) - 1 Con Paso 1 Hacer
			Escribir Subcadena(f, i, i)
		Fin Para
		Escribir "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
	Fin Si
	
	
Fin Funcion

//// SUBCADENA
////Retorna una nueva cadena que consiste en la parte de la cadena S que va desde la posición X hasta la posición Y (incluyendo ambos extremos). 
////Las posiciones utilizan la misma base que los arreglos, por lo que la primer letra será la 0 o la 1 de acuerdo al perfil del lenguaje utilizado.

Algoritmo sin_titulo
	Definir f Como Caracter
	
	f = "Programación"
	
	//	primera letra Funcion 
	letras("primera letra de Programación `Subcadena(f, 0, 0)`", f, 0, 0)
	
	// tercera letra
	letras("tercera letra de Programación `Subcadena(f, 2, 2)`", f, 2, 2)
	
	// ultima letra
	letras("ultima letra de Programación `Subcadena(f, Longitud(f) - 1, Longitud(f) - 1)`", f, Longitud(f) - 1, Longitud(f) - 1)
	
	// primeras 3 letras
	letras("primeras 3 letras de Programación `Subcadena(f, 0, 2)`", f, 0, 2)
	
	//	5 letras del medio
	letras("5 letras del medio de Programación `Subcadena(f, 3, 7)`", f, 3, 7)
	
	//	ultimas 4 letras
	letras("ultimas 4 letras de Programación `Subcadena(f, Longitud(f) - 4, Longitud(f) - 1)`", f, Longitud(f) - 4, Longitud(f) - 1)
	
	//	listar todas las letras de programación
	letras("0", f, 0, 0)
	
FinAlgoritmo
