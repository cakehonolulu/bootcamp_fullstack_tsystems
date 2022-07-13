package Task4App;

import javax.swing.JOptionPane;

public class Task4App {

	public static void main(String[] args) {
		// Ask the user for the circle's radius
		String m_radius = JOptionPane.showInputDialog("Input the radius");

		// Show the user the total circle area by processing the data
		System.out.println("The area of the circle is: " + (Math.PI * (Math.pow(Double.parseDouble(m_radius), 2))));
	}

}
