package Task12App;

import javax.swing.JOptionPane;

public class Task12App {

	public static void main(String[] args) {
		// Only 3 tries are allowed
		int m_tries = 3;
		
		// Auxiliary boolean for the loop
		boolean m_found = false;
		
		// Guessed password
		String m_guess;
		
		// Loop while we still have tries and haven't found the password
		while ((m_tries > 0) && !m_found)
		{
			// Ask for the password
			m_guess = JOptionPane.showInputDialog("Input the password");
			
			// Compare the input with the password
			if (m_guess.equals("BOOTCAMP"))
			{
				// Exit the loop
				m_found = true;
			}
		
			m_tries--;
		}
		
		// Whether found or not, tell the user
		if (m_found)
		{
			JOptionPane.showMessageDialog(null, "Correct password!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Wrong password, no tries left...!");
		}

	}

}
