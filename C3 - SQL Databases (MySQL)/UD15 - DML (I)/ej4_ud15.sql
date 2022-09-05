drop table if exists asignado_a;
drop table if exists cientificos;
drop table if exists proyectos;

create table cientificos(
	dni varchar(8),
    nom_apels nvarchar(255),
    primary key (dni)
);
create table proyectos(
	id char(4),
    nombre nvarchar(255),
    primary key (id)
);
create table asignado_a(
	cientifico varchar(8),
    proyecto char(4),
    primary key (cientifico, proyecto),
    foreign key (cientifico) references cientificos(dni),
    foreign key (proyecto) references proyectos(id)
);

insert into cientificos(dni, nom_apels) values("48003310", "Manolo");
insert into cientificos(dni, nom_apels) values("48003311", "Juan");
insert into cientificos(dni, nom_apels) values("48003312", "Antonio");
insert into cientificos(dni, nom_apels) values("48003313", "Antonia");
insert into cientificos(dni, nom_apels) values("48003314", "Manuela");
insert into cientificos(dni, nom_apels) values("48003315", "Javier");
insert into cientificos(dni, nom_apels) values("48003316", "Susan");
insert into cientificos(dni, nom_apels) values("48003317", "Daniel");
insert into cientificos(dni, nom_apels) values("48003318", "Sergio");
insert into cientificos(dni, nom_apels) values("48003319", "Victor");

insert into proyectos(id, nombre) values('P1', "Apocalipsis");
insert into proyectos(id, nombre) values('P2', "Resureccion");
insert into proyectos(id, nombre) values('P3', "Apolo");
insert into proyectos(id, nombre) values('P4', "Aurora");
insert into proyectos(id, nombre) values('P5', "Barracuda");
insert into proyectos(id, nombre) values('P6', "Pie Grande");
insert into proyectos(id, nombre) values('P7', "Luna azul");
insert into proyectos(id, nombre) values('P8', "Burdeos");
insert into proyectos(id, nombre) values('P9', "Canario");
insert into proyectos(id, nombre) values('P0', "Camelot");

insert into asignado_a(cientifico, proyecto) values("48003310", 'P1');
insert into asignado_a(cientifico, proyecto) values("48003311", 'P2');
insert into asignado_a(cientifico, proyecto) values("48003312", 'P3');
insert into asignado_a(cientifico, proyecto) values("48003313", 'P4');
insert into asignado_a(cientifico, proyecto) values("48003314", 'P5');
insert into asignado_a(cientifico, proyecto) values("48003315", 'P6');
insert into asignado_a(cientifico, proyecto) values("48003316", 'P7');
insert into asignado_a(cientifico, proyecto) values("48003317", 'P8');
insert into asignado_a(cientifico, proyecto) values("48003318", 'P9');
insert into asignado_a(cientifico, proyecto) values("48003319", 'P2');
