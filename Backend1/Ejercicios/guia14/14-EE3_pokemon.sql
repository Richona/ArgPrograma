-- 1. Mostrar el nombre de todos los pokemon.
select nombre from pokemon order by nombre;

-- 2. Mostrar los pokemon que pesen menos de 10k.
select nombre, peso from pokemon where peso < 10;

-- 3. Mostrar los pokemon de tipo agua.
SELECT DISTINCT
    p.numero_pokedex, p.nombre, t.nombre as tipo
FROM
    pokemon p
        INNER JOIN
    pokemon_tipo pt USING (numero_pokedex)
        INNER JOIN
    tipo t USING (id_tipo) 
WHERE
    t.nombre LIKE 'agua';

-- 4. Mostrar los pokemon de tipo agua, fuego o tierra ordenados por tipo.
SELECT DISTINCT
    p.numero_pokedex, p.nombre, t.nombre AS tipo
FROM
    pokemon p
        INNER JOIN
    pokemon_tipo pt USING (numero_pokedex)
        INNER JOIN
    tipo t USING (id_tipo)
WHERE
    t.nombre IN ('agua' , 'fuego', 'tierra')
ORDER BY t.nombre;

-- 5. Mostrar los pokemon que son de tipo fuego y volador.
SELECT DISTINCT
    p.numero_pokedex, p.nombre, t.nombre AS tipo
FROM
    pokemon p
        INNER JOIN
    pokemon_tipo pt USING (numero_pokedex)
        INNER JOIN
    tipo t USING (id_tipo)
WHERE
    t.nombre IN ('fuego', 'volador');

-- 6. Mostrar los pokemon con una estadística base de ps mayor que 200.
SELECT 
    numero_pokedex, nombre, ps
FROM
    pokemon
        INNER JOIN
    estadisticas_base USING (numero_pokedex)
WHERE
    ps > 200;

-- 7. Mostrar los datos (nombre, peso, altura) de la prevolución de Arbok.
SELECT 
    p.nombre, p.peso, p.altura
FROM
    pokemon p
WHERE
    p.nombre = 'Arbok';

-- 8. Mostrar aquellos pokemon que evolucionan por intercambio.
SELECT 
    p.numero_pokedex, p.nombre, te.tipo_evolucion
FROM
    pokemon p
        INNER JOIN
    pokemon_forma_evolucion pfe USING (numero_pokedex)
        INNER JOIN
    forma_evolucion fe USING (id_forma_evolucion)
        INNER JOIN
    tipo_evolucion te ON fe.id_forma_evolucion = te.id_tipo_evolucion
WHERE
    te.tipo_evolucion LIKE 'intercambio'
;

-- 9. Mostrar el nombre del movimiento con más prioridad.
select nombre, prioridad from movimiento where prioridad = (select max(prioridad) from movimiento);

-- 10. Mostrar el pokemon más pesado.
select * from pokemon where peso = (select max(peso) from pokemon);

-- 11. Mostrar el nombre y tipo del ataque con más potencia.
SELECT 
    m.nombre as movimiento, m.potencia, t.nombre as tipo, ta.tipo as tipo_ataque
FROM
    movimiento m
        INNER JOIN
    tipo t USING (id_tipo)
        INNER JOIN
    tipo_ataque ta USING (id_tipo_ataque)
WHERE
    m.potencia = (SELECT 
            MAX(potencia)
        FROM
            movimiento);

-- 12. Mostrar el número de movimientos de cada tipo.
SELECT 
    t.nombre, count(id_tipo) as cantidad_movimientos
FROM
    movimiento m
        INNER JOIN
    tipo t USING (id_tipo)
group by id_tipo;

-- 13. Mostrar todos los movimientos que puedan envenenar.
SELECT 
    *
FROM
    movimiento m
        INNER JOIN
    tipo t USING (id_tipo)
WHERE
    t.nombre LIKE 'veneno'
;

-- 14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.
select * from movimiento where potencia > 0 order by nombre;

-- 15. Mostrar todos los movimientos que aprende pikachu.
SELECT 
    m.nombre
FROM
    movimiento m
        inner JOIN
    pokemon_movimiento_forma pmf using(id_movimiento)
        inner JOIN
    forma_aprendizaje fa using(id_forma_aprendizaje)
        inner JOIN
    pokemon p using(numero_pokedex)
WHERE
    p.nombre like "pikachu";

-- 16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).
SELECT 
    m.nombre, tfa.tipo_aprendizaje
FROM
    movimiento m
        INNER JOIN
    pokemon_movimiento_forma pmf USING (id_movimiento)
        INNER JOIN
    forma_aprendizaje fa USING (id_forma_aprendizaje)
        INNER JOIN
    tipo_forma_aprendizaje tfa USING (id_tipo_aprendizaje)
        INNER JOIN
    pokemon p USING (numero_pokedex)
WHERE
    p.nombre LIKE 'pikachu'
        AND tfa.tipo_aprendizaje LIKE 'mt';

-- 17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.
SELECT 
    m.nombre, t.nombre
FROM
    movimiento m
        INNER JOIN
    pokemon_movimiento_forma pmf USING (id_movimiento)
        INNER JOIN
    forma_aprendizaje fa USING (id_forma_aprendizaje)
        INNER JOIN
    tipo t USING (id_tipo)
        INNER JOIN
    pokemon p USING (numero_pokedex)
WHERE
    p.nombre LIKE 'pikachu'
        AND t.nombre LIKE 'normal'
;

-- 18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.
select m.nombre, mes.probabilidad from movimiento m inner join movimiento_efecto_secundario mes using(id_movimiento) where mes.probabilidad > 30;

-- 19. Mostrar todos los pokemon que evolucionan por piedra.
SELECT 
    p.numero_pokedex, p.nombre, fe.tipo_evolucion, tp.nombre_piedra
FROM
    pokemon p
        INNER JOIN
    pokemon_forma_evolucion pfe USING (numero_pokedex)
        INNER JOIN
    forma_evolucion fe USING (id_forma_evolucion)
        INNER JOIN
    piedra pi USING(id_forma_evolucion)
		INNER JOIN
    tipo_piedra tp USING(id_tipo_piedra)
;

-- 20. Mostrar todos los pokemon que no pueden evolucionar.
SELECT 
    *
FROM
    pokemon p
        LEFT JOIN
    pokemon_forma_evolucion pfe USING (numero_pokedex)
WHERE
    id_forma_evolucion IS NULL
;

-- 21. Mostrar la cantidad de los pokemon de cada tipo.
SELECT 
    t.id_tipo,
    t.nombre AS tipo,
    COUNT(p.nombre) AS cantidad_pokemones
FROM
    pokemon p
        INNER JOIN
    pokemon_tipo pt USING (numero_pokedex)
        INNER JOIN
    tipo t USING (id_tipo)
GROUP BY pt.id_tipo;

-- FELICIDADES POR LLEGAR HASTA ACA, SOS CRACK!!