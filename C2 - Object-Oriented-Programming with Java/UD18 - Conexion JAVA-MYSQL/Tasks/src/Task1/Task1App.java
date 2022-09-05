package Task1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import mysql_interconnect.Mysql_interconnect;

public class Task1App {

	public static void main(String[] args) {
		Mysql_interconnect m_connection = new Mysql_interconnect();
		m_connection.connect("IP", "PORT", "USER", "PASSWORD");
		m_connection.createDB("Ud18_Ej4");
		m_connection.useDB("Ud18_Ej4");

		m_connection.createTable("create table if not exists fabricante ("		+
										"identity int primary key not null, "	+
										"nombre nvarchar(100) );"
								);
		
		
		m_connection.createTable("create table if not exists articulos ("		+
										"identity int primary key not null, "	+
									    "nombre nvarchar(100), "				+
									    "precio int, "							+
									    "fabricante int, "						+
									    "constraint fk_fabricante foreign key(fabricante) references fabricante(identity) );"
								);
		
		m_connection.insertRecord("insert into fabricante(identity, nombre) values (1, 'Philips')");
		m_connection.insertRecord("insert into fabricante(identity, nombre) values (2, 'Sony')");
		m_connection.insertRecord("insert into fabricante(identity, nombre) values (3, 'Microsoft')");
		m_connection.insertRecord("insert into fabricante(identity, nombre) values (4, 'Nintendo')");
		m_connection.insertRecord("insert into fabricante(identity, nombre) values (5, 'Amiga')");
		
		m_connection.insertRecord("insert into articulos(identity, nombre, precio, fabricante) values (1, 'Head Screwdriver', 10, 1)");
		m_connection.insertRecord("insert into articulos(identity, nombre, precio, fabricante) values (2, 'PlayStation 2', 300, 2)");
		m_connection.insertRecord("insert into articulos(identity, nombre, precio, fabricante) values (3, 'Xbox Classic', 350, 3)");
		m_connection.insertRecord("insert into articulos(identity, nombre, precio, fabricante) values (4, 'NES', 250, 4)");
		m_connection.insertRecord("insert into articulos(identity, nombre, precio, fabricante) values (5, '500', 550, 5)");
		
		m_conection.closeConnection();
	}

}
