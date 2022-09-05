package controllers;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.ViewAsignadoA;
import views.ViewCientificos;
import views.ViewMain;
import views.ViewProyectos;

public class ControllerMain implements ActionListener {

	private ViewMain view = new ViewMain();
	private ControllerCientificos controllerCientificos;
	private ControllerProyectos controllerProyectos;
	private ControllerAsignadoA controllerAsignadoA;

	public ControllerMain() {

		// abrir la ventana
		ventanaMain();

		// aqui se van asignando los actions a los elemntos de la vista

		actionBtnCientificos();
		actionBtnProyectos();
		actionBtnAsignar();

	}

	public void ventanaMain() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});

	}

	public void actionBtnCientificos() {

		view.getBtnCientificos().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// cerrar ventana principal y abri ventana cientificos
				view.setVisible(false);
				controllerCientificos = new ControllerCientificos();

			}

		});
	}

	public void actionBtnProyectos() {
		view.getBtnProyectos().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// cerrar o ocultar ventana principal y abrir ventana proyectos
				view.setVisible(false);
				controllerProyectos = new ControllerProyectos();
			}
		});

	}

	public void actionBtnAsignar() {
		view.getBtnAsignar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// cerrar ventana principal y abrir ventana asignar
				view.setVisible(false);
				controllerAsignadoA = new ControllerAsignadoA();
			}
		});
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}