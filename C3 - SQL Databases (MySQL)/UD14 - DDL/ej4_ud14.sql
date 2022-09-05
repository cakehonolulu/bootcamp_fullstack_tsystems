use ud14;

drop table if exists departamento, empleado;

create table departamento (
	codigo int primary key not null,
    nombre nvarchar(100),
    presupuesto int
);

create table empleado (
	dni varchar(8) primary key not null,
    nombre nvarchar(100),
    apellidos nvarchar(255),
    departamento int,
    constraint fk_departamento foreign key(departamento) references departamento(codigo)
);
