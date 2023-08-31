/* 23. Resalte todas las palabras de más de 8 caracteres en el texto del párrafo (con un fondo
amarillo, por ejemplo) */

let palabras = document.getElementById("parrafo").innerText.split(" ")

for (let i = 0; i < palabras.length; i++) {
    if (palabras[i].length > 8) {
        palabras[i] = `<span class="resaltado">${palabras[i]}</span>`;
    }
}

document.getElementById("parrafo").innerHTML = palabras.join(" ")

console.log(palabras)