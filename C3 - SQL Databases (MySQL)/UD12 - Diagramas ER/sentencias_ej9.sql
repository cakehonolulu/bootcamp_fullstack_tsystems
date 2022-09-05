create database ud12_9;

use ud12_9;
-- ejercicio 9
create table ingredientes
(
nombre VARCHAR(16) primary key not null,
cantidad INT(10) ,
precio decimal(4,2) 
);


create table material(
nombre_material varchar(32) primary key not null,
tamano int(4)
);

create table receta
(
nombre_recete varchar(32) primary key not null,
duracion int(4),
autor varchar(32)

);

create table se_usa(
id int, 
nombre_material varchar(32),
nombre_receta varchar(32),
primary key(id),
foreign key(nombre_material) references material(nombre_material),
foreign key(nombre_receta) references receta(nombre_recete)
);


create table tiene(
id int auto_increment,
nombre_ingrediente varchar(32),
nombre_receta varchar(32),
primary key(id),
foreign key(nombre_ingrediente) references ingredientes(nombre),
foreign key(nombre_receta) references receta(nombre_recete)
);
