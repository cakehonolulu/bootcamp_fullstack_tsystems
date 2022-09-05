package Equipo06.tarea2.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Equipo06.tarea2.models.ModelClientes;
import Equipo06.tarea2.models.ModelVideos;
import Equipo06.tarea2.models.SQLConnection;
import Equipo06.tarea2.views.EditarVideosView;
import Equipo06.tarea2.views.GetView;
import Equipo06.tarea2.views.MainView;

public class ControllerVideos {

	private MainView menu;
	private GetView getView;
	private SQLConnection connection;
	private EditarVideosView editVideos = null;
	
	// Modelos
	private ModelVideos mvideos = new ModelVideos();
	
	public ControllerVideos(MainView menu, GetView getView, SQLConnection connection) {
		
		this.menu = menu;
		this.getView = getView;
		this.connection = connection;
		
		eventManager();
	}
	
	public void eventManager() {
		
		// Vet todos videos
		this.menu.ver_videos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getView = new GetView("Videos");
				String res = mvideos.getVideos(connection);
				getView.textArea.setText(res);
			}
		});
		
		// Editor de videos
		this.menu.editar_videos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idVideo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el id del video que quieres editar"));
				editVideos = new EditarVideosView(idVideo);
				
				// Guardar edicion de videos
				editVideos.editar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						mvideos.saveEditVideos(connection, editVideos, idVideo);
					}
				});
				
				mvideos.editVideos(connection, idVideo, editVideos);
			}
		});
		
		// Eliminar video
		this.menu.eliminar_videos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idVideo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el id del video que quieres eliminar"));
				mvideos.removeVideos(connection, idVideo);
			}
		});
		
		// Guardar nuevo video
		this.menu.crear_videos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title = JOptionPane.showInputDialog("Introduce el titulo del video");
				String director = JOptionPane.showInputDialog("Introduce el nombre del director");
				int cli_id = Integer.parseInt(JOptionPane.showInputDialog("Introduce el id del cliente asociado"));
				mvideos.crearVideo(connection, title, director, cli_id);
			}
		});
		
	}
	
}
