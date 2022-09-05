package ejercicio4;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Frame;

import javax.swing.JLabel;

public class EX4_Window {

	private JFrame frame;
	private int cont = 1;;

	/**
	 * Create the application.
	 */
	public EX4_Window() {
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
		textarea1.setText("Texto Inicial ");
		frame.getContentPane().add(textarea1);

		JLabel lblNewLabel = new JLabel("Eventos");
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);

		frame.addComponentListener(new ComponentAdapter() {
			//reescladada
			public void componentResized(ComponentEvent componentEvent) {

				if(cont%17 == 0)
					textarea1.setText(textarea1.getText() + "VentanaReescalada ");	

				cont++;
			}
		});

		frame.addWindowStateListener(new WindowStateListener() {
			public void windowStateChanged(WindowEvent arg0) {
				resize(arg0);
			}

			private void resize(WindowEvent e) {
				//minimizada
				if ((e.getNewState() & Frame.ICONIFIED) == Frame.ICONIFIED){
					textarea1.setText(textarea1.getText() + "VentanaMinimizada ");	
				}
				// maximizada
				else if ((e.getNewState() & Frame.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH){
					textarea1.setText(textarea1.getText() + "VentanaMaximizada ");	
				}
			}
		});
	}

}