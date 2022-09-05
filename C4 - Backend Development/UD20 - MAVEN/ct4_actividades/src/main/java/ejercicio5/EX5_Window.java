package ejercicio5;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class EX5_Window {
	private JFrame frame;

	/**
	 * Create the application.
	 */
	public EX5_Window() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JTextArea textarea1=new JTextArea();
		textarea1.setEditable(false);
		textarea1.setLineWrap(true);
		textarea1.setText("");
		frame.getContentPane().add(textarea1);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textarea1.setText("");
			}
		});
		panel.add(btnNewButton);

		
		textarea1.addMouseListener(new MouseAdapter() {
			//Cuando entra
	        public void mouseEntered(MouseEvent e) {
	        	textarea1.setText(textarea1.getText() + "ENTRADO EN EL COMPONENTE ");
	        }
	        //Cuando sale
	        public void mouseExited(MouseEvent e) {
	        	textarea1.setText(textarea1.getText() + "SALIDO DEL COMPONENTE ");
	        }
	    });
	}
}
