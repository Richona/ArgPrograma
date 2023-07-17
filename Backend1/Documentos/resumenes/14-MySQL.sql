/* *************************************************/
/* **************  ATAJOS DE TECLADO ***************/
/* *************************************************/
-- CTRL + ENTER : EJECUTAR LINEA.

-- CTRL + SHIFT + ENTER : EJECUTAR ARCHIVO.

-- CTRL + DIVISOR : COMENTAR/DESCOMENTAR.

-- CTRL + RUEDITA : AUMENTAR/DISMINUIR PANTALLA.

-- CTRL + B : IDENTAR/EMBECELLER CODIGO.

-- CTRL + R : GENERAR DIAGRAMA DE TABLAS.

/* *****************************************************************/
/* **************  CREATE - INSERT - UPDATE - DELETE ***************/
/* *****************************************************************/
DROP DATABASE IF EXISTS superheroes; /* BORRA BASE DE DATOS SI EXISTE */

CREATE DATABASE superheroes CHARACTER SET utf8mb4; /* CREA BASE DE DATOS */

USE superheroes; /* USA LA BASE DE DATOS */

CREATE TABLE creador ( /* CREA TABLA */
id_creador INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, /* LLAVE PRIMARIA UNICA ENTERA QUE SE AUTOINCREMENTA */
  nombre VARCHAR(20) NOT NULL /* STRING DE 20 CARACTERES QUE NO PERMITE NULOS */
);

alter table creador rename to hola; -- ALTER TABLE PERMITE MODIFICAR ESTRUCTURA.
alter table hola rename to creador;

CREATE TABLE personajes (
  id_personaje INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre_real VARCHAR(20) NOT NULL,
  personaje VARCHAR(20) NOT NULL,
  inteligencia INT(10) NOT NULL,
  fuerza VARCHAR(10) NOT NULL,
  velocidad INT(11) NOT NULL,
  poder INT(11) NOT NULL,
  aparicion INT(11) NOT NULL,
  ocupacion VARCHAR(30) NULL,
  id_creador INT UNSIGNED NOT NULL,
  FOREIGN KEY (id_creador) REFERENCES creador(id_creador) /* LLAVE FORANEA, RELACIONA PERSONAJES CON CREADOR */
  );

insert into creador (nombre) values ("Marvel"); /* INSERTA UN DATO EN LA TABLA CREADOR */
insert into creador (nombre) values ("DC Comics");
INSERT INTO creador (nombre) values ("CARLITO");
INSERT INTO creador (nombre) values ("marcelo");

UPDATE creador SET nombre = REPLACE(nombre, 'CARLITO', 'Bolita') WHERE id_creador = 7;
select * from creador;

update creador set nombre = "bolita" where nombre = 'CARLITO';
-- update creador set nombre = "autito" where id_creador = 3;

delete from creador where id_creador = 6;

UPDATE personajes SET velocidad = 80 WHERE inteligencia = 170;

/* INSERCION DE DATOS A LA TABLE PERSONAJES */
insert into personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) values ("Bruce Banner", "Hulk", 160, "600 mil", 75, 98, 1962, "Fisico Nuclear", 1);
insert into personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) values ("Tony Stark", "Iron Man", 170, "200 mil", 70, 123, 1963, "Inventor Industrial", 1);
insert into personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) values ("Thor Odinson", "Thor", 145, "infinita", 100, 235, 1962, "Rey de Asgard", 1);
insert into personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) values ("Wanda Maximoff", "Bruja Escarleta", 170, "100 mil", 90, 345, 1964, "Bruja", 1);
insert into personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) values ("Carol Danvers", "Capitana Marvel", 157, "250 mil", 85, 128, 1968, "Oficial de Inteligencia", 1);
insert into personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) values ("Thanos", "Thanos", 170, "infinita", 40, 306, 1973, "Adorador de la Muerte", 1);
insert into personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) values ("Peter Parker", "Spiderman", 165, "25 mil", 80, 74, 1962, "Fotografo", 1);
insert into personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) values ("Steve Rogers", "Capitan America", 145, "600", 45, 60, 1941, "Oficial Federal",1);
insert into personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) values ("Bobby Drake", "Ice Man", 140, "2 mil", 64, 122, 1963, "Contador", 1);
insert into personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) values ("Barry Allen", "Flash", 160, "10 mil", 120, 168, 1956, "Cientifico forense", 2);
insert into personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) values ("Bruce Wayne", "Batman", 170, "500", 32, 47, 1939, "Hombre de negocios", 2);
insert into personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) values ("Clarck Kent", "Superman", 165, "infinita", 120, 182, 1948, "Reportero", 2);
insert into personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) values ("Diana Prince", "Mujer Maravilla", 160, "infinita", 95, 127, 1949, "Princesa guerrera", 2);

UPDATE personajes SET aparicion = 1938 WHERE id_personaje = 12;/* ACTUALIZA EL DATO CON ID 12 */

DELETE FROM personajes WHERE id_personaje = 10; /* BORRA EL DATO CON ID 10 */

/*****************************************************************************************************************/
/***************  SELECT - WHERE - OPERADORES - BETWEEN - IN - NOT IN - LIKE - NOT LIKE - ORDER BY ***************/
/*****************************************************************************************************************/
SELECT * from creador;
SELECT * from personajes;/* MUESTRA TODA LA TABLE */

SELECT nombre_real, personaje from personajes; /* MUESTRA SOLO LAS COLUMNAS ESCRITAS */

SELECT nombre_real, personaje, (inteligencia + fuerza + velocidad + poder) from personajes; /* SUMA TODAS SUS HABILIDADES */

SELECT DISTINCT aparicion from personajes; /* NO REPITE VALORES */

select nombre_real, personaje from personajes where personaje = "Thor"; /* MUESTRA AL PERSONAJE THOR */

select nombre_real, personaje, aparicion from personajes where aparicion > 1962; /* MUESTRA TODOS LOS PERSONAJES QUE APARECIERON DESPUES DE 1962 */

select nombre_real, personaje, aparicion from personajes where aparicion >= 1962 AND aparicion <= 1970; /* MUESTRA TODOS LOS PERSONAJES QUE APARECIERON ENTRE 1962 Y 1970 */

select nombre_real, personaje, aparicion from personajes where aparicion between 1962 and 1970; /* MUESTRA TODOS LOS PERSONAJES QUE APARECIERON ENTRE 1962 Y 1970 */

select nombre_real, personaje from personajes where personaje in ("Thor", "Hulk", "Iron Man"); /* MUESTRA A LOS PERSONAJES THOR, Hulk e Iron Man*/

select nombre_real, personaje from personajes where personaje not in ("Thor", "Hulk", "Iron Man"); /* MUESTRA A LOS PERSONAJES QUE NO SEAN THOR, Hulk e Iron Man*/

select nombre_real, personaje from personajes where personaje like "b%"; /* MUESTRA PERSONAJES QUE EMPIECEN CON B */

select nombre_real, personaje from personajes where personaje like "%a"; /* MUESTRA PERSONAJES QUE TERMINEN CON A */

select nombre_real, personaje from personajes where personaje like "%a%"; /* MUESTRA PERSONAJES QUE TENGAN UNA A ENTRE MEDIO */

select nombre_real, personaje from personajes where personaje like "b______%"; /* MUESTRA PERSONAJES QUE EMPIECEN CON B Y AL MENOS TENGA 7 DE LARGO*/

select * from empleados where nombre not like "%ma%"; -- NOT LIKE FUNCIONA AL REVES QUE LIKE, LO BUSCADO NO DEBE ESTAR.

select nombre_real, personaje from personajes order by nombre_real; /* ORDENA LOS NOMBRES DE FORMA ASCENDENTE */

select nombre_real, personaje from personajes order by nombre_real desc; /* ORDENA LOS NOMBRES DE FORMA DESCENDENTE */

select * from producto order by nombre, precio desc; /* ORDENA PRIMERO POR NOMBRE ASC Y LUEGO POR PRECIO DESC */

/**********************************************************************************************/
/***************  GROUP BY - FUNCIONES DE AGREGACION(MAX, MIN, COUNT, SUM, AVG) ***************/
/**********************************************************************************************/
select nombre_real, personaje from personajes group by nombre_real; /* AGRUPA MEDIANTE EL NOMBRE */

select max(poder) from personajes; /* MUESTRA EL PODER MAS GRANDE */

select min(poder) from personajes; /* MUESTRA EL PODER MAS CHICO */

select avg(poder) from personajes; /* MUESTRA EL PROMEDIO DE PODER */

select count(personaje) from personajes; /* MUESTRA EL TOTAL DE PERSONAJES */

select id_creador, sum(poder) from personajes group by id_creador; /* AGRUPAMOS PERSONAJES MEDIANTE CREADOR Y SUMAMOS PODERES */

select count(id_creador), id_creador from personajes group by id_creador; /* AGRUPAMOS PERSONAJES MEDIANTE CREADOR Y SUMAMOS CUANTOS TIENE CADA UNO */


/************************************************************/
/***************  HAVING - AS - ROUND - LIMIT ***************/
/************************************************************/
select count(id_creador), id_creador from personajes group by id_creador having count(id_creador) > 3; /* AGRUPAMOS PERSONAJES MEDIANTE CREADOR Y SUMAMOS CUANTOS TIENE CADA UNO, HAVING CONDICIONA COMO WHERE */

select count(personaje) AS "Cantidad de personajes" from personajes; -- AS PERMITE DARLE UN ALIAS A UNA COLUMNA.

-- CONSULTA COMPLETA UTILIZANDO GRAN PARTE DE LO VISTO.
SELECT personaje AS personajes FROM personajes
WHERE nombre_real like "%a%"
GROUP BY  id_creador
HAVING id_creador > 1
ORDER BY nombre_real asc;

select round(avg(poder)) from personajes; /* MUESTRA EL PROMEDIO DE PODER REDONDEADO */

select nombre_real, personaje from personajes where personaje like "%a%" limit 3; /* MUESTRA LOS PRIMEROS 3 PERSONAJES QUE TENGAN UNA A ENTRE MEDIO */


/************************************************************/
/***************  JOIN: INNER | LEFT | RIGHT  ***************/
/************************************************************/
select personaje, nombre from personajes inner join creador on personajes.id_creador = creador.id_creador; -- UNE LAS DOS TABLAS MEDIANTE SU ID MIENTRAS TENGAN DATOS RELACIONADOS.

-- insert into creador (nombre) values ("PATULUZU");
select nombre, personaje from creador left join personajes on creador.id_creador = personajes.id_creador; -- UNE LAS DOS TABLAS MEDIANTE SU ID. TRAE TODOS LOS DATOS DE LA TABLA IZQUIERDA SIN IMPORTAR SI HAY RELACION.

select personaje, nombre from personajes right join creador on personajes.id_creador = creador.id_creador; -- UNE LAS DOS TABLAS MEDIANTE SU ID. TRAE TODOS LOS DATOS DE LA TABLA DERECHA SIN IMPORTAR SI HAY RELACION.

SELECT * FROM -- SE PUEDEN UNIR VARIAS TABLAS.
    cliente AS c
        INNER JOIN
    empleado AS e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
        INNER JOIN
    pago AS p ON c.codigo_cliente = p.codigo_cliente;
    

/**********************************************/
/***************  SUBCONSULTAS  ***************/
/**********************************************/
select nombre_real, personaje, poder from personajes where poder > (select avg(poder) from personajes); -- CONSULTA DENTRO DE OTRA, PERMITE REDUCIR LINEAS.


/**********************************************/
/***************  COSAS QUE VI  ***************/
/**********************************************/
/* ABS */ -- ABS() RETORNA EL VALOR ABSOLUTO (NUMERO POSITIVO).
SELECT * FROM partidos WHERE ABS(puntos_local - puntos_visitante) = 10; 


/* IF */ -- IF PERMITE CONDICIONAR UN DATO, IF(condicion, true, false). EL CASO FALSE PUEDE ANIDARSE OTRO IF.
SELECT  IF(puntos_local > puntos_visitante, equipo_local, IF(puntos_local < puntos_visitante, equipo_visitante, NULL)) FROM partidos;


/* CONCAT */ -- CONCAT TE PERMITE UNIR CADENAS.
SELECT CONCAT(e.nombre, ' ', e.apellido1, ' ', e.apellido2) FROM empleado; 


/* IS NULL */ -- IS NULL PERMITE VALIDAR SI ESTA NULO.
SELECT * FROM fabricante LEFT JOIN producto ON producto.codigo_fabricante = fabricante.codigo WHERE producto.nombre IS NULL; 


/* USING */ -- - USING() ES LO MISMO QUE PONER on p.codigo_producto = dp.codigo_producto SIEMPRE Y CUANDO TENGAN EL MISMO NOMBRE ID.
SELECT * FROM producto p LEFT JOIN detalle_pedido dp using(codigo_producto);


/* EXISTS | NOT EXISTS */ -- EXISTS se usa para comprobar si un registro existe en una subconsulta. NOT EXISTS ES LO CONTRARIO.
SELECT * FROM cliente c WHERE NOT EXISTS (SELECT *  FROM pago p WHERE c.codigo_cliente = p.codigo_cliente);


/* DATE */
select * from pago where year(fecha_pago) = 2008; -- YEAR OBTIENE EL AÑO DE UN DATO DATE.

select * from pedido where month(fecha_entrega) = 01; -- MONTH OBTIENE EL MES DE UN DATE.

select * from pago where DATE_FORMAT(fecha_pago, "%Y") = 2008; -- -- DATE_FORMAT(fecha_pago, "%Y") OBTIENE EL AÑO DE UN DATO DATE.

SELECT * FROM pago WHERE LEFT(fecha_pago, 4) = 2008; -- LEFT(fecha_pago, 4) OBTIENE EL AÑO DE UN DATO DATE. .

SELECT * FROM pedido WHERE adddate(fecha_entrega, interval 2 day) <= fecha_esperada; -- ADDDATE(fecha_entrega, interval 2 day) AGREGA TIEMPO A UN DATO DATE. (FUNCIONA CON DÍAS, MESES, AÑOS...)

SELECT * FROM pedido WHERE datediff(fecha_entrega, fecha_esperada) >= 2; -- datediff(fecha_entrega, fecha_esperada) RETORNA LA DIFERENCIA ENTRE 2 FECHAS. (SÓLO FUNCIONA CON DÍAS)