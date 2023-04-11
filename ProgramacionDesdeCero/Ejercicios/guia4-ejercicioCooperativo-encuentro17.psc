//// CALCULAR SUPERFICIE
Funcion superficie = calcularSuperficie(alto, ancho)
	Definir superficie Como Real	
	superficie = alto * ancho
FinFuncion

//// CALCULAR VOLUMEN
Funcion volumen = calcularVolumen(alto, largo, ancho)
	Definir volumen Como Real
	volumen = alto * largo * ancho
FinFuncion

//// CALCULAR MURO
////Nos debe pedir primero si el muro será de 20 o 30 cm de espesor. Luego el largo y el alto. A partir
////de estos datos se debe mostrar al usuario la superficie del muro y la cantidad de materiales que
////necesitaremos para construirlo. 
////Si el muro es de 30cm necesitaremos por metro cuadrado: 15.2 kg de cemento, 0.115 m3 de arena y 120 ladrillos.
////Si el muro es de 20cm necesitaremos por metro cuadrado: 10.9 kg de cemento, 0.09 m3 de arena y 90 ladrillos. 
SubProceso calcularMuro()
	Definir espesor, largo, alto, superficie, cemento, arena, ladrillos como real
	Escribir "espesor de muro, 1) 20cm o 2) 30cm"
	Leer espesor
	
	Escribir "Largo del muro"
	Leer largo
	Escribir "Alto del muro"
	Leer alto
	
	superficie = calcularSuperficie(alto, largo)
	
	Segun espesor Hacer
		1:
			cemento = 10.9 * superficie
			arena = 0.9 * superficie
			ladrillos = 90 * superficie
		2:
			cemento = 15.2 * superficie
			arena = 0.115 * superficie
			ladrillos = 120 * superficie
		De Otro Modo:
			Escribir "Elegi una opcion correcta de espesor."
	Fin Segun
	
	Escribir "La superficie del muro será igual a: ", superficie, " m2";
	Escribir "La cantidad de cemento que se necesita es de: ", cemento, " Kg";
	Escribir "La cantidad de arena que se necesita es de: ", arena, " m3";
	Escribir "La cantidad de ladrillos que se necesitan es: ", ladrillos;
	
FinSubProceso

//// CALCULAR VIGA
////Nos debe pedir el largo de la viga. Por metro lineal de viga se necesitarán: 9 kg de cemento, 0.02
////m3 de arena, 0.02 m2 de piedra, 4 m de hierro del 8 y 3 m de hierro del 4.
////Debemos mostrar al usuario la cantidad de materiales necesaria.

SubProceso calcularViga()
	Definir largo Como Real
	Escribir "Largo de la viga"
	Leer largo
	
	Escribir "Meteriales necesarios."
	Escribir "Cemento: " largo * 9 "kg"
	Escribir "Arena: " largo * 0.02 "m3"
	Escribir "Piedra: " largo * 0.02 "m2"
	Escribir "Hierro del 8: " largo * 4 "m"
	Escribir "Hierro del 4: " largo * 3 "m"
	
FinSubProceso

//// CALCULAR COLUMNA
////Nos debe pedir el largo de la columna. Por metro lineal de columna se necesitarán: 7.5 kg de
////cemento, 0.016 m3 de arena, 0.016 m2 de piedra, 6 m de hierro del 10 y 3 m de hierro del 4.
////Debemos mostrar al usuario la cantidad de materiales necesaria.

SubProceso calcularColumna()
	Definir largo Como Real
	Escribir "Largo de la columna"
	Leer largo
	
	Escribir "Meteriales necesarios."
	Escribir "Cemento: " largo * 7.5 "kg"
	Escribir "Arena: " largo * 0.016 "m3"
	Escribir "Piedra: " largo * 0.016 "m2"
	Escribir "Hierro del 10: " largo * 6 "m"
	Escribir "Hierro del 4: " largo * 3 "m"
FinSubProceso

//// CAALCULAR CONTRAPISOS
////Nos debe pedir espesor, ancho y largo del contrapiso a calcular.
////Por metro cúbico de contrapiso se necesita: 105 kg de cemento, 0.45 m3 de arena y 0.9 m3 de piedra.
////Debemos mostrar al usuario la cantidad de materiales necesaria
SubProceso calcularContrapisos()
	Definir espesor, ancho, largo, volumen como real
	Escribir "Espesor del contrapiso"
	Leer espesor
	Escribir "Ancho del contrapiso"
	Leer ancho
	Escribir "Largo del contrapiso"
	leer largo
	
	volumen = calcularVolumen(espesor, largo, ancho)
	
	Escribir "Meteriales necesarios."
	Escribir "Cemento: " volumen * 105 "kg"
	Escribir "Arena: " volumen * 0.45 "m3"
	Escribir "Piedra: " volumen * 0.9 "m3"
FinSubProceso

//// CALCULAR TECHO
////Nos debe pedir espesor, ancho y largo del techo a calcular.
////Por metro cuadrado de techo se necesita: 33 kg de cemento, 0.072 m3 de arena, 0.072 m3 de
////piedra, 7 m de hierro del 8 y 4 m de hierro del 6
////Debemos mostrar al usuario la cantidad de materiales necesaria.

SubProceso calcularTecho()
	Definir espesor, ancho, largo, superficie como real
	Escribir "Espesor del contrapiso"
	Leer espesor
	Escribir "Ancho del contrapiso"
	Leer ancho
	Escribir "Largo del contrapiso"
	leer largo
	
	superficie = calcularSuperficie(largo, ancho)
	
	Escribir "Meteriales necesarios."
	Escribir "Cemento: " superficie * 33 "kg"
	Escribir "Arena: " superficie * 0.072 "m3"
	Escribir "Piedra: " superficie * 0.072 "m3"
	Escribir "Hierro del 8: " largo * 7 "m"
	Escribir "Hierro del 6: " largo * 4 "m"
FinSubProceso

//// CALCULAR PISOS
////Nos debe pedir ancho y largo del paño de piso a colocar. Teniendo esos datos se debe calcular la
////superficie y añadirle un 10% extra por recortes
////Mostrar el resultado en m2

SubProceso calcularPisos()
	Definir ancho, largo, superficie Como Real
	Escribir "Ancho del paño de piso"
	Leer ancho
	Escribir "Largo del paño de piso"
	Leer largo
	
	superficie = calcularSuperficie(largo, ancho)
	
	Escribir "La superficie con un 10% extra por recortes es: " superficie + (superficie * 0.10) "m2"
FinSubProceso

//// CALCULAR PINTURA
////Nos debe pedir la superficie del muro y mostrar cuánta pintura necesitamos teniendo en cuenta
////que rinde 6 m2 por litro de pintura.

SubProceso calcularPintura()
	Definir ancho, largo, superficie Como Real
	Escribir "Ancho del muro"
	Leer ancho
	Escribir "Largo del muro"
	Leer largo
	
	superficie = calcularSuperficie(largo, ancho)
	
	Escribir "Pintura necesaria: " superficie / 6 "l"
FinSubProceso

//// CALCULAR ILUMINACION
////Nos debe pedir la superficie de la habitación. La iluminación la calculamos de la siguiente forma:
////superficie * 0.20. Eso nos da la cantidad mínima de superficie de iluminación natural (ventanas y
////puertas de vidrio). Mostrar resultado

SubProceso calcularIluminacion()
	Definir ancho, largo, superficie Como Real
	Escribir "Ancho del muro"
	Leer ancho
	Escribir "Largo del muro"
	Leer largo
	
	superficie = calcularSuperficie(largo, ancho)
	
	Escribir "Se necesitan " superficie * 0.20  " m2 de iluminación natural.";
FinSubProceso

//// SUBMENU
SubProceso submenu(ban Por Referencia)
	Definir res Como Caracter
	Escribir "********************************************"
	Escribir "Desea seguir utilizando la app? s/S para si"
	Escribir "********************************************"
	Leer res
	
	Si Minusculas(res) == "s" Entonces
		ban = Verdadero
	SiNo
		Escribir "*** SALIR ***. Gracias por usar nuestra app."
		ban = falso
	Fin Si
FinSubProceso

//// MENU
////El menú debe quedar de la siguiente manera:
////1. Calcular muro de ladrillo
////2. Calcular viga de hormigón
////3. Calcular columnas de hormigón
////4. Calcular contrapisos
////5. Calcular techo
////6. Calcular pisos
////7. Calcular pintura
////8. Calcular iluminación
////9. Salir
SubProceso menu()
	Definir opc Como Entero
	Definir ban Como Logico
	
	ban = Verdadero
	
	Repetir
		Escribir "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
		Escribir "Bienvenido! Ingresa un numero eligiendo la opcion:"
		Escribir "1. Calcular muro de ladrillo"
		Escribir "2. Calcular viga de hormigón"
		Escribir "3. Calcular columnas de hormigón"
		Escribir "4. Calcular contrapisos"
		Escribir "5. Calcular techo"
		Escribir "6. Calcular pisos"
		Escribir "7. Calcular pintura"
		Escribir "8. Calcular iluminación"
		Escribir "9. Salir"
		Escribir "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
		Leer opc
		
		Segun opc Hacer
			1:
				Escribir "*** CALCULAR MURO DE LADRILLO ***"
				calcularMuro()
				submenu(ban)
			2:
				Escribir "*** CALCULAR VIGA DE HORMIGON ***"
				calcularViga()
				submenu(ban)
			3:
				Escribir "*** CALCULAR COLUMNAS DE HORMIGON ***"
				calcularColumna()
				submenu(ban)
			4:
				Escribir "*** CALCULAR CONTRAPISOS ***"
				calcularContrapisos()
				submenu(ban)
			5:
				Escribir "*** CALCULAR TECHO ***"
				calcularTecho()
				submenu(ban)
			6:
				Escribir "*** CALCULAR PISOS ***"
				calcularPisos()
				submenu(ban)
			7:
				Escribir "*** CALCULAR PINTURA ***"
				calcularPintura()
				submenu(ban)
			8:
				Escribir "*** CALCULAR ILUMINACION ***"
				calcularIluminacion()
				submenu(ban)
			9:
				Escribir "*** SALIR ***. Gracias por usar nuestra app."
				ban = Falso
			De Otro Modo:
				Escribir "ERROR! Elegi una opcion correcta."
		Fin Segun
		
	Mientras Que ban
	
FinSubProceso

//// ALGORITMO PRINCIPAL
////El algoritmo principal sólo debe llamar al subPrograma menu()
Algoritmo algoritmoPrincipal
	menu()
FinAlgoritmo
