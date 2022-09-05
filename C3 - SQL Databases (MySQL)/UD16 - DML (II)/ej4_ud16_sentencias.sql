use actividades;

-- 1.mostrar el nombre de todas las peliculas
select nombre from peliculas;

-- 2.mostrar las distintas calificaciones de edad que existen
select calificacionedad from peliculas group by CALIFICACIONEDAD;

-- 3.mostrar todas las peliculas que no han sido calificadas
select * from peliculas where calificacionedad is null;

-- 4.mostrar todas las salas que no proyectan ninguna pelicula
select * from salas where pelicula is null;

-- 5.mostrar la informacion de todas las salas y, si se proyecta
-- alguna pelicula en la sala, mostrar tambien la informacion de la pelicula
select * from salas left outer join peliculas on salas.pelicula = peliculas.codigo;

-- 6.mostrar la informacion de todas las peliculas y, si se proyecta en alguna sala,
-- mostrar tambien la informacion de la sala
select * from peliculas left outer join salas on salas.pelicula=peliculas.codigo where
salas.pelicula is null;

-- 7.mostrar los nombres de las peliculas que no se proyectan en ninguna sala
select peliculas.nombre from salas right outer join peliculas
 on salas.pelicula =peliculas.nombre;

-- 8.añadir una nueva pelicula 'Uno, Dos, Tres', para mayores de 7 años
insert into peliculas values 
(123,"Uno, Dos, Tres","mayores de 7");

-- 9.hacer constar que todas las peliculas no calificadas han sido
-- calificadas 'no recomendales para menores de 13 años'
SET SQL_SAFE_UPDATES = 0;

update peliculas set calificacionedad = "no recomendadas para menores de 13" 
where calificacionedad is null;


-- 10.eliminar todas las salas que proyectan peliculas recomendadas 
-- para todos los publicos
delete from salas where pelicula in(select codigo from peliculas 
where calificacionedad = "G");
