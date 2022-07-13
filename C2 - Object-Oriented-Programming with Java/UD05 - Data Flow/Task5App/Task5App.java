package Task5App;

import javax.swing.JOptionPane;

public class Task5App {
	
	public static void main(String[] args) {
		// Ask the user for a number
		String m_number = JOptionPane.showInputDialog("Input the number");

		// Simple if-else that detects whether the number has or not residue
		if (Integer.parseInt(m_number) % 2 == 0)
		{
			System.out.println("The number " + m_number + " is divisible by 2!");
		}
		else
		{
			System.out.println("The number " + m_number + " is NOT divisible by 2!");
		}
	}

}
