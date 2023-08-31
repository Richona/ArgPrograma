/* 11. Escribir una función que reciba un String y devuelva la palabra más larga.
String Ejemplo: “Guia de JavaScript”
Resultado esperado : “JavaScript” */
let palabraLarga = (p = "") => {
    p = p.split(" ");

    let palabra = p[0];
    
    for (let i = 1; i < p.length; i++) {
        palabra = p[i].length > palabra.length ? p[i] : palabra;
    };

    return palabra;
};

alert("La palabra mas larga es: " + palabraLarga(prompt("Ingresa una frase: ")));
