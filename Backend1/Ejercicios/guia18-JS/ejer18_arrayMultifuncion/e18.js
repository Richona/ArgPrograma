/* 18. A partir del siguiente array: var valores = [true, 5, false, "hola", "adios", 2]:
a) Determinar cual de los dos elementos de texto es mayor
b) Utilizando exclusivamente los dos valores booleanos del array, determinar los
operadores necesarios para obtener un resultado true y otro resultado false
c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los
dos elementos numéricos */

let valores = [true, 5, false, "hola", "adios", 2];

let palabraMasLarga = "";

for (let i = 0; i < valores.length; i++) {
    if (typeof valores[i] === 'string') {
        palabraMasLarga = valores[i].length > palabraMasLarga.length ? valores[i] : palabraMasLarga;
    } 
};

let resultadoTrue = valores[0] || valores[2];
let resultadoFalse = valores[0] && valores[2];

let suma = valores[1] + valores[5];
let resta = valores[1] - valores[5];
let multiplicacion = valores[1] * valores[5];
let divison = valores[1] / valores[5];
let modulo = valores[1] % valores[5];


alert(`La palabra mas larga es: ${palabraMasLarga}
${resultadoTrue} / ${resultadoFalse}
suma: ${suma} / resta: ${resta} / multiplicacion: ${multiplicacion} / division: ${divison} / modulo: ${modulo}`);

