package Interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

import Metodo.Persona;

public class CrearPersonaje extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public CrearPersonaje() {
		JPanel contentPane = new JPanel();
		contentPane.setBounds(100, 100, 800, 500);

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JPanel panel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 15, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, contentPane);
		panel.setBackground(Color.CYAN);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, -5, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, 849, SpringLayout.WEST, contentPane);
		contentPane.add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblNewLabel = new JLabel("Crear Personaje");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 353, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel, 73, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, -274, SpringLayout.EAST, panel);
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 27));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Niv_Locura");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Secretos");
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel_2);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 211, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 111, SpringLayout.WEST, panel);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ubicación");
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_3, 111, SpringLayout.WEST, panel);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 88, SpringLayout.SOUTH, lblNewLabel_2);
		panel.add(lblNewLabel_3);
		
		//Ubicacion
		JSpinner spinner = new JSpinner();
		sl_panel.putConstraint(SpringLayout.NORTH, spinner, 311, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, spinner, 79, SpringLayout.EAST, lblNewLabel_3);
		sl_panel.putConstraint(SpringLayout.SOUTH, spinner, -120, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, spinner, 150, SpringLayout.EAST, lblNewLabel_3);
		panel.add(spinner);
		
		//Secretos
		JSpinner spinner_1 = new JSpinner();
		sl_panel.putConstraint(SpringLayout.NORTH, spinner_1, 202, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, spinner_1, 86, SpringLayout.EAST, lblNewLabel_2);
		sl_panel.putConstraint(SpringLayout.SOUTH, spinner_1, -229, SpringLayout.SOUTH, panel);
		panel.add(spinner_1);
		
		//Niv_Locura
		JSpinner spinner_2 = new JSpinner();
		sl_panel.putConstraint(SpringLayout.WEST, spinner_2, 69, SpringLayout.EAST, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.EAST, spinner_2, -522, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 9, SpringLayout.NORTH, spinner_2);
		sl_panel.putConstraint(SpringLayout.SOUTH, spinner_2, -327, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, spinner_2, 104, SpringLayout.NORTH, panel);
		panel.add(spinner_2);
		
		JButton btnNewButton = new JButton("CrearPersonaje");
		sl_panel.putConstraint(SpringLayout.EAST, spinner_1, -251, SpringLayout.WEST, btnNewButton);
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton, 136, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton, -271, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton, -164, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton, -136, SpringLayout.EAST, panel);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int niv_Locura = (int) spinner_2.getNextValue() - 1;
				int secretos = (int) spinner_1.getNextValue() - 1;
				int ubicacion = (int) spinner.getNextValue() - 1;
				
				Persona random = new Persona(secretos, ubicacion, niv_Locura);
			}
		});
		panel.add(btnNewButton);
	}

}
