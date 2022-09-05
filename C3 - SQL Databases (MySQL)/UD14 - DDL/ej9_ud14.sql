create table cientificos(
	dni varchar(8) not null,
    nom_apels varchar(255),
    primary key (dni)
);

create table proyecto(
	id char(4) not null,
    nombre varchar(255),
    horas int,
    primary key (id)
);

create table asignado_a(
	cientifico varchar(8),
	proyecto char(4),
    primary key (cientifico, proyecto),
    constraint fk_asignado_a_to_cientificos foreign key (cientifico) references cientificos(dni)
    on delete cascade on update cascade,
    constraint fk_asignado_a_to_proyecto foreign key (proyecto) references proyecto(id)
    on delete cascade on update cascade
);
