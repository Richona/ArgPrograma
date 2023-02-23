////Realizar un programa que pida tres notas y determine si un alumno aprueba o reprueba un
////curso, sabiendo que aprobará el curso si su promedio de tres calificaciones es mayor o
////igual a 70; y reprueba en caso contrario.

//Algoritmo sin_titulo
//	Definir n1, n2 , n3 Como Entero
//	Escribir "Ingresa la nota 1 (desde 0 a 100)"
//	Leer n1
//	Escribir "Ingresa la nota 2 (desde 0 a 100)"
//	Leer n2
//	Escribir "Ingresa la nota 3 (desde 0 a 100)"
//	Leer n3
//	
//	Si (n1 + n2 + n3) / 3 >= 70 Entonces
//		Escribir "Aprobaste el curso"
//	SiNo
//		Escribir "No aprobaste el curso"
//	Fin Si
//	
//FinAlgoritmo

////Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del
////10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un
////mes y el importe de la compra. El programa debe calcular cuál es el monto total que se
////debe cobrar al cliente e imprimirlo por pantalla.

//Algoritmo asd
//	Definir m Como Caracter
//	Definir c Como Real
//	Escribir "Ingresa el mes de la compra"
//	Leer m
//	Escribir "Ingresa el monto de la compra"
//	Leer c
//	
//	Si Minusculas(m) == "septiembre" | Minusculas(m) == "octubre" | Minusculas(m) == "noviembre" Entonces
//		Escribir "El monto a pagar es: ", c - c * .10
//	SiNo
//		Escribir "El monto a pagar es: ", c
//	Fin Si
//FinAlgoritmo

////Solicitar al usuario que ingrese dos números enteros y determinar si ambos son pares o
////impares. Mostrar en pantalla un mensaje que indique "Ambos números son pares" siempre
////y cuando cumplan con la condición. En caso contrario se deberá imprimir el siguiente
////mensaje "Los números no son pares, o uno de ellos no es par".
////Nota: investigar la función mod de PseInt.

//Algoritmo asd
//	Definir n1, n2 Como Entero
//	Escribir "Ingresa 2 numeros enteros"
//	Leer n1, n2
//	
//	Si (n1 MOD 2 == 0) & (n2 MOD 2 == 0) Entonces
//		Escribir "Ambos números son pares"
//	SiNo
//		Escribir "Los números no son pares, o uno de ellos no es par"
//	Fin Si
//FinAlgoritmo

////La empresa "Te llevo a todos lados" está destinada al alquiler de autos y tiene un sistema
////de tarifa que consiste en cobrar el alquiler por hora. Si el cliente devuelve el auto dentro
////de las 2 horas de uso el valor que corresponde pagar es de $400 pesos y la nafta va de
////regalo. Cuando el cliente regresa a la empresa pasadas las 2 horas, se ingresan la
////cantidad de litros de nafta gastados y el tiempo transcurrido en horas. Luego, se le cobra
////40 pesos por litro de nafta gastado, y la hora se fracciona en minutos, cobrando un total
////de $5,20 el minuto de uso. Realice un programa que permita registrar esa información y el
////total a pagar por el cliente.

Algoritmo asd
	Definir cl, ht Como Entero
	Escribir "Ingresa la cantidad de litros de nafta gastados"
	Leer cl
	Escribir "Ingresa la cantidad de horas transcurridas"
	Leer ht
	Escribir ((ht * 60) * 5.2)
	Si ht > 2 Entonces
		Escribir "Llegaste tarde, debes pagar $" (cl * 40) + ((ht * 60) * 5.2)
	SiNo
		Escribir "Gracias por llegar temprano, debes pagar $400 y la nafta te la regalamos"
	Fin Si
FinAlgoritmo
