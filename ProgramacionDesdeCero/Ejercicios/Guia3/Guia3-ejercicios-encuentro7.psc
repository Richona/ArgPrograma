////Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota
////se pedirá de nuevo hasta que la nota sea correcta.

//Algoritmo sin_titulo
//	Definir n Como Entero
//	Escribir "Ingrese una nota entre 0 y 10"
//	Leer n
//	
//	Mientras n < 0 O n > 10 Hacer
//		Escribir "Ingrese una correcta entre 0 y 10"
//		Leer n
//	Fin Mientras
//	
//	Escribir "Excelente, nota guardada"
//	
//FinAlgoritmo

////Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
////números al usuario hasta que la suma de los números introducidos supere el límite inicial.

//Algoritmo asd
//	Definir numLimite, numIng, acu Como Entero
//	Escribir "Ingresa un valor limite positivo"
//	Leer numLimite
//	acu = 0
//	Mientras acu <= numLimite Hacer
//		Escribir "Ingresa otro numero para superar el limite"
//		Leer numIng
//		acu = acu + numIng
//	Fin Mientras
//	
//FinAlgoritmo

////Dada una secuencia de números ingresados por teclado que finaliza con un -1, por
////ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,......,-1; realizar un programa que calcule el promedio de los
////números ingresados. Suponemos que el usuario no insertará número negativos.

//Algoritmo asd
//	Definir acuCan, acuSum, num Como Entero
//	Escribir "Ingresa numeros hasta que te canses y pongas -1"
//	Leer num
//	
//	acuCan = 0
//	acuSum = 0
//	Mientras num <> -1 Hacer
//		acuCan = acuCan + 1
//		acuSum = acuSum + num
//		
//		Escribir "Ingresa otro numero hasta que te canses y pongas -1"
//		Leer num
//	Fin Mientras
//	
//	Escribir acuSum 
//	Escribir "El promedio de todos los numeros ingresados es: " acuSum / acuCan
//	
//FinAlgoritmo

////Escriba un programa en el cual se ingrese un número y mientras ese número sea mayor
////de 10, se pedirá el número de nuevo.

//Algoritmo asd
//	Definir n Como Entero
//	Escribir "Ingrese un numero, mientras sea mayor a 10 se te pedira otra vez"
//	Leer n
//	
//	Mientras n > 10 Hacer
//		Escribir "Ingrese otro numero, mientras sea mayor a 10 se te pedira otra vez"
//		Leer n
//	Fin Mientras
//	
//FinAlgoritmo

////Escriba un programa que solicite dos números enteros (mínimo y máximo). A continuación,
////se debe pedir al usuario que ingrese números enteros situados entre el máximo y mínimo.
////Cada vez que un número se encuentre entre ese intervalo, se sumara uno a una variable.
////El programa terminará cuando se escriba un número que no pertenezca a ese intervalo, y
////al finalizar se debe mostrar por pantalla la cantidad de números ingresados dentro del
////intervalo.

//Algoritmo asd
//	Definir numMin, numMax, numIng, acu Como Entero
//	Escribir "Ingresa un numero que sea el minimo y otro el maximo para un intervalo"
//	Leer numMin, numMax
//	
//	Escribir "Ingresa numeros enteros situados entre el minimo y maximo"
//	Leer numIng
//	
//	acu = 0
//	
//	Mientras numIng > numMin Y numIng < numMax Hacer
//		acu = acu + 1
//		
//		Escribir "Ingresa otro numero que este entre el intervalo, si quieres terminar ya sabes como (numero fuera del intervalo)"
//		leer numIng
//	Fin Mientras
//	
//	Escribir "La cantidad de numeros ingresados dentro del intervalo es: " acu
//	
//FinAlgoritmo

////Escriba un programa que solicite al usuario números decimales mientras que el usuario
////escriba números mayores al primero que se ingresó. Por ejemplo: si el usuario ingresa
////como primer número un 3.1, y luego ingresa un 4, el programa debe solicitar un tercer
////número. El programa continuará solicitando valores sucesivamente mientras los valores
////ingresados sean mayores que 3.1, caso contrario, el programa finaliza.

//Algoritmo asd
//	Definir numIng, numMin Como Real
//	Escribir "Ingresa un numero como base"
//	Leer numMin
//	numIng = numMin + 1
//	
//	Mientras numIng > numMin Hacer
//		Escribir "Ingresa otro numero mientras sea mayor al primero, si es menor termina el proceso."
//		leer numIng
//	Fin Mientras
//	
//	
//FinAlgoritmo

////Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se
////calcula según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas vale
////el 50% y la parte teórica el 40%. El programa leerá el nombre del alumno, las tres notas
////obtenidas, mostrará el resultado por pantalla, y a continuación volverá a pedir los datos del
////siguiente alumno hasta que el nombre sea una cadena vacía. Las notas deben estar
////comprendidas entre 0 y 10, y si no están dentro de ese rango no se imprimirá el promedio
////y se mostrará un mensaje de error.

//Algoritmo assd
//	Definir nombre Como Caracter
//	Definir n1, n2, n3, prom Como real
//	
//	Escribir "Ingresa el nombre del alumno"
//	Leer nombre
//	Escribir "Ingresa la nota de la practica"
//	Leer n1
//	Escribir "Ingresa la nota de problemas"
//	Leer n2
//	Escribir "ingresa la nota teorica"
//	Leer n3
//	
//	Mientras nombre <> "" Hacer
//		
//		Si (n1 >= 0 Y n1 <= 10) Y (n2 >= 0 Y n2 <= 10) Y (n3 >= 0 Y n3 <= 10) Entonces
//			prom = (n1 * .10) + (n2 * .50) + (n3 * .40)
//			Escribir "El promedio del alumno " nombre " es: " prom
//		SiNo
//			Escribir "Error, las notas deben estar entre 0 y 10, ingresa nuevamente los datos"
//		Fin Si
//		
//		Escribir "Ingresa el nombre del alumno, para terminar el proceso no pongas nombre"
//		Leer nombre
//		
//		Si nombre <> "" Entonces
//			Escribir "Ingresa la nota de la practica"
//			Leer n1
//			Escribir "Ingresa la nota de problemas"
//			Leer n2
//			Escribir "ingresa la nota teorica"
//			Leer n3
//		Fin Si
//		
//	Fin Mientras
//	
//FinAlgoritmo

////Escribir un programa que calcule cuántos dígitos tiene un número entero positivo sin
////convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
////investigar la función trunc().

Algoritmo asd
	Definir n, acu como entero
	Escribir "Ingresa un numero"
	Leer n
	
	acu = 0
	
	Mientras n >= 1 Hacer
		n = trunc(n/10)
		acu	= acu + 1
	Fin Mientras
	
	Escribir "El numero tiene " acu " digitos"
	
FinAlgoritmo
	