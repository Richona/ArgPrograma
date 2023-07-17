/*A Ahora veamos cómo ha quedado la tabla “superheroes” que creaste anteriormente. Para ello
necesitarás una consulta de tipo SELECT.*/
SELECT * from creador;
SELECT * from personajes;

/* B Realiza una consulta que devuelva todos los valores de la columna “nombre_real” de la tabla
superhéroe. */
select nombre_real from personajes;

/* C Realiza una consulta que devuelva todos los nombres reales de los personajes cuyo nombre
empieza con “B”.*/
select nombre_real from personajes where nombre_real like "b%";