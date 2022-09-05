package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import models.DBConnection;
import models.ModelClients;
import views.ViewClients;

public class ControllerClients implements ActionListener {
	private ModelClients clients;
	private ViewClients view;

	static Connection java_connection = null;
	
	public ControllerClients(ModelClients clients, ViewClients view) {
		this.clients = clients;
		this.view = view;
		
		// aqui se van asignando los actions a los elemntos de la vista
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public static boolean makeConnection() {
		java_connection = DBConnection.makeConection(java_connection);
		
		DBConnection.useDataBase(java_connection, "ud22_01");
		
		return ((java_connection != null) ? true : false);
	}
	
	public static void insertClient() {
		JTextField clientName = new JTextField();
		JTextField clientSurname = new JTextField();
		JTextField clientAddress = new JTextField();
		JTextField clientIdentNum = new JTextField();
		JTextField date = new JTextField();
		Object[] message = {
		    "Name: ", clientName,
		    "Surname:", clientSurname,
		    "Address: ", clientAddress,
		    "Ident. Num.: ", clientIdentNum,
		    "Date: ", date
		};

		int result = JOptionPane.showConfirmDialog(null, message, "Insert new Client", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
		    if (clientName.getText().length() > 0 && clientSurname.getText().length() > 0 && clientAddress.getText().length() > 0 &&
		    		clientIdentNum.getText().length() > 0 && date.getText().length() > 0) {
		    	ModelClients.insertClient(java_connection, clientName.getText().toString(), clientSurname.getText().toString(),
		    			clientAddress.getText().toString(), Integer.parseInt(clientIdentNum.getText()), date.getText().toString());
		    } else {
		        JOptionPane.showMessageDialog(null, "All fields must be filled!");
		    }
		} else {
			JOptionPane.showMessageDialog(null, "Insert canceled!");
		}
	}
	
	public static void deleteClient() {
		JTextField clientName = new JTextField();

		Object[] message = {
			"Name:", clientName
		};
		
		int result = JOptionPane.showConfirmDialog(null, message, "Delete a Client", JOptionPane.OK_CANCEL_OPTION);
		
		if (result == JOptionPane.OK_OPTION) {
			if (clientName.getText().length() > 0)
			{
				ModelClients.deleteClient(java_connection, clientName.getText().toString());
				JOptionPane.showMessageDialog(null, "Client Deleted!");
			} else {
		        JOptionPane.showMessageDialog(null, "All fields must be filled!");
		    }
		}
		
	}
	
	public static void updateClient() {
		JTextField newClientName = new JTextField();
		JTextField newClientSurname = new JTextField();
		JTextField newClientAddress = new JTextField();
		JTextField newClientIdentNum = new JTextField();
		JTextField newDate = new JTextField();
		
		Object[] message = {
		    "New Name: ", newClientName,
		    "New Surname:", newClientSurname,
		    "New Address: ", newClientAddress,
		    "New Ident. Num.: ", newClientIdentNum,
		    "New Date: ", newDate
		};
		
		String clientToChg = JOptionPane.showInputDialog("Name of the client to update");
		
		int result = JOptionPane.showConfirmDialog(null, message, "Update a Client", JOptionPane.OK_CANCEL_OPTION);
		
		if (result == JOptionPane.OK_OPTION) {
		    if (newClientName.getText().length() > 0 && newClientSurname.getText().length() > 0 && newClientAddress.getText().length() > 0 &&
		    		newClientIdentNum.getText().length() > 0 && newDate.getText().length() > 0) {
		    	ModelClients.updateClient(java_connection, clientToChg, newClientName.getText().toString(), newClientSurname.getText().toString(),
		    			newClientAddress.getText().toString(), Integer.parseInt(newClientIdentNum.getText()), newDate.getText().toString());
		    } else {
		        JOptionPane.showMessageDialog(null, "All fields must be filled!");
		    }
		} else {
			JOptionPane.showMessageDialog(null, "Insert canceled!");
		}
	}
	
	public static void listClients() {
		JOptionPane.showMessageDialog(null, ModelClients.listClients(java_connection));
	}

}
