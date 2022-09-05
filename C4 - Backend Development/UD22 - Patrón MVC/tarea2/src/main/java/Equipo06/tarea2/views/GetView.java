package Equipo06.tarea2.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GetView  extends JFrame{
	
	private String tableName = "";
	
	// Panel de la aplicacion
	public JPanel contentPane;
	
	public JTextArea textArea;
	
	public GetView(String table) {
		
		// Anadimos un titulo al programa
		this.tableName = table;
		setTitle("Ver" + " " + this.tableName);
		
		// Coordenadas x y  de la aplicacion
		setBounds(400, 200, 500, 312);
		
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 12, 466, 258);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
	}
}
