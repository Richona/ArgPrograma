/* 
2. Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio
de una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que
para calcular el área y el perímetro se utilizan las siguientes fórmulas:
area = PI * radio2
perimetro = 2 * PI * radio
*/

let pi = Math.PI;

let radio = prompt("Ingresa el radio de la circunferencia:");

let area = pi * Math.pow(radio, 2);

let perimetro = 2 * pi * radio;

alert(`El valor del area es ${area.toFixed(2)} y el perimetro es ${perimetro.toFixed(2)}`);