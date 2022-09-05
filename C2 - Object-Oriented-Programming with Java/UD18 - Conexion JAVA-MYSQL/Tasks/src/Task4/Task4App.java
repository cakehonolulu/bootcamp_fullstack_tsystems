package Task4;

import mysql_interconnect.Mysql_interconnect;

public class Task4App {

	public static void main(String[] args) {
		Mysql_interconnect connection = new Mysql_interconnect();
		connection.connect("192.168.1.150", "3306", "remote", "W4WfPjZv3.");
		connection.createDB("Ud18_Ej4");
		connection.useDB("Ud18_Ej4");
		connection.createTable("create table if not exists peliculas(codigo int, nombre varchar(100), calificacion_edad"
				+ " int, primary key (codigo));");
		
		connection.createTable("create table if not exists salas(codigo int, nombre varchar(100), pelicula int, primary "
				+ "key (codigo),foreign key (pelicula) references peliculas (codigo));");
		
		connection.insertRecord("insert into peliculas values(1,'Interstellar', 7)");
		connection.insertRecord("insert into peliculas values(2,'Turning red', 3)");
		connection.insertRecord("insert into peliculas values(3,'The sea beast', 7)");
		connection.insertRecord("insert into peliculas values(4,'The northman', 12)");
		connection.insertRecord("insert into peliculas values(5,'The batman', 7)");

		
		connection.insertRecord("insert into salas values(1,'Magna', 1)");
		connection.insertRecord("insert into salas values(2,'Animation', 2)");
		connection.insertRecord("insert into salas values(3,'Netflix', 3)");
		connection.insertRecord("insert into salas values(4,'Historic', 4)");
		connection.insertRecord("insert into salas values(5,'Heroes', 5)");
		
		connection.closeConnection();
		System.out.println("FIN");
		
	}

}
