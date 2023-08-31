/* 20. Realizar un programa que obtenga la siguiente matriz [[3], [6], [9], [12], [15]] y devuelve y
muestre el siguiente array [6, 9, 12, 15, 18]. */

let arrayOriginal = [[3], [6], [9], [12], [15]];
console.log("Array original: " + arrayOriginal)

let arrayModify = arrayOriginal.flat();

arrayModify.shift();
arrayModify.push(18)

console.log("Array modificado: " + arrayModify)