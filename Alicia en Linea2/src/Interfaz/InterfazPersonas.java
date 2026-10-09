package Interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpringLayout;

import Metodo.Mundo;
import Metodo.Persona;

public class InterfazPersonas extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private Mundo m;
	private int id;
	JSpinner spinner_Id = new JSpinner();
	/**
	 * Create the panel.
	 */
	public void idSeleccionado() {
		id = (int) spinner_Id.getValue();
	}
	public Persona encontrarPersona() {
		for(Persona p : m.getLosPersonajes()) {
			if(p.getId() == id) {
				return p;
			}
		}
		return null;
	}
	
	public InterfazPersonas(Mundo m) {
		this.m = m;
		setBackground(Color.GREEN);
		setBounds(100, 100, 800, 500);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("PERSONAJE");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -229, SpringLayout.EAST, this);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Selecciona un personaje:");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 112, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 55, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -322, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, 238, SpringLayout.WEST, this);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblNewLabel_1);
		
		springLayout.putConstraint(SpringLayout.NORTH, spinner_Id, 112, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, spinner_Id, -322, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 16, SpringLayout.WEST, spinner_Id);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -19, SpringLayout.NORTH, spinner_Id);
		springLayout.putConstraint(SpringLayout.WEST, spinner_Id, 6, SpringLayout.EAST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, spinner_Id, 310, SpringLayout.WEST, this);
		add(spinner_Id);
		
		JLabel lblNewLabel_2 = new JLabel("");
		add(lblNewLabel_2);
		
		
		JButton btnEstaMaravillado = new JButton("Esta en el mundo marravilla?");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 12, SpringLayout.NORTH, btnEstaMaravillado);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_2, 68, SpringLayout.EAST, btnEstaMaravillado);
		btnEstaMaravillado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(encontrarPersona().determinarUbicacion()) {
					lblNewLabel_2.setText("Este Personaje esta en maravila");
				}else {
					lblNewLabel_2.setText("Este Personaje no esta en maravila");
				}
				
				
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnEstaMaravillado, 0, SpringLayout.WEST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, btnEstaMaravillado, -187, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnEstaMaravillado, -421, SpringLayout.EAST, this);
		btnEstaMaravillado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		add(btnEstaMaravillado);
		
		JButton btnConfirmarFuncin = new JButton("Embellecer");
		springLayout.putConstraint(SpringLayout.NORTH, btnConfirmarFuncin, 31, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, btnConfirmarFuncin, -252, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, btnEstaMaravillado, 26, SpringLayout.SOUTH, btnConfirmarFuncin);
		springLayout.putConstraint(SpringLayout.WEST, btnConfirmarFuncin, 55, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnConfirmarFuncin, -503, SpringLayout.EAST, this);
		btnConfirmarFuncin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		add(btnConfirmarFuncin);
		
		JButton btnEsLindo = new JButton("Es lindo?");
		springLayout.putConstraint(SpringLayout.NORTH, btnEsLindo, 29, SpringLayout.SOUTH, btnEstaMaravillado);
		springLayout.putConstraint(SpringLayout.WEST, btnEsLindo, 0, SpringLayout.WEST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, btnEsLindo, -119, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnEsLindo, 122, SpringLayout.WEST, lblNewLabel_1);
		add(btnEsLindo);
		
		
		JButton btnEsNormal = new JButton("Es normal?");
		springLayout.putConstraint(SpringLayout.NORTH, btnEsNormal, 22, SpringLayout.SOUTH, btnEsLindo);
		springLayout.putConstraint(SpringLayout.WEST, btnEsNormal, 0, SpringLayout.WEST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, btnEsNormal, 129, SpringLayout.SOUTH, btnEstaMaravillado);
		springLayout.putConstraint(SpringLayout.EAST, btnEsNormal, 0, SpringLayout.EAST, btnEsLindo);
		add(btnEsNormal);
		
		JButton btnPersonaSeleccionado = new JButton("Seleccionado");
		springLayout.putConstraint(SpringLayout.NORTH, btnPersonaSeleccionado, 13, SpringLayout.NORTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.WEST, btnPersonaSeleccionado, 64, SpringLayout.EAST, spinner_Id);
		springLayout.putConstraint(SpringLayout.SOUTH, btnPersonaSeleccionado, -8, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, btnPersonaSeleccionado, -17, SpringLayout.EAST, lblNewLabel_2);
		add(btnPersonaSeleccionado);
		
		JLabel lblNewLabel_3 = new JLabel("Seleccionado Correctamente");
		lblNewLabel_3.setVisible(false);
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 47, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_3, 49, SpringLayout.EAST, btnPersonaSeleccionado);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, 61, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_3, 201, SpringLayout.EAST, btnPersonaSeleccionado);
		add(lblNewLabel_3);
		
		
		btnPersonaSeleccionado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idSeleccionado();
				lblNewLabel_3.setVisible(true);
				
			}
		});
	}
}
