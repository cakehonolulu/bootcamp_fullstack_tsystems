package Task3;

public class Task3App {

	public static void main(String[] args) {
		Mysql_interconnect m_connection = new Mysql_interconnect();
		m_connection.connect("IP", "PORT", "USER", "PASSWORD");
		m_connection.createDB("Ud18_Ej4");
		m_connection.useDB("Ud18_Ej4");

		m_connection.createTable("create table if not exists almacen (" 	+
									"identity int primary key not null, "	+
								    "lugar nvarchar(100), "					+
								    "capacidad int"
								);

		m_connection.createTable("create table if not exists caja ("											+
									"num_referencia char(5) primary key not null, "								+
								    "contenido nvarchar(100), "													+
								    "valor int, "																+
								    "almacen int, "																+
								    "constraint fk_almacen foreign key(almacen) references almacen(identity)"
								);
			
		m_connection.insertRecord("insert into almacen(identity, lugar, capacidad) values (1, 'Almacen 1', 1000)");
		m_connection.insertRecord("insert into almacen(identity, lugar, capacidad) values (2, 'Almacen 2', 2000)");
		m_connection.insertRecord("insert into almacen(identity, lugar, capacidad) values (3, 'Almacen 3', 3000)");
		m_connection.insertRecord("insert into almacen(identity, lugar, capacidad) values (4, 'Almacen 4', 4000)");
		m_connection.insertRecord("insert into almacen(identity, lugar, capacidad) values (5, 'Almacen 5', 5000)");
		
		m_connection.insertRecord("insert into caja(num_referencia, contenido, valor, almacen) values ('1', 'Contenido 1', 10, 1)");
		m_connection.insertRecord("insert into caja(num_referencia, contenido, valor, almacen) values ('2', 'Contenido 2', 20, 2)");
		m_connection.insertRecord("insert into caja(num_referencia, contenido, valor, almacen) values ('3', 'Contenido 3', 30, 3)");
		m_connection.insertRecord("insert into caja(num_referencia, contenido, valor, almacen) values ('4', 'Contenido 4', 40, 4)");
		m_connection.insertRecord("insert into caja(num_referencia, contenido, valor, almacen) values ('5', 'Contenido 5', 50, 5)");
		
		m_conection.closeConnection();
	}

}
