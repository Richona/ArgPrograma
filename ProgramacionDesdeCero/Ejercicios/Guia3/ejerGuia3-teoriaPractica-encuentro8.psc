////Vamos a hacer nuevamente el ejercicio de la vocal misteriosa, pero esta vez con una estructura
////Hacer-Mientras. ¿Puedes notar cuál es la diferencia entre ambas estructuras?

//Algoritmo sin_titulo
//	Definir vocalSec, vocalIng Como caracter
//	
//	vocalSec = "i"
//	
//	Repetir
//		Escribir "Ingresa una vocal hasta adivinar la secreta"
//		Leer vocalIng
//	Mientras Que vocalIng <> vocalSec
//	
//	Escribir "Excelente, vocal secreta adivinada!"
//	
//FinAlgoritmo

Algoritmo Correccion_HacerMientras
	definir num Como Entero
	Repetir
		Escribir "Ingrese un número PAR"
		Leer num
	Mientras Que num MOD 2 == 0
	
	Escribir "Ingresaste un numero impar"
FinAlgoritmo
