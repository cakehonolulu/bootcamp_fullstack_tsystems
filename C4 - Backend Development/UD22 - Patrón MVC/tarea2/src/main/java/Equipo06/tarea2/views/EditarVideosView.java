package Equipo06.tarea2.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class EditarVideosView extends JFrame {

	private int idVideo = 0;
	
	// Panel de la aplicacion
	public JPanel contentPane;
	
	public JTextPane title;
	public JTextPane director;
	public JTextPane cli_id;
	public JButton editar;
	
	public EditarVideosView() {
		
	}
	
	public EditarVideosView(int id) {
		
		// Anadimos un titulo al programa
		this.idVideo = id;
		setTitle("Editar" + " " + this.idVideo);
		
		// Coordenadas x y  de la aplicacion
		setBounds(400, 200, 490, 340);
		
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
		
		title = new JTextPane();
		title.setBounds(100, 50, 285, 45);
		contentPane.add(title);
		
		director = new JTextPane();
		director.setBounds(100, 112, 285, 45);
		contentPane.add(director);
		
		cli_id = new JTextPane();
		cli_id.setBounds(100, 169, 285, 45);
		contentPane.add(cli_id);
		
		editar = new JButton("Editar");
		editar.setBounds(100, 226, 285, 45);
		contentPane.add(editar);
	
	}
}
