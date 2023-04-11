////Se debe crear una matriz con las siguientes palabras como se muestra a continuación. Luego de
////eso debemos acomodar las palabras para que la primera letra ?R? de cada una quede en la
////posición 5, alineándose.

////Para ello debemos primero leer todo el ejercicio y ponernos de acuerdo con el equipo en las
////tareas que hará cada uno y en cómo llamemos a las variables y subprogramas necesarios.
////Recordemos que todo lo tenemos que hacer con subprocesos o funciones.
////El ejercicio será mucho más sencillo si establecemos las bases como equipo al principio.
////Se necesita programar los siguientes subprogramas:

////subprograma inicializarMatriz:
////Debe recibir como parámetros la matriz a inicializar, la cantidad de filas y la cantidad de columnas.
////En primera instancia inicializaremos la matriz con un "*" (asterisco) en cada lugar para que la
////misma no esté vacía y no tengamos problemas.

////subprograma imprimirMatriz:
////Debe recibir como parámetros la matriz a imprimir, la cantidad de filas y la cantidad de columnas.
////Para que veamos la matriz en la consola cuando lo necesitemos.
////Tengamos en cuenta que para que no queden pegadas las letras vamos a imprimir un espacio, la
////letra y otro espacio. Lo hacemos en imprimir para no modificar el contenido de la matriz.
////Ambos subprogramas son similares al ejercicio 8 de la guía.

////subprograma agregarPalabra:
////Se le debe indicar en los parámetros la matriz donde se va a agregar la palabra, la fila en la que se
////agregará y la propia palabra. Una vez el subprograma reciba eso debe descomponer la palabra y
////agregarla a la matriz en la posición deseada.
////Similar al ejercicio 12 de la guía.

////subprograma buscarR:
////Se le debe indicar la matriz donde se buscará la letra R y el número de fila en el que buscaremos.
////Debe comparar cada letra de la fila indicada hasta que encuentre la primera letra ?R?. Ahí debe
////devolvernos la posición de ?R?.
////Nota: cuidado! debe devolver la posición de la primera R solamente.
////Aquí podemos usar principios que usamos en el ejercicio 5

////subprograma acomodarPalabra:
////Se le debe indicar sólo la matriz en donde se acomodarán las palabras.
////Ahora debemos crear una lógica que nos permita mover las palabras de las filas. Recordar que
////podemos llamar a buscarR para saber cuántos espacios hay que mover las palabras.
////Una vez que las palabras se muevan hay que llenar los espacios con asteriscos nuevamente: es
////decir, si la palabra se mueve dos posiciones a la derecha hay que agregar dos asteriscos a la
////izquierda de la fila.
////Nota: ¡recuerden que la primera letra ?R? debe quedar en la posición 5 de la matriz! Ya sabemos
////en qué posición se encuentra ?R? así que sólo debemos llevarla a la posición 5 corriendo toda la
////palabra.

////Algoritmo principal:
////		Debería quedarnos algo así
////		Algoritmo ejercicioCooperativoGuia4
////			Definir tablero como Cadena
////			Dimension tablero[9, 12]
////			inicializarMatriz(tablero, 9, 12)
////			agregarPalabra(tablero, "vector", 0)
////			agregarPalabra(tablero, "matrix", 1)
////			agregarPalabra(tablero, "programa", 2)
////			agregarPalabra(tablero, "subprograma", 3)
////			agregarPalabra(tablero, "subproceso", 4)
////			agregarPalabra(tablero, "variable", 5)
////			agregarPalabra(tablero, "entero", 6)
////			agregarPalabra(tablero, "para", 7)
////			agregarPalabra(tablero, "mientras", 8)
////			acomodarPalabras(tablero)
////			imprimirMatriz(tablero, 9, 12)
////FinAlgoritmo

//// INICIALIZAR MATRIZ
SubProceso inicializarMatriz(tablero Por Referencia, f, c)
	Definir i, j como entero
	
	Para i = 0 Hasta f -1 Con Paso 1 Hacer
		Para j = 0 Hasta c -1 Con Paso 1 Hacer
			tablero[i, j] = "*"
		Fin Para
	Fin Para
FinSubProceso

//// LLENAR V
SubProceso llenarV(tablero, tableroV)
	Definir i, j como entero
	
	Para i = 0 Hasta 8 Con Paso 1 Hacer
		Para j = 0 Hasta 11 Con Paso 1 Hacer
			tableroV[i, j] = tablero[i, j]
		Fin Para
	Fin Para
FinSubProceso

//// IMPRIMIR MATRIZ
SubProceso imprimirMatriz(tablero, tableroV, f, c)
	Definir i, j como entero
	
	Escribir "       *** TABLERO VIEJO ***                       *** TABLERO ACTUALIZADO ***"
	Escribir "__________________________________________________________________________________"
	Para i = 0 Hasta f -1 Con Paso 1 Hacer
		Para j = 0 Hasta c -1 Con Paso 1 Hacer
			escribir " " tableroV[i, j] " " Sin Saltar
			
		Fin Para
		Escribir "    |    " Sin Saltar
		
		Para j = 0 Hasta c -1 Con Paso 1 Hacer
			escribir " " tablero[i, j] " " Sin Saltar
		Fin Para
		Escribir " |"
		Escribir "__________________________________________________________________________________|"
	Fin Para
FinSubProceso

//// AGREGAR PALABRA
subproceso agregarPalabra(tablero, p, i)
	Definir j como entero
	
	Para j = 0 Hasta Longitud(p) -1 Con Paso 1 Hacer
		tablero[i, j] = Mayusculas(Subcadena(p, j, j))
	Fin Para
FinSubProceso

//// BUSCAR R
Funcion r = buscarR(tablero, i)
	Definir r, j Como entero
	
	Para j = 0 Hasta 11 Con Paso 1 Hacer
		Si tablero[i, j] == "R" Entonces
			r = j
			j = 12
		Fin Si
	Fin Para
FinFuncion

//// ACOMODAR PALABRAS
SubProceso acomodarPalabras(tablero)
	Definir i, j, pos como entero
	
	Para i = 0 Hasta 8 Con Paso 1 Hacer
		pos = 5 - buscarR(tablero, i)
		
		Para j = 11 Hasta pos Con Paso -1 Hacer
			tablero[i, j] = tablero[i, j - pos]
		Fin Para
		
		Si pos > 0 Entonces
			Para j = 0 Hasta pos -1 Con Paso 1 Hacer
				tablero[i, j] = "*"
			Fin Para
		Fin Si
	Fin Para
FinSubProceso

//// ALGORITMO
Algoritmo principal
	Definir tablero, tableroV como Cadena
	Dimension tablero[9, 12], tableroV[9, 12]
	
	inicializarMatriz(tablero, 9, 12)
	
	agregarPalabra(tablero, "vector", 0)
	agregarPalabra(tablero, "matrix", 1)
	agregarPalabra(tablero, "programa", 2)
	agregarPalabra(tablero, "subprograma", 3)
	agregarPalabra(tablero, "subproceso", 4)
	agregarPalabra(tablero, "variable", 5)
	agregarPalabra(tablero, "entero", 6)
	agregarPalabra(tablero, "para", 7)
	agregarPalabra(tablero, "mientras", 8)
	
	llenarV(tablero, tableroV)
	
	acomodarPalabras(tablero)
	imprimirMatriz(tablero, tableroV, 9, 12)
FinAlgoritmo