package Task3App;

import javax.swing.JOptionPane;

public class Task3App {

	public static void main(String[] args) {
		// Ask the user for it's name
		String m_name = JOptionPane.showInputDialog("Input your name");
		
		// Print the welcome message with the concatenated name
		System.out.println("Welcome " + m_name + "!");
	}

}
