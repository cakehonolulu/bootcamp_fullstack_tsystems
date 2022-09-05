package Task8;

import mysql_interconnect.Mysql_interconnect;

public class Task8App {

	public static void main(String[] args) {
		Mysql_interconnect my_conection = new Mysql_interconnect();
		my_conection.connect("192.168.5.104", "3306", "remote", "password");
		my_conection.createDB("ud18_8");
		my_conection.useDB("ud18_8");

		my_conection.createTable(
				"create table if not exists cajeros(codigo int,nom_apell varchar(255),primary key(codigo));");
		my_conection.createTable(
				"create table if not exists productos(codigo int,nombre varchar(100),precio int,primary key(codigo));");
		my_conection.createTable(
				"create table if not exists maquinas_registradoras(codigo int,piso int,primary key(codigo));");
		my_conection.createTable(
				"create table if not exists venta(cajero int,maquina int,producto int,primary key(cajero,maquina,producto),"
						+ "constraint fk_venta_cajeros foreign key(cajero) references cajeros(codigo) "
						+ "on delete cascade on update cascade,"
						+ "constraint fk_venta_maquinas foreign key(maquina) references maquinas_registradoras(codigo)"
						+ "on delete cascade on update cascade,"
						+ "constraint fk_venta_productos foreign key(producto) references productos(codigo)"
						+ "on delete cascade on update cascade);");

		my_conection.insertRecord("insert into cajeros(codigo,nom_apell) values (1,'pepe pepito'),"
				+ "(2,'jose joselito'),(3,'ana anita'),(4,'andres andresito'),(5,'maria antonieta');");

		my_conection.insertRecord("insert into productos(codigo,nombre,precio) values (111,'agua',2),"
				+ "(222,'galletas',4),(333,'leche',2),(444,'pasta',3),(555,'vino',9);");

		my_conection.insertRecord(
				"insert into maquinas_registradoras(codigo,piso) values (1001,1),(1002,1),(1003,2),(1004,2),(1005,3);");

		my_conection.insertRecord("insert into venta(cajero,maquina,producto) values "
				+ "(1,1003,111),(1,1001,222),(3,1002,333),(2,1005,444),(1,1001,111);");
	}

}
