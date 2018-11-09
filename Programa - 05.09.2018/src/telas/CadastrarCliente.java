import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;

public class CadastrarCliente {

	private JFrame frmSistemaHotelSorriso;
	private JTextField nome;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex ) {
			System.err.println(ex);
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarCliente window = new CadastrarCliente();
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
	public CadastrarCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSistemaHotelSorriso = new JFrame();
		frmSistemaHotelSorriso.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Marksu Kaul\\Downloads\\pp.jpg"));
		frmSistemaHotelSorriso.setTitle("Sistema Hotel Sorriso");
		frmSistemaHotelSorriso.getContentPane().setForeground(Color.BLACK);
		frmSistemaHotelSorriso.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("Cadastrar Cliente");
		panel.setBorder(new TitledBorder(null, "Cadastro de Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(216, 11, 382, 292);
		frmSistemaHotelSorriso.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNomeCompleto = new JLabel("Nome Completo:");
		lblNomeCompleto.setBounds(10, 23, 104, 17);
		panel.add(lblNomeCompleto);
		lblNomeCompleto.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNomeCompleto.setForeground(Color.BLACK);
		
		nome = new JTextField();
		nome.setToolTipText("Nome");
		nome.setBounds(10, 39, 362, 20);
		panel.add(nome);
		nome.setColumns(10);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(10, 70, 29, 14);
		panel.add(lblRg);
		lblRg.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblRg.setForeground(Color.BLACK);
		
		textField_1 = new JTextField();
		textField_1.setBounds(117, 86, 97, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 86, 97, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(118, 70, 29, 14);
		panel.add(lblCpf);
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCpf.setForeground(Color.BLACK);
		
		JLabel lblNacionalidade = new JLabel("Nacionalidade:\r\n");
		lblNacionalidade.setBounds(224, 70, 97, 14);
		panel.add(lblNacionalidade);
		lblNacionalidade.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNacionalidade.setForeground(Color.BLACK);
		lblNacionalidade.setToolTipText("Nacionalidade:");
		
		textField_4 = new JTextField();
		textField_4.setBounds(224, 86, 148, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Nascimento:\r\n");
		lblDataDeNascimento.setBounds(10, 115, 76, 14);
		panel.add(lblDataDeNascimento);
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDataDeNascimento.setForeground(Color.BLACK);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 132, 97, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(117, 115, 49, 14);
		panel.add(lblGenero);
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblGenero.setForeground(Color.BLACK);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(117, 132, 97, 20);
		panel.add(comboBox);
		comboBox.setForeground(Color.BLACK);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino", "Outros"}));
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(223, 115, 56, 14);
		panel.add(lblTelefone);
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTelefone.setForeground(Color.BLACK);
		
		textField_5 = new JTextField();
		textField_5.setBounds(224, 132, 148, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 163, 36, 14);
		panel.add(lblEmail);
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_6 = new JTextField();
		textField_6.setBounds(10, 181, 362, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(260, 258, 112, 23);
		panel.add(btnCadastrar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 240, 240));
		panel_1.setBorder(new TitledBorder(null, "Menu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 11, 200, 292);
		frmSistemaHotelSorriso.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnCheckin = new JButton("Check-In");
		btnCheckin.setBounds(10, 23, 180, 23);
		panel_1.add(btnCheckin);
		
		JButton btnCheckout = new JButton("Check-Out");
		btnCheckout.setBounds(10, 57, 180, 23);
		panel_1.add(btnCheckout);
		
		JButton btnCadastrarCliente = new JButton("Cadastrar Cliente");
		btnCadastrarCliente.setBounds(10, 90, 180, 23);
		panel_1.add(btnCadastrarCliente);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(10, 258, 180, 23);
		panel_1.add(btnLogout);
		frmSistemaHotelSorriso.setBounds(100, 100, 624, 353);
		frmSistemaHotelSorriso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}