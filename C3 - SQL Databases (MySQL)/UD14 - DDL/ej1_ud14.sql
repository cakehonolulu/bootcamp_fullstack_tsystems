create database ud14;
-- ej1
create table estaciones(
id int auto_increment primary key not null,
latitud varchar(10),
longitud varchar(10),
altitud varchar(10)
);

create table muestras(
id int auto_increment primary key not null,
identificador_estacion int,
fecha date,
temperatura_minima decimal(2,2),
temperatura_maxima decimal(2,2),
precipitaciones varchar(10),
humedad_minima decimal(2,2),
humedad_maxima decimal(2,2),
velocidad_viento_minima varchar(10),
velocidad_viento_maxima varchar(10),
constraint fk_muestras_to_estaciones foreign key(identificador_estacion) references estaciones(id)
on delete cascade on update cascade
);