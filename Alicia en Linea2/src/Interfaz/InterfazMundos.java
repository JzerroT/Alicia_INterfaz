package Interfaz;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class InterfazMundos extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public InterfazMundos() {
		
		setBounds(100, 100, 800, 500);
		setBackground(new Color(143, 138, 210));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("MUNDO");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 326, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 91, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -346, SpringLayout.EAST, this);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 34));
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Selecciona un personaje:");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 110, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 60, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -362, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, 236, SpringLayout.WEST, this);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblNewLabel_1);
	}

}
