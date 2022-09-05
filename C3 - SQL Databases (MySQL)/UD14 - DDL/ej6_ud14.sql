#use UD14;
create table Peliculas(
	codigo int auto_increment not null,
    nombre varchar(100),
    calificacion_edad int,
    primary key (codigo)
);

Create table Salas(
	codigo int,
    nombre varchar(100),
    pelicula int,
    primary key (codigo),
    constraint fk_salas_to_peliculas foreign key (pelicula) references Peliculas(codigo)
    on delete cascade on update cascade
);

