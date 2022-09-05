package Task6;

import mysql_interconnect.Mysql_interconnect;

public class Task6App {

	public static void main(String[] args) {
		Mysql_interconnect connection = new Mysql_interconnect();

		connection.connect("192.168.1.150", "3306", "remote", "W4WfPjZv3.");
		connection.createDB("Ud18_Ej6");
		connection.useDB("Ud18_Ej6");

		connection.createTable("create table if not exists piezas(codigo int, nombre varchar(100), "
				+ "primary key (codigo));");
		connection.createTable("create table if not exists proveedores(id char(4), nombre varchar(100), "
				+ "primary key (id));");
		connection.createTable("create table if not exists suministra(codigo_pieza int, id_proveedor char(4),"
				+ " precio int, primary key (codigo_pieza, id_proveedor), foreign key (codigo_pieza) "
				+ "references piezas (codigo), foreign key (id_proveedor) references proveedores (id));");
		
		connection.insertRecord("insert into piezas values(1, 'Tornillo');");
		connection.insertRecord("insert into piezas values(2, 'Tuerca');");
		connection.insertRecord("insert into piezas values(3, 'Martillo');");
		connection.insertRecord("insert into piezas values(4, 'Maza');");
		connection.insertRecord("insert into piezas values(5, 'Hacha');");
		
		connection.insertRecord("insert into proveedores values('a', 'Toyota');");
		connection.insertRecord("insert into proveedores values('s', 'Ferrari');");
		connection.insertRecord("insert into proveedores values('d', 'Kia');");
		connection.insertRecord("insert into proveedores values('f', 'Hyundai');");
		connection.insertRecord("insert into proveedores values('g', 'Seat');");
		
		connection.insertRecord("insert into suministra values(1, 'a', 240);");
		connection.insertRecord("insert into suministra values(2, 's', 150);");
		connection.insertRecord("insert into suministra values(3, 'd', 830);");
		connection.insertRecord("insert into suministra values(4, 'f', 450);");
		connection.insertRecord("insert into suministra values(5, 'g', 130);");
		
		connection.closeConnection();
		System.out.println("FIN");


	}

}
