package ejercicio2;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EX2_Botones {

	private JFrame frmVentanaConInteraccin;


	/**
	 * Create the application.
	 */
	public EX2_Botones() {
		initialize();
		frmVentanaConInteraccin.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVentanaConInteraccin = new JFrame();
		frmVentanaConInteraccin.setTitle("Ventana con interacción");
		frmVentanaConInteraccin.setBounds(100, 100, 450, 300);
		frmVentanaConInteraccin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentanaConInteraccin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Has pulsado:");
		lblNewLabel.setBounds(10, 15, 89, 14);
		frmVentanaConInteraccin.getContentPane().add(lblNewLabel);
		
		final JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(96, 15, 78, 14);
		frmVentanaConInteraccin.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Botón 1");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_1.setText("Botón 1");
			}
		});
		btnNewButton.setBounds(204, 11, 89, 23);
		frmVentanaConInteraccin.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Botón 2");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_1.setText("Botón 2");
			}
		});
		btnNewButton_1.setBounds(303, 11, 89, 23);
		frmVentanaConInteraccin.getContentPane().add(btnNewButton_1);
			
	}
}