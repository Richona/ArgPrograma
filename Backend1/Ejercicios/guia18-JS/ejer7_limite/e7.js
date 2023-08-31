/* 7. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial. */

let limite = prompt("Ingrese un numero limite");

let acu = 0;
do {
    acu += parseInt(prompt("Ingrese numero para ir sumando hasta superar el limite: .\nSuma= " + acu + "\nLimite= " + limite));
    
} while (acu <= limite);

alert("Limite superado");