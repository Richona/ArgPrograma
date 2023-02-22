///Escribir un programa que pregunte al usuario su nombre, y luego lo salude.

//Algoritmo sin_titulo
//	definir nombre Como Caracter
//	Escribir "ingresa tu nombre"
//	Leer nombre
//	Escribir "Hola ", nombre
//FinAlgoritmo

////Calcular el cambio de monedas en dólares y euros al ingresar cierta cantidad de dinero en pesos.

//Algoritmo asd
//	Definir pesos, dolares, euros Como Real
//	Escribir "Ingresa una cantidad en pesos"
//	Leer pesos
//	
//	dolares = pesos / 192
//	euros = pesos / 206
//	
//	Escribir "Su dinero ingresado (", pesos, ") es en doleres $", dolares
//	Escribir "Su dinero ingresado (", pesos, ") es en euros e", euros
//FinAlgoritmo

////Hacer un programa que calcule el salario de un empleado, si se descuenta el 20% de su salario bruto.

//Algoritmo asd
//	Definir salario, descuento Como Real
//	Escribir "Ingresa tu salario"
//	Leer salario
//	
//	descuento = salario * .20
//	
//	Escribir "Su salario es de $", salario - descuento
//	Escribir "El descuento fue de $", descuento
//	
//FinAlgoritmo

////Hacer un programa que ingrese por teclado un número total de segundos y que luego pueda mostrar la cantidad de horas, minutos y segundos que existen en el valor ingresado.

//Algoritmo asd
//	Definir segundoss, horas, minutos Como real
//	Escribir "ingresa una cantidad en segundos";
//	Leer segundoss;
//	
//	minutos = segundoss / 60
//	horas = minutos / 60
//	
//	Escribir trunc(horas), ":", trunc(minutos), ":", segundoss
//FinAlgoritmo

////Mostrar el área y perímetro de un rombo.

//Algoritmo sdaf
//	Definir a, b, h, area, perimetro Como Real
//	
//	Escribir "Ingresa la diagonal mayor"
//	leer a
//	Escribir "Ingresa la diagonal menor"
//	leer b
//	
//	area = (a*b)/2
//	
//	h = rc((a/2)^2 + (b/2)^2)
//	
//	perimetro = h * 4
//	
//	Escribir "El perimetro del rombo es: ",perimetro
//	
//	Escribir "El area del rombo es: ",area   
//FinAlgoritmo

////Mostrar el área y perímetro de un hexágono.

//Algoritmo asd
//	definir ap,p,l,area, perimetro como real
//	
//	Escribir "Escribe uno de los lados del hexagono"
//	
//	leer l
//	
//	p = 6 * l
//	
//	ap = rc((l*l) - ((l/2)*(l/2)))
//	
//	area = (p*ap) / 2
//	
//	perimetro = l * 6
//	
//	Escribir "El area del hexagono es: ",area
//	Escribir "El perimetro del hexagono es: ",perimetro
//FinAlgoritmo

////Mostrar el área y perímetro de un paralelogramo.

//Algoritmo asd
//	Definir ancho, alto, perimetro, area Como Real
//	Escribir "Ingresa el ancho"
//	Leer ancho
//	Escribir "ingresa el alto"
//	leer alto
//	
//	perimetro = (ancho + alto) * 2
//	
//	area = ancho * alto
//	
//	Escribir "El perimetro es: ", perimetro
//	Escribir "El area es: ", area
//	
//FinAlgoritmo

////Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.

//Algoritmo asd
//	Definir c,f Como Real
//	Escribir "Ingresa los grados Fahrenheit"
//	leer f
//	c = (f-32) * (5/9)
//	
//	Escribir "Los grados Fahrenheit convertidos a grados Celsius es: ",c
//FinAlgoritmo

////Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas, el vendedor desea saber cuánto dinero obtendrá por concepto de comisiones por las tres
////ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.

//Algoritmo asd
//	Definir v1, v2, v3, sueldoB, comision, sueldoF Como Real
//	Escribir "Ingresar sus 3 ventas"
//	leer v1, v2, v3
//	Escribir "Ingresa su sueldo"
//	leer sueldoB
//	
//	comision = (v1 + v2 + v3) * .10
//	sueldoF = sueldoB + comision
//	
//	Escribir "Su comicion por las tres vestas es: ", comision
//	Escribir "Su sueldo final es: ", sueldoF
//FinAlgoritmo

////Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuánto deberá pagar finalmente por su compra.

//Algoritmo asd
//	Definir precioI, pF Como Real
//	Escribir "Ingresa el total"
//	Leer precioI
//	
//	pF = precioI - (precioI * .15)
//	
//	Escribir  "El precio final de su compra es: $", pF
//FinAlgoritmo

////Un alumno desea saber cuál será su calificación final en la materia de Algoritmos. Dicha calificación se compone de los siguientes porcentajes:
////a. 55% del promedio de sus tres calificaciones parciales.
////b. 30% de la calificación del examen final.
////c. 15% de la calificación de un trabajo final.

//Algoritmo asd
//	Definir n1, n2, n3, eF, tF, prom, promF Como Real
//	Escribir "ingresa tus 3 notas parciales"
//	Leer n1, n2, n3
//	
//	Escribir "Ingresa la nota de tu examen final"
//	leer eF
//	
//	Escribir "ingresa la nota de tu trabajo final"
//	leer tF
//	
//	prom = (n1 + n2 + n3) / 3
//	
//	promF= (prom * .55) + (eF * .30) + (tF * .15)
//	
//	Escribir "Tu promedio final es: %", promF
//	
//FinAlgoritmo

////Pide al usuario dos números y muestra la "distancia" entre ellos (el valor absoluto de su diferencia, de modo que el resultado sea siempre positivo).

//Algoritmo asd
//	Definir n1, n2, a1, a2, dist Como Real
//	Escribir "Ingresa 2 numeros"
//	leer n1, n2
//	
//	a1 = n1
//	a2= n2
//	
//	dist = 0
//	Si n1 <> n2 Entonces
//		
//		Si n1 < n2 Entonces
//			
//			Repetir
//				dist = dist + 1
//				n1 = n1 + 1
//			Mientras Que n1 < n2
//			
//		SiNo
//			
//			Repetir
//				dist = dist + 1
//				n2 = n2 + 1
//			Mientras Que n2 < n1
//			
//		Fin Si
//		
//	SiNo
//		dist = 0
//	Fin Si
//	
//	
//	
//	Escribir "La distancia entre los numeros (", a1," y ", a2, ") es: ", dist
//	
//FinAlgoritmo

////Realizar un algoritmo que lea un número y que muestre su raíz cuadrada y su raíz cúbica. PSeInt no tiene ninguna función predefinida que permita calcular la raíz cúbica, ¿Cómo sepuede calcular?

//Algoritmo ASD
//	Definir num, rCua, rCub como real
//	Escribir "Ingresa un numero"
//	leer num
//	
//	rCua = raiz(num)
//	rCub = (num)^(1.0/3.0)
//	
//	Escribir "La raiz cuadrada: ", rCua
//	Escribir "La raiz cubica: ", rCub
//FinAlgoritmo

////Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número invertido. Ejemplo, si se introduce 23 que muestre 32.

//CADENAS
//Algoritmo asd
//	Definir num, num1, num2 Como Caracter
//	Escribir "Ingresa 1 numero de 2 cifras"
//	leer num
//	
//	num1 = SubCadena(num,0,0)
//	num2 = SubCadena(num,1,1)
//	
//	Escribir "El numero invertido es: ", num2, num1
//FinAlgoritmo

//NUMEROS
//Algoritmo adsf
//	Definir num,decenas,unidades como Entero;
//	Escribir "Ingresa 1 numero de 2 cifras";
//	Leer num;
//	decenas <- trunc(num/10);
//	unidades <- num % 10;
//	Escribir "El numero invertido es: ", unidades, decenas
//FinAlgoritmo

////Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. El tiempo de viaje hasta llegar a otra ciudad B es de T segundos. Escribir un algoritmo que determine la
////hora de llegada a la ciudad B.

Algoritmo ASD
	Definir horapartida, minpartida, segpartida, seginicial, segfinal,segviaje, horallegada, minllegada, segllegada Como Entero;
	Escribir Sin Saltar "Hora de salida:";
	Leer horapartida;
	Escribir Sin Saltar "Minutos de salida:";
	Leer minpartida;
	Escribir Sin Saltar "Segundos de salida:";
	Leer segpartida;
	Escribir Sin Saltar "Tiempo que has tardado en segundos:";
	Leer segviaje;
	
	//Convierto la hora de salida a segundos
	seginicial <- horapartida * 3600 + minpartida*60 + segpartida;
	//Le sumo los segundos que he tardado
	segfinal <- seginicial + segviaje;
	//Convierto los segundos totales a hora, minúto y segundos
	horallegada <- trunc(segfinal / 3600);
	minllegada <- trunc((segfinal % 3600) / 60);
	segllegada <- (segfinal % 3600) % 60;
	//Muestro la hora de llegada
	Escribir "Hora de llegada";
	Escribir horallegada,":",minllegada,":",segllegada;
FinAlgoritmo
