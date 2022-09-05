create database ud15_ej5;
use ud15_ej5;
-- creacion tablas
create table facultades(
codigo int auto_increment,
nombre varchar(100),
primary key(codigo)
);

create table investigadores(
DNI varchar(8),
nom_apellidos varchar(255),
facultad int,
primary key(DNI),
constraint fk_investigadores_facultades 
foreign key(facultad) references facultades(codigo)
on delete cascade on update cascade
);

create table equipos(
num_serie char(4),
nombre varchar(100),
facultad int,
primary key(num_serie),
constraint fk_equipos_facultades
foreign key(facultad) references facultades(codigo)
on delete cascade on update cascade
);

create table reservas(
DNI varchar(8),
num_serie char(4),
comienzo datetime,
fin datetime,
primary key(DNI,num_serie),
constraint fk_reservas_investigadores
foreign key(DNI) references investigadores(DNI)
on delete cascade on update cascade,
constraint fk_reservas_equipos
foreign key(num_serie) references equipos(num_serie)
on delete cascade on update cascade
);
-- inserts
insert into facultades(nombre) values
("carlos I"),
("lolita II"),
("alejandro magno"),
("federico"),
("maria antonieta"),
("joselito"),
("andres bravo"),
("ciencias politicas reus"),
("lenguas constanti"),
("arte");

insert into investigadores(DNI,nom_apellidos,facultad) values
("1111111a","ana perez",1),
("2222222b","maria rogriguez",2),
("3333333c","pepe gomez",2),
("4444444d","joselito ruiz",3),
("5555555e","andres martinez",4),
("6666666f","lolita lopez",5),
("7777777g","manolo gonzalez",6),
("8888888h","clara gomez",7),
("9999999i","leyre perez",8),
("1231231j","pablo lara",9);

insert into equipos(num_serie,nombre,facultad) values
('111a',"los tigres",1),
('222a',"ciencias",1),
('333a',"azules",2),
('444a',"amarillos",3),
('555a',"grises y con botas",4),
('666a',"gorras rojas",5),
('777a',"deportes de invierno",5),
('888a',"ajedrez con amigos",6),
('999a',"mates para burros",7),
('123a',"lectura",9);


insert into reservas(DNI,num_serie,comienzo,fin) values
("1111111a",'111a','2021-01-25',null),
("2222222b",'222a','2022-03-12',null),
("3333333c",'999a','2022-02-13','2022-02-20'),
("1111111a",'333a','2022-04-15','2022-05-12'),
("4444444d",'444a','2022-01-02',null),
("5555555e",'888a','2022-02-12','2022-02-18'),
("6666666f",'666a','2022-01-10',null),
("9999999i",'555a','2022-09-15',null),
("8888888h",'777a','2022-06-12',null),
("7777777g",'777a','2021-05-14','2021-09-14');





