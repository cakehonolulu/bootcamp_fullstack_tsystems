package ejercicio1;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

	public class EX1_Window {

		private JFrame frame;
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;


		/**
		 * Create the application.
		 */
		public EX1_Window() {
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
			frame.getContentPane().setLayout(null);
			
			textField = new JTextField();
			textField.setBounds(136, 58, 125, 47);
			frame.getContentPane().add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setBounds(78, 149, 86, 20);
			frame.getContentPane().add(textField_1);
			textField_1.setColumns(10);
			
			textField_2 = new JTextField();
			textField_2.setBounds(78, 193, 86, 20);
			frame.getContentPane().add(textField_2);
			textField_2.setColumns(10);
			
			JLabel lblNewLabel = new JLabel("horizontal");
			lblNewLabel.setBounds(22, 152, 80, 14);
			frame.getContentPane().add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("vertical");
			lblNewLabel_1.setBounds(22, 196, 46, 14);
			frame.getContentPane().add(lblNewLabel_1);
			
			JButton btnNewButton = new JButton("cambiar tamaño");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int lblNewLabel = Integer.parseInt(textField.getText());
					int lblNewLabel_1 = Integer.parseInt(textField.getText());
					textField.setBounds(130, 66, lblNewLabel, lblNewLabel_1);
				}
			});
			btnNewButton.setBounds(196, 167, 135, 23);
			frame.getContentPane().add(btnNewButton);
			
			
		}
	}

