package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class ModelClients {

	/**
	 *	This function inserts clienst to the database based on the function arguments detailed below.
	 * 
	 *	@param databaseConnection	The MySQL handle.
	 *	@param clientName 			The client's name to insert.
	 *	@param clientSurname		The client's surname to insert.
	 *	@param clientAddress		The client's address to insert.
	 *	@param clientIdentNum		The client's inentification number to insert.
	 *	@param date					The insert's date.
	 */
	public static void insertClient(Connection databaseConnection, String clientName, String clientSurname,
			String clientAddress, int clientIdentNum, String date) {

		// Surround with Try-Catch to handle SQL-related errors.
		try {
			/**
			 *	Query that will insert into 'clientes' table a new client w/the function's specified attributes.
			 */
			String sqlQuery = "INSERT INTO clientes(nombre,apellido,direccion,dni,fecha) VALUES (" 
					+ "'" + clientName + "',"
					+ "'" + clientSurname + "',"
					+ "'" + clientAddress + "',"
					+ clientIdentNum + ","
					+ "'" + date + "');";
			
			// SQL Statement to handle.
			Statement sqlStatement = databaseConnection.createStatement();
			
			// Execute the query.
			sqlStatement.executeUpdate(sqlQuery);
			
			System.out.println("The client has been succesfully saved on the database!");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}
	}
	/**
	 *  This function lists all clients in the database.
	 *  
	 *  @param databaseConnection	The MySQL handle.
	 */
	public static String listClients(Connection databaseConnection) {
		StringBuilder clientsList = new StringBuilder();
		
		// Surround with Try-Catch to handle SQL-related errors.
		try {
			/*
			 *  The SQL Query SELECT's everything from the 'clientes' table.
			 */
			String sqlQuery = "SELECT * FROM clientes;";
			
			// SQL Statement to handle.
			Statement sqlStatement = databaseConnection.createStatement();
			
			// Execute the query.
			ResultSet sqlQueryResult = sqlStatement.executeQuery(sqlQuery);
			
			ResultSetMetaData resultSetHelper = (ResultSetMetaData) sqlQueryResult.getMetaData();
			
			// Process the entire clientToFind ResultSet.
			while (sqlQueryResult.next()) {
				// Loop that starts at i = 2 to skip the 'id' column.
			    for (int i = 2; i <= 2; i++) {
			    	// Append the column's name and it's value.
			    	clientsList.append(sqlQueryResult.getString(i) + "\n");

			    }
			}

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}
		
		return clientsList.toString();
	}

	/**
	 *  This function tries to find a client by matching the provided name and theirs.
	 *  It returns a String containing everything regarding the matched client.
	 *  
	 *  @param clientName			The name of the client to be searched.
	 *  @param databaseConnection	The MySQL handle.
	 *  
	 *  @return						String containing a dump of that client's information as an String.
	 */
	public static String findClient(Connection databaseConnection, String clientName) {
		// String that will get generated with the client's data (If found).
		StringBuilder clientData = new StringBuilder();
		
		// Surround with Try-Catch to handle SQL-related errors
		try {
			/*
			 *  The SQL Query SELECT's everything from the 'clientes' table pattern-matching it
			 *  with the provided client's name on the function argument.
			 */
			String sqlQuery = "SELECT * FROM clientes WHERE nombre = '" + clientName + "';";

			// SQL Statement to handle.
			Statement sqlStatement = databaseConnection.createStatement();
			
			// Execute the query.
			ResultSet clientToFind = sqlStatement.executeQuery(sqlQuery);
			
			// Query's ResultSet parser-helper.
			ResultSetMetaData resultSetHelper = (ResultSetMetaData) clientToFind.getMetaData();

			// Process the entire clientToFind ResultSet.
			while (clientToFind.next()) {
				// Loop that starts at i = 2 to skip the 'id' column.
			    for (int i = 2; i <= resultSetHelper.getColumnCount(); i++) {
			    	// Append the column's name and it's value.
			    	clientData.append(resultSetHelper.getColumnName(i) + ": " + clientToFind.getString(i));
			    	
			        // Minor aesthetic aid that helps format the printed string.
			        if (i + 1 <= resultSetHelper.getColumnCount())
			        {
			        	clientData.append(", ");
			        }
			    }
			    clientData.append("");
			}

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}

		// Return the client's String.
		return clientData.toString();
	}

	/**
	 *  This function will update all the records of the client that is specified w/the function
	 *  argument 'clientName'.
	 *  
	 *	@param databaseConnection	The MySQL handle.
	 *	@param clientToChange 		The client to change.
	 *	@param clientName 			The client's name to update.
	 *	@param clientSurname		The client's surname to update.
	 *	@param clientAddress		The client's address to update.
	 *	@param clientIdentNum		The client's inentification number to update.
	 *	@param date					The insert's date.
	 */
	public static void updateClient(Connection databaseConnection, String clientToChange, String clientName, String clientSurname,
			String clientAddress, int clientIdentNum, String date) {
		// Surround with Try-Catch to handle SQL-related errors.
		try {
			/**
			 *	Query that will update a client provided by one of the function's arguments on the 'clientes' table
			 *	with a set of new function-argument-provided attributes.
			 */
			String sqlQuery = "UPDATE clientes\n" +
							  "SET\n" +
								  "nombre = '" + clientName + "',\n" +
								  "apellido = '" + clientSurname + "',\n" +
								  "direccion = '" + clientAddress + "',\n" +
								  "dni = " + clientIdentNum + ",\n" +
								  "fecha = '" + date + "'\n" +
							  "WHERE\n" +
							  "nombre = '" + clientToChange + "';";
			
			// SQL Statement to handle.
			Statement sqlStatement = databaseConnection.createStatement();
						
			// Execute the query.
			sqlStatement.executeUpdate(sqlQuery);

			
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}
	}

	/**
	 *  This function will delete all the records of the client that is specified w/the function
	 *  argument 'clientName'.
	 *  
	 *  @param databaseConnection	The MySQL handle.
	 *  @param clientName			The name of the client to be deleted.
	 */
	public static void deleteClient(Connection databaseConnection, String clientName) {
		// Surround with Try-Catch to handle SQL-related errors.
		try {
			/*
			 *  The SQL Query DELETE's everything from the 'clientes' client pattern-matching it
			 *  with the provided client's name on the function argument.
			 */
			String sqlQuery = "DELETE FROM clientes WHERE nombre = '" + clientName + "';";
			
			// SQL Statement to handle.
			Statement sqlStatement = databaseConnection.createStatement();
			
			// Execute the query, use executeUpdate instead of executeQuery to properly update the tables.
			sqlStatement.executeUpdate(sqlQuery);

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}
	}

}
