package Task9;

import mysql_interconnect.Mysql_interconnect;

public class Task9App {

	public static void main(String[] args) {
		Mysql_interconnect my_conection = new Mysql_interconnect();
		my_conection.connect("192.168.5.104", "3306", "remote", "27ione91");
		my_conection.createDB("ud18_9");
		my_conection.useDB("ud18_9");

		my_conection.createTable(
				"create table if not exists facultades(codigo int,nombre varchar(100)," + "primary key(codigo));");

		my_conection.createTable(
				"create table if not exists investigadores(dni varchar(8),nom_apell varchar(255),facultad int,"
						+ "primary key(dni)," + "foreign key(facultad) references facultades(codigo) "
						+ "on delete cascade on update cascade);");

		my_conection
				.createTable("create table if not exists equipos(num_serie char(4),nombre varchar(100),facultad int,"
						+ "primary key(num_serie)," + "foreign key(facultad) references facultades(codigo) "
						+ "on delete cascade on update cascade);");

		my_conection.createTable("create table if not exists reservas(dni varchar(8),num_serie char(4),"
				+ "comienzo date,fin date," + "primary key(dni,num_serie),"
				+ " foreign key(dni) references investigadores(dni) " + "on delete cascade on update cascade,"
				+ "foreign key(num_serie) references equipos(num_serie) " + "on delete cascade on update cascade);");

		my_conection.insertRecord("insert into facultades(codigo,nombre) values"
				+ "(1,'uab'),(2,'upf'),(3,'alfonso x'),(4,'upc'),(5,'upv');");

		my_conection.insertRecord("insert into investigadores(dni,nom_apell,facultad) values "
				+ "('1111111a','ana perez',1)," + "('2222222a','maria tomilllo',1)," + "('3333333a','pepe ruiz',2),"
				+ "('4444444a','luis ramirez',3)," + "('5555555a','roberto lopez',4);");

		my_conection.insertRecord("insert into equipos(num_serie,nombre,facultad) values" + "('11aa','ciencias',1),"
				+ "('22aa','artes escenicas',2)," + "('33aa','dibujo',3)," + "('44aa','ping pong',4),"
				+ "('55aa','ajedrez',5);");
		my_conection.insertRecord("insert into reservas(dni,num_serie,comienzo,fin) values "
				+ "('1111111a','11aa','2022-02-21','2022-04-21')," + "('2222222a','22aa','2022-03-20','2022-05-12'),"
				+ "('3333333a','33aa','2022-01-21','2022-03-12')," + "('4444444a','44aa','2022-05-15','2022-07-12'),"
				+ "('5555555a','55aa','2022-03-27','2022-05-15');");

	}
}
