////Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
////múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
////recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la
////compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
////vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto
////deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
////vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por
////cada venta.

//Algoritmo sin_titulo
//	Definir a, b, cantVendederos, cantVentas Como Entero
//	Definir suelBase, valVenta, comision Como Real
//	
//	comision = 0
//	
//	Escribir "Cantidad de vendedores"
//	Leer cantVendederos
//	
//	Para a = 1 Hasta cantVendederos Con Paso 1 Hacer
//		Escribir "Sueldo base del vendedor " a
//		Leer suelBase
//		Escribir "Cantidad de ventas que realizo el vendedor " a
//		Leer cantVentas
//		
//		Para b = 1 Hasta cantVentas Con Paso 1 Hacer
//			Escribir "Valor de la venta " b " que realizo el vendedor " a
//			Leer valVenta
//			
//			comision = comision + (valVenta * .10)
//		Fin Para
//		
//		Escribir "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~1~~~~~~~~~~~~~~~"
//		Escribir "El dinero que debe pagar al vendedor " a " por concepto de comisiones de las ventas realizadas es: " comision
//		Escribir "El sueldo total a pagar del vendedor " a " es: " suelBase + comision
//		Escribir "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
//		comision = 0
//		
//	Fin Para
//	
//FinAlgoritmo

////Realizar un programa que lea un número entero (tamaño del lado) y a partir de él cree un
////cuadrado de asteriscos de ese tamaño. Los asteriscos sólo se verán en el borde del
////cuadrado, no en el interior. Por ejemplo, si se ingresa el número 4 se debe mostrar:
////* * * *
////*     *
////*	  *
////* * * *
////	Nota: Recordar el uso del escribir sin saltar en PseInt.

//Algoritmo asd
//	Definir a, b, n Como Entero
//	Escribir "Ingresa un numero entero"
//	Leer n
//	
//	Para a = 1 Hasta n Con Paso 1 Hacer
//		
//		Para b = 1 Hasta n Con Paso 1 Hacer
//			
//			Si a > 1 Y a < n Y b > 1 Y b < n Entonces
//				Escribir "   " Sin Saltar
//			SiNo
//				Escribir "*  " Sin Saltar
//			Fin Si
//			
//		Fin Para
//		
//		Escribir ""
//		
//	Fin Para
//	
//FinAlgoritmo

////Escriba un programa que lea un número entero (altura) y a partir de él cree una escalera
////invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
////deberá mostrar:
////	*****
////	****
////	***
////	**
////	*

//Algoritmo asd
//	Definir a, b, n Como Entero
//	Escribir "Ingresa un numero entere"
//	Leer n
//	
//	Para a = 0 Hasta n Con Paso 1 Hacer
//		
//		Para b = 1 Hasta n - a Con Paso 1 Hacer
//			
//			Escribir "*" Sin Saltar
//			
//		Fin Para
//		Escribir ""
//		
//	Fin Para
//	
//FinAlgoritmo

////La función factorial se aplica a números enteros positivos. El factorial de un número entero
////positivo (!n) es igual al producto de los enteros positivos desde 1 hasta n:
////n! = 1 * 2 * 3 * 4 * 5 * (n-1) * n

////Escriba un programa que calcule las factoriales de todos los números enteros desde el 1
////hasta el 5. El programa deberá mostrar la siguiente salida:
////	!1 = 1
////	!2 = 1*2 = 2
////	...
////	!5 = 1*2*3*4*5 = 120

Algoritmo sad
	
	Definir a, b, acu Como Entero
	
	
	Para a = 1 Hasta 5 Con Paso 1 Hacer
		Escribir "!" a " = " Sin Saltar
		
		acu	= 1
		
		Para b = 1 Hasta a Con Paso 1 Hacer
			Si b < a Entonces
				Escribir b "*" Sin Saltar
			SiNo
				Escribir b Sin Saltar
			Fin Si
			
			acu = acu * b
			
		Fin Para
		
		Si a <> 1 Entonces
			Escribir " = " acu Sin Saltar
		Fin Si

		Escribir ""
		
	Fin Para
	
FinAlgoritmo
