//// INICIALIZAR MATRIZ
////Inicializa la matriz con algún valor genérico en todas sus posiciones, por
////ejemplo con el número 0.
SubProceso inicializarMatriz(calculadora Por Referencia)
	Definir i, j, k Como Entero
	
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Para k = 0 Hasta 2 Con Paso 1 Hacer
				calculadora[i, j, k] = 0
			Fin Para
		Fin Para
	Fin Para
FinSubProceso

//// IMPRIMIR MATRIZ
SubProceso imprimirMatriz(calculadora)
	Definir i, j, k Como Entero
	
	Escribir " *** CAPA 0 ***     *** CAPA 1 ***        *** CAPA 2 ***"
	Escribir "__________________________________________________________"
	Para i = 0 Hasta 0 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir "|" Sin Saltar
			Para k = 0 Hasta 2 Con Paso 1 Hacer
				escribir "  " calculadora[0, j, k] " " Sin Saltar
			Fin Para
			Escribir "   |   " Sin Saltar
			Para k = 0 Hasta 2 Con Paso 1 Hacer
				escribir "  " calculadora[1, j, k] " " Sin Saltar
			Fin Para
			Escribir "   |   " Sin Saltar
			Para k = 0 Hasta 2 Con Paso 1 Hacer
				Si calculadora[2, j, k] > 9 Entonces
					escribir " " calculadora[2, j, k] "   " Sin Saltar
				SiNo
					escribir " " calculadora[2, j, k] "    " Sin Saltar
				Fin Si
			Fin Para
			Escribir "|"
		Fin Para
		Escribir "|_______________|__________________|_____________________|"
		Escribir ""
	Fin Para
FinSubProceso

////  LLENAR MATRIZ Z0
SubProceso llenarMatriz_Z0(calculadora, cadena1)
	Definir i, j, k, conta Como Entero
	conta = 0
	Para i = 0 Hasta 0 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Para k = 0 Hasta 2 Con Paso 1 Hacer
				calculadora[i, j, k] = convertirANumero(Subcadena(cadena1, conta, conta))
				conta = conta +1
			Fin Para
		Fin Para
	Fin Para
FinSubProceso

////  LLENAR MATRIZ Z1
SubProceso llenarMatriz_Z1(calculadora, cadena2)
	Definir i, j, k, conta Como Entero
	conta = 0
	Para i = 1 Hasta 1 Con Paso 1 Hacer
		Para j = 2 Hasta 0 Con Paso -1 Hacer
			Para k = 0 Hasta 2 Con Paso 1 Hacer
				calculadora[i, j, k] = convertirANumero(Subcadena(cadena2, conta, conta))
				conta = conta +1
			Fin Para
		Fin Para
	Fin Para
FinSubProceso

////  LLENAR MATRIZ Z2
SubProceso llenarMatriz_Z2(calculadora)
	Definir i, j, k, conta Como Entero
	conta = 0
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Para k = 0 Hasta 2 Con Paso 1 Hacer
				calculadora[2, j, k] = calculadora[0, j, k] * calculadora[1, j, k]
			Fin Para
		Fin Para
	Fin Para
FinSubProceso

Algoritmo Final
	//Definición de variables
	Definir calculadora Como Entero
	Definir cadena1, cadena2 Como Caracter
	Definir diagonal3D1, diagonal3D2 Como Entero
	
	//Definimos las 3 dimensiones de la matriz calculadora
	Dimension calculadora(3, 3, 3)
	
	//Asignamos valores a las cadenas de texto
	cadena1 = "123456789"
	cadena2 = "987654321"
	
	//Inicializamos la matriz
	inicializarMatriz(calculadora)
	
	//Llenamos las matrices como se marca en el enunciado
	llenarMatriz_Z0(calculadora, cadena1)
	llenarMatriz_Z1(calculadora, cadena2)
	llenarMatriz_Z2(calculadora)
	//Mostramos los resultados de la matriz
	imprimirMatriz(calculadora)
	//Asignamos los valores de las diagonales 3D
	diagonal3D1 = calculadora(0, 2, 0)*calculadora(1, 1,1)*calculadora(2, 0, 2)
	diagonal3D2 = calculadora(0, 0, 0)*calculadora(1, 1,1)*calculadora(2, 2, 2)
	//Escribimos los resultados de las diagonales
	Escribir "La multiplicación de los elementos (" calculadora(0, 2, 0) "*" calculadora(1, 1,1) "*" calculadora(2, 0, 2) ") de la diagonal 3D 1 es ", diagonal3D1
	Escribir "La multiplicación de los elementos (" calculadora(0, 0, 0) "*" calculadora(1, 1,1) "*" calculadora(2, 2, 2) ") de la diagonal 3D 2 es ", diagonal3D2
FinAlgoritmo
