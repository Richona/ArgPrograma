select * from jugadores;
select * from equipos;
select * from estadisticas;
select * from partidos;

-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
select nombre from jugadores order by nombre;

-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por nombre alfabéticamente.
select nombre, Posicion, Peso from jugadores where Posicion like 'C' && peso > 200 order by nombre;

-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
select nombre from equipos order by nombre;

-- 4. Mostrar el nombre de los equipos del este (East).
select nombre, Conferencia from equipos where Conferencia like "East";

-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
select nombre, ciudad from equipos where Ciudad like "c%" order by Nombre;

-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
select * from jugadores order by Nombre_equipo;

-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
select * from jugadores where Nombre_equipo like "Raptors" order by nombre;

-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
SELECT 
    Puntos_por_partido
FROM
    estadisticas
WHERE
    jugador = (SELECT -- CONSULTA DONDE SE OBTIENE EL ID DEL JUGADOR.
            codigo
        FROM
            jugadores
        WHERE
            nombre LIKE 'Pau Gasol');

-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
SELECT 
    Puntos_por_partido
FROM
    estadisticas
WHERE
    temporada LIKE '04/05' -- ACLARAMOS LA TEMPORADA.
        AND jugador = (SELECT -- CONSULTA DONDE SE OBTIENE EL ID DEL JUGADOR.
            codigo
        FROM
            jugadores
        WHERE
            nombre LIKE 'Pau Gasol');
            
-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.
select sum(estadisticas.Puntos_por_partido) as "Puntos en toda su carrera", jugadores.Nombre from estadisticas inner join jugadores on estadisticas.jugador = jugadores.codigo group by estadisticas.jugador;

-- 11. Mostrar el número de jugadores de cada equipo.
select Nombre_equipo, count(Nombre) as cantidadJugadores from jugadores group by Nombre_equipo;

-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
SELECT 
    SUM(estadisticas.Puntos_por_partido) AS 'Puntos en toda su carrera',
    jugadores.Nombre
FROM
    estadisticas
        INNER JOIN
    jugadores ON estadisticas.jugador = jugadores.codigo
GROUP BY estadisticas.jugador
ORDER BY SUM(estadisticas.Puntos_por_partido) DESC
LIMIT 1;

-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
SELECT 
    Nombre_equipo,
    Conferencia,
    Division,
    jugadores.Nombre,
    Altura
FROM
    equipos
        INNER JOIN
    jugadores ON equipos.Nombre = jugadores.Nombre_equipo
WHERE
    Altura = (SELECT -- CONSULTA PARA OBTENER EL JUGADOR MAS ALTO.
            MAX(Altura)
        FROM
            jugadores);

-- 14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
SELECT 
    *
FROM
    partidos AS par
WHERE
    ABS(puntos_local - puntos_visitante) = (SELECT -- CONSULTA PARA OBTENER LA MAX DIFERENCIA.
            MAX(ABS(puntos_local - puntos_visitante)) -- ABS RETORNA EL VALOR ABSOLUTO (VALOR POSITIVO)
        FROM
            partidos); 

-- 15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.
SELECT -- IF PERMITE CONDICIONAR UN DATO, IF(condicion, true, false). EL CASO FALSE PUEDE ANIDARSE OTRO IF.
    codigo,
    equipo_local,
    puntos_local,
    equipo_visitante,
    puntos_visitante,
    IF(puntos_local > puntos_visitante,
        equipo_local,
        IF(puntos_local < puntos_visitante,
            equipo_visitante,
            NULL)) AS 'equipo_ganador'
FROM
    partidos;