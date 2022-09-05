package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewAsignadoA extends JFrame {

	private JPanel contentPane;
	private JPanel panel_opciones;
	private JPanel panelAdd;
	private JPanel panelEliminar;
	private JPanel panelVerTodo;

	private JButton btnAddCientifico;
	private JButton btnVolver;
	private JButton btnEliminarCientifico;
	private JButton btnVerTodo;
	private JTextField tfCientifico;
	private JTextField tfProyecto;
	private JButton btnGuardar;
	private JTextArea textArea;
	private JLabel lblDniEliminar;
	private JTextField tfCientificoEliminar;
	private JButton btnEliminar;
	private JLabel lblProyecto;
	private JTextField tfProyectoEliminar;

	public ViewAsignadoA() {
		setTitle("ASIGNAR");
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

		btnEliminarCientifico.setBounds(0, 83, 169, 25);
		panel_opciones.add(btnEliminarCientifico);

		btnVerTodo = new JButton("Ver Todo");

		btnVerTodo.setBounds(0, 46, 169, 25);
		panel_opciones.add(btnVerTodo);

		panelAdd = new JPanel();
		panelAdd.setVisible(false);
		panelAdd.setBackground(Color.LIGHT_GRAY);
		panelAdd.setBounds(232, 12, 181, 235);
		contentPane.add(panelAdd);
		panelAdd.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cientifico(DNI)");
		lblNewLabel.setBounds(12, 22, 140, 15);
		panelAdd.add(lblNewLabel);

		tfCientifico = new JTextField();
		tfCientifico.setBounds(12, 39, 114, 19);
		panelAdd.add(tfCientifico);
		tfCientifico.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Proyecto(ID)");
		lblNewLabel_1.setBounds(12, 82, 140, 15);
		panelAdd.add(lblNewLabel_1);

		tfProyecto = new JTextField();
		tfProyecto.setBounds(12, 98, 114, 19);
		panelAdd.add(tfProyecto);
		tfProyecto.setColumns(10);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setBackground(Color.GREEN);

		btnGuardar.setBounds(31, 198, 117, 25);
		panelAdd.add(btnGuardar);

		panelEliminar = new JPanel();
		panelEliminar.setBackground(Color.LIGHT_GRAY);
		panelEliminar.setBounds(232, 12, 181, 235);
		contentPane.add(panelEliminar);
		panelEliminar.setLayout(null);

		lblDniEliminar = new JLabel("Cientifico");
		lblDniEliminar.setBounds(12, 53, 70, 15);
		panelEliminar.add(lblDniEliminar);

		tfCientificoEliminar = new JTextField();
		tfCientificoEliminar.setBounds(12, 68, 114, 19);
		panelEliminar.add(tfCientificoEliminar);
		tfCientificoEliminar.setColumns(10);

		btnEliminar = new JButton("Eliminar");

		btnEliminar.setBackground(Color.RED);
		btnEliminar.setBounds(32, 174, 117, 25);
		panelEliminar.add(btnEliminar);

		lblProyecto = new JLabel("Proyecto");
		lblProyecto.setBounds(12, 99, 70, 15);
		panelEliminar.add(lblProyecto);

		tfProyectoEliminar = new JTextField();
		tfProyectoEliminar.setBounds(12, 119, 114, 19);
		panelEliminar.add(tfProyectoEliminar);
		tfProyectoEliminar.setColumns(10);

		panelVerTodo = new JPanel();
		panelVerTodo.setBounds(232, 12, 181, 235);
		contentPane.add(panelVerTodo);
		panelVerTodo.setBackground(Color.LIGHT_GRAY);
		panelVerTodo.setLayout(null);
		panelVerTodo.setVisible(false);

		textArea = new JTextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setBounds(12, 12, 157, 211);
		panelVerTodo.add(textArea);
		panelEliminar.setVisible(false);
	}

	public JTextField getTfCientifico() {
		return tfCientifico;
	}

	public JTextField getTfProyecto() {
		return tfProyecto;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JPanel getPanel_opciones() {
		return panel_opciones;
	}

	public JButton getBtnVerTodo() {
		return btnVerTodo;
	}

	public JPanel getPanelAdd() {
		return panelAdd;
	}

	public JPanel getPanelEliminar() {
		return panelEliminar;
	}

	public JPanel getPanelVerTodo() {
		return panelVerTodo;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public JButton getBtnAddCientifico() {
		return btnAddCientifico;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public JButton getBtnEliminarCientifico() {
		return btnEliminarCientifico;
	}

	public JTextField getTfCientificoEliminar() {
		return tfCientificoEliminar;
	}

	public JTextField getTfProyectoEliminar() {
		return tfProyectoEliminar;
	}

}