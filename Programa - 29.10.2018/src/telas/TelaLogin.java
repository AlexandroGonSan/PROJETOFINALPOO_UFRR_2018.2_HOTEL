package telas;
import br.com.hotel.hotel_sorriso.modelo.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin {

	private JFrame frmSistemaHotelSorriso;
	private JTextField txtAdasd;
	private JPasswordField passwordField;
	private int i;
	private SistemaInterno si;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.frmSistemaHotelSorriso.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unlikely-arg-type")
	private void initialize() {
		frmSistemaHotelSorriso = new JFrame();
		frmSistemaHotelSorriso.setForeground(Color.DARK_GRAY);
		frmSistemaHotelSorriso.setTitle("SISTEMA HOTEL SORRISO");
		frmSistemaHotelSorriso.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\MobileAPP\\Desktop\\WhatsApp Image 2018-09-14 at 21.21.29.jpeg"));
		frmSistemaHotelSorriso.getContentPane().setBackground(Color.DARK_GRAY);
		frmSistemaHotelSorriso.setBounds(100, 100, 821, 682);
		frmSistemaHotelSorriso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblHotelSorriso = new JLabel("HOTEL SORRISO");
		lblHotelSorriso.setForeground(Color.WHITE);
		lblHotelSorriso.setFont(new Font("Arial", Font.PLAIN, 75));
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 40));
		
		txtAdasd = new JTextField();
		txtAdasd.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdasd.setFont(new Font("Arial", Font.PLAIN, 16));
		txtAdasd.setToolTipText("");
		txtAdasd.setColumns(10);
		
		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 40));
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setEchoChar('*');
		passwordField.setFont(new Font("Arial", Font.PLAIN, 16));
		
		JButton btnEntrar = new JButton("ENTRAR");
		for(i=0;i<si.recepcionista.size();i++)
		{
			if(lblLogin.equals(si.recepcionista.get(i).getIdentificador()) && lblSenha.equals(si.recepcionista.get(i).getSenhaDeAcesso()))
			{
				btnEntrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
			}
		}
		
		GroupLayout groupLayout = new GroupLayout(frmSistemaHotelSorriso.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(92, Short.MAX_VALUE)
					.addComponent(lblHotelSorriso, GroupLayout.PREFERRED_SIZE, 625, GroupLayout.PREFERRED_SIZE)
					.addGap(86))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(342)
					.addComponent(lblLogin)
					.addContainerGap(426, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(336)
					.addComponent(lblSenha)
					.addContainerGap(416, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(307)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(passwordField, Alignment.TRAILING)
						.addComponent(txtAdasd, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
					.addContainerGap(395, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(367)
					.addComponent(btnEntrar)
					.addContainerGap(445, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblHotelSorriso, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblLogin)
					.addGap(18)
					.addComponent(txtAdasd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblSenha, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(88)
					.addComponent(btnEntrar)
					.addContainerGap(117, Short.MAX_VALUE))
		);
		frmSistemaHotelSorriso.getContentPane().setLayout(groupLayout);
		frmSistemaHotelSorriso.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmSistemaHotelSorriso.getContentPane(), lblHotelSorriso, lblLogin, lblSenha, passwordField, txtAdasd, btnEntrar}));
	}
}
