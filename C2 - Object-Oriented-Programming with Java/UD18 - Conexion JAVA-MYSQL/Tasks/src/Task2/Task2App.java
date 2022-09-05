package Task2;

public class Task2App {

	public static void main(String[] args) {
		Mysql_interconnect m_connection = new Mysql_interconnect();
		m_connection.connect("IP", "PORT", "USER", "PASSWORD");
		m_connection.createDB("Ud18_Ej4");
		m_connection.useDB("Ud18_Ej4");

		m_connection.createTable("create table if not exists departamento ("	+
									"codigo int primary key not null, "			+
								    "nombre nvarchar(100), "					+
								    "presupuesto int "
								);

		m_connection.createTable("create table if not exists empleado ("													+
									"dni varchar(8) primary key not null, "													+
								    "nombre nvarchar(100), "																+
								    "apellidos nvarchar(255), "																+
								    "departamento int, "																	+
								    "constraint fk_departamento foreign key(departamento) references departamento(codigo) "
								);
			
		m_connection.insertRecord("insert into departamento(codigo, nombre, presupuesto) values (1, 'Dept 1', 1000)");
		m_connection.insertRecord("insert into departamento(codigo, nombre, presupuesto) values (2, 'Dept 2', 2000)");
		m_connection.insertRecord("insert into departamento(codigo, nombre, presupuesto) values (3, 'Dept 3', 3000)");
		m_connection.insertRecord("insert into departamento(codigo, nombre, presupuesto) values (4, 'Dept 4', 4000)");
		m_connection.insertRecord("insert into departamento(codigo, nombre, presupuesto) values (5, 'Dept 5', 5000)");
		
		m_connection.insertRecord("insert into empleado(dni, nombre, apellidos, departamento) values ('13494391', 'A', 'B', 1)");
		m_connection.insertRecord("insert into empleado(dni, nombre, apellidos, departamento) values ('62431786', 'C', 'D', 2)");
		m_connection.insertRecord("insert into empleado(dni, nombre, apellidos, departamento) values ('13240607', 'E', 'F', 3)");
		m_connection.insertRecord("insert into empleado(dni, nombre, apellidos, departamento) values ('43302440', 'G', 'H', 4)");
		m_connection.insertRecord("insert into empleado(dni, nombre, apellidos, departamento) values ('92578781', 'I', 'J', 5)");
		
		m_conection.closeConnection();
	}

}
