/*****************************/
/* Consultas sobre una tabla */ 
/*****************************/
-- 1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.
select codigo_oficina, ciudad from oficina;

-- 2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.
select ciudad, telefono from oficina where pais like "España";

-- 3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un código de jefe igual a 7.
select nombre, apellido1, apellido2, email from empleado where codigo_jefe = 7;

-- 4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.
select puesto, nombre, apellido1, apellido2, email from empleado where codigo_jefe is NULL;

-- 5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean representantes de ventas.
select nombre, apellido1, apellido2, puesto from empleado where puesto not like "Representante Ventas";

-- 6. Devuelve un listado con el nombre de los todos los clientes españoles.
select nombre_cliente from cliente where pais like "Spain";

-- 7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.
select distinct(estado) from pedido;

/*
8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago
en 2008. Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan
repetidos. Resuelva la consulta:
o Utilizando la función YEAR de MySQL.
o Utilizando la función DATE_FORMAT de MySQL.
o Sin utilizar ninguna de las funciones anteriores.
*/
select codigo_cliente, fecha_pago from pago where year(fecha_pago) = 2008;

select codigo_cliente, fecha_pago from pago where DATE_FORMAT(fecha_pago, "%Y") = 2008;

SELECT distinct(codigo_cliente), fecha_pago FROM pago WHERE LEFT(fecha_pago, 4) = 2008;

-- 9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos que no han sido entregados a tiempo.
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from pedido where fecha_entrega > fecha_esperada;

/*
10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de
entrega de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha
esperada.
o Utilizando la función ADDDATE de MySQL.
o Utilizando la función DATEDIFF de MySQL.
*/
SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega FROM pedido WHERE adddate(fecha_entrega, interval 2 day) <= fecha_esperada;

SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega FROM pedido WHERE datediff(fecha_entrega, fecha_esperada) >= 2;

-- 11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.
select * from pedido where estado like "rechazado" && year(fecha_pedido) = 2009;

-- 12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de cualquier año.
select * from pedido where estado like "entregado" && month(fecha_entrega) = 01;

-- 13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal. Ordene el resultado de mayor a menor.
select * from pago where forma_pago like "PayPal" && year(fecha_pago) = 2008 order by total desc;

-- 14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en cuenta que no deben aparecer formas de pago repetidas.
select distinct forma_pago from pago;

-- 15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que tienen más de 100 unidades en stock. 
-- El listado deberá estar ordenado por su precio de venta, mostrando en primer lugar los de mayor precio.
select * from producto where gama like "Ornamentales" and cantidad_en_stock > 100 order by precio_venta desc;

-- 16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo representante de ventas tenga el código de empleado 11 o 30.
select * from cliente where ciudad like "Madrid" && codigo_empleado_rep_ventas in (11, 30);


/*************************************************************************************************/
/* Consultas multitabla (Composición interna) // Las consultas se deben resolver con INNER JOIN. */ 
/*************************************************************************************************/
-- 1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas.
SELECT -- CONCAT TE PERMITE UNIR CADENAS.
    c.nombre_cliente,
    CONCAT(e.nombre,
            ' ',
            e.apellido1,
            ' ',
            e.apellido2) AS nombre_representante
FROM
    cliente AS c
        INNER JOIN
    empleado AS e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
WHERE
    e.puesto LIKE 'Representante Ventas';
    
-- 2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus representantes de ventas.
SELECT 
    c.nombre_cliente,
    CONCAT(e.nombre,
            ' ',
            e.apellido1,
            ' ',
            e.apellido2) AS nombre_representante,
    e.puesto,
    p.forma_pago
FROM
    cliente AS c
        INNER JOIN
    empleado AS e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
        INNER JOIN
    pago AS p ON c.codigo_cliente = p.codigo_cliente
WHERE
    e.puesto LIKE 'Representante Ventas'
ORDER BY c.codigo_cliente;
    
-- 3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de sus representantes de ventas.
SELECT 
    c.nombre_cliente,
    CONCAT(e.nombre,
            ' ',
            e.apellido1,
            ' ',
            e.apellido2) AS nombre_representante,
    e.puesto
FROM
    cliente AS c
        INNER JOIN
    empleado AS e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
        LEFT JOIN
    pago AS p ON c.codigo_cliente = p.codigo_cliente
WHERE
    e.puesto LIKE 'Representante Ventas'
        AND forma_pago IS NULL
ORDER BY c.codigo_cliente;
    
-- 4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
SELECT 
    c.nombre_cliente,
    CONCAT(e.nombre,
            ' ',
            e.apellido1,
            ' ',
            e.apellido2) AS nombre_representante,
    e.puesto AS puesto_representante,
    p.forma_pago,
    o.ciudad AS ciudad_oficina
FROM
    cliente AS c
        INNER JOIN
    empleado AS e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
        INNER JOIN
    pago AS p ON c.codigo_cliente = p.codigo_cliente
        INNER JOIN
    oficina AS o ON e.codigo_oficina = o.codigo_oficina
WHERE
    e.puesto LIKE 'Representante Ventas'
ORDER BY c.codigo_cliente;

-- 5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
SELECT 
    c.nombre_cliente,
    CONCAT(e.nombre,
            ' ',
            e.apellido1,
            ' ',
            e.apellido2) AS nombre_representante,
    e.puesto AS puesto_representante,
    o.ciudad AS ciudad_oficina
FROM
    cliente AS c
        INNER JOIN
    empleado AS e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
        LEFT JOIN
    pago AS p ON c.codigo_cliente = p.codigo_cliente
        INNER JOIN
    oficina AS o ON e.codigo_oficina = o.codigo_oficina
WHERE
    e.puesto LIKE 'Representante Ventas'
        AND forma_pago IS NULL
ORDER BY c.codigo_cliente;

-- 6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.
SELECT DISTINCT
    c.nombre_cliente,
    c.ciudad AS ciudad_cliente,
    CONCAT(o.linea_direccion1,
            ' // ',
            o.linea_direccion2) AS direccion_oficina
FROM
    cliente AS c
        INNER JOIN
    empleado AS e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
        INNER JOIN
    oficina AS o ON e.codigo_oficina = o.codigo_oficina
WHERE
    c.ciudad LIKE 'Fuenlabrada';
    
-- 7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
SELECT DISTINCT
    c.nombre_cliente,
    CONCAT(e.nombre,
            ' ',
            e.apellido1,
            ' ',
            e.apellido2) AS nombre_representante,
    o.ciudad AS ciudad_oficina
FROM
    cliente AS c
        INNER JOIN
    empleado AS e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
        INNER JOIN
    oficina AS o ON e.codigo_oficina = o.codigo_oficina;

-- 8. Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.
SELECT 
    CONCAT(e.nombre,
            ' ',
            e.apellido1,
            ' ',
            e.apellido2) AS nombre_empleado,
    CONCAT(j.nombre,
            ' ',
            j.apellido1,
            ' ',
            j.apellido2) AS nombre_jefe
FROM
    empleado AS e
        INNER JOIN
    empleado AS j ON e.codigo_jefe = j.codigo_empleado;

-- 9. Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.
SELECT 
    nombre_cliente, fecha_entrega, fecha_esperada
FROM
    cliente AS c
        INNER JOIN
    pedido AS p ON c.codigo_cliente = p.codigo_cliente
WHERE
    fecha_entrega > fecha_esperada;
    
-- 10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.
SELECT DISTINCT c.nombre_cliente, pr.gama
FROM cliente c INNER JOIN pedido pe ON c.codigo_cliente = pe.codigo_cliente
               INNER JOIN detalle_pedido dp ON dp.codigo_pedido = pe.codigo_pedido
               INNER JOIN producto pr ON pr.codigo_producto = dp.codigo_producto;


/************************************************************************************************************************************/
/* Consultas multitabla (Composición externa) // Resuelva todas las consultas utilizando las cláusulas LEFT JOIN, RIGHT JOIN, JOIN. */ 
/************************************************************************************************************************************/
-- 1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
SELECT DISTINCT
    nombre_cliente
FROM
    cliente AS c
        LEFT JOIN
    pago AS p ON p.codigo_cliente = c.codigo_cliente
WHERE
    p.codigo_cliente IS NULL
ORDER BY nombre_cliente;
    
-- 2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pedido.
SELECT DISTINCT
    nombre_cliente
FROM
    cliente AS c
        LEFT JOIN
    pedido AS p ON p.codigo_cliente = c.codigo_cliente
WHERE
    p.codigo_cliente IS NULL
ORDER BY nombre_cliente;

-- 3. Devuelve un listado que muestre los clientes que no han realizado ningún pago y los que no han realizado ningún pedido.
SELECT DISTINCT
    nombre_cliente
FROM
    cliente AS c
        LEFT JOIN
    pedido AS p ON p.codigo_cliente = c.codigo_cliente
        LEFT JOIN
    pago ON pago.codigo_cliente = c.codigo_cliente
WHERE
    p.codigo_cliente IS NULL
        AND pago.codigo_cliente IS NULL
ORDER BY nombre_cliente;

-- 4. Devuelve un listado que muestre solamente los empleados que no tienen una oficina asociada. 
SELECT 
    *
FROM
    empleado AS e
        LEFT JOIN
    oficina AS o ON e.codigo_oficina = o.codigo_oficina
WHERE
    o.codigo_oficina IS NULL; -- MEDIO AL PEDO XD
     
-- 5. Devuelve un listado que muestre solamente los empleados que no tienen un cliente asociado.
SELECT 
    CONCAT(e.nombre, ' ', e.apellido1, ' ', e.apellido2) AS 'Empleado', puesto
FROM
    empleado AS e
        LEFT JOIN
    cliente AS c ON e.codigo_empleado = c.codigo_empleado_rep_ventas
WHERE
    c.codigo_empleado_rep_ventas IS NULL;

-- 6. Devuelve un listado que muestre los empleados que no tienen una oficina asociada y los que no tienen un cliente asociado.
SELECT 
    CONCAT(e.nombre, ' ', e.apellido1, ' ', e.apellido2) AS 'Empleado', puesto
FROM
    empleado AS e
        LEFT JOIN
    oficina AS o ON e.codigo_oficina = o.codigo_oficina
        LEFT JOIN
    cliente AS c ON e.codigo_empleado = c.codigo_empleado_rep_ventas
WHERE
    o.codigo_oficina IS NULL
        AND c.codigo_empleado_rep_ventas IS NULL;

-- 7. Devuelve un listado de los productos que nunca han aparecido en un pedido.
SELECT 
	p.nombre
FROM
    producto p
        LEFT JOIN
    detalle_pedido dp using(codigo_producto)
WHERE
    dp.codigo_producto IS NULL;
    
-- 8. Devuelve las oficinas donde no trabajan ninguno de los empleados que hayan sido los representantes de ventas de algún cliente
-- que haya realizado la compra de algún producto de la gama Frutales.
SELECT 
    *
FROM
    oficina o
WHERE
    o.codigo_oficina NOT IN (SELECT DISTINCT
            ofi.codigo_oficina
        FROM
            oficina ofi
                INNER JOIN
            empleado emp USING (codigo_oficina) -- USING() ES LO MISMO QUE PONER on emp.codigo_oficina = ofi.codigo_oficina SIEMPRE Y CUANDO TENGAN EL MISMO NOMBRE ID.
                INNER JOIN
            cliente cli ON cli.codigo_empleado_rep_ventas = emp.codigo_empleado
                INNER JOIN
            pedido pe USING (codigo_cliente)
                INNER JOIN
            detalle_pedido dp USING (codigo_pedido)
                INNER JOIN
            producto prod USING (codigo_producto)
        WHERE
            prod.gama = 'Frutales');

-- 9. Devuelve un listado con los clientes que han realizado algún pedido, pero no han realizado ningún pago.
SELECT distinct
    c.nombre_cliente, pe.fecha_pedido, pa.fecha_pago
FROM
    cliente c
        INNER JOIN
    pedido pe USING (codigo_cliente)
        LEFT JOIN
    pago pa USING (codigo_cliente)
WHERE
    pa.codigo_cliente IS NULL;

-- 10. Devuelve un listado con los datos de los empleados que no tienen clientes asociados y el nombre de su jefe asociado.
SELECT 
    CONCAT(e.nombre,
            ' ',
            e.apellido1,
            ' ',
            e.apellido2) AS nombre_empleado,
    CONCAT(j.nombre,
            ' ',
            j.apellido1,
            ' ',
            j.apellido2) AS nombre_jefe
FROM
    empleado e
        LEFT JOIN
    cliente c ON e.codigo_empleado = c.codigo_empleado_rep_ventas
        INNER JOIN
    empleado AS j ON e.codigo_jefe = j.codigo_empleado
WHERE
    c.codigo_empleado_rep_ventas IS NULL;


/*********************/
/* Consultas resumen */
/*********************/
-- 1. ¿Cuántos empleados hay en la compañía?
select count(nombre) cantidad_empleados from empleado;

-- 2. ¿Cuántos clientes tiene cada país?
select pais, count(nombre_cliente) as cantidad_clientes from cliente group by pais;

-- 3. ¿Cuál fue el pago medio en 2009?
select avg(total) from pago where year(fecha_pago) = 2009;

-- 4. ¿Cuántos pedidos hay en cada estado? Ordena el resultado de forma descendente por el número de pedidos.
select estado, count(estado) from pedido group by estado order by count(estado) desc;

-- 5. Calcula el precio de venta del producto más caro y más barato en una misma consulta.
select max(precio_venta), min(precio_venta) from producto;

-- 6. Calcula el número de clientes que tiene la empresa.
select count(codigo_cliente) as cantidad_clientes from cliente;

-- 7. ¿Cuántos clientes tiene la ciudad de Madrid?
select count(codigo_cliente) as clientes_de_madrid from cliente where ciudad = "Madrid";

-- 8. ¿Calcula cuántos clientes tiene cada una de las ciudades que empiezan por M?
select ciudad, count(codigo_cliente) as cantidad_clientes from cliente group by ciudad having ciudad like "m%";

-- 9. Devuelve el nombre de los representantes de ventas y el número de clientes al que atiende cada uno.
SELECT 
    empleado.nombre, count(cliente.codigo_empleado_rep_ventas)
FROM
    empleado
        INNER JOIN
    cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas
    group by cliente.codigo_empleado_rep_ventas;

-- 10. Calcula el número de clientes que no tiene asignado representante de ventas.
SELECT 
    count(cliente.codigo_cliente)
FROM
    cliente
        LEFT JOIN
    empleado ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas
where empleado.codigo_empleado is null;

-- 11. Calcula la fecha del primer y último pago realizado por cada uno de los clientes. El listado
-- deberá mostrar el nombre y los apellidos de cada cliente.
SELECT 
    c.nombre_contacto,
    c.apellido_contacto,
    MIN(p.fecha_pago) AS 'Primer pago',
    MAX(p.fecha_pago) AS 'Último pago'
FROM
    pago p
        INNER JOIN
    cliente c ON p.codigo_cliente = c.codigo_cliente
GROUP BY c.codigo_cliente; 

-- 12. Calcula el número de productos diferentes que hay en cada uno de los pedidos.
SELECT 
    pe.codigo_pedido,
    COUNT(DISTINCT pr.codigo_producto) AS 'Cantidad de productos distintos'
FROM
    (producto pr
    INNER JOIN detalle_pedido dp ON pr.codigo_producto = dp.codigo_producto)
        INNER JOIN
    pedido pe ON dp.codigo_pedido = pe.codigo_pedido
GROUP BY pe.codigo_pedido;

-- 13. Calcula la suma de la cantidad total de todos los productos que aparecen en cada uno de los pedidos.
SELECT 
    pe.codigo_pedido, SUM(pr.precio_venta)
FROM
    producto pr
        INNER JOIN
    detalle_pedido dp ON pr.codigo_producto = dp.codigo_producto
        INNER JOIN
    pedido pe ON dp.codigo_pedido = pe.codigo_pedido
GROUP BY pe.codigo_pedido;

-- 14. Devuelve un listado de los 20 productos más vendidos y el número total de unidades que se han 
-- vendido de cada uno. El listado deberá estar ordenado por el número total de unidades vendidas.
SELECT 
    dp.codigo_producto, p.nombre, COUNT(dp.cantidad) AS unidades_vendidas
FROM
    producto p
        INNER JOIN
    detalle_pedido dp ON p.codigo_producto = dp.codigo_producto
GROUP BY dp.codigo_producto
ORDER BY unidades_vendidas DESC
LIMIT 20;

/*
15. La facturación que ha tenido la empresa en toda la historia, indicando la base imponible, el
IVA y el total facturado. La base imponible se calcula sumando el coste del producto por el
número de unidades vendidas de la tabla detalle_pedido. El IVA es el 21 % de la base
imponible, y el total la suma de los dos campos anteriores.
*/
SELECT 
    SUM(precio_unidad * cantidad) baseImponible,
    SUM((precio_unidad * cantidad) * 0.21)  IVA,
   SUM(dp.precio_unidad * dp.cantidad * 1.21)  total
FROM
    detalle_pedido dp;

-- 16. La misma información que en la pregunta anterior, pero agrupada por código de producto.
SELECT 
	codigo_producto,
    SUM(precio_unidad * cantidad) baseImponible,
    SUM((precio_unidad * cantidad) * 0.21) IVA,
    SUM(precio_unidad * cantidad * 1.21) total
FROM
    detalle_pedido
GROUP BY codigo_producto;

-- 17. La misma información que en la pregunta anterior, pero agrupada por código de producto filtrada por los códigos que empiecen por OR.
SELECT 
	codigo_producto,
    SUM(precio_unidad * cantidad) baseImponible,
    SUM((precio_unidad * cantidad) * 0.21) IVA,
    SUM(precio_unidad * cantidad * 1.21) total
FROM
    detalle_pedido
GROUP BY codigo_producto having codigo_producto like "or%";

-- 18. Lista las ventas totales de los productos que hayan facturado más de 3000 euros. Se mostrará el nombre, unidades vendidas, 
-- total facturado y total facturado con impuestos (21% IVA)
SELECT 
    p.nombre,
    dp.cantidad unidades_vendidas,
    SUM(dp.precio_unidad * dp.cantidad) total,
    SUM(dp.precio_unidad * dp.cantidad  * 1.21) total_con_impuestos
FROM
    detalle_pedido AS dp
        INNER JOIN
    producto AS p USING (codigo_producto)
GROUP BY dp.codigo_producto
HAVING total > 3000;


/******************************************************/
/* Subconsultas con operadores básicos de comparación */
/******************************************************/
-- 1. Devuelve el nombre del cliente con mayor límite de crédito.
select nombre_cliente, limite_credito from cliente where limite_credito = (select max(limite_credito) from cliente);

-- 2. Devuelve el nombre del producto que tenga el precio de venta más caro.
select nombre, precio_venta from producto where precio_venta = (select max(precio_venta) from producto);

/*
3. Devuelve el nombre del producto del que se han vendido más unidades. (Tenga en cuenta
que tendrá que calcular cuál es el número total de unidades que se han vendido de cada
producto a partir de los datos de la tabla detalle_pedido. Una vez que sepa cuál es el código
del producto, puede obtener su nombre fácilmente.)
*/
SELECT 
    nombre
FROM
    producto
WHERE
    codigo_producto = (SELECT 
            codigo_producto
        FROM
            detalle_pedido
        GROUP BY codigo_producto
        ORDER BY SUM(cantidad) DESC
        LIMIT 1);

-- 4. Los clientes cuyo límite de crédito sea mayor que los pagos que haya realizado. (Sin utilizar INNER JOIN).
SELECT 
    nombre_cliente, limite_credito
FROM
    cliente c
WHERE
    limite_credito > (SELECT 
            MAX(total)
        FROM
            pago p
        WHERE
            c.codigo_cliente = p.codigo_cliente);

-- 5. Devuelve el producto que más unidades tiene en stock.
SELECT 
    nombre
FROM
    producto
WHERE
    cantidad_en_stock = (SELECT 
            MAX(cantidad_en_stock)
        FROM
            producto);

-- 6. Devuelve el producto que menos unidades tiene en stock.
SELECT 
    nombre
FROM
    producto
WHERE
    cantidad_en_stock = (SELECT 
            MIN(cantidad_en_stock)
        FROM
            producto);

-- 7. Devuelve el nombre, los apellidos y el email de los empleados que están a cargo de Alberto Soria.
select codigo_empleado from empleado where nombre like "alberto" && apellido1 like "soria"; -- OBTENEMOS ID DE ALBERTITO

SELECT 
    CONCAT(e.nombre,
            ' ',
            e.apellido1,
            ' ',
            e.apellido2) AS 'Empleados a cargo de Alberto Soria',
            email
FROM
    empleado e
WHERE
    codigo_jefe = (SELECT 
            codigo_empleado
        FROM
            empleado
        WHERE
            nombre LIKE 'alberto'
                && apellido1 LIKE 'soria');

/******************************/
/* Subconsultas con ALL y ANY */
/******************************/
-- 1. Devuelve el nombre del cliente con mayor límite de crédito.
SELECT *
FROM cliente c
WHERE c.limite_credito >= all(SELECT MAX(c.limite_credito) 
                              FROM cliente c);

-- 2. Devuelve el nombre del producto que tenga el precio de venta más caro.
select * from producto where precio_venta = all(select max(precio_venta) from producto);

-- 3. Devuelve el producto que menos unidades tiene en stock.
select * from producto where cantidad_en_stock = all(select min(cantidad_en_stock) from producto);


/********************************/
/* Subconsultas con IN y NOT IN */
/********************************/
-- 1. Devuelve el nombre, apellido1 y cargo de los empleados que no representen a ningún cliente.
select nombre, apellido1, puesto from empleado where codigo_empleado not in (select codigo_empleado_rep_ventas from cliente);

-- 2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
select * from cliente where codigo_cliente not in (select codigo_cliente from pago);

-- 3. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
select * from cliente where codigo_cliente in (select codigo_cliente from pago);

-- 4. Devuelve un listado de los productos que nunca han aparecido en un pedido.
select * from producto where codigo_producto not in (select distinct codigo_producto from detalle_pedido); 

-- 5. Devuelve el nombre, apellidos, puesto y teléfono de la oficina de aquellos empleados que no sean representante de ventas de ningún cliente.
SELECT 
    CONCAT(e.nombre,
            ' ',
            e.apellido1,
            ' ',
            e.apellido2) AS Empleados_sin_clientes,
    e.puesto AS puesto_empleado,
    o.telefono AS telefono_oficina
FROM
    empleado e
        INNER JOIN
    oficina o USING (codigo_oficina)
WHERE
    e.codigo_empleado NOT IN (SELECT 
            c.codigo_empleado_rep_ventas
        FROM
            cliente c);


/****************************************/
/* Subconsultas con EXISTS y NOT EXISTS */
/****************************************/
-- 1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
SELECT *
FROM cliente c
WHERE NOT EXISTS (SELECT *
                  FROM pago p
                  WHERE c.codigo_cliente = p.codigo_cliente);

-- 2. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
SELECT *
FROM cliente c
WHERE EXISTS (SELECT *
                  FROM pago p
                  WHERE c.codigo_cliente = p.codigo_cliente);

-- 3. Devuelve un listado de los productos que nunca han aparecido en un pedido.
SELECT 
    *
FROM
    producto p
WHERE
    NOT EXISTS( SELECT DISTINCT
            *
        FROM
            detalle_pedido dp
        WHERE
            p.codigo_producto = dp.codigo_producto); 

-- 4. Devuelve un listado de los productos que han aparecido en un pedido alguna vez.
SELECT 
    *
FROM
    producto p
WHERE
    EXISTS( SELECT DISTINCT
            *
        FROM
            detalle_pedido dp
        WHERE
            p.codigo_producto = dp.codigo_producto); 