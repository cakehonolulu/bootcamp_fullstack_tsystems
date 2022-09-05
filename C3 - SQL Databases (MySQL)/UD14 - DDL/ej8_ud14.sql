create table piezas(
	codigo int not null,
	nombre varchar(100),
    primary key (codigo)
);

create table proveedores(
	id char(4) not null,
    nombre varchar(100),
    primary key (id)
);

create table suministra(
	codigo_pieza int not null,
    id_proveedor char(4) not null,
    precio int,
    primary key (codigo_pieza, id_proveedor),
    constraint fk_suministra_to_piezas foreign key (codigo_pieza) references piezas(codigo)
    on delete cascade on update cascade,
    constraint fk_suministra_to_proveedores foreign key (id_proveedor) references proveedores(id)
    on delete cascade on update cascade
);
