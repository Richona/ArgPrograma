/* 9. Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
espacio entre cada letra. La frase se mostrara así: H o l a. Nota: recordar el
funcionamiento de la función Substring(). */

let frase = prompt("Ingresa una frase");

let fraseConEspacios= "";

for (let i = 0; i < frase.length; i++) {
    fraseConEspacios += frase.substring(i, i+1) + " "
}

alert(fraseConEspacios)