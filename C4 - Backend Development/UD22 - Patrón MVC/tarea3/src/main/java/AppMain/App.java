package AppMain;

import java.sql.Connection;


import controllers.ControllerMain;
import models.DBConnection;

public class App {
	public static void main(String[] args) throws ClassNotFoundException {
		Connection java_connection = null;

		java_connection = DBConnection.makeConection();
		DBConnection.useDataBase("ud22_03");
		// abrir ventana principal
		ControllerMain controllerMain = new ControllerMain();

		
	}
}
