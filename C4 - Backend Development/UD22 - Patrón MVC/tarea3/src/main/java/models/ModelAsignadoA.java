package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JOptionPane;

public class ModelAsignadoA {
	private static DBConnection conexion = new DBConnection();
	static Connection conexionbd = null;

	/**
	 * Metodo que inserta datos en una tabla
	 * 
	 * @param db       nombre de la base datos donde se insertaran los datos
	 * @param SQLquery sentencia sql de la insercion de los datos en la tabla
	 */

	public static void insertAsignadoA( String cientifico, String proyecto) {

		String SQLquery = "insert into asignado_a(cientifico,proyecto) values(" + "'" + cientifico + "'" + "," + "'"
				+ proyecto + "'" + ");";
		System.out.println(SQLquery);
		conexion.updateQuery(SQLquery);
	}

	public ResultSet seeAllAsignadoA() {

		String SQLquery = "select * from asignado_a;";
		System.out.println(SQLquery);
		return conexion.getValues(SQLquery);

	}

	public ResultSet findAsignadoAbyCientifico( String cientifico) {

		String SQLquery = "select * from asignado_a where cientifico=" + "'" + cientifico + "'" + ";";
		System.out.println(SQLquery);
		return conexion.getValues(SQLquery);
	}

	public ResultSet findAsignadoAbProyecto( char proyecto) {

		String SQLquery = "select * from asignado_a where proyecto=" + "'" + proyecto + "'" + ";";
		System.out.println(SQLquery);

		return conexion.getValues(SQLquery);
	}

	public void updateCientificoAsignadoA( String cientifico, String proyecto) {

		String SQLquery = "update cientificos set cientifico=" + "'" + cientifico + "'" + " where proyecto=" + "'"
				+ proyecto + "'" + ";";
		System.out.println(SQLquery);
		conexion.updateQuery(SQLquery);
	}

	public void updateProyectoAsignadoA( String proyecto, String cientifico) {

		String SQLquery = "update cientificos set proyecto=" + "'" + proyecto + "'" + " where cientifico=" + "'"
				+ cientifico + "'" + ";";
		System.out.println(SQLquery);
		conexion.updateQuery(SQLquery);
	}

	public void deleteAsignadoA( String cientifico, String proyecto) {

		String SQLquery = "delete from asignado_a where cientifico=" + "'" + cientifico + "'" + " and proyecto=" + "'"
				+ proyecto + "'" + ";";
		System.out.println(SQLquery);
		conexion.updateQuery(SQLquery);

	}

}
