package Equipo06.tarea2.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import Equipo06.tarea2.views.EditarClientesView;

public class ModelClientes {

	private String nombre = "";
	private String apellidos = "";
	private String direccion = "";
	private int dni = 00000000;
	private String fecha = "0000-00-00";

	public ModelClientes() {
		
	}
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param direccion
	 * @param dni
	 * @param fecha
	 */
	public ModelClientes(String nombre, String apellidos, String direccion, int dni, String fecha) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.dni = dni;
		this.fecha = fecha;
	}
	
	// Methods
	
	public String getClientes(SQLConnection connection){
		
		final String query = "SELECT * FROM cliente;";
		String returnMessage = "";
		
		ResultSet res = connection.getValues(query);
		try {
			while ( res.next() ) {
			    returnMessage += res.getString("id") + " " + res.getString("nombre") + " " + res.getString("apellido") + " " + res.getString("direccion") + " " + res.getString("dni") + " " + res.getString("fecha") + "\n\n";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return returnMessage;
	}
	
	public String[] editClientes(SQLConnection connection, int idCLiente, EditarClientesView editView){
		
		final String query = "SELECT * FROM cliente WHERE id = " + idCLiente + ";";
		String[] returnFields = {};
		
		ResultSet res = connection.getValues(query);
		try {
			int i = 0;
			while ( res.next() ) {
			    editView.nombre.setText(res.getString("nombre"));
			    editView.apellido.setText(res.getString("apellido"));
			    editView.direccion.setText(res.getString("direccion"));
			    editView.dni.setText(res.getString("dni"));
			    editView.fecha.setText(res.getString("fecha"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return returnFields;
	}
	
	public void saveEditCliente(SQLConnection connection, EditarClientesView editCliente, int idClientes){
		
		final String query = "UPDATE cliente SET nombre = " + "'" + editCliente.nombre.getText() + "'" + ", apellido = " + "'" + editCliente.apellido.getText() + "'" + ", direccion = '" + editCliente.direccion.getText() + "', dni = " + Integer.parseInt(editCliente.dni.getText()) + ", fecha = '" + editCliente.fecha.getText() + "' WHERE id = " + idClientes + ";";
		connection.updateQuery(query);
	}
	
	public void removeCliente(SQLConnection connection, int idClientes) {
		
		final String query = "DELETE FROM cliente WHERE id = " + idClientes + ";";
		connection.updateQuery(query);
	}
	
	public void crearCliente(SQLConnection connection, String nombre, String apellido, String direccion, int dni, String fecha) {
		
		final String query = "INSERT INTO cliente (nombre, apellido, direccion, dni, fecha) VALUES ('" + nombre + "', '" + apellido + "', '" + direccion + "', '" + dni + "', '" + fecha + "');";
		connection.updateQuery(query);
	}
	
}
