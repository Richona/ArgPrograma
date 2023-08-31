/* 8. Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
todos ellos. */

let num, max = 0, min = 0, acu = 0, cont = 0;

do {
    num = parseInt(prompt("Ingrese un numero. 0 para terminar."));

    if (num == 0) {
        break;
    }

    max = num > max ? num : max;

    min = num < min ? num : min;

    acu+= num;
    cont++;
} while (true);

alert(`El numero maximo es: ${max}.
El numero minimo es: ${min}.
El promedio es: ${acu / cont}`)