/* 24. Escribir un programa de JavaScript que a través de un formulario calcule el radio de un
circulo y lo muestre en el HTML. */
function calcularArea(radio){
    return Math.PI * Math.pow(radio, 2);
}

function calcularPerimetro(radio) {
    return 2 * Math.PI * radio;
}

document.getElementById("form").addEventListener("submit", (e) =>{
    e.preventDefault();

    let radio = document.getElementById("radio").value;

    let area = calcularArea(radio);
    let perimetro = calcularPerimetro(radio);

    let mensaje = `El resultado con el radio de ${radio} es:
    area: ${area}
    perimetro: ${perimetro}`;

    document.getElementById("resultado").innerHTML = mensaje;
})