use ud14;

drop table if exists editorial, libro, tema, autor, escrito_por, trata_sobre, socio, ejemplar, prestamo;

create table autor (
	clave_autor int primary key not null,
    nombre varchar (60)
);

create table tema (
	clave_tema smallint primary key not null,
    nombre varchar (40)
);

create table socio (
	clave_socio int primary key not null,
    nombre varchar(60),
    direccion varchar(60),
    telefono varchar(15),
    categoria char
);

create table editorial (
	clave_editorial smallint primary key not null,
    nombre varchar(60),
    direccion varchar (60),
	telefono varchar(15)
);

create table libro (
	clave_libro int primary key not null,
    titulo varchar(60),
    idioma varchar(15),
	formato varchar(15),
    clave_editorial smallint,
    constraint fk_clave_editorial foreign key(clave_editorial) references editorial(clave_editorial)
);

create table ejemplar (
	clave_ejemplar int primary key not null,
    clave_libro int,
    numero_orden smallint,
    edicion smallint,
	ubicacion varchar(15),
    clave_editorial smallint,
    categoria char,
    constraint fk_another_clave_to_libro foreign key(clave_libro) references libro(clave_libro)
);

create table prestamo (
	id int auto_increment primary key not null,
    clave_socio int,
	clave_ejemplar int,
    numero_orden smallint,
    fecha_prestamo date,
    fecha_devolucion date,
    notas blob,
    constraint fk_clave_socio foreign key(clave_socio) references socio(clave_socio),
    constraint fk_clave_ejemplar foreign key(clave_ejemplar) references ejemplar(clave_ejemplar)
);

create table trata_sobre (
	clave_libro int,
    clave_tema smallint,
    constraint fk_clave_to_libro foreign key(clave_libro) references libro(clave_libro),
    constraint fk_clave_tema foreign key(clave_tema) references tema(clave_tema)
);

create table escrito_por (
	clave_libro int,
    clave_autor int,
    constraint fk_clave_libro foreign key(clave_libro) references libro(clave_libro),
    constraint fk_clave_autor foreign key(clave_autor) references autor(clave_autor)
);
