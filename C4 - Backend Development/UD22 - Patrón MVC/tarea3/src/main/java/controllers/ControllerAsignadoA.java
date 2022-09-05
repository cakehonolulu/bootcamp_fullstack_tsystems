package controllers;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.ModelAsignadoA;
import views.ViewAsignadoA;
import views.ViewMain;

public class ControllerAsignadoA implements ActionListener {
	private ModelAsignadoA asignado = new ModelAsignadoA();
	private ViewAsignadoA frame = new ViewAsignadoA();
	private ViewMain viewMain = new ViewMain();
	private ControllerMain controllerMain;

	public ControllerAsignadoA() {
		ventanaAsignarA();
		// aqui se van asignando los actions a los elemntos de la vista
		actionBtnAdd();
		actionBtnVerTodo();
		actionBtnEliminar();
		actionBtnVolver();

		actionBtnAddProyecto();
		actionBtnEliminarById();
	}

	public void ventanaAsignarA() {
		viewMain.setVisible(false);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void actionBtnAdd() {
		frame.getBtnAddCientifico().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// mostramos el panel que nos interesa y ocultamos los demas
				frame.getPanelAdd().setVisible(true);
				frame.getPanelVerTodo().setVisible(false);
				frame.getPanelEliminar().setVisible(false);

			}
		});
	}

	public void actionBtnAddProyecto() {
		frame.getBtnGuardar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cientifico = frame.getTfCientifico().getText();
				String proyecto = frame.getTfProyecto().getText();

				asignado.insertAsignadoA(cientifico, proyecto);
				frame.getTfCientifico().setText("");
				frame.getTfProyecto().setText("");

			}
		});
	}

	public void actionBtnVerTodo() {
		frame.getBtnVerTodo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// mostramos el panel que nos interesa y ocultamos los demas

				frame.getPanelAdd().setVisible(false);
				frame.getPanelVerTodo().setVisible(true);
				frame.getPanelEliminar().setVisible(false);
				mostrarTodo();

			}
		});
	}

	public String obtenerTodo() {
		String todaLaInfo = "";
		ResultSet res = null;
		res = asignado.seeAllAsignadoA();
		try {
			while (res.next()) {
				todaLaInfo += "c: "+res.getString("cientifico") + " p: " + res.getString("proyecto") + "\n";

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return todaLaInfo;
	}

	private void mostrarTodo() {
		String listado = obtenerTodo();
		frame.getTextArea().setText(listado);
	}






	public void actionBtnEliminar() {
		frame.getBtnEliminarCientifico().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// mostramos el panel que nos interesa y ocultamos los demas

				frame.getPanelAdd().setVisible(false);
				frame.getPanelVerTodo().setVisible(false);
				frame.getPanelEliminar().setVisible(true);
			}
		});
	}

	public void actionBtnEliminarById() {
		frame.getBtnEliminar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cientifico = frame.getTfCientificoEliminar().getText();
				String proyecto = frame.getTfProyectoEliminar().getText();
				asignado.deleteAsignadoA(cientifico, proyecto);
				frame.getTfCientificoEliminar().setText("");
				frame.getTfProyectoEliminar().setText("");

			}
		});
	}

	public void actionBtnVolver() {
		frame.getBtnVolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				controllerMain = new ControllerMain();
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}