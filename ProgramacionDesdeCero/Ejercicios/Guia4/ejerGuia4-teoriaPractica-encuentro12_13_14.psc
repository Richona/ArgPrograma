

//Algoritmo valorVSreferencia
//	Definir num Como Entero
//	num = 2
//	
//	Escribir num
//	Escribir "Ahora enviamos el número a la función por valor y el resultado es: "
//	elevarAlCuadradoPorValor(num)
//	Escribir num
//	
//	Escribir "***********"
//	Escribir "Ahora enviamos el número a la función por referencia y el resultado es: "
//	elevarAlCuadradoPorReferencia(num)
//	Escribir num
//	
//FinAlgoritmo
//
//SubProceso elevarAlCuadradoPorValor(num Por Valor)
//	num = num * num
//FinSubProceso
//
//SubProceso elevarAlCuadradoPorReferencia(num Por Referencia)
//	num = num * num
//FinSubProceso

////Realiza una función llamada Cooperar que reciba dos variables de tipo carácter, una variable debe
////contener el mensaje "Cooperando" y la otra "trabajamos mejor". La función debe concatenar ambos textos.

//Algoritmo asd
//	Definir c, d, conca Como Caracter
//	c = "Cooperando "
//	d = "trabajamos mejor"
//	conca = Cooperar(c, d)
//	
//	Escribir conca
//	
//FinAlgoritmo
//
//Funcion retorno <- Cooperar ( a Por Referencia, b Por Referencia )
//	Definir retorno Como Caracter
//	retorno = Concatenar(a,b)
//Fin Funcion

//Algoritmo asd
//	Definir n Como Entero
//	Escribir "ingresa un numero para saber si es par"
//	Leer n
//	
//	Escribir Paridad(n)
//FinAlgoritmo
//
//Funcion retorno <- Paridad ( num Por Referencia)
//	Definir retorno Como Logico
//	retorno = num MOD 2 == 0
//Fin Funcion

Funcion retorno <- Comparar ( num1 Por Referencia, num2 Por Referencia )
	Definir retorno Como Logico
	retorno = num1 > num2
FinFuncion
	
Algoritmo Prueba
		Definir num1, num2 Como Entero
		Definir resultado Como Logico
		num1 = 3
		num2 = 6
		resultado = Comparar(num1,num2)
		Escribir "El num1 es mayor a num2, esta afirmación es: " resultado
FinAlgoritmo

