/* 15. Escribe un programa JavaScript para calcular el área y el perímetro de un objeto Círculo
con la propiedad radio. Nota: Cree dos métodos para calcular el área y el perímetro. El
radio del círculo lo proporcionará el usuario. */
function calcularArea(radio){
    return Math.PI * Math.pow(radio, 2);
}

function calcularPerimetro(radio) {
    return 2 * Math.PI * radio;
}

let radio = prompt("Ingrese el radio de un circulo:");

alert(`El area del circulo es: ${calcularArea(radio).toFixed(2)}
El perimetro del circulo es: ${calcularPerimetro(radio).toFixed(2)}`);