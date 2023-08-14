/*************/
# CANDADO A
/*************/
/*
El candado A está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)
*/
SELECT COUNT(*) AS Max_Asistencias
FROM estadisticas
WHERE Asistencias_por_partido = (SELECT MAX(Asistencias_por_partido) FROM estadisticas); # POSICION 2

/*
La clave del candado A estará con formada por la/s siguientes consulta/s a la base de
datos:
Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea
centro o esté comprendida en otras posiciones.
*/
SELECT SUM(Peso) AS Clave_Candado_A
FROM jugadores
WHERE Nombre_equipo IN (SELECT Nombre FROM equipos WHERE Conferencia = 'East')
AND (Posicion = 'C' OR Posicion LIKE '%C%'); #CLAVE 14043


/*************/
# CANDADO B
/*************/
/*
Posición: El candado B está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de
jugadores que tiene el equipo Heat.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)
*/

SELECT COUNT(*) AS Posicion_Candado_B
FROM jugadores
WHERE codigo IN (SELECT jugador FROM estadisticas GROUP BY jugador 
HAVING MAX(Asistencias_por_partido) > (SELECT COUNT(*) FROM jugadores WHERE Nombre_equipo = 'Heat')); # POSICION 3

/*
Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
datos:
La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.
*/
SELECT COUNT(*) AS Conteo_Partidos
FROM partidos
WHERE temporada LIKE '%99%'; # CLAVE 3480


/*************/
# CANDADO C
/*************/
/*
Posición: El candado C está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman
parte de equipos de la conferencia oeste.
Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a
195, y a eso le vamos a sumar 0.9945.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)
*/
SELECT round((COUNT(*) / (SELECT COUNT(*) FROM jugadores WHERE Peso >= 195) + 0.9945)) AS Posicion_Candado_C
FROM jugadores
WHERE Procedencia = 'Michigan' AND Nombre_equipo IN (SELECT Nombre FROM equipos WHERE Conferencia = 'Oeste'); # POSICION 1

/*
Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
datos:
Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de
sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de
tapones por partido. Además, este resultado debe ser, donde la división sea central.
*/
SELECT 
    FLOOR((AVG(Puntos_por_partido) + COUNT(Asistencias_por_partido) + SUM(Tapones_por_partido))) AS Clave_Candado_C
FROM
    estadisticas
        INNER JOIN
    jugadores j ON j.codigo = jugador
        INNER JOIN
    equipos e ON e.nombre = j.Nombre_equipo
WHERE
    Division = 'Central'; # CLAVE 631
    
/*************/
# CANDADO D
/*************/
/*
Posición: El candado D está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este
resultado debe ser redondeado. Nota: el resultado debe estar redondeado
Este resultado nos dará la posición del candado (1, 2, 3 o 4)
*/
SELECT 
    ROUND(Tapones_por_partido)
FROM
    estadisticas
WHERE
    temporada = '00/01'
        AND jugador = (SELECT 
            codigo
        FROM
            jugadores
        WHERE
            Nombre = 'Corey Maggette'); # POSICION 4
            
/*
Clave: La clave del candado D estará con formada por la/s siguientes consulta/s a la base de
datos:
Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido
de todos los jugadores de procedencia argentina
*/
SELECT FLOOR(SUM(Puntos_por_partido)) AS Clave_Candado_D
FROM estadisticas
WHERE jugador IN (SELECT codigo FROM jugadores WHERE Procedencia = 'Argentina'); #CLAVE 191