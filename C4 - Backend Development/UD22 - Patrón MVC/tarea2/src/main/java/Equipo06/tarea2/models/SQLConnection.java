package Equipo06.tarea2.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class SQLConnection {

	final String dbname = "tarea02db";
	
	/** Atributo */
	public Connection conexion;
	
	/** Constructor */
	public SQLConnection () {
		makeConection();
	}
	
	/**
	* Metodo donde el usuario introduce los datos de su servidor/sql y se establece la conexion
	*/
	public void makeConection() {
	    String ip = JOptionPane.showInputDialog(null,"Introduce los datos de la conexión sql\nIp:"); 

	    String user = JOptionPane.showInputDialog(null,"Usuario: ");

	    String pass = JOptionPane.showInputDialog(null,"Contraseña: ");
	    
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://"+ip+":3306?useTimezone=true&serverTimezone=UTC",user,pass);
			JOptionPane.showMessageDialog(null,"Conectado al Sevidor");		
			selectDB();
		}catch (SQLException | ClassNotFoundException ex ) {
			System.out.println("No se ha podido conectar con mi base de datos");
			System.out.println(ex);
		}
	}
	
	public void selectDB() {
		try {
			String Querydb = "USE tarea02db;";
			Statement stdb = this.conexion.createStatement();
			stdb.executeUpdate(Querydb);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	/**
	* Metodo que cierra la conexion
	*/
	public void closeConnection() {
		
		try {
			conexion.close();
			JOptionPane.showMessageDialog(null, "Se ha finalizado la conexión con el servidor");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
	}
	
	public ResultSet getValues (String SQLquery) {
		java.sql.ResultSet resultSet = null;
		try {
			
			Statement st = this.conexion.createStatement();
			resultSet = st.executeQuery(SQLquery);
				
		}catch (SQLException ex) {
			JOptionPane.showMessageDialog(null,"Error: "+ex.getMessage());
		}
		
		return resultSet;
	}
	
	public void execQuery (String SQLquery) {
		try {
			Statement stqr = this.conexion.createStatement();
			stqr.executeQuery(SQLquery);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void updateQuery(String SQLquery) {
		try {
			Statement stup = this.conexion.createStatement();
			stup.executeUpdate(SQLquery);
			JOptionPane.showMessageDialog(null, "Se ha actualizado correctamente!");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
	