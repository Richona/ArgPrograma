/* 12. Escribir una función flecha de JavaScript que reciba un argumento y retorne el tipo de dato. */
let tipoDeDato = (dato) => {
    return typeof dato;
}

alert(`2 es ${tipoDeDato(2)}
'hola' es: ${tipoDeDato("hola")}
true es: ${tipoDeDato(true)}`);