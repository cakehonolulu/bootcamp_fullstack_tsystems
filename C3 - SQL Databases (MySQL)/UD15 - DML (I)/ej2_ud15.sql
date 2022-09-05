-- Drop-if-exists
drop database if exists ud15;

-- Create database
create database ud15;

-- Use it
use ud15;

-- Database Creation

-- 'Pieza' table
create table pieza(
	identity int primary key not null,
    nombre nvarchar(100)
);

-- 'Proveedor' table
create table proveedor(
	id char(4) primary key not null,
    nombre nvarchar(100)
);

-- 'Suministra' table
create table suministra(
	codigo_pieza int not null,
    id_proveedor char(4) not null,
    precio int,
    foreign key (codigo_pieza) references pieza (identity),
    foreign key (id_proveedor) references proveedor (id),
    primary key (codigo_pieza, id_proveedor)
);

-- Fill the tables

-- Fill 'Piezas' first

insert into pieza(identity, nombre)
values
	(1, "A"),
    (2, "B"),
    (3, "C"),
    (4, "D"),
    (5, "E"),
    (6, "F"),
    (7, "G"),
    (8, "H"),
    (9, "I"),
    (10, "J");
    
-- Fill 'Proveedores'

insert into proveedor(id, nombre)
values
	("1", "A"),
    ("2", "B"),
    ("3", "C"),
    ("4", "D"),
    ("5", "E"),
    ("6", "F"),
    ("7", "G"),
    ("8", "H"),
    ("9", "I"),
    ("10", "J");

-- Fill 'Suministra'

insert into suministra(codigo_pieza, id_proveedor, precio)
values
	(1, "1", 1),
    (2, "2", 2),
    (3, "3", 3),
    (4, "4", 4),
    (5, "5", 5),
    (6, "6", 6),
    (7, "7", 7),
    (8, "8", 8),
    (9, "9", 9),
    (10, "10", 10);
