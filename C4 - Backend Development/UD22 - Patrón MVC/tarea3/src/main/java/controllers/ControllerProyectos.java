package controllers;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.ModelProyectos;
import views.ViewMain;
import views.ViewProyectos;

public class ControllerProyectos implements ActionListener {
	private ModelProyectos proyectos = new ModelProyectos();
	private ViewProyectos frame = new ViewProyectos();
	private ViewMain viewMain = new ViewMain();
	private ControllerMain controllerMain;

	public ControllerProyectos() {

		ventanaProyectos();
		// aqui se van asignando los actions a los elemntos de la vista
		actionBtnAdd();
		actionBtnVerTodo();
		actionBtnBuscar();
		actionBtnActualizar();
		actionBtnEliminar();
		actionBtnVolver();

		actionBtnAddProyecto();
		actionBtnBuscaById();
		actionBtnLupa();
		actionBtnActualizarDatos();
		actionBtnEliminarById();
	}

	public void ventanaProyectos() {
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
				frame.getPanelBuscar().setVisible(false);
				frame.getPanelActualizar().setVisible(false);
				frame.getPanelEliminar().setVisible(false);

			}
		});
	}

	public void actionBtnAddProyecto() {
		frame.getBtnGuardar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = frame.getTfId().getText();
				String nombre = frame.getTfNom().getText();
				int horas = Integer.parseInt(frame.getTfHoras().getText());

				proyectos.insertProyectos(id, nombre, horas);
				frame.getTfId().setText("");
				frame.getTfNom().setText("");
				frame.getTfHoras().setText("");

			}
		});
	}

	public void actionBtnVerTodo() {
		frame.getBtnVerTodo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// mostramos el panel que nos interesa y ocultamos los demas

				frame.getPanelAdd().setVisible(false);
				frame.getPanelVerTodo().setVisible(true);
				frame.getPanelBuscar().setVisible(false);
				frame.getPanelActualizar().setVisible(false);
				frame.getPanelEliminar().setVisible(false);
				mostrarTodo();

			}
		});
	}

	public String obtenerTodo() {
		String todaLaInfo = "";
		ResultSet res = null;
		res = proyectos.seeAllProyectos();
		try {
			while (res.next()) {
				todaLaInfo += res.getString("id") + " " + res.getString("nombre") + " " + res.getString("horas") + "\n";

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

	public void actionBtnBuscar() {
		frame.getBtnBuscar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// mostramos el panel que nos interesa y ocultamos los demas

				frame.getPanelAdd().setVisible(false);
				frame.getPanelVerTodo().setVisible(false);
				frame.getPanelBuscar().setVisible(true);
				frame.getPanelActualizar().setVisible(false);
				frame.getPanelEliminar().setVisible(false);
			}
		});
	}

	public void actionBtnBuscaById() {
		frame.getBtnBuscaById().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// recuperar info dada por el usuario
				String id = frame.getTfIdInput().getText();
				String todaLaInfo = "";
				ResultSet res = null;
				res = proyectos.findProyecto(id);// consulta
				try {
					while (res.next()) {
						todaLaInfo = "ID: \n" + res.getString("id") + "\nNombre: \n" + res.getString("nombre")
								+ "\nHoras: \n" + res.getString("horas");

					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				frame.getTfIdInput().setText("");
				frame.getTextAreaMuestraDatos().setText(todaLaInfo);

			}
		});
	}

	public void actionBtnActualizar() {
		frame.getBtnActualizar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// mostramos el panel que nos interesa y ocultamos los demas

				frame.getPanelAdd().setVisible(false);
				frame.getPanelVerTodo().setVisible(false);
				frame.getPanelBuscar().setVisible(false);
				frame.getPanelActualizar().setVisible(true);
				frame.getPanelEliminar().setVisible(false);
			}
		});
	}

	public void actionBtnLupa() {
		frame.getBtnBuscaCientifParaActulizar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = frame.getTfIdActualiza().getText();
				ResultSet res = proyectos.findProyecto(id);
				frame.getPanel().setVisible(true);
				String idA = null;
				String nom = null;
				String horas = null;
				try {
					while (res.next()) {
						idA = res.getString("id");
						nom = res.getString("nombre");
						horas = res.getString("horas");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				frame.getTfIdParaActualizar().setText(idA);
				frame.getTfNomApellParaActualizar().setText(nom);
				frame.getTfHorasParaActualizar().setText(horas);
				frame.getTfDniActualiza().setText("");

			}
		});
	}

	public void actionBtnActualizarDatos() {
		frame.getBtnActualiza().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = frame.getTfIdParaActualizar().getText();
				String nombre = frame.getTfNomParaActualizar().getText();
				int horas = Integer.parseInt(frame.getTfHorasParaActualizar().getText());
				proyectos.updateProyecto(id, nombre, horas);
				frame.getTfIdParaActualizar().setText("");
				frame.getTfNomParaActualizar().setText("");
				frame.getTfHorasParaActualizar().setText("");
			}
		});
	}

	public void actionBtnEliminar() {
		frame.getBtnEliminarCientifico().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// mostramos el panel que nos interesa y ocultamos los demas

				frame.getPanelAdd().setVisible(false);
				frame.getPanelVerTodo().setVisible(false);
				frame.getPanelBuscar().setVisible(false);
				frame.getPanelActualizar().setVisible(false);
				frame.getPanelEliminar().setVisible(true);
			}
		});
	}
	
	public void actionBtnEliminarById() {
		frame.getBtnEliminar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = frame.getTfIdEliminar().getText();
				proyectos.deleteProyecto(id);
				frame.getTfIdEliminar().setText("");
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