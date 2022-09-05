drop table if exists suministra;
drop table if exists piezas;
drop table if exists proveedores;
create table piezas (
	codigo int,
	nombre varchar(100),
	primary key (codigo)
);

create table proveedores(
	id char(4),
    nombre varchar(100),
    primary key (id)
);

create table suministra(
	precio int,
    codigo_pieza int,
    id_proveedor char(4),
    primary key (codigo_pieza, id_proveedor),
    foreign key (codigo_pieza) references piezas (codigo),
    foreign key (id_proveedor) references proveedores (id)
);

insert into piezas(codigo, nombre) values (1,"Tornillo");
insert into piezas(codigo, nombre) values (2,"Motor");
insert into piezas(codigo, nombre) values (3,"Neumatico");
insert into piezas(codigo, nombre) values (4,"Chasis");
insert into piezas(codigo, nombre) values (5,"Carroceria");
insert into piezas(codigo, nombre) values (6,"Parabrisas");
insert into piezas(codigo, nombre) values (7,"Asiento");
insert into piezas(codigo, nombre) values (8,"Tapiceria");
insert into piezas(codigo, nombre) values (9,"Cuadro de mando");
insert into piezas(codigo, nombre) values (10,"Tubo de escape");

insert into proveedores(id, nombre) values('a5', "Manolo");
insert into proveedores(id, nombre) values('a6', "Juan");
insert into proveedores(id, nombre) values('a7', "Vicente");
insert into proveedores(id, nombre) values('a8', "Maria");
insert into proveedores(id, nombre) values('a9', "Julia");
insert into proveedores(id, nombre) values('a0', "Mireia");
insert into proveedores(id, nombre) values('b1', "Marcos");
insert into proveedores(id, nombre) values('b2', "Daniel");
insert into proveedores(id, nombre) values('b3', "Carmen");
insert into proveedores(id, nombre) values('b4', "Sergio");

insert into suministra(precio, codigo_pieza, id_proveedor) values(15,1,'a5');
insert into suministra(precio, codigo_pieza, id_proveedor) values(34,2,'a6');
insert into suministra(precio, codigo_pieza, id_proveedor) values(24,3,'a7');
insert into suministra(precio, codigo_pieza, id_proveedor) values(13,4,'a8');
insert into suministra(precio, codigo_pieza, id_proveedor) values(75,5,'a9');
insert into suministra(precio, codigo_pieza, id_proveedor) values(34,6,'a0');
insert into suministra(precio, codigo_pieza, id_proveedor) values(45,7,'b1');
insert into suministra(precio, codigo_pieza, id_proveedor) values(99,8,'b2');
insert into suministra(precio, codigo_pieza, id_proveedor) values(44,9,'b3');
insert into suministra(precio, codigo_pieza, id_proveedor) values(65,10,'b4');
