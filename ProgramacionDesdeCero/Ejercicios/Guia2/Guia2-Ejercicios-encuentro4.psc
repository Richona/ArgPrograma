////Un hombre desea saber si su sueldo es mayor al sueldo mínimo, el programa le pedirá al usuario su sueldo actual y el sueldo mínimo. Si el sueldo es mayor al mínimo se debe
////mostrar un mensaje por pantalla indicándolo.

//Algoritmo sin_titulo
//	Definir sa, sm Como Real
//	Escribir "Ingresa tu sueldo"
//	Leer sa
//	
//	Escribir "Ingresa el sueldo minimo"
//	Leer sm
//	
//	Si sa > sm Entonces
//		Escribir "Su sueldo ", sa, " es mayor al sueldo minimo ", sm
//	SiNo
//		Escribir "Segui votando a albertito"
//	Fin Si
//FinAlgoritmo

////Construir un pseudocódigo que permita ingresar un número, si el número es mayor de 500, se debe calcular y mostrar en pantalla el 18% de este.

//Algoritmo asd
//	Definir n Como Real
//	Escribir "Ingresa un numero"
//	Leer n
//	
//	Si n > 500 Entonces
//		Escribir "El 18% de ", n, " es: ", (n *.18)
//	SiNo
//		Escribir "Debe ser mayor a 500"
//	Fin Si
//FinAlgoritmo


////Se pide ingresar una letra del alfabeto y mostrar si dicha letra es vocal o consonante.

//Algoritmo asd
//	Definir l Como Caracter
//	Escribir "Ingresa una letra"
//	Leer l
//	
//	Si l == "a" | l == "e" | l == "i" | l == "o" | l == "u" Entonces
//		Escribir "Su letra es vocal (", l, ")"
//	SiNo
//		Escribir "Su letra es consonante (", l, ")"
//	Fin Si
//FinAlgoritmo

////Diseñe un algoritmo que lea un número de tres cifras y determine si es o no capicúa.

//Algoritmo asds
//	Definir n Como Entero
//	Escribir "Ingresa un numero de 3 cifras"
//	Leer n
//	
//	Si n > 99 & n < 1000 Entonces
//		Si (n - n MOD 100)/100 == n MOD 10 Entonces
//			Escribir "El numero es capicua ", n
//		SiNo
//			Escribir "El numero no es capicua ", n
//		Fin Si
//	SiNo
//		Escribir "Ingresa un numero de 3 cifras por favor"
//	Fin Si
//FinAlgoritmo

////Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no.

//Algoritmo asd
//	Definir d Como Caracter
//	Escribir "Ingresa un dia de la semana"
//	Leer d
//	
//	Si d == "sabado" | d == "domingo" Entonces
//		Escribir "No es un dia laboral el ", d
//	SiNo
//		Escribir "Es un dia laboral el ", d
//	Fin Si
//	
//FinAlgoritmo

////

Algoritmo asd
	Definir cantidadEmails, correoVoz Como Entero
	Definir emergencia Como Logico
	
	cantidadEmails = 11
	correoVoz = 0
	emergencia = Verdadero
	
	Escribir "Inicia sesion como administrador"
	Escribir "Hacer hoja de calculos de ingresos mensuales."
	
	Escribir "Ver la cantidad de emails"
	Si cantidadEmails < 10 Entonces
		Escribir "Hay menos de 10 correos"
		Si emergencia == Falso Entonces
			Escribir "No hay emergencia"
			Si correoVoz > 0 Entonces
				Escribir "Realizar la solicitud de los ejecutivos."
				Escribir "Una vez hecho la solicitud, revisar los emails."
			SiNo
				Escribir "No hay solicitud de ejecutivos"
				Escribir "Revisar los emails."
			Fin Si
		SiNo
			Escribir "Realizar la tarea de emergencia"
			Si correoVoz > 0 Entonces
				Escribir "Realizar la solicitud de los ejecutivos."
				Escribir "Una vez hecho la solicitud, revisar los emails."
			SiNo
				Escribir "No hay solicitud de ejecutivos"
				Escribir "Revisar los emails."
			Fin Si
		Fin Si
	SiNo
		Escribir "Hay mas de 10 correos"
		Escribir "Revisar los emails"
		Si emergencia == Falso Entonces
			Escribir "No hay emergencia"
			Si correoVoz > 0 Entonces
				Escribir "realizar la solicitud de los ejecutivos."
			SiNo
				Escribir "No hay solicitud de ejecutivos"
			Fin Si
		SiNo
			Escribir "Realizar la tarea de emergencia"
			Si correoVoz > 0 Entonces
				Escribir "realizar la solicitud de los ejecutivos."
			SiNo
				Escribir "No hay solicitud de ejecutivos"
			Fin Si
		Fin Si
	Fin Si
	
	Escribir "UNA VEZ HECHO TODO, enviar correo de actualización al compá"
	Escribir "Apagar pc"
	Escribir "Regar planta del escritorio"
	
FinAlgoritmo
	