////Realizar un programa que rellene de números aleatorios una matriz a través de un subprograma
////y generar otro subprograma que muestre por pantalla la matriz final.
//SubProceso llenadoAlea(matriz Por Referencia)
//	Definir i, j Como Entero
//	Para i = 0 Hasta 2 Con Paso 1 Hacer
//		Para j = 0 Hasta 2 Con Paso 1 Hacer
//			matriz[i, j] = Aleatorio(1, 9)
//		Fin Para
//	Fin Para
//FinSubProceso
//
//SubProceso imprimeMatriz(matriz)
//	Definir i, j Como Entero
//	Para i = 0 Hasta 2 Con Paso 1 Hacer
//		Para j = 0 Hasta 2 Con Paso 1 Hacer
//			Escribir matriz[i, j] " " Sin Saltar
//		Fin Para
//		Escribir ""
//	Fin Para
//FinSubProceso
//
//Algoritmo sin_titulo
//	Definir matriz Como Entero
//	Dimension matriz[3,3]
//	
//	llenadoAlea(matriz)
//	imprimeMatriz(matriz)
//	
//FinAlgoritmo

////Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario), llenarla
////con números aleatorios entre 1 y 100 y mostrar su traspuesta.

////¿Qué es una Matriz Traspuesta?
////La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por co-
////lumnas (o viceversa).

//SubProceso imprimeMatriz(matriz, n, m)
//	Definir i, j Como Entero
//	Para i = 0 Hasta n-1 Con Paso 1 Hacer
//		Para j = 0 Hasta m-1 Con Paso 1 Hacer
//			Escribir matriz[i, j] " " Sin Saltar
//		Fin Para
//		Escribir ""
//	Fin Para
//FinSubProceso
//
//Algoritmo asd
//	Definir matriz, matrizTrans, n, m, i, j Como Entero
//	
//	Escribir "Tamaño de filas y columnas"
//	Leer n, m
//	
//	dimension matriz[n,m], matrizTrans[n,m]
//	
//	Para i = 0 Hasta n-1 Con Paso 1 Hacer
//		Para j = 0 Hasta m-1 Con Paso 1 Hacer
//			matriz[i, j] = Aleatorio(1, 100)
//		Fin Para
//	Fin Para
//	Escribir "*** Matriz anterior ***"
//	imprimeMatriz(matriz, n, m)
//	
//	Para i = 0 Hasta n-1 Con Paso 1 Hacer
//		Para j = 0 Hasta m-1 Con Paso 1 Hacer
//			matrizTrans[i, j] = matriz[j, i]
//		Fin Para
//	Fin Para
//	
//	Escribir "*** Matriz transpuesta ***"
//	imprimeMatriz(matrizTrans, n, m)
//	
//FinAlgoritmo

////Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos y
////ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna de
////ceros. Por ejemplo, nuestro matriz final debería verse así:
////	111111111111111
////	100000000000001
////	100000000000001
////	100000000000001
////	111111111111111
//SubProceso imprimeMatriz(matriz)
//	Definir i, j Como Entero
//	Para i = 0 Hasta 4 Con Paso 1 Hacer
//		Para j = 0 Hasta 14 Con Paso 1 Hacer
//			Escribir matriz[i, j] Sin Saltar
//		Fin Para
//		Escribir ""
//	Fin Para
//FinSubProceso
//
//Algoritmo asd
//	Definir matriz, i, j Como Entero
//	Dimension matriz[5,15]
//	
//	Para i = 0 Hasta 4 Con Paso 1 Hacer
//		Para j = 0 Hasta 14 Con Paso 1 Hacer
//			Si i == 0 O i == 4 O j == 0 O j == 14 Entonces
//				matriz[i, j] = 1
//			SiNo
//				matriz[i, j] = 0
//			Fin Si
//		Fin Para
//	Fin Para
//	
//	imprimeMatriz(matriz)
//FinAlgoritmo

////Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3. Inicialice
////las matrices para evitar el ingreso de datos por teclado.

//SubProceso imprimeMatriz(matriz)
//	Definir i, j Como Entero
//	Para i = 0 Hasta 2 Con Paso 1 Hacer
//		Para j = 0 Hasta 2 Con Paso 1 Hacer
//			Escribir matriz[i, j] " " Sin Saltar
//		Fin Para
//		Escribir ""
//	Fin Para
//FinSubProceso
//
//Algoritmo assd
//	Definir matriz1, matriz2, matrizFinal, i, j Como Entero
//	Dimension matriz1[3,3], matriz2[3,3],matrizFinal[3,3]
//	
//	Para i = 0 Hasta 2 Con Paso 1 Hacer
//		Para j = 0 Hasta 2 Con Paso 1 Hacer
//			matriz1[i, j] = Aleatorio(1, 9)
//			matriz2[i, j] = Aleatorio(1, 9)
//		Fin Para
//	Fin Para
//	
//	Para i = 0 Hasta 2 Con Paso 1 Hacer
//		Para j = 0 Hasta 2 Con Paso 1 Hacer
//			matrizFinal[i, j] = matriz1[i, j] * matriz2[i, j]
//		Fin Para
//	Fin Para
//	
//	Escribir "*** Matriz 1 ***"
//	imprimeMatriz(matriz1)
//	Escribir "*** Matriz 2 ***"
//	imprimeMatriz(matriz2)
//	Escribir "*** Matriz Final multiplicados 1 y 2 ***"
//	imprimeMatriz(matrizFinal)
//	
//FinAlgoritmo

////Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
////primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
////deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
////la matriz de la siguiente forma:
////	3 + 5 = 8
////	4 + 3 = 7
////	1 + 4 = 5
//SubProceso imprimeMatriz(matriz, filas)
//	Definir i, j Como Entero
//	Para i = 0 Hasta filas-1 Con Paso 1 Hacer
//		Para j = 0 Hasta 2 Con Paso 1 Hacer
//			
//			Segun j Hacer
//				0:
//					Escribir matriz[i, j] " + " Sin Saltar
//				1:
//					Escribir matriz[i, j] " = " Sin Saltar
//				De Otro Modo:
//					Escribir matriz[i, j] " " Sin Saltar
//			Fin Segun
//			
//		Fin Para
//		Escribir ""
//	Fin Para
//FinSubProceso
//
//Algoritmo asd
//	Definir matriz, filas, i, j Como Entero
//	Escribir "Ingresar la cantidad de filas"
//	Leer filas
//	Dimension matriz[filas, 3]
//	
//	Escribir "Ingresar " filas * 2 " numeros para sumar" 
//	Para i = 0 Hasta filas-1 Con Paso 1 Hacer
//		Para j = 0 Hasta 2 Con Paso 1 Hacer
//			Si j <> 2 Entonces
//				leer matriz[i, j]
//			SiNo
//				matriz[i, j] = matriz[i, j -2] + matriz[i, j -1]
//			Fin Si
//		Fin Para
//	Fin Para
//	
//	imprimeMatriz(matriz, filas)
//FinAlgoritmo

////Realizar un programa que permita visualizar el resultado del producto de una matriz de enteros 
////de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden inicializarse 
////evitando así el ingreso de datos por teclado.
//SubProceso imprimeMatriz(matriz)
//	Definir i, j Como Entero
//	
//FinSubProceso
//
//Algoritmo asd
//	Definir matriz, matrizProducto, vector, i, j Como Entero
//	Dimension matriz[3,3], matrizProducto[3,3], vector[3]
//	
//	Para i = 0 Hasta 2 Con Paso 1 Hacer
//		vector[i] = Aleatorio(1, 9)
//		Para j = 0 Hasta 2 Con Paso 1 Hacer
//			matriz[i, j] = Aleatorio(1, 9)
//		Fin Para
//	Fin Para
//	
//	Escribir "MATRIZ         VECTOR";
//	Para i = 0 Hasta 2 Hacer
//		Para j = 0 Hasta 2 Hacer
//			Escribir "[" matriz[i,j] "] " Sin Saltar
//		FinPara
//		Escribir"    [" vector[i] "] "
//	FinPara
//	
//	Escribir "";
//	Escribir "RESULTADO:"
//	Para i = 0 Hasta 2 Hacer
//		para j = 0 Hasta 2 Hacer
//			Escribir "[" matriz[i,j] * vector[i] "] " Sin Saltar 
//		FinPara
//		Escribir ""
//	FinPara
//	
//FinAlgoritmo

////Una empresa de venta de productos por correo desea realizar una estadística de las ventas
////realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5 produc-
////tos en los 5 días hábiles de la semana. Se desea conocer:
////	
////	a) Total de ventas por cada día de la semana.
////	b) Total de ventas de cada producto a lo largo de la semana.
////	c) El producto más vendido en cada semana.
////	d) El nombre, el día de la semana y la cantidad del producto más vendido.

//Algoritmo asd
//	Definir matrizNum, i, j, may Como Entero
//	Definir matrizCarac Como Caracter
//	Dimension matrizNum[8, 7], matrizCarac[8, 7]
//	
//	Para i = 0 Hasta 7 Con Paso 1 Hacer
//		may = 0
//		Para j = 0 Hasta 6 Con Paso 1 Hacer
//			si i = 0 Entonces
//				Segun j Hacer
//					0:
//						matrizCarac[i,j] = "   "
//					1:
//						matrizCarac[i,j] = "     Lunes      |"
//					2:
//						matrizCarac[i,j] = "    Martes     |"
//					3:
//						matrizCarac[i,j] = "  Miercoles    |"
//					4:
//						matrizCarac[i,j] = "    Jueves     |"
//					5:
//						matrizCarac[i,j] = "    Viernes    |"
//					6:
//						matrizCarac[i,j] = "Total producto |"
//				Fin Segun
//			SiNo
//				matrizNum[i, j] = Aleatorio(1, 1000)
//				Si j == 6 Entonces ///TOTAL PRODUCTO
//					matrizNum[i, j] = matrizNum[i, j -1] + matrizNum[i, j -2] + matrizNum[i, j -3] + matrizNum[i, j -4] + matrizNum[i, j -5]
//				SiNo
//					Si i == 6 Entonces /// TOTAL SEMANA
//						matrizNum[i, j] = matrizNum[i -1, j] + matrizNum[i -2, j] + matrizNum[i -3, j] + matrizNum[i -4, j] + matrizNum[i -5, j]
//					SiNo
//						
//						Si i == 7 Entonces /// PRODUCTO MAS VENDIDO
//							Si matrizNum[i-2, j] > matrizNum[i-3, j] Y matrizNum[i-2, j] > matrizNum[i-4, j] Y matrizNum[i-2, j] > matrizNum[i-5, j] Y matrizNum[i-2, j] > matrizNum[i-6, j]  Entonces
//								matrizNum[i, j] = matrizNum[i -2, j]
//								Escribir matrizNum[i, j]
//							SiNo
//								Si matrizNum[i-3, j] > matrizNum[i-2, j] Y matrizNum[i-3, j] > matrizNum[i-4, j] Y matrizNum[i-3, j] > matrizNum[i-5, j] Y matrizNum[i-3, j] > matrizNum[i-6, j] Entonces
//									matrizNum[i, j] = matrizNum[i -3, j]
//									Escribir matrizNum[i, j]
//								SiNo
//									Si matrizNum[i-4, j] > matrizNum[i-2, j] Y matrizNum[i-4, j] > matrizNum[i-3, j] Y matrizNum[i-4, j] > matrizNum[i-5, j] Y matrizNum[i-4, j] > matrizNum[i-6, j] Entonces
//										matrizNum[i, j] = matrizNum[i -4, j]
//										Escribir matrizNum[i, j]
//									SiNo
//										Si matrizNum[i-5, j] > matrizNum[i-2, j] Y matrizNum[i-5, j] > matrizNum[i-3, j] Y matrizNum[i-5, j] > matrizNum[i-4, j] Y matrizNum[i-5, j] > matrizNum[i-6, j] Entonces
//											matrizNum[i, j] = matrizNum[i -5, j]
//											Escribir matrizNum[i, j]
//										SiNo
//											matrizNum[i, j] = matrizNum[i -6, j]
//											Escribir matrizNum[i, j]
//										Fin Si
//									Fin Si
//								Fin Si
//							Fin Si
//							
//						Fin Si
//					Fin Si
//				Fin Si
//			FinSi
//			
//			si j = 0 Entonces
//				Segun i Hacer
//					0:
//						matrizCarac[i,j] = "                      |"
//					1:
//						matrizCarac[i,j] = " Producto 1           |"
//					2:
//						matrizCarac[i,j] = " Producto 2           |"
//					3:
//						matrizCarac[i,j] = " Producto 3           |"
//					4:
//						matrizCarac[i,j] = " Producto 4           |"
//					5:
//						matrizCarac[i,j] = " Producto 5           |"
//					6:
//						matrizCarac[i,j] = " Total semana         |"
//					7:
//						matrizCarac[i,j] = " Producto mas vendido |"
//						
//				Fin Segun
//			FinSi
//			
//		Fin Para
//	Fin Para
//	
//	Escribir "_______________________________________________________________________________________________________________________________"
//	
//	Para i = 0 Hasta 7 Con Paso 1 Hacer
//		Para j = 0 Hasta 6 Con Paso 1 Hacer
//			Si i == 0 O j == 0 Entonces
//				Escribir matrizCarac[i, j] " " Sin Saltar 
//			SiNo
//				Si matrizNum[i, j] < 10 Entonces /// 1 digito
//					Escribir "       " matrizNum[i, j] "        |" Sin Saltar
//				SiNo
//					Si matrizNum[i, j] < 100 Entonces /// 2digitos
//						Escribir "       " matrizNum[i, j] "       |" Sin Saltar
//					SiNo
//						Si matrizNum[i, j] < 1000 Entonces /// 3digitos
//							Escribir "      " matrizNum[i, j] "       |" Sin Saltar
//						SiNo 
//							Si matrizNum[i, j] < 10000 Entonces /// 4digitos
//								Escribir "      " matrizNum[i, j] "      |" Sin Saltar
//							SiNo /// 5digitos
//								Escribir "      " matrizNum[i, j] "     |" Sin Saltar
//							Fin Si
//						Fin Si
//					Fin Si
//				Fin Si
//				 
//			Fin Si
//			
//		Fin Para
//		Escribir ""
//		Escribir "_______________________________________________________________________________________________________________________________"
//		
//	Fin Para
//	
//FinAlgoritmo

////Una distribuidora de Nescafé tiene 4 representantes que viajan por toda la Argentina ofreciendo
////sus productos. Para tareas administrativas el país está dividido en cinco zonas: Norte,	
////Sur, Este, Oeste y Centro. Mensualmente almacena sus datos y obtiene distintas estadísticas
////sobre el comportamiento de sus representantes en cada zona. 

////Se desea hacer un programa que lea el monto de las ventas de los representantes en cada zona y calcule luego:
////		a) el total de ventas de una zona introducida por teclado
////		b) el total de ventas de un vendedor introducido por teclado en cada una de las zonas
////		c) el total de ventas de todos los representantes.

Algoritmo asd
	Definir repre, venta, ventasZonas, i, j, opc, opcZona Como Entero
	Definir zonas Como Caracter
	
	Dimension repre[4], ventasZonas[5], zonas[5]
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		Si i <> 4 Entonces
			repre[i] = 0
		Fin Si
		ventasZonas[i] = 0
	Fin Para
	
	zonas[0] = "Norte"
	zonas[1] = "Sur"
	zonas[2] = "Este"
	zonas[3] = "Oeste"
	zonas[4] = "Centro"
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
//		Escribir "Cantidad de ventas de la zona " zonas[i]
		Para j = 0 Hasta 3 Con Paso 1 Hacer
//			Escribir "Representante n° " j+1
//			leer venta
			repre[j] = repre[j] + 10
			ventasZonas[i] = ventasZonas[i] + 10
		Fin Para
	Fin Para
	
	Repetir
		Escribir "**************************************************"
		Escribir "Bienvenido a Nescafe! Elija una opcion"
		Escribir "1) Ver total de ventas de una zona"
		Escribir "2) Ver total de ventas de un representante"
		Escribir "3) Ver total de ventas de todos los representantes"
		Escribir "0) Salir"
		Escribir "**************************************************"
		Leer opc
		
		Segun opc Hacer
			1:
				Escribir "*** Total de ventas de una zona ***"
				Escribir "Elija la zona: "
				Escribir "1) Norte"
				Escribir "2) Sur"
				Escribir "3) Este"
				Escribir "4) Oeste"
				Escribir "5) Centro"
				Leer opcZona
				
				Si opcZona > 0 Y opcZona < 6 Entonces
					Escribir "El total de ventas de la zona " zonas[opcZona -1] " es: " ventasZonas[opcZona -1]
				SiNo
					Escribir "Error! Opcion incorrecta"
				Fin Si
			2:
				Escribir "*** Total de ventas de un representante ***"
				Escribir "Elija un numero de representante, entre 1 y 4"
				Leer opcZona
				
				Si opcZona > 0 Y opcZona < 5 Entonces
					Escribir "El total de ventas del representa n°" opcZona " es: " repre[opcZona -1]
				SiNo
					Escribir "Error! Opcion incorrecta"
				Fin Si
			3:
				Escribir "*** Total de ventas de todos los representantes ***"
				Escribir "El total de ventas de los representantes es: " repre[0] + repre[1] + repre[2] + repre[3]
			0: 
				Escribir "*** SALIR ***"
			De Otro Modo:
				Escribir "Error! Opcion incorrecta"
		Fin Segun
		
		Si opc <> 0 Entonces
			Escribir ""
			Escribir "---------Presione enter para continuar:-----------"
			Esperar Tecla
		Fin Si
		
		
	Mientras Que opc <> 0
	
FinAlgoritmo

	