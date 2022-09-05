use ud12_9;

insert into ingredientes(nombre,cantidad,precio) values
("patata",5,2.3),
("aceite",1,12.5),
("cebolla",3,1.2),
("sal",1,0.3),
("berenjena",2,2.2),
("pimiento",3,2.5),
("ajo",1,0.9),
("calabacin",1,1.2),
("nata",1,1.4),
("huevo",4,2.5);

insert into material(nombre_material,tamano) values
("sarten",1),
("cuchara",2),
("sarten_grande",2),
("tenedor",1),
("cuchillo",1),
("pelador",1),
("escurridor",1),
("olla",1),
("tapa sarten",1),
("plato",1);

insert into receta(nombre_recete,duracion,autor) values
("tortilla patatas",1,"popular"),
("tortilla de patatas con cebolla",1,"anomino"),
("crema de calabacin",1,"La abuela Maria"),
("huevos con berenjena",1,"Pepe Pepito"),
("huevos revueltos",1,"Ana Luisa"),
("tortilla con verduras",1,"popular"),
("huevos duros",1,"anomino"),
("calabacin tempura",1,"Luis Alfonso"),
("berenjena salteada",1,"Juanito Romero"),
("pure patata",1,"Joselito Perez");

insert into se_usa(id,nombre_material,nombre_receta) values
(1,"sarten","tortilla patatas"),
(2,"plato","tortilla patatas"),
(3,"cuchillo","tortilla patatas"),
(4,"tenedor","tortilla patatas"),
(5,"tapa sarten","tortilla patatas"),
(6,"pelador","tortilla patatas"),
(7,"sarten","huevos revueltos"),
(8,"tenedor","huevos revueltos"),
(9,"plato","huevos revueltos"),
(10,"olla","huevos duros");

insert into tiene(nombre_ingrediente,nombre_receta) values
("patata","tortilla patatas"),
("aceite","tortilla patatas"),
("cebolla","tortilla patatas"),
("sal","tortilla patatas"),
("huevo","tortilla patatas"),
("huevo","huevos duros"),
("huevo","huevos revueltos"),
("aceite","huevos revueltos"),
("sal","huevos revueltos");
-- probar eliminar ingrediente utilizado/referenciado en alguna tabla ->no se puede
delete from ingredientes where nombre like "patata";
-- eliminar un ingrediente no utilizado/referenciado en ninguna tabla
delete from ingredientes where nombre like "ajo";
-- funciona como se espera

-- probar eliminar material utilizado/referenciado en alguna tabla ->no se puede
delete from material where nombre_material like "sarten";
-- eliminar un material no utilizado/referenciado en ninguna tabla
delete from material where nombre_material like "escurridor";
-- funciona como se espera

-- probar eliminar receta utilizado/referenciado en alguna tabla ->no se puede
delete from receta where nombre_recete like "tortilla patatas";
-- no funciona como se espera, así que hacemos los ajustes necesarios

-- add cascade in the fk in table se_usa
alter table se_usa
drop foreign key se_usa_ibfk_1;

alter table se_usa
add constraint fk_se_usa_material 
foreign key(nombre_material) references material(nombre_material)
on delete cascade on update cascade;

alter table se_usa
drop foreign key se_usa_ibfk_2;

alter table se_usa
add constraint fk_se_usa_receta 
foreign key(nombre_receta) references receta(nombre_recete)
on delete cascade on update cascade;

-- add cascade in the fk in table tiene

alter table tiene
drop foreign key tiene_ibfk_1;

alter table tiene
add constraint fk_tiene_ingrediente
foreign key(nombre_ingrediente) references ingredientes(nombre)
on delete cascade on update cascade;

alter table tiene
drop foreign key tiene_ibfk_2;

alter table tiene
add constraint fk_tiene_receta
foreign key(nombre_receta) references receta(nombre_recete)
on delete cascade on update cascade;

-- -- probar eliminar receta utilizado/referenciado en alguna tabla -> ahora se puede
delete from receta where nombre_recete like "tortilla patatas";

-- comprobar que los ingrediente utilizados en la receta elimina no se hayan 
-- eliminado tambien, solo la receta y las tuplas de las tablas se_usa y tienen
-- en las que salía la receta elimina

select * from ingredientes;
select * from se_usa;
select * from tiene;
-- las recetas se eliminan correctamente