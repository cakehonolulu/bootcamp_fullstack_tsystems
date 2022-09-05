package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class ViewCientificos extends JFrame {

	private JPanel panel_opciones;
	private JPanel contentPane;
	private JPanel panelAdd;
	private JPanel panelActualizar;
	private JPanel panelEliminar;
	private JPanel panelBuscar;
	private JPanel panelVerTodo;
	private JTextField tfDni;
	private JTextField tfNomApell;
	private JButton btnAddCientifico;
	private JButton btnVolver;
	private JButton btnEliminarCientifico;
	private JButton btnActualizar;
	private JButton btnVerTodo;
	private JButton btnGuardar;
	private JButton btnBuscar;
	private JTextArea textArea;
	private JTextField tfDniInput;
	private JButton btnBuscaById;
	private JTextArea textAreaMuestraDatos;
	private JLabel lblDniEliminar;
	private JTextField tfDniEliminar;
	private JButton btnEliminar;
	private JButton btnActualiza;
	private JLabel lblDni_1;
	private JTextField tfDniActualiza;
	private JButton btnBuscaCientifParaActulizar;
	private JTextField tfDniParaActualizar;
	private JTextField tfNomApellParaActualizar;
	private JPanel panel;

	public ViewCientificos() {
		setTitle("CIENTIFICOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel_opciones = new JPanel();
		panel_opciones.setBounds(12, 12, 181, 235);
		contentPane.add(panel_opciones);
		panel_opciones.setLayout(null);

		btnAddCientifico = new JButton("Añadir ");

		btnAddCientifico.setBounds(0, 12, 169, 25);
		panel_opciones.add(btnAddCientifico);

		btnVolver = new JButton("Volver Inicio");

		btnVolver.setBounds(0, 210, 169, 25);
		panel_opciones.add(btnVolver);

		btnEliminarCientifico = new JButton("Eliminar");

		btnEliminarCientifico.setBounds(0, 152, 169, 25);
		panel_opciones.add(btnEliminarCientifico);

		btnActualizar = new JButton("Actualizar");

		btnActualizar.setBounds(0, 116, 169, 25);
		panel_opciones.add(btnActualizar);

		btnVerTodo = new JButton("Ver Todo");

		btnVerTodo.setBounds(0, 46, 169, 25);
		panel_opciones.add(btnVerTodo);

		btnBuscar = new JButton("Buscar");

		btnBuscar.setBounds(0, 79, 169, 25);
		panel_opciones.add(btnBuscar);

		panelAdd = new JPanel();
		panelAdd.setVisible(false);
		panelAdd.setBackground(Color.LIGHT_GRAY);
		panelAdd.setBounds(245, 12, 181, 235);
		contentPane.add(panelAdd);
		panelAdd.setLayout(null);

		JLabel lblNewLabel = new JLabel("DNI");
		lblNewLabel.setBounds(12, 22, 70, 15);
		panelAdd.add(lblNewLabel);

		tfDni = new JTextField();
		tfDni.setBounds(12, 39, 114, 19);
		panelAdd.add(tfDni);
		tfDni.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Nombre Apellido");
		lblNewLabel_1.setBounds(12, 82, 140, 15);
		panelAdd.add(lblNewLabel_1);

		tfNomApell = new JTextField();
		tfNomApell.setBounds(12, 98, 114, 19);
		panelAdd.add(tfNomApell);
		tfNomApell.setColumns(10);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setBackground(Color.GREEN);

		btnGuardar.setBounds(31, 198, 117, 25);
		panelAdd.add(btnGuardar);

		panelBuscar = new JPanel();
		panelBuscar.setBackground(Color.LIGHT_GRAY);
		panelBuscar.setBounds(245, 12, 181, 235);
		contentPane.add(panelBuscar);
		panelBuscar.setLayout(null);

		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(12, 12, 83, 27);
		panelBuscar.add(lblDni);

		tfDniInput = new JTextField();
		tfDniInput.setBounds(12, 39, 114, 19);
		panelBuscar.add(tfDniInput);
		tfDniInput.setColumns(10);

		btnBuscaById = new JButton("Busca");

		btnBuscaById.setBounds(12, 59, 117, 25);
		panelBuscar.add(btnBuscaById);

		textAreaMuestraDatos = new JTextArea();
		textAreaMuestraDatos.setEditable(false);
		textAreaMuestraDatos.setBackground(Color.WHITE);
		textAreaMuestraDatos.setBounds(12, 126, 146, 89);
		panelBuscar.add(textAreaMuestraDatos);

		JLabel lblDatosEncontrados = new JLabel("Datos encontrados");
		lblDatosEncontrados.setBounds(22, 99, 157, 15);
		panelBuscar.add(lblDatosEncontrados);
		panelBuscar.setVisible(false);

		panelEliminar = new JPanel();
		panelEliminar.setBackground(Color.LIGHT_GRAY);
		panelEliminar.setBounds(245, 12, 181, 235);
		contentPane.add(panelEliminar);
		panelEliminar.setLayout(null);

		lblDniEliminar = new JLabel("DNI");
		lblDniEliminar.setBounds(12, 53, 70, 15);
		panelEliminar.add(lblDniEliminar);

		tfDniEliminar = new JTextField();
		tfDniEliminar.setBounds(12, 80, 114, 19);
		panelEliminar.add(tfDniEliminar);
		tfDniEliminar.setColumns(10);

		btnEliminar = new JButton("Eliminar");

		btnEliminar.setBackground(Color.RED);
		btnEliminar.setBounds(32, 174, 117, 25);
		panelEliminar.add(btnEliminar);

		panelVerTodo = new JPanel();
		panelVerTodo.setBounds(245, 12, 181, 235);
		contentPane.add(panelVerTodo);
		panelVerTodo.setBackground(Color.LIGHT_GRAY);
		panelVerTodo.setLayout(null);
		panelVerTodo.setVisible(false);

		textArea = new JTextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setBounds(12, 12, 157, 211);
		panelVerTodo.add(textArea);

		panelActualizar = new JPanel();
		panelActualizar.setBounds(245, 12, 181, 235);
		contentPane.add(panelActualizar);
		panelActualizar.setBackground(Color.LIGHT_GRAY);
		panelActualizar.setLayout(null);

		btnActualiza = new JButton("Actualiza");

		btnActualiza.setBounds(35, 198, 117, 25);
		panelActualizar.add(btnActualiza);

		lblDni_1 = new JLabel("DNI");
		lblDni_1.setBounds(12, 12, 70, 15);
		panelActualizar.add(lblDni_1);

		tfDniActualiza = new JTextField();
		tfDniActualiza.setBounds(12, 28, 114, 19);
		panelActualizar.add(tfDniActualiza);
		tfDniActualiza.setColumns(10);

		btnBuscaCientifParaActulizar = new JButton("");

		btnBuscaCientifParaActulizar.setIcon(new ImageIcon("res/lupa.png"));
		btnBuscaCientifParaActulizar.setFont(new Font("Dialog", Font.BOLD, 5));
		btnBuscaCientifParaActulizar.setBounds(138, 25, 31, 25);
		panelActualizar.add(btnBuscaCientifParaActulizar);

		panel = new JPanel();
		panel.setVisible(false);
		panel.setBounds(12, 59, 157, 119);
		panelActualizar.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);

		JLabel lblDni_2 = new JLabel("DNI");
		lblDni_2.setBounds(0, 12, 70, 15);
		panel.add(lblDni_2);

		tfDniParaActualizar = new JTextField();
		tfDniParaActualizar.setEditable(false);
		tfDniParaActualizar.setBounds(0, 27, 114, 19);
		panel.add(tfDniParaActualizar);
		tfDniParaActualizar.setColumns(10);

		JLabel lblNombreYApellido = new JLabel("Nombre y apellido");
		lblNombreYApellido.setBounds(0, 68, 145, 15);
		panel.add(lblNombreYApellido);

		tfNomApellParaActualizar = new JTextField();
		tfNomApellParaActualizar.setBounds(0, 84, 114, 19);
		panel.add(tfNomApellParaActualizar);
		tfNomApellParaActualizar.setColumns(10);
		panelActualizar.setVisible(false);
		panelEliminar.setVisible(false);

	}

	public JButton getBtnAddCientifico() {
		return btnAddCientifico;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public JButton getBtnEliminarCientifico() {
		return btnEliminarCientifico;
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public JButton getBtnVerTodo() {
		return btnVerTodo;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public JPanel getPanelActualizar() {
		return panelActualizar;
	}

	public JPanel getPanelAdd() {
		return panelAdd;
	}

	public JPanel getPanelEliminar() {
		return panelEliminar;
	}

	public JPanel getPanelBuscar() {
		return panelBuscar;
	}

	public JPanel getPanelVerTodo() {
		return panelVerTodo;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public JTextField getTfDni() {
		return tfDni;
	}

	public JTextField getTfNomApell() {
		return tfNomApell;
	}

	public JTextField getTfDniInput() {
		return tfDniInput;
	}

	public JButton getBtnBuscaById() {
		return btnBuscaById;
	}

	public JTextArea getTextAreaMuestraDatos() {
		return textAreaMuestraDatos;
	}

	public JTextField getTfDniEliminar() {
		return tfDniEliminar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public JButton getBtnActualiza() {
		return btnActualiza;
	}

	public JTextField getTfDniActualiza() {
		return tfDniActualiza;
	}

	public JButton getBtnBuscaCientifParaActulizar() {
		return btnBuscaCientifParaActulizar;
	}

	public JTextField getTfDniParaActualizar() {
		return tfDniParaActualizar;
	}

	public JTextField getTfNomApellParaActualizar() {
		return tfNomApellParaActualizar;
	}

	public JPanel getPanel() {
		return panel;
	}

	public JPanel getPanel_opciones() {
		return panel_opciones;
	}
	

}