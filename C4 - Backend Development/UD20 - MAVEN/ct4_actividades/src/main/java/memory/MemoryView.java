package memory;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MemoryView {
	
	private Color fondo= new Color(15,16,46);
	private Color borde= new Color(181,148,0);
	private JFrame frame;
	private JPanel panelTabla;
	private Hashtable<Integer, JButton> buttons = new Hashtable<Integer, JButton>();
	private Hashtable<Integer, Casilla> casillas = new Hashtable<Integer, Casilla>();
	private Memory memory = new Memory();
	private ArrayList<Casilla> casillasList= memory.getCasillas();
	private int casillaSeleccionada = -1;
	
	byte activas = 0;
	byte casillasTotales = 16;
	
	private JLabel numIntentos;
	
	/**
	 * Create the application.
	 */
	public MemoryView() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(fondo);
		frame.setBounds(100, 100, 720, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		panelTabla = new JPanel();
		panelTabla.setBackground(fondo);
		panelTabla.setBounds(35, 35, 620, 620);
		frame.getContentPane().add(panelTabla);
		panelTabla.setLayout(new GridLayout(0, 4, 5, 5));
		
		JLabel textIntentoslbl = new JLabel("Intentos:");
		textIntentoslbl.setForeground(Color.WHITE);
		textIntentoslbl.setBounds(45, 8, 70, 15);
		frame.getContentPane().add(textIntentoslbl);
		
		numIntentos = new JLabel("0");
		numIntentos.setForeground(Color.WHITE);
		numIntentos.setBounds(127, 8, 70, 15);
		frame.getContentPane().add(numIntentos);

		createDeck();
		imagenesCasillas();
	}

	
	/**
	 * Creates the deck and adds actionListener to each button
	 */
	private void createDeck() {
		for(int i = 0; i<16; i++) {
			int id=i;
			JButton btnDeck = new JButton("");
			btnDeck.setBorder(BorderFactory.createLineBorder(borde, 2));
			btnDeck.setOpaque(false);
			btnDeck.setContentAreaFilled(false);
			panelTabla.add(btnDeck);
			buttons.put(i, btnDeck);

			casillas.put(i, casillasList.get(i));
			btnDeck.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					if(!(casillaSeleccionada == id) && activas < 2) {
						activas++;
						if(casillaSeleccionada == -1) {
							casillaSeleccionada = id;
							mostrarCarta(id);
						}else {
							mostrarCarta(id);
							Timer timer = new Timer(1000 /* Milisegundos */, new ActionListener(){
							    public void actionPerformed( ActionEvent e ){

							    	if(casillas.get(id).compararCasilla(casillas.get(casillaSeleccionada))) {
										buttons.get(id).setVisible(false);
										buttons.get(casillaSeleccionada).setVisible(false);
										buttons.get(casillaSeleccionada).setEnabled(false);
										buttons.get(id).setEnabled(false);
										activas -= 2;
										int intentos = (Integer.parseInt(numIntentos.getText()));
										intentos++;
										numIntentos.setText(String.valueOf((intentos)));
										casillasTotales -= 2;
									}else {
										ocultarCarta(casillaSeleccionada);
										ocultarCarta(id);
										activas -= 2;
										int intentos = (Integer.parseInt(numIntentos.getText()));
										intentos++;
										numIntentos.setText(String.valueOf((intentos)));
									}
									casillaSeleccionada = -1;
									
									if (casillasTotales == 0)
									{
										JOptionPane.showMessageDialog(null, "Has ganado la partida!");
										System.exit(0);
									}
									
								}
							    }
							);
							timer.setRepeats(false);
							timer.start();
							
					}
				}
			}
			});
		}
	}

	
	/**
	 * Shows the image of the card
	 * @param id
	 */
	private void mostrarCarta(int id) {
		int size = panelTabla.getHeight()/4;
		ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource(casillas.get(id).getCarta().getImagen()));
		Image image = imageIcon.getImage();
		Image newimg;


		newimg = image.getScaledInstance(size, size,  java.awt.Image.SCALE_SMOOTH);
		buttons.get(id).setIcon(new ImageIcon(newimg));

	}

	/**
	 * Hides the image of the card and changes it for the default back
	 * @param id
	 */
	private void ocultarCarta(int id) {
		int size = panelTabla.getHeight()/4;
		ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("images/memoryBack.jpg"));
		Image image = imageIcon.getImage();
		Image newimg;


		newimg = image.getScaledInstance(size, size,  java.awt.Image.SCALE_SMOOTH);
		buttons.get(id).setIcon(new ImageIcon(newimg));

	}

	
	/**
	 * Sets the back as the image of the cards 
	 */
	private void imagenesCasillas() {
		Component[] components = panelTabla.getComponents();
		int size = panelTabla.getHeight()/4;
		ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("images/memoryBack.jpg"));
		Image image = imageIcon.getImage();
		Image newimg;

		for (int i = 0; i < components.length; i++) {
			newimg = image.getScaledInstance(size, size,  java.awt.Image.SCALE_SMOOTH);
			((JButton) components[i]).setIcon(new ImageIcon(newimg));
		}

	}
}
