/* <!-- 4. Realiza un programa que sólo permita introducir los caracteres ‘S’ y ‘N’. Si el usuario
ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. --> */

let resp = prompt("Ingresa S o N: ").toUpperCase();

alert(resp === "S" || resp === "N" ? "Correcto" : "Incorrecto");