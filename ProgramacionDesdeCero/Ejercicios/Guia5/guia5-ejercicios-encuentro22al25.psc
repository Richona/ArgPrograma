////Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el usuario y
////los muestre por pantalla.

Algoritmo sin_titulo
	Definir matriz, i, j Como Entero
	Dimension matriz[3,3]
	
	Escribir "Ingrese 9 numeros"
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir "Valor para la posicion [" i ", " j " ]"
			Leer matriz[i, j]
		Fin Para
	Fin Para
	
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir "Valor de la posicion [" i ", " j " ] : "  matriz[i, j]
		Fin Para
	Fin Para
FinAlgoritmo

////Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
////usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las coordenadas
////donde se encuentra el valor, es decir en que fila y columna se encuentra. En caso de no
////encontrar el valor dentro de la matriz se debe mostrar un mensaje.

//Algoritmo asd
//	Definir matriz, i, j, n Como Entero
//	Definir b Como Logico
//	Dimension matriz[5,5]
//	
//	Para i = 0 Hasta 4 Con Paso 1 Hacer
//		Para j = 0 Hasta 4 Con Paso 1 Hacer
//			matriz[i,j] = Aleatorio(0, 50)
//		Fin Para
//	Fin Para
//	
//	Escribir "Numero a buscar en la matriz: "
//	Leer n
//	
//	b = Falso
//	Para i = 0 Hasta 4 Con Paso 1 Hacer
//		Para j = 0 Hasta 4 Con Paso 1 Hacer
//			Si matriz[i,j] == n Entonces
//				b = Verdadero
//				
//				Escribir "El valor " n " se encuentra en las coordenadas [" i ", " j "]"
//			Fin Si
//		Fin Para
//	Fin Para
//	
//	Si !b Entonces
//		Escribir "No se encontre el valor " n " dentro de la matriz :C"
//	Fin Si
//	
//FinAlgoritmo

////Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
////un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro subprograma
////que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y los resultados por pantalla.
//SubProceso suma(matriz, n, m, sum Por Referencia)
//	Definir i, j Como Entero
//	sum = 0
//	Para i = 0 Hasta n -1 Con Paso 1 Hacer
//		Para j = 0 Hasta m -1 Con Paso 1 Hacer
//			sum = sum + matriz[i,j]
//		Fin Para
//	Fin Para
//	
//	Escribir "La suma de todo es: " sum
//FinSubProceso
//
//SubProceso llenadoAlea(matriz Por Referencia, n, m)
//	Definir i, j Como Entero
//	Para i = 0 Hasta n -1 Con Paso 1 Hacer
//		Para j = 0 Hasta m -1 Con Paso 1 Hacer
//			matriz[i,j] = Aleatorio(0, 50)
//		Fin Para
//	Fin Para
//	
//	Para i = 0 Hasta n -1 Con Paso 1 Hacer
//		Para j = 0 Hasta m -1 Con Paso 1 Hacer
//			Escribir "Valor de la posicion [" i ", " j " ] : "  matriz[i, j]
//		Fin Para
//	Fin Para
//FinSubProceso
//
//Algoritmo asd
//	Definir matriz, n, m, sum Como Entero
//	
//	Repetir
//		Escribir "Tamaño filas y columnas"
//		Leer n, m
//	Mientras Que n < 1 O m < 1
//	
//	Dimension matriz[n,m]
//	
//	llenadoAlea(matriz, n, m)
//	
//	suma(matriz, n, m, sum)
//	
//	
//FinAlgoritmo

////Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal
////principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro subproceso para imprimir la matriz.
//SubProceso imprimirMatriz(matriz)
//	Definir i, j Como Entero
//	Para i = 0 Hasta 4 Con Paso 1 Hacer
//		Para j = 0 Hasta 4 Con Paso 1 Hacer
//			Escribir " "  matriz[i, j] " " Sin Saltar
//		Fin Para
//		Escribir ""
//	Fin Para
//FinSubProceso
//
//SubProceso diagonal(matriz Por Referencia)
//	Definir i, j Como Entero
//	Para i = 0 Hasta 4 Con Paso 1 Hacer
//		Para j = 0 Hasta 4 Con Paso 1 Hacer
//			Si i - j == 0 Entonces
 //				matriz[i,j] = 0
//			SiNo
//				matriz[i,j] = Aleatorio(0, 50)
//			Fin Si
//		Fin Para
//	Fin Para
//FinSubProceso
//
//Algoritmo asd
//	Definir matriz Como Entero
//	Dimension matriz[5,5]
//	
//	diagonal(matriz)
//	
//	imprimirMatriz(matriz)
//FinAlgoritmo
//	

////Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario, encontrando 
////la manera de que la frase se muestre de manera continua en la matriz.
////Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:
////	H A B
////	I L I
////	D A D
////Nota: recordar el uso de la función Subcadena().

//Algoritmo asd
//	Definir i, j, conta Como Entero
//	Definir matriz, frase Como Caracter
//	
//	Dimension matriz[3,3]
//	
//	Repetir
//		Escribir "Ingrese una frase de 9 caracteres"
//		Leer frase
//	Mientras Que Longitud(frase) <> 9
//	
//	conta = 0
//	
//	Para i = 0 Hasta 2 Con Paso 1 Hacer
//		Para j = 0 Hasta 2 Con Paso 1 Hacer
//			matriz[i, j] = Mayusculas(Subcadena(frase, conta , conta))
//			conta = conta + 1
//		Fin Para
//		
//	Fin Para
//	
//	Para i = 0 Hasta 2 Con Paso 1 Hacer
//		Para j = 0 Hasta 2 Con Paso 1 Hacer
//			Escribir matriz[i,j] " " Sin Saltar
//		Fin Para
//		Escribir ""
//	Fin Para
//	
//FinAlgoritmo

////Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que
////tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
////Por ejemplo:
////	2 7 6
////	9 5 1
////	4 3 8	
////En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un algoritmo
////que compruebe si una matriz de datos enteros es mágica o no, y en caso de que sea		
////mágica escribir la suma. Además, el programa deberá comprobar que los números introducidos
////son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el tamaño de la matriz		
////que no debe superar orden igual a 10.

Algoritmo ads
	Definir matriz, sumaFilas, sumaColumnas, sumaDiag1, sumaDiag2, i, j, conta, tam, n Como Entero
	Definir condicion Como Logico
	
	Repetir
		Escribir "Tamaño de la matriz: "
		Leer tam
		Si tam < 2 O tam > 3 Entonces
			Escribir "ERROR! numero fuera de rango"
		Fin Si
	Mientras Que tam < 2 O tam > 3
	
	dimension matriz[tam, tam], sumaFilas[tam], sumaColumnas[tam]
	
	Escribir "Ingresa " tam * tam " numeros"
	Para i = 0 Hasta tam-1 Con Paso 1 Hacer
		Para j = 0 Hasta tam-1 Con Paso 1 Hacer
			
			Repetir
				Leer n
				Si n < 1 O n > 10 Entonces
					Escribir "ERROR! numero fuera de rango"
				SiNo
					matriz[i,j] = n
				Fin Si
			Mientras Que n < 1 O n > 10
			
		Fin Para
	Fin Para
	
	Para i = 0 Hasta tam-1 Con Paso 1 Hacer
		sumaColumnas[i] = 0
		sumaFilas[i] = 0
	Fin Para
	
	sumaDiag1 = 0
	sumaDiag2 = 0
	Para i = 0 Hasta tam-1 Con Paso 1 Hacer
		Para j = 0 Hasta tam-1 Con Paso 1 Hacer
			sumaFilas[i] = sumaFilas[i] + matriz[i, j]
			sumaColumnas[i] = sumaColumnas[i] + matriz[j, i]
			
			Si i == j Entonces
				sumaDiag1 = sumaDiag1 + matriz[i, j]
			Fin Si
			
			Si i + j == tam-1 Entonces
				sumaDiag2 = sumaDiag2 + matriz[i, j]
			Fin Si
			
		Fin Para
	Fin Para
	
	// Comparo la igualdad de las sumas:
	//	conta = -1;
	condicion = Verdadero
	Para i = 0 Hasta tam-1 Hacer
		Escribir sumaFilas[i]
		Escribir sumaColumnas[i]
		Si sumaFilas[i] == sumaColumnas[i] Y condicion == Verdadero
			condicion = Verdadero
		SiNo
			condicion = Falso
		FinSi
	FinPara
	
	Si sumaDiag1 == sumaDiag2 Y condicion == Verdadero
		condicion = Verdadero
	SiNo
		condicion = Falso
	FinSi
	
	// Resultados:
	Si condicion == Verdadero
		Escribir "***********************";
		Escribir "MATRIZ MÁGICA DE SUMA: " sumaFilas[0];
		Escribir "************************";
	SiNo
		Escribir "***********************";
		Escribir "LA MATRIZ NO ES MÁGICA.";
		Escribir "************************";
	FinSi
	
	// Muestro la Matriz:
	Para i = 0 Hasta tam-1 Hacer
		Escribir Sin Saltar " ";
		Para j = 0 Hasta tam-1 Hacer
			Escribir Sin Saltar "[" matriz[i,j] "]";
		FinPara
		Escribir Sin Saltar " = " sumaFilas[i];
		Escribir "";
	FinPara
	
FinAlgoritmo
