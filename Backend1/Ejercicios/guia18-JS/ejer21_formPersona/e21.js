/* 21. Escribir un programa para obtener un array de las propiedades de un objeto Persona.
Las propiedades son nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. */
document.getElementById("form").addEventListener("submit", (e) => {
    let array = [];

    e.preventDefault();

    const nombre = document.getElementById("nombre").value;
    const edad = document.getElementById("edad").value;
    const sexos = document.getElementById("sexo").value;
    const peso = document.getElementById("peso").value;
    const altura = document.getElementById("altura").value;

    let sexo = sexos == 1 ? "Hombre" : sexos == 2 ? "Mujer" : "Otro";

    let persona = new Object();
    persona.nombre = nombre;
    persona.edad = edad;
    persona.sexo = sexo;
    persona.peso = peso;
    persona.altura = altura;

    array.push(persona);

    console.log(persona);
});

