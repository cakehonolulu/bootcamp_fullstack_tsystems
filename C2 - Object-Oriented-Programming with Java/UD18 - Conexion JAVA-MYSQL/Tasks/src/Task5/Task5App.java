package Task5;

import mysql_interconnect.Mysql_interconnect;

public class Task5App {

	public static void main(String[] args) {
		Mysql_interconnect connection = new Mysql_interconnect();

		connection.connect("192.168.1.150", "3306", "remote", "W4WfPjZv3.");
		connection.createDB("Ud18_Ej5");
		connection.useDB("Ud18_Ej5");

		connection.createTable("create table if not exists despacho(numero int, capacidad int, "
				+ "primary key (numero));");
		
		connection.createTable("create table if not exists directores(dni varchar(8), nom_apels varchar(100),"
				+ " dni_jefe varchar(8), despacho int, primary key (dni), foreign key (despacho) references "
				+ "despacho (numero), foreign key (dni_jefe) references directores (dni));");
		
		connection.insertRecord("insert into despacho values(1, 20);");
		connection.insertRecord("insert into despacho values(2, 60);");
		connection.insertRecord("insert into despacho values(3, 30);");
		connection.insertRecord("insert into despacho values(4, 70);");
		connection.insertRecord("insert into despacho values(5, 80);");
		
		connection.insertRecord("insert into directores values('48003310', 'Manolo Díaz', null, 1);");
		connection.insertRecord("insert into directores values('48456313', 'Marta Aviles', '48003310', 2);");
		connection.insertRecord("insert into directores values('48942850', 'Juan Fernando', null, 3);");
		connection.insertRecord("insert into directores values('59776813', 'Miguel Alonso', '48942850', 4);");
		connection.insertRecord("insert into directores values('69778563', 'Periquito Diaz', null, 5);");
		connection.closeConnection();
		System.out.println("FIN");
		
	}

}
