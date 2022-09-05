package Equipo06.tarea2.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Equipo06.tarea2.models.ModelClientes;
import Equipo06.tarea2.models.SQLConnection;
import Equipo06.tarea2.views.EditarClientesView;
import Equipo06.tarea2.views.GetView;
import Equipo06.tarea2.views.MainView;

public class ControllerClientes {
	
	private MainView menu;
	private GetView getView;
	private SQLConnection connection;
	private EditarClientesView editClient;
	
	private ModelClientes mclientes = new ModelClientes();
	
	public ControllerClientes(MainView menu, GetView getView, SQLConnection connection) {
		
		this.menu = menu;
		this.getView = getView;
		this.connection = connection;
		
		eventManager();
	}
	
	public void eventManager() {
		
		// Ver todos clientes
		this.menu.ver_clientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getView = new GetView("Clientes");
				String res = mclientes.getClientes(connection);
				getView.textArea.setText(res);
			}
		});
		
		// Editor de clientes
		this.menu.editar_clientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idClient = Integer.parseInt(JOptionPane.showInputDialog("Introduce el id del cliente que quieres editar"));
				editClient = new EditarClientesView(idClient);
				
				// Guardar edicion de clientes
				editClient.editar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						mclientes.saveEditCliente(connection, editClient, idClient);
					}
				});
				
				mclientes.editClientes(connection, idClient, editClient);
			}
		});
		
		// Eliminar cliente
		this.menu.eliminar_clientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idCliente = Integer.parseInt(JOptionPane.showInputDialog("Introduce el id del video que quieres eliminar"));
				mclientes.removeCliente(connection, idCliente);
			}
		});
		
		// Guardar nuevo cliente
		this.menu.crear_cliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = JOptionPane.showInputDialog("Introduce el nombre del cliente");
				String apellido = JOptionPane.showInputDialog("Introduce el apellido del cliente");
				String direccion = JOptionPane.showInputDialog("Introduce la direccion del cliente");
				int dni = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dni del cliente"));
				String fecha = JOptionPane.showInputDialog("Introduce el aniversario del cliente");
				mclientes.crearCliente(connection, nombre, apellido, direccion, dni, fecha);
			}
		});
		
	}
	
}
