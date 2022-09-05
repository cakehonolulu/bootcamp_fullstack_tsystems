use ud14;

drop table if exists almacen, caja;

create table almacen (
	identity int primary key not null,
    lugar nvarchar(100),
    capacidad int
);

create table caja (
	num_referencia char(5) primary key not null,
    contenido nvarchar(100),
    valor int,
    almacen int,
    constraint fk_almacen foreign key(almacen) references almacen(identity)
);
