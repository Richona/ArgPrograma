/* 25. Escriba una función de JavaScript para obtener los valores de Nombre y Apellido del
siguiente formulario.
<!DOCTYPE html>
<html><head>
<meta charset=utf-8 />
<title>Obtener nombre y apellido de form </title>
</head><body>
<form id="form1" onsubmit="getFormValores()">
Nombre: <input type="text" name="nombre" value="David"><br>
Apellido: <input type="text" name="apellido" value="Beckham"><br>
<input type="submit" value="Submit">
</form>
</body>
</html> */

document.getElementById("form").addEventListener("submit", (e) => {
    e.preventDefault();

    let nombre = document.getElementById("nombre").value;
    let apellido = document.getElementById("apellido").value;

    alert(`Bienvenido ${nombre} ${apellido}`);
})