create database ud12_2;

use ud12_2;

-- ejercio 2

CREATE table alumno(dni int primary key not null,
direccion varchar(32),
nombre varchar(32),
telefono int(12),
edad int(2));




create table empresa(
codigo_empresa int(10) primary key not null,
 dni int,
 cif int,
telefono int,
direccion varchar(32),
nombre varchar(32),
foreign key(dni) references alumno(dni)
on delete cascade on update cascade
);


create table profesor(
dni varchar(9) primary key not null,
nombre varchar(32),
apellido varchar(32),
direccion varchar(32),
telefono int(12)
);




create table curso(
codigo_curso int(10) primary key not null,
profe varchar(9),
programa int(10),
horas int(4),
titulo varchar(16),
fecha_inicio date,
fecha_fin date,
numero int(4),
foreign key(profe)references profesor(dni)
on delete cascade on update cascade
);



create table tienen(
id int auto_increment primary key not null,
nota int(2),
codigo_curso int(10),
dni int,
foreign key(codigo_curso) references curso(codigo_curso),
foreign key(dni) references alumno(dni)

);
