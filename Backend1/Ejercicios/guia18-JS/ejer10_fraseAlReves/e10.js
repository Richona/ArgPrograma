/* 10. Escribir una función flecha que reciba una palabra y la devuelva al revés. */
let palabraAlReves = (p = "") => {
    // let p2 = p.split("");
    // let p3 = p2.reverse();
    // let p4 = p3.join("");
    // return p4;

    return p.split("").reverse().join("");
};

alert(palabraAlReves(prompt("Ingresa una palabra")));