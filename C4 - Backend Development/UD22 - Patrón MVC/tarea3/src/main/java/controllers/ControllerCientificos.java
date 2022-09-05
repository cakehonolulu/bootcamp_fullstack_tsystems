package controllers;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import models.ModelCientificos;
import views.ViewCientificos;
import views.ViewMain;

public class ControllerCientificos implements ActionListener {
	private ModelCientificos cientifico = new ModelCientificos();
	private ViewCientificos viewCientificos = new ViewCientificos();
	private ViewMain viewMain = new ViewMain();
	private ControllerMain controllerMain;

	public ControllerCientificos() {
		ventanaCientificos();
		// llamar los actions de los botones
		actionBtnAdd();
		actionBtnVerTodo();
		actionBtnBuscar();
		actionBtnVolver();
		actionBtnActualizar();
		actionBtnEliminar();
		actionBtnAddCientifico();

		actionBtnBuscaById();
		actionBtnEliminarById();
		actionBtnLupa();
		actionBtnActualizarDatos();
	}

	public void actionBtnAdd() {
		viewCientificos.getBtnAddCientifico().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// mostramos el panel que nos interesa y ocultamos los demas
				viewCientificos.getPanelAdd().setVisible(true);
				viewCientificos.getPanelVerTodo().setVisible(false);
				viewCientificos.getPanelBuscar().setVisible(false);
				viewCientificos.getPanelActualizar().setVisible(false);
				viewCientificos.getPanelEliminar().setVisible(false);

			}
		});
	}

	public void actionBtnVerTodo() {
		viewCientificos.getBtnVerTodo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// mostramos el panel que nos interesa y ocultamos los demas

				viewCientificos.getPanelAdd().setVisible(false);
				viewCientificos.getPanelVerTodo().setVisible(true);
				viewCientificos.getPanelBuscar().setVisible(false);
				viewCientificos.getPanelActualizar().setVisible(false);
				viewCientificos.getPanelEliminar().setVisible(false);
				mostrarTodo();

			}
		});
	}

	public void actionBtnBuscar() {
		viewCientificos.getBtnBuscar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// mostramos el panel que nos interesa y ocultamos los demas

				viewCientificos.getPanelAdd().setVisible(false);
				viewCientificos.getPanelVerTodo().setVisible(false);
				viewCientificos.getPanelBuscar().setVisible(true);
				viewCientificos.getPanelActualizar().setVisible(false);
				viewCientificos.getPanelEliminar().setVisible(false);
			}
		});
	}

	public void actionBtnActualizar() {
		viewCientificos.getBtnActualizar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// mostramos el panel que nos interesa y ocultamos los demas

				viewCientificos.getPanelAdd().setVisible(false);
				viewCientificos.getPanelVerTodo().setVisible(false);
				viewCientificos.getPanelBuscar().setVisible(false);
				viewCientificos.getPanelActualizar().setVisible(true);
				viewCientificos.getPanelEliminar().setVisible(false);
			}
		});
	}

	public void actionBtnEliminar() {
		viewCientificos.getBtnEliminarCientifico().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// mostramos el panel que nos interesa y ocultamos los demas

				viewCientificos.getPanelAdd().setVisible(false);
				viewCientificos.getPanelVerTodo().setVisible(false);
				viewCientificos.getPanelBuscar().setVisible(false);
				viewCientificos.getPanelActualizar().setVisible(false);
				viewCientificos.getPanelEliminar().setVisible(true);
			}
		});
	}

	public void actionBtnVolver() {
		viewCientificos.getBtnVolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				viewCientificos.setVisible(false);// ocultamos el frame actual
				controllerMain = new ControllerMain();// instanciamos el controllerMain
				// para poder ver de nuevo la ventana principal y poder volver a usar sus
				// elementos

			}
		});
	}

	public String obtenerTodo() {
		String todaLaInfo = "";
		ResultSet res = null;
		res = cientifico.seeAllCientificos();
		try {
			while (res.next()) {
				todaLaInfo += res.getString("dni") + " " + res.getString("nom_apell") + "\n";
				// listado.add(todaLaInfo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return todaLaInfo;
	}

	private void mostrarTodo() {
		String listado = obtenerTodo();
		viewCientificos.getTextArea().setText(listado);
	}

	public void actionBtnBuscaById() {
		viewCientificos.getBtnBuscaById().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// recuperar info dada por el usuario
				String dni = viewCientificos.getTfDniInput().getText();
				String todaLaInfo = "";
				ResultSet res = null;
				res = cientifico.findCientifico(dni);// consulta
				try {
					while (res.next()) {
						todaLaInfo = "DNI: \n" + res.getString("dni") + "\nNombre y apellido: \n"
								+ res.getString("nom_apell");

					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				viewCientificos.getTfDniInput().setText("");
				viewCientificos.getTextAreaMuestraDatos().setText(todaLaInfo);

			}
		});
	}

	// se crea la ventana
	private void ventanaCientificos() {
		viewMain.setVisible(false);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewCientificos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void actionBtnAddCientifico() {
		viewCientificos.getBtnGuardar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dni = viewCientificos.getTfDni().getText();
				String nom_apell = viewCientificos.getTfNomApell().getText();
				cientifico.insertCientificos(dni, nom_apell);
				viewCientificos.getTfDni().setText("");
				viewCientificos.getTfNomApell().setText("");

			}
		});
	}

	public void actionBtnEliminarById() {
		viewCientificos.getBtnEliminar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dni = viewCientificos.getTfDniEliminar().getText();
				cientifico.deleteCientifico(dni);
				viewCientificos.getTfDniEliminar().setText("");
			}
		});
	}

	public void actionBtnLupa() {
		viewCientificos.getBtnBuscaCientifParaActulizar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dni = viewCientificos.getTfDniActualiza().getText();
				ResultSet res = cientifico.findCientifico(dni);
				viewCientificos.getPanel().setVisible(true);
				String dniA = null;
				String nom_apellA = null;
				try {
					while (res.next()) {
						dniA = res.getString("dni");
						nom_apellA = res.getString("nom_apell");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				viewCientificos.getTfDniParaActualizar().setText(dniA);
				viewCientificos.getTfNomApellParaActualizar().setText(nom_apellA);
				viewCientificos.getTfDniActualiza().setText("");

			}
		});
	}

	public void actionBtnActualizarDatos() {
		viewCientificos.getBtnActualiza().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dni = viewCientificos.getTfDniParaActualizar().getText();
				String nom_apell = viewCientificos.getTfNomApellParaActualizar().getText();
				cientifico.updateCientifico(dni, nom_apell);
				viewCientificos.getTfDniParaActualizar().setText("");
				viewCientificos.getTfNomApellParaActualizar().setText("");
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}