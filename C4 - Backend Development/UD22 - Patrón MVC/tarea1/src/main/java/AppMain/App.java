package AppMain;

import java.sql.Connection;
import java.sql.Date;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import models.DBConnection;
import models.ModelClients;
import views.ViewClients;

public class App {

	public static void main(String[] args) {
		ViewClients viewTask1 = new ViewClients();
		viewTask1.setVisible(true);
	}

}