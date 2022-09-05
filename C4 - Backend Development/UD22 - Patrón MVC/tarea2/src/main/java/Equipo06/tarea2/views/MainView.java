package Equipo06.tarea2.views;

import javax.swing.*;

public class MainView extends JFrame {
	
	// Panel de la aplicacion
	public JPanel contentPane;
	
	public JButton ver_clientes;
	public JButton ver_videos;
	public JButton editar_clientes;
	public JButton editar_videos;
	public JButton eliminar_clientes;
	public JButton eliminar_videos;
	public JButton crear_cliente;
	public JButton crear_videos;
	
	public MainView() {
		
		// Anadimos un titulo al programa
		setTitle("tarea02");
		
		// Coordenadas x y  de la aplicacion
		setBounds(400, 200, 510, 325);
		
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
		
		this.ver_clientes = new JButton("Ver Clientes");
		this.ver_clientes.setBounds(12, 25, 190, 50);
		contentPane.add(ver_clientes);
		
		this.ver_videos = new JButton("Ver Videos");
		this.ver_videos.setBounds(298, 25, 190, 50);
		contentPane.add(ver_videos);
		
		this.editar_clientes = new JButton("Editar Clientes");
		this.editar_clientes.setBounds(12, 149, 190, 50);
		contentPane.add(editar_clientes);
		
		this.editar_videos = new JButton("Editar Videos");
		this.editar_videos.setBounds(298, 149, 190, 50);
		contentPane.add(editar_videos);
		
		this.eliminar_clientes = new JButton("Eliminar Clientes");
		this.eliminar_clientes.setBounds(12, 213, 190, 50);
		contentPane.add(eliminar_clientes);
		
		this.eliminar_videos = new JButton("Eliminar Videos");
		this.eliminar_videos.setBounds(298, 213, 190, 50);
		contentPane.add(eliminar_videos);
		
		crear_cliente = new JButton("Crear Clientes");
		crear_cliente.setBounds(12, 87, 190, 50);
		contentPane.add(crear_cliente);
		
		crear_videos = new JButton("Crear Videos");
		crear_videos.setBounds(298, 87, 190, 50);
		contentPane.add(crear_videos);
	
	}
}
