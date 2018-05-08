package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Rectangle;

public class UI extends JFrame {

	protected JPanel contentPane;
	protected JTextField textRuta;
	protected JTextArea textBusqueda;
	protected JButton btnBuscar;
	private JTextField txtBuscador;

	public UI() {
		setMinimumSize(new Dimension(700, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		textBusqueda = new JTextArea();
		textBusqueda.setEditable(false);
		textBusqueda.setBackground(new Color(192, 192, 192));
		//Estamos poniendo la barra pra bajar y subir
		JScrollPane barraVertical = new JScrollPane(textBusqueda);
		contentPane.add(barraVertical, BorderLayout.CENTER);
		
		txtBuscador = new JTextField();
		txtBuscador.setForeground(new Color(255, 255, 255));
		txtBuscador.setBackground(new Color(128, 0, 0));
		txtBuscador.setEditable(false);
		txtBuscador.setFont(new Font("Arial", Font.BOLD, 57));
		txtBuscador.setHorizontalAlignment(SwingConstants.CENTER);
		txtBuscador.setText("BUSCADOR");
		barraVertical.setColumnHeaderView(txtBuscador);
		txtBuscador.setColumns(10);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));

		textRuta = new JTextField();
		panel.add(textRuta, BorderLayout.CENTER);
		textRuta.setColumns(10);

		btnBuscar = new JButton("GO !");
		btnBuscar.setForeground(new Color(255, 255, 255));
		btnBuscar.setFont(new Font("Arial", Font.BOLD, 11));
		btnBuscar.setBackground(new Color(178, 34, 34));
		panel.add(btnBuscar, BorderLayout.EAST);

	}

}
