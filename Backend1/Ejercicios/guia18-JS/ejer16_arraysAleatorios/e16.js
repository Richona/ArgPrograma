/*  16. Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios
y los muestre por pantalla. */

let array1 = [], array2 = [];

for (let i = 0; i < 5; i++) {
    array1[i] = Math.round(Math.random() * 100);
    array2[i] = Math.round(Math.random() * 100);
}

alert(`Array1: ${array1}
Array2: ${array2}`);
