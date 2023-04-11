////Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
////una clave. Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá
////mostrar un mensaje indicándonos que hemos agotado esos 3 intentos. Si acertamos la
////clave se deberá mostrar un mensaje que indique que se ha ingresado al sistema
////correctamente.

//Algoritmo sin_titulo
//	Definir claveSec, claveIng Como Caracter
//	Definir intentos como entero
//	
//	claveSec = "eureka"
//	intentos = 0
//	
//	Repetir
//		Escribir "Ingresa la clave secreta. Solo tienes 3 intentos"
//		Leer claveIng
//		
//		intentos = intentos +1
//		
//	Mientras Que intentos < 3 Y claveIng <> claveSec
//	
//	Si intentos == 3 Entonces
//		Escribir "Se te acabaron los intentos"
//	SiNo
//		Escribir "Se ha ingresado correctamente al sistema"
//	Fin Si
//	
//FinAlgoritmo

////Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
////programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
////todos ellos.
////Para poder lograr, por ejemplo, el máximo inicializaremos una variable en cero llamada
////numeroMaximo. Luego iremos comparando cada número que se ingresa con esta variable.
////Si es mayor reemplazaremos el valor de numeroMaximo. Por ejemplo, si 5 > 0 entonces el
////máximo entre estos números será 5. Si luego ingreso el número 2, se evalúa 2 > 5 lo que
////resultará falso y por lo tanto el valor 5 de numeroMaximo no se reemplaza. Una lógica
////similar tendrá el mínimo.

//Algoritmo sad
//	Definir num, numMax, numMin, contador, acumu Como Entero
//	Definir prom Como Real
//	
//	numMax = 0
//	numMin = 0
//	
//	contador = 0
//	acumu = 0
//	
//	Repetir
//		
//		Escribir "Ingresa un numero entero. Ingresa 0 si quieres terminar"
//		leer num
//		
//		Si num <> 0 Entonces
//			Si num > numMax Entonces
//				numMax = num
//			Fin Si
//			
//			Si num < numMin Entonces
//				numMin = num
//			Fin Si
//			
//			contador = contador + 1
//			acumu = acumu + num
//		Fin Si
//		
//	Mientras Que num <> 0
//	
//	Escribir "El numero maximo ingresado es: " numMax
//	Escribir "El numero minimo ingresado es: " numMin
//	Escribir "El promedio de todos los numeros es: " acumu / contador
//	
//FinAlgoritmo

////Realizar un programa que solicite al usuario su código de usuario (un número entero
////mayor que cero) y su contraseña numérica (otro número entero positivo). El programa no le
////debe permitir continuar hasta que introduzca como código 1024 y como contraseña 4567.
////El programa finaliza cuando ingresa los datos correctos.

//Algoritmo asd
//	Definir codigo, contra Como Entero
//	
//	Repetir
//		
//		Escribir "Ingresa su codigo de usuario. Numero entero mayor que cero"
//		Leer codigo
//		Escribir "Ingresa su contraseña. Numero entero positivo"
//		leer contra
//		
//		Si codigo <= 0 O contra <= 0 Entonces
//			Escribir "ERROR! El codigo y la contra deben ser mayor a 0"
//		Fin Si
//		
//		Si codigo <> 1024 O contra <> 4567 Entonces
//			Escribir "X-CREDENCIALES INVALIDAS-X"
//		Fin Si
//		
//	Mientras Que codigo <> 1024 O contra <> 4567
//	
//	Escribir "Inicio de sesion correcto."
//	
//FinAlgoritmo

////Se debe realizar un programa que:
////1o) Pida por teclado un número (entero positivo).
////2o) Pregunte al usuario si desea introducir o no otro número.
////3o) Repita los pasos 1o y 2o mientras que el usuario no responda n/N (no).
////4o) Muestre por pantalla la suma de los números introducidos por el usuario.

//Algoritmo asd
//	Definir res Como Caracter
//	Definir num, suma Como Entero
//	Escribir "Ingresa un numero entero positivo"
//	Leer num
//	
//	Si num > 0 Entonces
//		suma = num
//		
//		Repetir
//			Escribir "Quieres ingresar otro numero? ingresa n/N para terminar"
//			Leer res
//			
//			Si Mayusculas(res) <> "N" Entonces
//				Escribir "ingresa otro numero"
//				Leer num
//				
//				suma = suma + num
//			Fin Si
//			
//		Mientras Que Mayusculas(res) <> "N"
//		
//		Escribir "La suma de todos los numeros es: " suma
//		
//	SiNo
//		Escribir "ERROR. Ingresa un valor mayor a 0"
//	Fin Si
//	
//	
//FinAlgoritmo

////Hacer un algoritmo para calcular la media de los números pares e impares, sólo se
////ingresará diez números.

//Algoritmo asd
//	Definir n, acu, sumImpar, sumPar, conImpar, conPar Como Entero
//	
//	acu = 0
//	
//	sumImpar = 0
//	conImpar= 0
//	
//	sumPar = 0
//	conPar = 0
//	
//	Repetir
//		
//		Escribir "Ingresa un numero"
//		Leer n
//		
//		Si n MOD 2 == 0 Entonces
//			sumPar = sumPar + n
//			conPar = conPar + 1
//		SiNo
//			sumImpar = sumImpar + n
//			conImpar = conImpar +1
//		Fin Si
//		
//		acu = acu + 1
//		
//	Mientras Que acu < 10
//	
//	Si conPar > 0 Entonces
//		Escribir "La media de los numeros pares es: " sumPar / conPar
//	SiNo
//		Escribir "No se ingresaron numeros pares"
//	Fin Si
//	
//	si conImpar > 0 Entonces
//		Escribir "La media de los numeros impares es: " sumImpar / conImpar
//	SiNo
//		Escribir "No se ingresaron numeros impares"
//	FinSi
//	
//	
//FinAlgoritmo


////Se pide escribir un programa que calcule la suma de los N primeros números pares. Es
////decir, si ingresamos el número 5 como valor de N, el algoritmo nos debe realizar la suma
////de los siguientes valores: 2+4+6+8+10.

//Algoritmo asd
//	Definir n, suma Como Entero
//	
//	suma = 0
//	
//	Repetir
//		Escribir "Ingresa un numero par. Si ingresas impar termina."
//		Leer n
//		
//		Si n mod 2 == 0 Entonces
//			suma = suma + n
//		Fin Si
//		
//	Mientras Que n mod 2 == 0
//	
//	Escribir "La suma de los numeros pares es: " suma
//	
//FinAlgoritmo

////Programar un juego donde la computadora elige un número al azar entre 1 y 10, y a
////continuación el jugador tiene que adivinarlo. La estructura del programa es la siguiente:
////1o) El programa elige al azar un número n entre 1 y 10.
////2o) El usuario ingresa un número x.
////3o) Si x no es el número exacto, el programa indica si n es más grande o más pequeño que
////el número ingresado.
////4o) Repetimos desde 2) hasta que x sea igual a n.
////El programa tiene que imprimir los mensajes adecuados para informarle al usuario qué
////hacer y qué pasó hasta que adivine el número.
////NOTA: Para generar un número aleatorio entre 1 y 10 se puede utilizar la función
////Aleatorio(limite_inferior, limite_superior) de PseInt.

Algoritmo asd
	Definir nAle, nIng Como Entero
	
	nAle = Aleatorio(1, 10)
	
	Repetir
		Escribir "Ingresa un numero entre 1 y 10 para adivinar"
		Leer nIng
		
		Si nIng <> nAle Entonces
			
			Si nIng > nAle Entonces
				Escribir "Un numero mas bajo!"
			SiNo
				Escribir "Un numero mas alto!"
			Fin Si
			
		Fin Si
		
	Mientras Que nIng <> nAle
	
	Escribir "Excelente! Numero adivinado"
	
FinAlgoritmo
