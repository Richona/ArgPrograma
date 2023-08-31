/* 17. Realizar un programa que elimine los dos últimos elementos de un array. Mostrar el
resultado */

let array = ["Manzana", "Sopa", "Hilo", "Francia", "papas"];

alert(`Array completo: ` + array);

array.splice(array.length-2, array.length-1);

alert(`Array sin los 2 ultimos elementos: ` + array);