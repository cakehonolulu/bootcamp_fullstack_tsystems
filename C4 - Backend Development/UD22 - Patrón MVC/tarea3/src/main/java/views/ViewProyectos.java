package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ViewProyectos extends JFrame {

	private JPanel contentPane;
	private JPanel panel_opciones;
	private JButton btnAddCientifico;
	private JButton btnVolver;
	private JButton btnEliminarCientifico;
	private JButton btnActualizar;
	private JButton btnVerTodo;
	private JButton btnBuscar;

	private JPanel panelAdd;
	private JPanel panelActualizar;
	private JPanel panelEliminar;
	private JPanel panelBuscar;
	private JPanel panelVerTodo;
	private JTextField tfId;
	private JTextField tfNom;
	private JButton btnGuardar;
	private JTextArea textArea;
	private JTextField tfIdInput;
	private JButton btnBuscaById;
	private JTextArea textAreaMuestraDatos;
	private JLabel lblDniEliminar;
	private JTextField tfIdEliminar;
	private JButton btnEliminar;
	private JButton btnActualiza;
	private JLabel lblDni_1;
	private JTextField tfIdActualiza;
	private JButton btnBuscaProyParaActulizar;
	private JTextField tfIdParaActualizar;
	private JTextField tfNomParaActualizar;
	private JPanel panel;
	private JLabel lblHoras;
	private JTextField tfHoras;
	private JLabel lblHoras_1;
	private JTextField tfHorasParaActualizar;

	public ViewProyectos() {
		setTitle("PROYECTOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

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
		panelAdd.setBounds(243, 12, 181, 235);
		contentPane.add(panelAdd);
		panelAdd.setLayout(null);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(12, 22, 70, 15);
		panelAdd.add(lblNewLabel);

		tfId = new JTextField();
		tfId.setBounds(12, 39, 114, 19);
		panelAdd.add(tfId);
		tfId.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(12, 82, 140, 15);
		panelAdd.add(lblNewLabel_1);

		tfNom = new JTextField();
		tfNom.setBounds(12, 98, 114, 19);
		panelAdd.add(tfNom);
		tfNom.setColumns(10);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setBackground(Color.GREEN);

		btnGuardar.setBounds(31, 198, 117, 25);
		panelAdd.add(btnGuardar);

		lblHoras = new JLabel("Horas");
		lblHoras.setBounds(12, 139, 70, 15);
		panelAdd.add(lblHoras);

		tfHoras = new JTextField();
		tfHoras.setBounds(12, 156, 114, 19);
		panelAdd.add(tfHoras);
		tfHoras.setColumns(10);

		panelEliminar = new JPanel();
		panelEliminar.setBackground(Color.LIGHT_GRAY);
		panelEliminar.setBounds(243, 12, 181, 235);
		contentPane.add(panelEliminar);
		panelEliminar.setLayout(null);

		lblDniEliminar = new JLabel("ID");
		lblDniEliminar.setBounds(12, 53, 70, 15);
		panelEliminar.add(lblDniEliminar);

		tfIdEliminar = new JTextField();
		tfIdEliminar.setBounds(12, 80, 114, 19);
		panelEliminar.add(tfIdEliminar);
		tfIdEliminar.setColumns(10);

		btnEliminar = new JButton("Eliminar");

		btnEliminar.setBackground(Color.RED);
		btnEliminar.setBounds(32, 174, 117, 25);
		panelEliminar.add(btnEliminar);

		panelVerTodo = new JPanel();
		panelVerTodo.setBounds(243, 12, 181, 235);
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
		panelActualizar.setBounds(243, 12, 181, 235);
		contentPane.add(panelActualizar);
		panelActualizar.setBackground(Color.LIGHT_GRAY);
		panelActualizar.setLayout(null);

		btnActualiza = new JButton("Actualiza");

		btnActualiza.setBounds(35, 198, 117, 25);
		panelActualizar.add(btnActualiza);

		lblDni_1 = new JLabel("ID");
		lblDni_1.setBounds(12, 12, 70, 15);
		panelActualizar.add(lblDni_1);

		tfIdActualiza = new JTextField();
		tfIdActualiza.setBounds(12, 28, 114, 19);
		panelActualizar.add(tfIdActualiza);
		tfIdActualiza.setColumns(10);

		btnBuscaProyParaActulizar = new JButton("");

		btnBuscaProyParaActulizar.setIcon(new ImageIcon("res/lupa.png"));
		btnBuscaProyParaActulizar.setFont(new Font("Dialog", Font.BOLD, 5));
		btnBuscaProyParaActulizar.setBounds(138, 25, 31, 25);
		panelActualizar.add(btnBuscaProyParaActulizar);

		panel = new JPanel();
		panel.setVisible(false);
		panel.setBounds(12, 59, 157, 119);
		panelActualizar.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);

		JLabel lblDni_2 = new JLabel("ID");
		lblDni_2.setBounds(0, 12, 70, 15);
		panel.add(lblDni_2);

		tfIdParaActualizar = new JTextField();
		tfIdParaActualizar.setEditable(false);
		tfIdParaActualizar.setBounds(0, 27, 114, 19);
		panel.add(tfIdParaActualizar);
		tfIdParaActualizar.setColumns(10);

		JLabel lblNombreYApellido = new JLabel("Nombre");
		lblNombreYApellido.setBounds(0, 46, 145, 15);
		panel.add(lblNombreYApellido);

		tfNomParaActualizar = new JTextField();
		tfNomParaActualizar.setBounds(0, 58, 114, 19);
		panel.add(tfNomParaActualizar);
		tfNomParaActualizar.setColumns(10);

		lblHoras_1 = new JLabel("Horas");
		lblHoras_1.setBounds(0, 73, 70, 15);
		panel.add(lblHoras_1);

		tfHorasParaActualizar = new JTextField();
		tfHorasParaActualizar.setBounds(0, 89, 114, 19);
		panel.add(tfHorasParaActualizar);
		tfHorasParaActualizar.setColumns(10);

		panelBuscar = new JPanel();
		panelBuscar.setBounds(243, 12, 181, 235);
		contentPane.add(panelBuscar);
		panelBuscar.setBackground(Color.LIGHT_GRAY);
		panelBuscar.setLayout(null);

		JLabel lblDni = new JLabel("ID");
		lblDni.setBounds(12, 12, 83, 27);
		panelBuscar.add(lblDni);

		tfIdInput = new JTextField();
		tfIdInput.setBounds(12, 39, 114, 19);
		panelBuscar.add(tfIdInput);
		tfIdInput.setColumns(10);

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
		panelActualizar.setVisible(false);
		panelEliminar.setVisible(false);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JPanel getPanel_opciones() {
		return panel_opciones;
	}

	public JTextField getTfIdInput() {
		return tfIdInput;
	}

	public JButton getBtnBuscaById() {
		return btnBuscaById;
	}

	public JTextArea getTextAreaMuestraDatos() {
		return textAreaMuestraDatos;
	}

	public JLabel getLblDniEliminar() {
		return lblDniEliminar;
	}

	public JTextField getTfDniEliminar() {
		return tfIdEliminar;
	}

	public JButton getBtnActualiza() {
		return btnActualiza;
	}

	public JLabel getLblDni_1() {
		return lblDni_1;
	}

	public JTextField getTfDniActualiza() {
		return tfIdActualiza;
	}

	public JButton getBtnBuscaCientifParaActulizar() {
		return btnBuscaProyParaActulizar;
	}

	public JTextField getTfDniParaActualizar() {
		return tfIdParaActualizar;
	}

	public JTextField getTfNomApellParaActualizar() {
		return tfNomParaActualizar;
	}

	public JPanel getPanel() {
		return panel;
	}

	public JLabel getLblHoras() {
		return lblHoras;
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

	public JTextField getTfId() {
		return tfId;
	}

	public JTextField getTfNom() {
		return tfNom;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public JTextField getTfHoras() {
		return tfHoras;
	}

	public JTextField getTfIdActualiza() {
		return tfIdActualiza;
	}

	public JButton getBtnBuscaProyParaActulizar() {
		return btnBuscaProyParaActulizar;
	}

	public JTextField getTfIdParaActualizar() {
		return tfIdParaActualizar;
	}

	public JTextField getTfNomParaActualizar() {
		return tfNomParaActualizar;
	}

	public JTextField getTfHorasParaActualizar() {
		return tfHorasParaActualizar;
	}

	public JTextField getTfIdEliminar() {
		return tfIdEliminar;
	}
	

}