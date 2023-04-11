////Construir un programa que simule un menú de opciones para realizar las cuatro
////operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
////numéricos enteros. El usuario, además, debe especificar la operación con el primer
////carácter de la operación que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta, ?M?
////o ?m? para la multiplicación y ?D? o ?d? para la división.

//Algoritmo sin_titulo
//	Definir n1, n2 Como Entero
//	Definir op Como Caracter
//	Escribir "Ingresa 2 numeros enteros"
//	Leer n1, n2
//	
//	Escribir "Ingresa la operacion que quieras realizar. `s` para sumar / `r` para restar / `m` para multiplicar / `d` para dividir"
//	Leer op
//	
//	Segun op Hacer
//		"s", "S":
//			Escribir "La suma de " n1 " y " n2 " es: " n1 + n2
//		"r", "R":
//			Escribir "La resta de " n1 " y " n2 " es: " n1 - n2
//		"m", "M":
//			Escribir "La multiplicacion de " n1 " y " n2 " es: " n1 * n2
//		"d", "D":
//			Escribir "La division de " n1 " y " n2 " es: " n1 / n2
//		De Otro Modo:
//			Escribir "Operacion incorrecta"
//	Fin Segun
//	
//FinAlgoritmo

////Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
////En caso de que el valor ingresado sea 0, se debe mostrar "el número no es par ni impar".
////Nota: investigar la función mod de PSeInt

//Algoritmo asd
//	Definir num Como Entero
//	Escribir "Ingresa un numero entero"
//	Leer num
//	
//	Si num <> 0 Entonces
//		Si num MOD 2 == 0 Entonces
//			Escribir "Es par"
//		SiNo
//			Escribir "Es impar"
//		Fin Si
//	SiNo
//		Escribir "el número no es par ni impar"
//	Fin Si
//	
//FinAlgoritmo

////Escriba un programa para obtener el grado de eficiencia de un operario de una fábrica de
////tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un período
////de prueba:
////	? Producir menos de 200 tornillos defectuosos.
////	? Producir más de 10000 tornillos sin defectos.
////	? El grado de eficiencia se determina de la siguiente manera:
////	? Si no cumple ninguna de las condiciones, grado 5.
////	? Si sólo cumple la primera condición, grado 6.
////	? Si sólo cumple la segunda condición, grado 7.
////	? Si cumple las dos condiciones, grado 8
////	Nota: para trabajar este ejercicio de manera prolija, ir probando cada inciso que pide el
////	ejercicio. No hacer todos al mismo tiempo y después probar.

Algoritmo asd
	Definir torDefec, torSinDefec Como Entero
	Escribir "ingresa la cantidad de tornillos defectuosos"
	Leer torDefec
	
	Escribir "Ingresa la cantidad de tornillos sin defectos"
	Leer torSinDefec
	
	Si torDefec < 200 O torSinDefec > 10000 Entonces
		
		Si torDefec > 200 O torSinDefec < 10000 Entonces
			
			Si torDefec < 200 Y torSinDefec < 10000 Entonces
				Escribir "El grado de eficiencia es 6"  
			SiNo
				Escribir "El grado de eficiencia es 7" 
			Fin Si
			
		SiNo
			Escribir "El grado de eficiencia es 8" 
		Fin Si
		
	SiNo
		Escribir "El grado de eficiencia es 5"
	Fin Si
	
FinAlgoritmo
	