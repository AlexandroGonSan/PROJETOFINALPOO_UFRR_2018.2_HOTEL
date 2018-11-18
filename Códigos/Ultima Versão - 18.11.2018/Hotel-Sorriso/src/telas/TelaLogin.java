package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSistemaHotelSorriso = new JLabel("SISTEMA HOTEL SORRISO");
		lblSistemaHotelSorriso.setHorizontalAlignment(SwingConstants.CENTER);
		lblSistemaHotelSorriso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSistemaHotelSorriso.setBounds(151, 11, 304, 18);
		contentPane.add(lblSistemaHotelSorriso);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3, true), "Login", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(151, 78, 304, 259);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("USUARIO");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLogin.setBounds(112, 51, 82, 22);
		panel.add(lblLogin);
		
		textField = new JTextField();
		textField.setBounds(10, 84, 281, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSenha.setBounds(112, 125, 82, 14);
		panel.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 150, 281, 30);
		panel.add(passwordField);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				new TelaQuarto().setVisible(true);
			}
		});
		btnLogar.setBounds(112, 191, 82, 30);
		panel.add(btnLogar);
	}
}
