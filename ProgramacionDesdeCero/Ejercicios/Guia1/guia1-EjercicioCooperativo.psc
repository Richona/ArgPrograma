Algoritmo sin_titulo
	Definir num, centenas, decenas, unidades Como entero;
	
	Escribir "Ingresa un numero:";
    Leer num;
	
    centenas = (num % 1000 - num % 100) / 100;
    decenas = (num % 100 - num % 10) / 10;
    unidades = num % 10;
	
    Escribir "Valor de centenas: ", centenas, ", Valor de decenas: ", decenas, ", Valor de unidades: ", unidades
FinAlgoritmo
