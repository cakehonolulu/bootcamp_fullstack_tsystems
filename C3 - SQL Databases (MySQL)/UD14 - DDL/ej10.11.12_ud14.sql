use ud14;
-- ej 10

create table cajeros(
codigo int auto_increment not null,
nom_apell varchar(255),
primary key(codigo)
);
create table productos(
codigo int not null,
nombre varchar(100),
precio int,
primary key(codigo)
);

create table maquinas_registradoras(
codigo int not null,
piso int,
primary key(codigo)
);

create table ventas(
cajero int,
maquina int,
producto int,
primary key(cajero,maquina,producto),
constraint fk_ventas_to_cajeros foreign key(cajero) references cajeros(codigo)
on delete cascade on update cascade,
constraint fk_ventas_to_maquinas_registradoras foreign key(maquina) references maquinas_registradoras(codigo)
on delete cascade on update cascade,
constraint fk_ventas_to_productos foreign key(producto) references productos(codigo)
on delete cascade on update cascade
);


-- ej 11

create table facultades(
codigo int auto_increment not null,
nombre varchar(100),
primary key(codigo)
);

create table investigadores(
dni varchar(8) not null,
nom_apell varchar(255),
facultad int,
primary key(dni),
constraint fk_investigadores_to_facultades foreign key(facultad) references facultades(codigo)
on delete cascade on update cascade
);

create table equipos(
num_serie char(4) not null,
nombre varchar(100),
facultad int,
primary key(num_serie),
constraint fk_equipos_to_facultades foreign key(facultad) references facultades(codigo)
on delete cascade on update cascade
);

create table reservas(
dni varchar(8) not null,
num_serie char(4) not null,
comienzo datetime,
fin datetime,
primary key(dni,num_serie),
constraint fk_reservas_to_investigadores foreign key(dni) references investigadores(dni)
on delete cascade on update cascade,
constraint fk_reservas_to_equipos foreign key(num_serie) references equipos(num_serie)
on delete cascade on update cascade
);

-- ej 12


create table profesores(
nombre varchar(100) not null unique,
apellido1 varchar(100) not null unique,
apellido2 varchar(100) not null unique,
dni varchar(9) not null,
direccion varchar(100),
titulo varchar(100),
gana int not null,
primary key(dni)
);
create table cursos(
nombre_curso varchar(100) not null unique,
cod_curso varchar(10) not null,
dni_profesor varchar(9) ,
max_alumnos int,
fecha_inicio date,
fecha_fin date ,
num_horas int not null,
primary key(cod_curso),
constraint fk_cursos_to_profesores foreign key(dni_profesor) references profesores(dni)
on delete cascade on update cascade,
check(fecha_fin > fecha_inicio)
);
create table alumnos(
nombre varchar(100),
apellido1 varchar(100),
apellido2 varchar(100),
dni varchar(9) not null,
direcccion varchar(100),
sexo varchar(1) check(sexo like"M" or sexo like"H") default "H",
fecha_nacimiento date,
curso varchar(10) not null,
primary key(dni),
constraint fk_alumnos_to_cursos foreign key(curso) references cursos(cod_curso)
on delete cascade on update cascade
);


















