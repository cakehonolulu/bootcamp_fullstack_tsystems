package Equipo06.tarea2.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

import Equipo06.tarea2.models.ModelClientes;
import Equipo06.tarea2.models.ModelVideos;
import Equipo06.tarea2.models.SQLConnection;
import Equipo06.tarea2.views.GetView;
import Equipo06.tarea2.views.MainView;

public class Controller {

	private SQLConnection connection = new SQLConnection();
	private MainView menu = new MainView();
	private GetView getView;
	
	// Controllers
	private ControllerClientes cclientes;
	private ControllerVideos cvideos;
	
	public Controller() {
		eventManager();
	}	
	
	public void eventManager() {
		
		// Cerrar sql connection
		this.menu.addWindowListener(new WindowAdapter() {
			@Override
		    public void windowClosing(WindowEvent windowEvent) {
		       connection.closeConnection();
		    }
		});
		
		// Clientes
		cclientes = new ControllerClientes(menu, getView, connection);
		
		// Videos
		cvideos = new ControllerVideos(menu, getView, connection);
		
	}
	
}
