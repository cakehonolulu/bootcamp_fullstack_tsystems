create database ud12_16;


-- ejercicio 16
use ud12_16;
create table usuario(
nombre_usuario varchar(32) primary key not null,
nombre varchar(32),
apellido varchar(32),
localizacion varchar(32),
telefono int(12),
correo varchar(32),
contrasena varchar(32),
nombre_usuario2 varchar(32),
foreign key(nombre_usuario2) references usuario(nombre_usuario) 
on delete no action on update cascade
);
rename table usuario to usuarios;

create table mensaje_privado(
id int auto_increment primary key not null,
fecha date,
mensaje text
);
rename table mensaje_privado to mensajes_privados;

create table tweets(
id int auto_increment primary key not null,
mensaje varchar(280),
likes int(9),
re_tweets int(9),
fecha date
);

create table comentarios(
id int(9) auto_increment primary key not null,
mensaje varchar(280),
likes int(9),
re_tweets int(9),
fecha date
);


create table tiene(
id int auto_increment,
nombre_usuario varchar(32),
id_mensaje int,
primary key(id),
foreign key(nombre_usuario)references usuarios(nombre_usuario),
foreign key(id_mensaje)references mensajes_privados(id)
);

create table comparte(
id int auto_increment,
nombre_usuario varchar(32),
id_tweet int,
primary key(id),
foreign key(nombre_usuario) references usuarios(nombre_usuario),
foreign key(id_tweet)references tweets(id)
);

create table contiene(
id int auto_increment,
id_tweet int,
id_comentario int,
primary key(id),
foreign key(id_tweet)references tweets(id),
foreign key(id_comentario) references comentarios(id)
);
