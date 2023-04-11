////Define un vector que alojará números enteros y otro de cadena. Dimensiona ambos de la longitud
////que tu desees. Ahora en lapiz y papel, escribe la dimensión de tus vectores y sus subíndices. 

//Algoritmo sin_titulo
//	Definir vectorEnt, i Como Entero
//	Definir vectorCad Como caracter
//	
//	
//	Dimension vectorEnt[5] //del 0 al 4 en subindices, contiene 5 elementos
//	Dimension vectorCad[10] //del 0 al 9 en subindices, contiene 10 elementos
//	
//FinAlgoritmo

////	Ahora es tu turno. Llena uno de los vectores que definiste y dimensionaste anteriormente, de
////	forma manual y el otro con un Bucle Para.

//Algoritmo sin_titulo
//	Definir vectorEnt, i Como Entero
//	Definir vectorCad Como caracter
//	
//	
//	Dimension vectorEnt[5] //del 0 al 4 en subindices, contiene 5 elementos
//	Dimension vectorCad[10] //del 0 al 9 en subindices, contiene 10 elementos
//	

//	
//	Para i = 0 Hasta 4 Con Paso 1 Hacer
//		vectorEnt[i] = i+1
//	Fin Para
//	
//FinAlgoritmo

////DETENCION DE ERRORES
//Algoritmo vectores
//	Definir i, vector Como Entero
//	Dimension vector[5]
//	Para i<-0 Hasta 4 Con Paso 1 Hacer
//		vector[i]=i
//	Fin Para
//FinAlgoritmo

////Ahora te toca a ti mostrar tus vectores. Además, define una nueva variable y aloja allí algún valor
////del vector. 
Algoritmo vectores
	Definir i, vector, num3 Como Entero
	Dimension vector[5]
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		vector[i]=i +1
	Fin Para
	
	num3 = vector[2]
	Escribir "Num3 contiene: " num3
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir "Subindice n°" i " tiene el valor de: " vector[i]
	Fin Para
	
FinAlgoritmo

