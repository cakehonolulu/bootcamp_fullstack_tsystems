package models;

import java.sql.Connection;
import java.sql.ResultSet;


public class ModelProyectos {
	private static DBConnection conexion = new DBConnection();
	static Connection conexionbd = null;

	/**
	 * Metodo que inserta datos en una tabla
	 * 
	 * @param db       nombre de la base datos donde se insertaran los datos
	 * @param SQLquery sentencia sql de la insercion de los datos en la tabla
	 */

	public static void insertProyectos(String id, String nombre, int horas) {

		String SQLquery = "insert into proyectos(id,nombre,horas) values(" + "'" + id + "'" + "," + "'" + nombre + "'"
				+ "," + horas + ");";
		System.out.println(SQLquery);
		conexion.updateQuery(SQLquery);
	}

	public ResultSet seeAllProyectos() {

		String SQLquery = "select * from proyectos;";
		System.out.println(SQLquery);
		return conexion.getValues(SQLquery);

	}

	public ResultSet findProyecto(String id) {

		String SQLquery = "select * from proyectos where id=" + "'" + id + "'" + ";";
		System.out.println(SQLquery);
		return conexion.getValues(SQLquery);

	}

	public void updateProyecto(String id, String nombre, int horas) {

		String SQLquery = "update proyectos set nombre =" + "'" + nombre + "'" + ",horas=" + horas + " where id=" + "'"
				+ id + "'" + ";";
		System.out.println(SQLquery);
		conexion.updateQuery(SQLquery);

	}

	public void deleteProyecto(String id) {

		String SQLquery = "delete from proyectos where id =" + "'" + id + "'" + ";";
		System.out.println(SQLquery);
		conexion.updateQuery(SQLquery);

	}

}
