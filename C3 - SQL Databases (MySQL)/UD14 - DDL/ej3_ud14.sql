use ud14;

drop table if exists fabricantes, articulos;

create table fabricante (
	identity int primary key not null,
    nombre nvarchar(100)
);

create table articulos (
	identity int primary key not null,
    nombre nvarchar(100),
    precio int,
    fabricante int,
    constraint fk_fabricante foreign key(fabricante) references fabricante(identity)
);
