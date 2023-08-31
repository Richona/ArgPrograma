let num1 = prompt("Ingrese el primer numero: ");
let num2 = prompt("Ingrese el segundo numero: ");

let ope = prompt("Que operacion desea realizar?\n"
    + "s- sumar.\n"
    + "r- restar.\n"
    + "m- multiplicar.\n"
    + "d- dividir.\n");

switch (ope.toLowerCase()) {
    case "s":
        alert(`La suma entre ${num1} y ${num2} es: ${num1 + num2}`);
        break;
    case "r":
        alert(`La resta entre ${num1} y ${num2} es: ${num1 - num2}`);
        break;
    case "m":
        alert(`La multiplicacion entre ${num1} y ${num2} es: ${num1 * num2}`);
        break;
    case "d":
        alert(num2 == 0 ? "No se puede dividir por 0" : `La division entre ${num1} y ${num2} es: ${num1 / num2}`);
        break;
    default:
        alert("Opcion incorrecta.");
        break;
}