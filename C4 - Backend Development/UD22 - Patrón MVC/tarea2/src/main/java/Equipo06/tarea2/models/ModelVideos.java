package Equipo06.tarea2.models;

import java.sql.ResultSet;
import java.sql.SQLException;

import Equipo06.tarea2.views.EditarVideosView;

public class ModelVideos {

	private String title;
	private String director;
	private String clienteid;
	
	public ModelVideos() {
		
	}
	
	/**
	 * @param title
	 * @param director
	 * @param clienteid
	 */
	public ModelVideos(String title, String director, String clienteid) {
		super();
		this.title = title;
		this.director = director;
		this.clienteid = clienteid;
	}
	
	// Methods
	
	public String getVideos(SQLConnection connection){
		
		final String query = "SELECT * FROM videos;";
		String returnMessage = "";
		
		ResultSet res = connection.getValues(query);
		try {
			while ( res.next() ) {
			    returnMessage += res.getString("id") + " " + res.getString("title") + " " + res.getString("director") + " " + res.getString("cli_id") + "\n\n";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return returnMessage;
	}
	
	public String[] editVideos(SQLConnection connection, int idVideo, EditarVideosView editView){
		
		final String query = "SELECT * FROM videos WHERE id = " + idVideo + ";";
		String[] returnFields = {};
		
		ResultSet res = connection.getValues(query);
		try {
			int i = 0;
			while ( res.next() ) {
			    editView.title.setText(res.getString("title"));
			    editView.director.setText(res.getString("director"));
			    editView.cli_id.setText(res.getString("cli_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return returnFields;
	}
	
	public void saveEditVideos(SQLConnection connection, EditarVideosView editVideos, int idVideo){
		
		final String query = "UPDATE videos SET title = " + "'" + editVideos.title.getText() + "'" + ", director = " + "'" + editVideos.director.getText() + "'" + ", cli_id = " + "" + Integer.parseInt(editVideos.cli_id.getText()) + " WHERE id = " + idVideo + ";";
		connection.updateQuery(query);
	}
	
	public void removeVideos(SQLConnection connection, int idVideo) {
		
		final String query = "DELETE FROM videos WHERE id = " + idVideo;
		connection.updateQuery(query);
	}
	
	public void crearVideo(SQLConnection connection, String title, String director, int cli_id) {
		
		final String query = "INSERT INTO videos (title, director, cli_id) VALUES ('" + title + "', '" + director + "', " + cli_id + ");";
		connection.updateQuery(query);
	}
	
}
