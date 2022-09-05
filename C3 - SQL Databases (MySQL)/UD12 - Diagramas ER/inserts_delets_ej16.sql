#TablaUsuarios
insert into usuarios(nombre_usuario, nombre, apellido, localizacion, telefono, correo, contrasena, nombre_usuario2) 
values ("ManolitoGafotas", "Manolo", "Diaz", "Tarragona", 620198960, "Manolo@hotmail.com", "123456", null);
insert into usuarios(nombre_usuario, nombre, apellido, localizacion, telefono, correo, contrasena, nombre_usuario2) 
values ("PedroPiqueras", "Pedro", "Piqueras", "Madrid", 123456789, "PedroP@hotmail.com", "12345612", null);
insert into usuarios(nombre_usuario, nombre, apellido, localizacion, telefono, correo, contrasena, nombre_usuario2) 
values ("GuardiaCivil", "Manel", "Echeberria", "Barcelona", 148657234, "Manu@gmail.com", "158627", "PedroPiqueras");
insert into usuarios(nombre_usuario, nombre, apellido, localizacion, telefono, correo, contrasena, nombre_usuario2) 
values ("Visigodo", "Juan", "Fernandez", "Tarragona", 179586431, "Juanfe@hotmail.com", "168438792", "GuardiaCivil");
insert into usuarios(nombre_usuario, nombre, apellido, localizacion, telefono, correo, contrasena, nombre_usuario2) 
values ("Licenciado", "Mauricio", "Colmenero", "Sevilla", 168463215, "vivaESPANA@hotmail.es", "123423556", "GuardiaCivil");
insert into usuarios(nombre_usuario, nombre, apellido, localizacion, telefono, correo, contrasena, nombre_usuario2) 
values ("LoreLore", "Lorena", "Garcia", "Tarragona", 620198432, "LaLore@hotmail.com", "12233456", null);
insert into usuarios(nombre_usuario, nombre, apellido, localizacion, telefono, correo, contrasena, nombre_usuario2) 
values ("Fidelito", "Fidel", "Castro", "Valencia", 620197530, "Fidel@hotmail.com", "12323456", "LoreLore");
insert into usuarios(nombre_usuario, nombre, apellido, localizacion, telefono, correo, contrasena, nombre_usuario2) 
values ("Portero", "Emilio", "Delgado", "Madrid", 397898960, "Porteria@hotmail.com", "12345626", null);
insert into usuarios(nombre_usuario, nombre, apellido, localizacion, telefono, correo, contrasena, nombre_usuario2) 
values ("MarianoDelgado", "mariano", "Delgado", "Madrid", 623598960, "Mariano@hotmail.com", "547123456", "Portero");
insert into usuarios(nombre_usuario, nombre, apellido, localizacion, telefono, correo, contrasena, nombre_usuario2) 
values ("Presidente", "Juan", "Cuesta", "Madrid", 620198684, "NuestraComunidad@hotmail.com", "22458123456", "MarianoDelgado");

#Tabla MensajePrivado
insert into mensajes_privados values (1,'2018-10-20', "Esto no va a funcionar xDD");
insert into mensajes_privados (fecha, mensaje) values ('2018-10-01', "patata ");
insert into mensajes_privados (fecha, mensaje) values ('2018-10-02', "Vamos a ir de viaje? ");
insert into mensajes_privados (fecha, mensaje) values ('2018-10-03', "Claro que si wapi");
insert into mensajes_privados (fecha, mensaje) values ('2018-10-04', "Corre");
insert into mensajes_privados (fecha, mensaje) values ('2018-10-05', "CANCELADO");
insert into mensajes_privados (fecha, mensaje) values ('2018-10-06', "vamos cabra");
insert into mensajes_privados (fecha, mensaje) values ('2018-10-07', "Viva sanderson");
insert into mensajes_privados (fecha, mensaje) values ('2018-10-08', "Los videojuegos son arte");
insert into mensajes_privados (fecha, mensaje) values ('2018-10-09', "esternocleidomastoidal");

#Tabla tweets
insert into tweets(mensaje, likes, re_tweets, fecha) value("no me gusta lo que estan diciendo", 69, 20, '2018-10-01');
insert into tweets(mensaje, likes, re_tweets, fecha) value("Inserte mensaje de odio aqui", 34, 2, '2018-10-02');
insert into tweets(mensaje, likes, re_tweets, fecha) value("Perdoname", 57, 74, '2018-10-03');
insert into tweets(mensaje, likes, re_tweets, fecha) value("Cancelado", 649, 43, '2018-10-04');
insert into tweets(mensaje, likes, re_tweets, fecha) value("papadelta", 6793, 230, '2018-10-05');
insert into tweets(mensaje, likes, re_tweets, fecha) value("WOW", 629, 270, '2018-10-06');
insert into tweets(mensaje, likes, re_tweets, fecha) value("Eres graciosisima", 669, 220, '2018-10-07');
insert into tweets(mensaje, likes, re_tweets, fecha) value("No te la vas a ligar, campeon", 600, 620, '2018-10-08');
insert into tweets(mensaje, likes, re_tweets, fecha) value("Josejuan", 0, 240, '2018-10-09');
insert into tweets(mensaje, likes, re_tweets, fecha) value("Por tu culpa me ha pasado esto", 3, 20, '2018-10-10');

#tabla comentarios
insert into comentarios(mensaje, likes, re_tweets, fecha) values ("te aguantas", 561, 728, '2020-03-14');
insert into comentarios(mensaje, likes, re_tweets, fecha) values ("odio", 562, 268, '2020-03-12');
insert into comentarios(mensaje, likes, re_tweets, fecha) values ("Perdonado", 563, 283, '2020-03-12');
insert into comentarios(mensaje, likes, re_tweets, fecha) values ("NOOOOO", 562, 284, '2020-03-13');
insert into comentarios(mensaje, likes, re_tweets, fecha) values ("gublins son mejores", 561, 286, '2020-03-14');
insert into comentarios(mensaje, likes, re_tweets, fecha) values ("FF", 564, 285, '2020-03-15');
insert into comentarios(mensaje, likes, re_tweets, fecha) values ("no te la vvas a ligar campeoon", 536, 228, '2020-03-14');
insert into comentarios(mensaje, likes, re_tweets, fecha) values ("lose", 526, 248, '2020-03-16');
insert into comentarios(mensaje, likes, re_tweets, fecha) values ("piquera", 561, 228, '2020-03-14');
insert into comentarios(mensaje, likes, re_tweets, fecha) values ("No ha sido mi culpa", 526, 281, '2020-03-13');

#tabla comparte
insert into comparte(nombre_usuario, id_tweet) values("Fidelito",1);
insert into comparte(nombre_usuario, id_tweet) values("Fidelito",2);
insert into comparte(nombre_usuario, id_tweet) values("Licenciado",3);
insert into comparte(nombre_usuario, id_tweet) values("Presidente",4);
insert into comparte(nombre_usuario, id_tweet) values("Fidelito",5);
insert into comparte(nombre_usuario, id_tweet) values("Presidente",6);
insert into comparte(nombre_usuario, id_tweet) values("Licenciado",7);
insert into comparte(nombre_usuario, id_tweet) values("Fidelito",8);
insert into comparte(nombre_usuario, id_tweet) values("Licenciado",9);
insert into comparte(nombre_usuario, id_tweet) values("Fidelito",10);

#tabla contiene
insert into contiene(id_tweet, id_comentario) values(1,1);
insert into contiene(id_tweet, id_comentario) values(2,4);
insert into contiene(id_tweet, id_comentario) values(3,1);
insert into contiene(id_tweet, id_comentario) values(4,2);
insert into contiene(id_tweet, id_comentario) values(5,1);
insert into contiene(id_tweet, id_comentario) values(6,5);
insert into contiene(id_tweet, id_comentario) values(7,1);
insert into contiene(id_tweet, id_comentario) values(8,1);
insert into contiene(id_tweet, id_comentario) values(9,7);
insert into contiene(id_tweet, id_comentario) values(10,4);

alter table usuarios drop foreign key usuarios_ibfk_1;
alter table usuarios add CONSTRAINT usuarios_ibfk_1 foreign key (nombre_usuario2) references usuarios(nombre_usuario) on delete set null;
alter table comparte drop foreign key comparte_ibfk_1;
alter table comparte add CONSTRAINT comparte_ibfk_1 foreign key (nombre_usuario) references usuarios(nombre_usuario) on delete set null;
alter table comparte drop foreign key comparte_ibfk_2;
alter table comparte add CONSTRAINT comparte_ibfk_2 foreign key (id_tweet) references tweets(id) on delete set null;
alter table contiene drop foreign key contiene_ibfk_1;
alter table contiene add CONSTRAINT contiene_ibfk_1 foreign key (id_comentario) references comentarios(id) on delete set null;
alter table contiene drop foreign key contiene_ibfk_2;
alter table contiene add CONSTRAINT contiene_ibfk_2 foreign key (id_tweet) references tweets(id) on delete set null;


delete from usuarios where nombre_usuario = "PedroPiqueras";
delete from mensajes_privados where id=1;
delete from tweets where id=1;
delete from comentarios where id =1;
delete from comparte where id=1;
delete from contiene where id=1;