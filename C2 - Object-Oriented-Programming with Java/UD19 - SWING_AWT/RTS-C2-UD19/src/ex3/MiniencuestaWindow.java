package ex3;

import java.awt.Button;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.JButton;

public class MiniencuestaWindow {
	private JFrame frame;
	
	/**
	 * Create the application.
	 */
	public MiniencuestaWindow() {
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
		frame.setBounds(0, 0, 450, 300);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Elije un sistema operativo:");
		lblNewLabel.setBounds(22, -19, 296, 92);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Elije tu especialidad:");
		lblNewLabel_1.setBounds(244, 20, 246, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas en el ordenador:");
		lblNewLabel_2.setBounds(22, 147, 280, 14);
		frame.getContentPane().add(lblNewLabel_2);

		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setBounds(22, 40, 109, 23);
		frame.getContentPane().add(rdbtnWindows);
		rdbtnWindows.setSelected(true);

		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(22, 67, 109, 23);
		frame.getContentPane().add(rdbtnLinux);

		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(22, 93, 109, 23);
		frame.getContentPane().add(rdbtnMac);

		JCheckBox chckbxProgramacion = new JCheckBox("Programaci\u00F3n");
		chckbxProgramacion.setBounds(244, 40, 198, 23);
		frame.getContentPane().add(chckbxProgramacion);

		JCheckBox chckbxDiseno = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		chckbxDiseno.setBounds(244, 67, 183, 23);
		frame.getContentPane().add(chckbxDiseno);

		JCheckBox chckbxAdmin = new JCheckBox("Administraci\u00F3n");
		chckbxAdmin.setBounds(244, 93, 183, 23);
		frame.getContentPane().add(chckbxAdmin);

		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnWindows);
		grupo.add(rdbtnLinux);
		grupo.add(rdbtnMac);

		JSlider slider = new JSlider();
		slider.setMajorTickSpacing(1);
		slider.setSnapToTicks(true);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMaximum(10);
		slider.setBounds(22, 170, 200, 38);
		frame.getContentPane().add(slider);

		JButton btnMostrar = new JButton("Mostrar datos");
		btnMostrar.setBounds(269, 191, 158, 23);
		frame.getContentPane().add(btnMostrar);
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sist_op;
				StringBuilder especialidad = new StringBuilder();;
				int horas;
				
				if (rdbtnWindows.isSelected()) {
					sist_op = "Windows";
				} else if (rdbtnLinux.isSelected()) {
					sist_op = "Linux";
				} else {
					sist_op = "Mac";
				}
				
				if (chckbxProgramacion.isSelected()) {
					if (especialidad.length() > 0)
					{
						especialidad.append(", ");
					}
					
					especialidad.append("Programación");
				}
				
				if (chckbxAdmin.isSelected()) {
					if (especialidad.length() > 0)
					{
						especialidad.append(", ");
					}
					
					especialidad.append("Administración");
				} 
				
				if (chckbxDiseno.isSelected()) {
					if (especialidad.length() > 0)
					{
						especialidad.append(", ");
					}
					
					especialidad.append("Diseño");
				}
				
				horas = slider.getValue();
				
				if (especialidad.length() > 0)
				{
					JOptionPane.showMessageDialog(null, "El sistema operativo es: " + sist_op 
							+ "\nLa especialidad es: " + especialidad.toString() + "\nHoras dedicadas: " + horas);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "El sistema operativo es: " + sist_op 
							+ "\nNo se ha especificado especialidad" + "\nHoras dedicadas: " + horas);
				}
				
			}
				
		});
	}
}
