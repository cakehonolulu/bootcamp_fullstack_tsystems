create table despachos(
	numero int not null,
    capacidad int,
    primary key (numero)
);

create table directores(
	dni varchar(8) not null,
    nom_apels varchar(255),
    dni_jefe varchar(8),
    despacho int,
    primary key (dni),
    constraint fk_directores_to_despachos foreign key (despacho) references despachos(numero)
    on delete cascade on update cascade,
    constraint fk_directores_to_directores foreign key (dni_jefe) references directores(dni)
    on delete cascade on update cascade
);
