
 -- 1. Lista el nombre de todos los productos que hay en la tabla producto.
select nombre from producto;

-- 2. Lista los nombres y los precios de todos los productos de la tabla producto.
select nombre, precio from producto;

-- 3. Lista todas las columnas de la tabla producto.
select * from producto;
select * from fabricante;

-- 4. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor del precio.
select nombre, round(precio) as precio_de_los_productos from producto;

-- 5. Lista el código de los fabricantes que tienen productos en la tabla producto.
select codigo_fabricante from producto;

-- 6. Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard. Utilizando el operador IN.
select producto.nombre, fabricante.nombre from producto inner join fabricante on producto.codigo_fabricante = fabricante.codigo where fabricante.nombre in ("Asus", "Hewlett-Packard"); 

-- 7. Lista los nombres de los fabricantes ordenados de forma ascendente.
select nombre from fabricante order by nombre;

-- 8. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma
-- ascendente y en segundo lugar por el precio de forma descendente.
select * from producto order by nombre, precio desc;

-- 9. Devuelve una lista con las 5 primeras filas de la tabla fabricante.
select * from fabricante limit 5;

-- 10. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas ORDER BY y LIMIT)
select nombre, precio from producto order by precio limit 1;

-- 11. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER BY y LIMIT)
select nombre, precio from producto order by precio desc limit 1;

-- 12. Lista el nombre de los productos que tienen un precio menor o igual a $120.
select nombre, precio from producto where precio <= 120;

-- 13. Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el operador BETWEEN.
select nombre, precio from producto where precio between 60 and 200;

-- 14. Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el operador IN.
select * from producto where codigo_fabricante in (1, 3, 5);

-- 15. Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil en el nombre.
select nombre from producto where nombre like "%Portatil%";


/************************/
/* Consultas Multitabla */
/************************/
-- 1. Devuelve una lista con el código del producto, nombre del producto, código del fabricante y nombre del fabricante, de todos los productos de la base de datos.
SELECT 
    producto.codigo,
    producto.nombre AS nombreProducto,
    fabricante.codigo,
    fabricante.nombre AS nombreFabricante
FROM
    producto
        INNER JOIN
    fabricante ON producto.codigo_fabricante = fabricante.codigo;

-- 2. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos los productos de la base de datos. Ordene el resultado por el nombre del fabricante, por orden alfabético.
SELECT 
    producto.nombre,
    producto.precio,
    fabricante.nombre AS nombreFabricante
FROM
    producto
        INNER JOIN
    fabricante ON producto.codigo_fabricante = fabricante.codigo
ORDER BY fabricante.nombre;

-- 3. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto más barato.
SELECT 
    producto.nombre,
    producto.precio,
    fabricante.nombre AS nombreFabricante
FROM
    producto
        INNER JOIN
    fabricante ON producto.codigo_fabricante = fabricante.codigo
ORDER BY producto.precio
LIMIT 1;

-- 4. Devuelve una lista de todos los productos del fabricante Lenovo.
SELECT 
    producto.nombre,
    producto.precio,
    fabricante.nombre AS nombreFabricante
FROM
    producto
        INNER JOIN
    fabricante ON producto.codigo_fabricante = fabricante.codigo
WHERE
    fabricante.nombre LIKE 'Lenovo';
    
-- 5. Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio mayor que $200.
SELECT 
    producto.nombre,
    producto.precio,
    fabricante.nombre AS nombreFabricante
FROM
    producto
        INNER JOIN
    fabricante ON producto.codigo_fabricante = fabricante.codigo
WHERE
    fabricante.nombre LIKE 'Crucial'
        AND producto.precio > 200;

-- 6. Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard. Utilizando el operador IN.
SELECT 
    producto.nombre,
    producto.precio,
    fabricante.nombre AS nombreFabricante
FROM
    producto
        INNER JOIN
    fabricante ON producto.codigo_fabricante = fabricante.codigo
WHERE
    fabricante.nombre in ("Asus", "Hewlett-Packard");
    
-- 7. Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos los productos que tengan un precio mayor o igual a $180. Ordene el resultado en primer
-- lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden ascendente)
SELECT 
    producto.nombre,
    producto.precio,
    fabricante.nombre AS nombreFabricante
FROM
    producto
        INNER JOIN
    fabricante ON producto.codigo_fabricante = fabricante.codigo
WHERE
    producto.precio >= 180
ORDER BY producto.precio DESC , producto.nombre;

/*********************************************************************************************************/
/* Consultas Multitabla // Resuelva todas las consultas utilizando las cláusulas LEFT JOIN y RIGHT JOIN. */
/*********************************************************************************************************/
-- 1. Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los productos que tiene cada uno de ellos. El listado deberá mostrar también aquellos
-- fabricantes que no tienen productos asociados.
SELECT 
    fabricante.nombre AS nombreFabricante, producto.nombre
FROM
    fabricante
        LEFT JOIN
    producto ON producto.codigo_fabricante = fabricante.codigo;
    
-- 2. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún producto asociado.
SELECT 
    fabricante.nombre AS nombreFabricante, producto.nombre
FROM
    producto
        RIGHT JOIN
    fabricante ON producto.codigo_fabricante = fabricante.codigo
WHERE
    producto.nombre IS NULL;
    
    
/********************************************************************************/
/* Subconsultas (En la cláusula WHERE) // Con operadores básicos de comparación */
/********************************************************************************/
-- 1. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).
SELECT 
    *
FROM
    producto
WHERE
    codigo_fabricante = (SELECT 
            codigo
        FROM
            fabricante
        WHERE
            nombre LIKE 'Lenovo');

-- 2. Devuelve todos los datos de los productos que tienen el mismo precio que el producto más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).
SELECT 
    *
FROM
    producto
WHERE
    precio = (SELECT 
            max(precio)
        FROM
            producto
        WHERE
            codigo_fabricante = (SELECT 
                    codigo
                FROM
                    fabricante
                WHERE
                    nombre LIKE 'Lenovo'));
                    
-- 3. Lista el nombre del producto más caro del fabricante Lenovo.
SELECT 
    nombre
FROM
    producto
WHERE
    precio = (SELECT 
            max(precio)
        FROM
            producto
        WHERE
            codigo_fabricante = (SELECT 
                    codigo
                FROM
                    fabricante
                WHERE
                    nombre LIKE 'Lenovo'));

-- 4. Lista todos los productos del fabricante Asus que tienen un precio superior al precio medio de todos sus productos.
SELECT 
    *
FROM
    producto
WHERE
    codigo_fabricante = (SELECT 
            codigo
        FROM
            fabricante
        WHERE
            nombre LIKE 'Asus')
        AND precio > (SELECT 
            AVG(precio)
        FROM
            producto
        WHERE
            codigo_fabricante = (SELECT 
                    codigo
                FROM
                    fabricante
                WHERE
                    nombre LIKE 'Asus'));
                    
                    
/********************************/
/* Subconsultas con IN y NOT IN */
/********************************/
-- 1. Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o NOT IN).
SELECT 
    nombre
FROM
    fabricante
WHERE
    codigo IN (SELECT 
            codigo_fabricante
        FROM
            producto);

-- 2. Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando IN o NOT IN).
SELECT 
    nombre
FROM
    fabricante
WHERE
    codigo NOT IN (SELECT -- CONSULTA DONDE SE OBTIENE EL ID DEL FABRICANTE EN TODOS LOS PRODUCTOS.
            codigo_fabricante
        FROM
            producto);


/****************************************/
/* Subconsultas (En la cláusula HAVING) */
/****************************************/
-- 1. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número de productos que el fabricante Lenovo.
SELECT -- CONSULTA DONDE SE OBTIENE EL NOMBRE DE LOS FABRICANTES CUMPLIENDO LA CONDICION.
    nombre
FROM
    fabricante
WHERE
    codigo IN (SELECT -- CONSULTA DONDE SE OBTIENE EL ID DE LOS FABRICANTES QUE TENGAN LA MISMA CANTIDAD QUE LENOVO.
            codigo_fabricante
        FROM
            producto
        GROUP BY codigo_fabricante
        HAVING COUNT(*) = (SELECT -- CONSULTA DONDE SE OBTIENE LA CANTIDAD DE PRODUCTOS DEL FABRICANTE LENOVO.
                COUNT(*)
            FROM
                producto AS prod
                    INNER JOIN
                fabricante AS fabr ON prod.codigo_fabricante = fabr.codigo
            WHERE
                fabr.nombre = 'Lenovo'));