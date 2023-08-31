/* 6. Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
En caso de que el valor ingresado sea 0, se debe mostrar “el número no es par ni impar”. */
let num = prompt("Ingrese un numero para saber si es par:");

alert(num == 0 ? "El numero no es par ni impar" : num % 2 == 0 ? "El numero es par" : "El numero no es par")
