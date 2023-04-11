////Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
////La variable A, debe terminar con el valor de la variable B.
//SubProceso inter(a Por Referencia, b Por Referencia, c)
//	c = a
//	a = b
//	b = c
//FinSubProceso
//
//
//Algoritmo sin_titulo
//	Definir a, b, c Como Entero
//	a = 1123
//	b = 40
//	c = 0
//	
//	Escribir "a: " a
//	Escribir "b: " b
//	Escribir "~~~~~~~~~~~~"
//	inter(a, b, c)
//	
//	Escribir "a: " a
//	Escribir "b: " b
//	
//FinAlgoritmo

////Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
////máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya pi-
////diendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
////programa pedirá el número de días que se van a introducir.

//SubProceso media(i, tMax Por Referencia, tMin Por Referencia)
//	Escribir "Temperatura maxima del dia " i
//	leer tMax
//	
//	Escribir "Temperatura minima del dia " i
//	Leer tMin
//	
//	Escribir "La media del dia " i " es: " (tMax + tMin) / 2
//	
//FinSubProceso
//
//Algoritmo asd
//	Definir i, tempMax, tempMin, nDias como real
//	tempMax= 0
//	tempMin= 0
//	
//	Escribir "Introduce los dias a medir"
//	Leer nDias
//	
//	Para i=1 Hasta nDias Con Paso 1 Hacer
//		media(i, tempMax, tempMin)
//	Fin Para
//	
//FinAlgoritmo

////Realizar un procedimiento que permita realizar la división entre dos números y muestre el co-
////ciente y el resto utilizando el método de restas sucesivas.

////El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta
////obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas
////realizadas es el cociente. Por ejemplo: 50 / 13:
////	50 - 13 = 37 una resta realizada
////	37 - 13 = 24 dos restas realizadas
////	24 - 13 = 11 tres restas realizadas
////dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

//SubProceso resCoc(nDividendo, nDivisor, acu)
//	
//	Mientras nDividendo >= nDivisor Hacer
//		nDividendo = nDividendo - nDivisor
//		acu = acu + 1
//	Fin Mientras
//	
//	Escribir "El residuo es: " nDividendo " y el cociente es: " acu
//FinSubProceso
//
//Algoritmo asd
//	Definir nDividendo, nDivisor, acu como real
//	acu = 0
//	
//	Escribir "Ingresa un numero dividendo"
//	leer nDividendo
//	Escribir "Ingresa un numero divisor"
//	Leer nDivisor
//	
//	resCoc(nDividendo,nDivisor, acu)
//	
//FinAlgoritmo

////Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
////en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal 
////se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo 
////a las vocales acentuadas) se mantienen sin cambios.

////a e i o u
////@ # $ % *

////Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. 
////Utilice la estructura "según" para la transformación.
////	Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
////	La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
////NOTA: investigue el uso de la función concatenar de PSeInt para armar la palabra/frase.

//SubProceso codificacion(carac, fraseCodi Por Referencia)
//	
//	Segun carac Hacer
//		"a", "A":
//			fraseCodi= fraseCodi + "@"
//		"e", "E":
//			fraseCodi= fraseCodi + "#"
//		"i", "I":
//			fraseCodi= fraseCodi + "$"
//		"o", "O":
//			fraseCodi= fraseCodi + "%"
//		"u", "U":
//			fraseCodi= fraseCodi + "*"
//		De Otro Modo:
//			fraseCodi= fraseCodi + carac
//	Fin Segun
//
//FinSubProceso
//
//Algoritmo asd
//	Definir frase, fraseCodi Como Caracter
//	Definir i Como Entero
//	
//	fraseCodi = ""
//	
//	Repetir
//		Escribir "Ingresa una frase terminada con un punto."
//		Leer frase
//	Mientras Que Subcadena(frase, Longitud(frase) -1, Longitud(frase) -1) <> "."
//	
//	Para i = 0 Hasta Longitud(frase) -1 Con Paso 1 Hacer
//		codificacion(Subcadena(frase, i, i), fraseCodi)
//	Fin Para
//
//	Escribir fraseCodi
//	
//FinAlgoritmo

////Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y muestra
////una cadena con un espacio adicional tras cada letra.
////Por ejemplo, "Hola, tú" devolverá "H o l a , t ú ". Crea un programa principal donde se use
////dicho procedimiento.

//SubProceso convertirEspaciado(i Por Referencia, text, textEsp Por Referencia)
//	Para i = 0 Hasta Longitud(text)-1 Con Paso 1 Hacer
//		Si Subcadena(text, i, i) <> " " Entonces
//			textEsp = textEsp + Subcadena(text, i, i) + " "
//		Fin Si
//	Fin Para
//FinSubProceso
//
//Algoritmo sad
//	Definir carac, textEsp, text Como Caracter
//	Definir i Como Entero
//	
//	textEsp= ""
//	
//	Escribir "Ingresa un texto"
//	Leer text
//	
//	convertirEspaciado(i, text, textEsp)
//	
//	Escribir textEsp
//	
//FinAlgoritmo

////Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta entre las
////letras "M" y "T". Recordar que Pseint le da un valor numérico a cada letra a través del Código
////Ascii, lo que nos deja usar operadores relacionales con letras y cadenas.
//SubProceso mensaje(letra)
//	Si letra == "M" O letra == "T" Entonces
//		Escribir "La letra esta entre la M y la T"
//	Fin Si
//FinSubProceso
//
//Algoritmo asd
//	Definir letra Como Caracter
//	Escribir "Ingresa una letra"
//	Leer letra
//	
//	mensaje(letra)
//	
//FinAlgoritmo

////Crear un programa que dibuje una escalera de números, donde cada línea de números comience 
////en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario al
////comenzar. Ejemplo: si se ingresa el número 3:
////	1
////	12
////	123
//SubProceso escalera(i Por Referencia, j Por Referencia, n)
//	
//	Para i = 1 Hasta n Con Paso 1 Hacer
//		
//		Para j = 1 Hasta i Con Paso 1 Hacer
//			Escribir j Sin Saltar
//		Fin Para
//		Escribir ""
//	Fin Para
//	
//FinSubProceso
//
//Algoritmo asd
//	Definir i, j, n Como Entero
//	Escribir "Ingrese un numero"
//	Leer n
//	
//	escalera(i, j, n)
//	
//FinAlgoritmo

////Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha anterior.
////Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba una fecha representada 
////a través de tres enteros dia, mes y anio, y retorne la fecha anterior. Puede asumir que	
////dia, mes y anio representan una fecha válida. Realice pruebas de escritorio para los valores
////dia=5, mes=10, anio=2012 y para dia=1, mes=3, anio=2004.
//SubProceso diaAnterior(dia Por Referencia, mes Por Referencia, anio Por Referencia)
//	
//	Si dia > 1 Entonces
//		dia = dia - 1
//	SiNo
//		
//		Segun mes Hacer
//			1, 01:
//				dia = 31
//				mes = 12
//				si anio < 0 Entonces
//					anio = anio + 1
//				SiNo
//					anio = anio - 1
//				FinSi
//				
//			2, 02:
//				dia = 31
//				mes = 1
//			3, 03:
//				dia = 28
//				mes = 2
//			4, 04:
//				dia = 31
//				mes = 3
//			5, 05:
//				dia = 30
//				mes = 4
//			6, 06:
//				dia = 31
//				mes = 5
//			7, 07:
//				dia = 30
//				mes = 6
//			8, 08:
//				dia = 31
//				mes = 7
//			9, 09:
//				dia = 31
//				mes = 8
//			10:
//				dia = 30
//				mes = 9
//			11:
//				dia = 31
//				mes = 10
//			12:
//				dia = 30
//				mes = 11
//			De Otro Modo:
//				Escribir "Ingresa un mes correcto"
//		Fin Segun
//		
//	Fin Si
//	
//FinSubProceso
//
//Algoritmo asd
//	Definir dia, mes, anio Como Entero
//	Repetir
//		Escribir "Dia en numero"
//		Leer dia
//		Escribir "Mes en numero"
//		leer mes
//		Escribir "Año en numero"
//		Leer anio
//		
//		si (dia < 1 O dia > 31) O (mes < 1 O mes > 12) O (anio > 2023) Entonces
//			Escribir "*********** ERROR! Fecha invalida ***********"
//		FinSi
//	Mientras Que (dia < 1 O dia > 31) O (mes < 1 O mes > 12) O (anio > 2023)
//	
//	
//	Escribir "Fecha ingresada: " dia "/" mes "/" anio
//	
//	diaAnterior(dia, mes, anio)
//	
//	Escribir "El dia anterior es: " dia "/" mes "/" anio
//	
//FinAlgoritmo

////Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales repetidas. 
////Al final el procedimiento mostrará la frase final.

////Por ejemplo:
////	Entrada: "Habia una vez un barco"
////	Salida: "Habi un vez n brco"
SubProceso eliVoc (i Por Referencia, frase, fraseSinVoc Por Referencia, aB Por Referencia, eB Por Referencia, iB Por Referencia, oB Por Referencia, uB Por Referencia)
	
	fraseSinVoc = ""
	aB= Falso
	eB= Falso
	iB= Falso
	oB= Falso
	uB= Falso
	
	Para i = 0 Hasta Longitud(frase) -1 Con Paso 1 Hacer
		
		Segun Subcadena(frase, i, i) Hacer
			"a", "A":
				si aB == Falso Entonces
					fraseSinVoc = fraseSinVoc + Subcadena(frase, i, i)
					aB = Verdadero
				FinSi
			"e", "E":
				si eB == Falso Entonces
					fraseSinVoc = fraseSinVoc + Subcadena(frase, i, i)
					eB = Verdadero
				FinSi
			"i", "I":
				si iB == Falso Entonces
					fraseSinVoc = fraseSinVoc + Subcadena(frase, i, i)
					iB = Verdadero
				FinSi
			"o", "O":
				si oB == Falso Entonces
					fraseSinVoc = fraseSinVoc + Subcadena(frase, i, i)
					oB = Verdadero
				FinSi
			"u", "U":
				si uB == Falso Entonces
					fraseSinVoc = fraseSinVoc + Subcadena(frase, i, i)
					uB = Verdadero
				FinSi
			De Otro Modo:
				fraseSinVoc = fraseSinVoc + Subcadena(frase, i, i)
		Fin Segun
		
	Fin Para
	
FinSubProceso

Algoritmo asd
	Definir frase, fraseSinVoc Como Caracter
	Definir i Como Entero
	Definir aB, eB, iB, oB, uB Como Logico
	
	Escribir "Ingresa una frase"
	Leer frase
	
	eliVoc(i, frase, fraseSinVoc, aB, eB, iB, oB, uB)
	
	Escribir fraseSinVoc
FinAlgoritmo
