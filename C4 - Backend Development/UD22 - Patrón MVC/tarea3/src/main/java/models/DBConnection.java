package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class DBConnection {
	static Connection conexionbd = null;

	/**
	 * Metodo donde el usuario introduce los datos de su servidor/sql y se establece
	 * la conexion
	 * 
	 * @throws ClassNotFoundException
	 */
	public static Connection makeConection() throws ClassNotFoundException {
		String ip = JOptionPane.showInputDialog(null, "Introduce los datos de la conexión sql\nIp:");

		String user = JOptionPane.showInputDialog(null, "Usuario: ");

		String pass = JOptionPane.showInputDialog(null, "Contraseña: ");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conexionbd = DriverManager.getConnection("jdbc:mysql://" + ip + ":3306?useTimezone=true&serverTimezone=UTC",
					user, pass);
			JOptionPane.showMessageDialog(null, "Conectado al Sevidor");
		} catch (SQLException ex) {
			System.out.println("No se ha podido conectar con mi base de datos");
			System.out.println(ex);
		}

		return conexionbd;
	}

	/***
	 * 
	 */
	public static void useDataBase(String db) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conexionbd.createStatement();
			stdb.executeUpdate(Querydb);

			System.out.println("Usando la " + db + " base de datos");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}

	}

	public ResultSet getValues(String SQLquery) {
		ResultSet resultSet = null;
		try {

			Statement st = conexionbd.createStatement();
			resultSet = st.executeQuery(SQLquery);

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}

		return resultSet;
	}

	public void execQuery(String SQLquery) {
		try {
			Statement stqr = this.conexionbd.createStatement();
			stqr.executeQuery(SQLquery);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void updateQuery(String SQLquery) {
		try {
			Statement stup = this.conexionbd.createStatement();
			stup.executeUpdate(SQLquery);
			JOptionPane.showMessageDialog(null, "Se ha actualizado correctamente!");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * Metodo que cierra la conexion
	 */
	public static void closeConnection() {

		try {
			conexionbd.close();
			JOptionPane.showMessageDialog(null, "Se ha finalizado la conexión con el servidor");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
	}

}