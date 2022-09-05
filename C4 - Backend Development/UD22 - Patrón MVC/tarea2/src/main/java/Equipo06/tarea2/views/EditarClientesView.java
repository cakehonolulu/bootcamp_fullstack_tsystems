package Equipo06.tarea2.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class EditarClientesView extends JFrame {

	private int editId = 0;
	
	// Panel de la aplicacion
	public JPanel contentPane;
	
	public JTextPane nombre;
	public JTextPane apellido;
	public JTextPane direccion;
	public JTextPane dni;
	public JTextPane fecha;
	public JButton editar;
	
	public EditarClientesView(int id) {
		
		// Anadimos un titulo al programa
		this.editId = id;
		setTitle("Editar" + " " + this.editId);
		
		// Coordenadas x y  de la aplicacion
		setBounds(400, 200, 500, 500);
		
		// Indica cuando se cierra la ventana se cierra la aplicacion
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Hace visible la ventana
		setVisible(true);
		
		// Creamos el panel
		contentPane = new JPanel();
		
		// Indicamos el diseno del panel
		contentPane.setLayout(null);
		
		// Asignamos el panel a la ventana
		setContentPane(contentPane);
		
		nombre = new JTextPane();
		nombre.setBounds(100, 50, 285, 45);
		contentPane.add(nombre);
		
		apellido = new JTextPane();
		apellido.setBounds(100, 112, 285, 45);
		contentPane.add(apellido);
		
		direccion = new JTextPane();
		direccion.setBounds(100, 169, 285, 45);
		contentPane.add(direccion);
		
		dni = new JTextPane();
		dni.setBounds(100, 226, 285, 45);
		contentPane.add(dni);
		
		fecha = new JTextPane();
		fecha.setBounds(100, 283, 285, 45);
		contentPane.add(fecha);
		
		editar = new JButton("Editar");
		editar.setBounds(100, 340, 285, 45);
		contentPane.add(editar);
	
	}
}
