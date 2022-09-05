-- Drop-if-exists
drop database if exists ud15;

-- Create database
create database ud15;

-- Use it
use ud15;

-- Database Creation

-- 'Despacho' table
create table despacho(
	numero int primary key not null,
    capacidad int
);

-- 'Director' table
create table director(
	dni varchar(8) primary key not null,
    nomapels nvarchar(255),
    dni_jefe varchar(8),
    despacho int,
    foreign key (despacho) references despacho (numero),
    foreign key (dni_jefe) references director (dni)
);

-- Fill the tables

-- Fill 'Despacho' first
insert into despacho(numero, capacidad)
values
    (1, 10),
    (2, 20),
    (3, 30),
    (4, 40),
    (5, 50),
    (6, 60),
    (7, 70),
    (8, 80),
    (9, 90),
    (10, 100);

-- Fill 'Directores'
insert into director(dni, nomapels, despacho)
values
	("61896510", "A", 1),
    ("49843690", "B", 2),
    ("50489117", "C", 3),
    ("31290305", "D", 4),
    ("43028306", "E", 5),
    ("70804115", "F", 6),
    ("39177627", "G", 7),
    ("36112237", "H", 8),
    ("07413360", "I", 9),
    ("16582870", "J", 10);
