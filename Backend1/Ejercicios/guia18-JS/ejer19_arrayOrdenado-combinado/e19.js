/* 19. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado
de 20. */

function compareNumeric(a, b) {
	if (a > b) return 1;
	if (a == b) return 0;
	if (a < b) return -1;
}

let arrayA = [], arrayB = [];

for (let i = 0; i < 50; i++) {
    arrayA[i] = (Math.random() * 100).toFixed(1)
}

alert("ArrayA desordenado: " + arrayA);

arrayA.sort(compareNumeric);

alert("ArrayA ordenado: " + arrayA);

for (let i = 0; i < 20; i++) {
    arrayB[i] = i < 10 ? arrayA[i] : 0.5;
}

alert("ArrayB combinado: " + arrayB);
