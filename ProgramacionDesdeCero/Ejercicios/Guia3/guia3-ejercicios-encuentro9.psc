////Escribir un programa que calcule el cuadrado de los 9 primeros números naturales e
////imprima por pantalla el número seguido de su cuadrado. Ejemplo: "2 elevado al cuadrado
////es igual a 4", y así sucesivamente.

//Algoritmo sin_titulo
//	Definir i Como Entero
//	
//	Para i = 1 Hasta 9 Con Paso 1 Hacer
//		Escribir i " elevado al cuadrado es igual a " i ^ 2
//	Fin Para
//	
//FinAlgoritmo

////Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
////espacio entre cada letra. La frase se mostrará así: H o l a. Nota: recordar el funcionamiento
////de la función Subcadena().
////NOTA:. En PseInt, si queremos escribir sin que haya saltos de línea, al final de la operación
////"escribir" escribimos "sin saltar". Por ejemplo:
////Escribir sin saltar "Hola, "
////Escribir sin saltar "cómo estás?"
////Imprimirá por pantalla: Hola, cómo estás?

//Algoritmo asd
//	Definir i Como Entero
//	Definir f Como Caracter
//	Escribir "Ingresa una frase"
//	Leer f
//	
//	Para i = 0 Hasta Longitud(f) Con Paso 1 Hacer
//		Escribir Subcadena(f, i, i) " " Sin Saltar
//	Fin Para
//FinAlgoritmo

////Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
////N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
////Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves de
////sus estudiantes:
//// # Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante reprueba el curso si tiene una nota final inferior a 6.5
//// # Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
//// # La mayor nota obtenida en las exposiciones.
//// # Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
////El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá
////las 3 notas y calculará todos informes claves que requiere el docente.

//Algoritmo asd
//	Definir i, cantAlum, acuReprob, acuAlumParc Como entero
//	Definir nPractInt1, nExpo2, nParc3, prom, sumReprob, acuInt7_5, nMayExpo Como Real
//	
//	acuReprob = 0
//	sumReprob = 0
//	
//	acuInt7_5 = 0
//	
//	nMayExpo = 0
//	
//	acuAlumParc = 0
//	
//	Escribir "Ingresa la cantidad de alumnos"
//	Leer cantAlum
//	
//	Para i = 1 Hasta cantAlum Con Paso 1 Hacer
//		Escribir "Ingresa las 3 notas del alumno numero " i 
//		Leer nPractInt1, nExpo2, nParc3
//		
//		prom = (nPractInt1 * .35) + (nExpo2 * .25) + (nParc3 * .40) 
//		
//		Si prom < 6.5 Entonces
//			acuReprob = acuReprob + 1
//			sumReprob = sumReprob + prom
//		Fin Si
//		
//		Si nPractInt1 > 7.5 Entonces
//			acuInt7_5 = acuInt7_5 + 1
//		Fin Si
//		
//		Si nExpo2 > nMayExpo Entonces
//			nMayExpo = nExpo2
//		Fin Si
//		
//		Si nParc3 >= 4.0 Y nParc3 <= 7.5 Entonces
//			acuAlumParc = acuAlumParc +1
//		Fin Si
//		
//	Fin Para
//	
//	Escribir "La nota promedio final de reprobados es: " sumReprob / acuReprob
//	Escribir "El porcentaje de alumnos con nota de integrador mayor a 7.5 es: " (acuInt7_5 * 100) / cantAlum "%"
//	Escribir "La nota mayor en las exposiciones es: " nMayExpo
//	Escribir "El total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5 es: " acuAlumParc
//	
//FinAlgoritmo

////Realizar un programa que muestre la cantidad de números que son múltiplos de 2 o de 3
////comprendidos entre 1 y 100.

//Algoritmo asd
//	Definir i, acu2, acu3 Como Entero
//	
//	acu2=0
//	acu3=0
//	
//	Para i = 1 Hasta 100 Con Paso 1 Hacer
//		Si i mod 2 == 0 Entonces
//			Escribir "Numero multiplo de 2: " i
//			acu2 = acu2 + 1
//		Fin Si
//		
//		Si i mod 3 == 0 Entonces
//			Escribir "Numero multiplo de 3: " i
//			acu3 = acu3 + 1
//		Fin Si
//	Fin Para
//	
//	Escribir "Cantidad de numeros multiplo de 2: " acu2
//	Escribir "Cantidad de numeros multiplo de 3: " acu3
//	
//FinAlgoritmo

////Escribir un programa que calcule la suma de los N primeros números naturales. El valor de
////N se leerá por teclado.

//Algoritmo asd
//	Definir i, n, suma Como Entero
//	suma = 0
//	
//	Repetir
//		Escribir "Ingresa un numero mayor a 0"
//		Leer n
//	Mientras Que n <= 0
//	
//	Para i = 0 Hasta n Con Paso 1 Hacer
//		suma = suma + i
//	Fin Para
//	
//	Escribir "La suma de los primeros numeros naturales es: " suma
//	
//FinAlgoritmo

////Siguiendo el ejercicio 2 de los ejercicios principales, ahora deberemos hacer lo mismo
////pero que la cadena se muestre al revés. Por ejemplo, si tenemos la cadena: Hola,
////deberemos mostrar a l o H.

Algoritmo asd
	Definir i Como Entero
	Definir f Como Caracter
	Escribir "Ingresa una frase"
	Leer f
	
	Para i = Longitud(f) Hasta 0 Con Paso -1 Hacer
		Escribir Subcadena(f, i, i) " " Sin Saltar
	Fin Para
FinAlgoritmo
