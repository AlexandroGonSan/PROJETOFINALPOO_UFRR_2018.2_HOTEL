package telas;
import br.com.hotel.hotel_sorriso.modelo.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import javax.swing.LayoutStyle.ComponentPlacement;

public class TelaLogin {

	private JFrame frmSistemaHotelSorriso;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	private SistemaInterno si;
	private Gerente g = new Gerente("Miller","1542");

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
		frmSistemaHotelSorriso.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaLogin.class.getResource("/telas/WhatsApp Image 2018-09-14 at 21.21.29.jpeg")));
		frmSistemaHotelSorriso.getContentPane().setBackground(Color.DARK_GRAY);
		frmSistemaHotelSorriso.setBounds(100, 100, 910, 730);
		frmSistemaHotelSorriso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblHotelSorriso = new JLabel("HOTEL SORRISO");
		lblHotelSorriso.setForeground(Color.WHITE);
		lblHotelSorriso.setFont(new Font("Arial", Font.PLAIN, 75));
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 40));
		
		txtLogin = new JTextField();
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogin.setFont(new Font("Arial", Font.PLAIN, 16));
		txtLogin.setToolTipText("");
		txtLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 40));
		
		txtSenha = new JPasswordField();
		txtSenha.setHorizontalAlignment(SwingConstants.CENTER);
		txtSenha.setEchoChar('*');
		txtSenha.setFont(new Font("Arial", Font.PLAIN, 16));
		
		JButton btnEntrar = new JButton("ENTRAR");
		

		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(si.checkLogingerente(txtLogin.getText(), new String (txtSenha.getPassword())))
				{
					JOptionPane.showMessageDialog(null, "BEM VINDO AO SISTEMA");
				}
				if(si.checkLoginrecepcionista(txtLogin.getText(), new String (txtSenha.getPassword())))
				{
					JOptionPane.showMessageDialog(null, "BEM VINDO AO SISTEMA");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "DADOS INVALIDOS");
				}
			}
		});
		GroupLayout groupLayout = new GroupLayout(frmSistemaHotelSorriso.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(150, Short.MAX_VALUE)
					.addComponent(lblHotelSorriso, GroupLayout.PREFERRED_SIZE, 625, GroupLayout.PREFERRED_SIZE)
					.addGap(117))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(380, Short.MAX_VALUE)
					.addComponent(lblSenha)
					.addGap(373))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(387, Short.MAX_VALUE)
					.addComponent(lblLogin)
					.addGap(382))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(354)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtSenha, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
						.addComponent(txtLogin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
					.addGap(349))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(392, Short.MAX_VALUE)
					.addComponent(btnEntrar, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addGap(384))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblHotelSorriso, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblLogin)
					.addGap(18)
					.addComponent(txtLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(73)
					.addComponent(lblSenha, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(82)
					.addComponent(btnEntrar, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(101, Short.MAX_VALUE))
		);
		frmSistemaHotelSorriso.getContentPane().setLayout(groupLayout);
		frmSistemaHotelSorriso.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{txtSenha, txtLogin, btnEntrar}));
		frmSistemaHotelSorriso.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmSistemaHotelSorriso.getContentPane(), lblHotelSorriso, lblLogin, lblSenha, txtSenha, txtLogin, btnEntrar}));
	}
}
