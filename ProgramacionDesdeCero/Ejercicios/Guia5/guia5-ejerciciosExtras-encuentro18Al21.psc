////Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios y los muestre por pantalla.

//Algoritmo sin_titulo
//	Definir i, vec1, vec2 Como Entero
//	Dimension vec1[5], vec2[5]
//	
//	Para i = 0 Hasta 4 Con Paso 1 Hacer
//		vec1[i] = Aleatorio(0, 10)
//		vec2[i] = Aleatorio(0, 10)
//	Fin Para
//	
//	Para i = 0 Hasta 4 Con Paso 1 Hacer
//		Escribir "Vector 1 | posicion " i ": " vec1[i]
//		Escribir "Vector 2 | posicion " i ": " vec2[i]
//	Fin Para
//	
//FinAlgoritmo

////Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
////usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.

//Algoritmo asd
//	Definir i, n, vec, acu, conta Como Entero
//	Escribir "Ingresar tamaño del vector"
//	Leer n
//	Dimension vec[n]
//	
//	Escribir "Ingrese " n " numeros"
//	Para i = 0 Hasta n -1 Con Paso 1 Hacer
//		Leer vec[i]
//	Fin Para
//	
//	conta = 0
//	acu = 0
//	
//	Para i = 0 Hasta n -1 Con Paso 1 Hacer
//		conta = conta +1
//		acu = acu + vec[i]
//	Fin Para
//	
//	Escribir "El promedio de todos los numeros es: " (acu / conta) 
//	
//FinAlgoritmo

////Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
////almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector se
////debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la función
////Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su longitud.

//Algoritmo asd
//	Definir i, n, vec2 Como Entero
//	Definir vec1 Como Caracter
//	Escribir "Tamaño del vector: "
//	Leer n
//	Dimension vec1[n], vec2[n]
//	
//	Escribir "Ingresar " n " nombres de personas: "
//	Para i = 0 Hasta n-1 Con Paso 1 Hacer
//		Leer vec1[i]
//	Fin Para
//	
//	Para i = 0 Hasta n-1 Con Paso 1 Hacer
//		vec2[i] = Longitud(vec1[i])
//	Fin Para
//	
//	Para i = 0 Hasta n-1 Con Paso 1 Hacer
//		Escribir "Nombre: " vec1[i] " | Longitud: " vec2[i]
//	Fin Para
//	
//FinAlgoritmo

////Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre 0 y
////20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de PseInt.
////Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos estudiantes son:
////	a) Deficientes 0-5
////	b) Regulares 6-10
////	c) Buenos 11-15
////	d) Excelentes 16-20

//Algoritmo asd
//	Definir i, vec, def, reg, bue, exc Como Entero
//	Dimension vec[100]
//	
//	Para i = 0 Hasta 99 Con Paso 1 Hacer
//		vec[i] = Aleatorio(0, 20)
//	Fin Para
//	
//	def = 0; reg = 0; bue = 0; exc = 0
//	
//	Para i = 0 Hasta 99 Con Paso 1 Hacer
//		
//		Si vec[i] <= 5 Entonces
//			def = def +1
//		SiNo
//			
//			Si vec[i] >= 6 Y vec[i] <= 10 Entonces
//				reg = reg +1
//			SiNo
//				
//				Si vec[i] >= 11 Y vec[i] <= 15 Entonces
//					bue = bue +1
//				SiNo
//					exc = exc +1
//				Fin Si
//				
//			Fin Si
//			
//		Fin Si
//		
//	Fin Para
//	
//	Escribir "Cantidad de estudiantes deficientes: " def
//	Escribir "Cantidad de estudiantes regulares: " reg
//	Escribir "Cantidad de estudiantes buenos: " bue
//	Escribir "Cantidad de estudiantes excelentes: " exc
//	
//FinAlgoritmo

////Tomando en cuenta el ejercicio 6 de guia 5 / ejercicios, mejore el mecanismo de inserción del carácter, facilitando
////un potencial reordenamiento del vector. Digamos que se pide ingresar el carácter en la
////posición X y la misma está ocupada, entonces de existir un espacio en cualquier posición X-n
////o X+n, desplazar los caracteres hacia la izq o hacia la derecha para poder ingresar el carácter
////en cuestión en el lugar deseado. El procedimiento de reordenamiento debe ubicar el espacio
////más cercano.

SubProceso cargarVectorPosOcupada(vector Por Referencia, frase, carac, n, posMenor, PosMayor)
	Definir i Como Entero
	
	Para i = 0 Hasta 19 Con Paso 1 Hacer
		Si i < n Entonces
			vector[i] = Subcadena(frase, i + posMenor , i + posMenor)
		SiNo
			Si i == n Entonces
				vector[n] = carac
			SiNo
				vector[i] = Subcadena(frase, i - PosMayor , i - PosMayor )
			Fin Si
		Fin Si
	Fin Para
FinSubProceso

SubProceso mostrarVector(vector)
	Definir i Como Entero
	
	Para i = 0 Hasta 19 Con Paso 1 Hacer
		Escribir vector[i] Sin Saltar
	Fin Para
	Escribir ""
FinSubProceso

Algoritmo sin_titulo
	Definir vector, frase, carac Como Caracter
	Definir i, n, c, inf, sup Como Entero
	Dimension vector[20]
	
	Repetir
		Escribir "Ingresa una frase hasta 20 caracteres"
		Leer frase
		
		Si Longitud(frase) > 20 Entonces
			Escribir "ERROR! Demasiados caracteres"
		Fin Si
	Mientras Que Longitud(frase) > 20
	
	Para i = 0 Hasta 19 Con Paso 1 Hacer
		vector[i] = Subcadena(frase, i, i)
	Fin Para
	
	Escribir "Caracter a ingresar y la posicion donde lo desea: "
	Leer carac, n
	c = 0
	Para i = 0 Hasta 19 Con Paso 1 Hacer
		Si vector[n] == "" O vector[n] == " " Entonces
			vector[n] = carac
			c = 1
		Fin Si
	Fin Para
	
	Si c == 1 Entonces
		mostrarVector(vector)
	SiNo
		inf = 0; sup = 0
		
		Para i = 0 Hasta 19 Con Paso 1 Hacer
			
			Si vector[i] == " " Entonces
				Si i > n Y n > sup Entonces
					sup = i
				Fin Si
				
				Si i < n Entonces
					inf = i
				Fin Si
			Fin Si
			
		Fin Para
		
		Si inf == 0 Entonces
			cargarVectorPosOcupada(vector, frase, carac, n, 0, 1) /// Mas cerca del espacio superior
		SiNo
			Si sup == 0 Entonces
				cargarVectorPosOcupada(vector, frase, carac, n, 1, 0) /// Mas cerca del espacio inferior
			SiNo
				
				Si (sup - n) < (n - inf) Entonces
					cargarVectorPosOcupada(vector, frase, carac, n, 0, 1) /// Mas cerca del espacio superior
				SiNo
					cargarVectorPosOcupada(vector, frase, carac, n, 1, 0) /// Mas cerca del espacio inferior
				Fin Si
				
			Fin Si
		Fin Si
		
		
		mostrarVector(vector)
	Fin Si
	
	
FinAlgoritmo

////Crear una función que devuelva la diferencia que hay entre el valor más chico de un arreglo y
////su valor más grande.
//Funcion r = diferencia(n, vector)
//	Definir i, chico, grande, r Como Entero
//	chico = vector[0]; grande = vector[0]
//	Para i = 0 Hasta n -1 Con Paso 1 Hacer
//		Si vector[i] > grande Entonces
//			grande = vector[i]
//		Fin Si
//		
//		Si vector[i] < chico Entonces
//			chico = vector[i]
//		Fin Si
//	Fin Para
//	
//	Escribir "el numero grande " grande Sin Saltar
//	Escribir " y el numero chico " chico " es: " Sin Saltar
//	r = grande - chico
//	
//FinFuncion
//
//Algoritmo asd
//	Definir i, vec, n Como Entero
//	Escribir "tamaño del vector"
//	Leer n
//	Dimension vec[n]
//	
//	Escribir "Ingresar " n " numeros:"
//	Para i = 0 Hasta n -1 Con Paso 1 Hacer
//		Leer vec[i]
//	Fin Para
//	
//	Escribir "La diferencia entre " Sin Saltar diferencia(n, vec)
//	Escribir ""
//	
//FinAlgoritmo

////Programe una función que calcule el producto de un arreglo de números enteros. Para esto
////imagine, por ejemplo, que para un vector V de tamaño 4, el producto de todos los valores es
////igual a (V[1]*V[2]*V[3]*V[4])
//Funcion r = producto(n, vec)
//	Definir i, r Como entero
//	r = vec[0]
//	Para i = 1 Hasta n -1 Con Paso 1 Hacer
//		r = r * vec[i]
//	Fin Para
//FinFuncion
//
//Algoritmo asd
//	Definir i, vec, n Como Entero
//	Escribir "Tamaño del vector: "
//	Leer n
//	Dimension vec[n]
//	
//	Escribir "Ingrese " n " numeros enteros"
//	Para i = 0 Hasta n -1 Con Paso 1 Hacer
//		Leer vec[i]
//	Fin Para
//	
//	Escribir producto(n, vec)
//	
//FinAlgoritmo

