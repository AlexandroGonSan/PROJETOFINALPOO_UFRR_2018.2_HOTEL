package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import br.com.hotel.hotel_sorriso.modelo.Cliente;
import br.com.hotel.hotel_sorriso.modelo.Quarto;
import br.com.hotel.hotel_sorriso.modelo.SistemaInterno;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.Popup;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;

import java.awt.Container;

public class TelaCadastroCliente extends JFrame {

	public SistemaInterno si = new SistemaInterno();
	private JFrame ourFrame = new JFrame("Aviso");
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textRg;
	private JTextField textNacionalidade;
	private JTextField textEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroCliente frame = new TelaCadastroCliente();
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
	public TelaCadastroCliente() {
		setTitle("Sistema Hotel Sorriso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3, true), "Menu Principal", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 564, 74);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnCheckout = new JButton("Check-out\r\n");
		btnCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new TelaCheckOut().setVisible(true);
			}
		});
		btnCheckout.setBounds(143, 25, 113, 31);
		panel.add(btnCheckout);
		
		JButton btnCheckin = new JButton("Check-in");
		btnCheckin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new TelaQuarto().setVisible(true);
			}
		});
		btnCheckin.setBounds(20, 25, 113, 31);
		panel.add(btnCheckin);
		
		JButton btnCadastroCliente = new JButton("Cadastro Cliente\r\n");
		btnCadastroCliente.setEnabled(false);
		btnCadastroCliente.setBounds(266, 25, 138, 31);
		panel.add(btnCadastroCliente);
		
		JButton btnAdm = new JButton("ADM\r\n");
		btnAdm.setEnabled(false);
		btnAdm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAdm.setBounds(414, 25, 63, 31);
		panel.add(btnAdm);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new TelaLogin().setVisible(true);
			}
		});
		btnSair.setBounds(487, 25, 67, 31);
		panel.add(btnSair);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3, true), "Cadastro de Cliente", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(0, 128, 128));
		panel_1.setBounds(10, 109, 564, 340);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNomeCompleto = new JLabel("Nome Completo:");
		lblNomeCompleto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeCompleto.setBounds(10, 44, 135, 14);
		panel_1.add(lblNomeCompleto);
		
		textNome = new JTextField();
		textNome.setBounds(10, 69, 544, 25);
		panel_1.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRg.setBounds(10, 105, 36, 14);
		panel_1.add(lblRg);
		
		textRg = new JTextField();
		textRg.setBounds(10, 130, 110, 25);
		panel_1.add(textRg);
		textRg.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCpf.setBounds(143, 105, 46, 14);
		panel_1.add(lblCpf);
		
		MaskFormatter mascaraCpf = null;
		MaskFormatter mascaraNascimento = null;
		MaskFormatter mascaraTelefone = null;
		
		try {
			mascaraCpf = new MaskFormatter("###.###.###-##");
			mascaraNascimento = new MaskFormatter("##/##/####");
			mascaraTelefone = new MaskFormatter("(##)#####-####");
			mascaraCpf.setPlaceholderCharacter('_');
			mascaraNascimento.setPlaceholderCharacter('_');
			mascaraTelefone.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}
		JFormattedTextField textCpf = new JFormattedTextField(mascaraCpf);
		textCpf.setBounds(143, 130, 110, 25);
		panel_1.add(textCpf);
		
		JLabel lblNacionalidade = new JLabel("NACIONALIDADE:");
		lblNacionalidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNacionalidade.setBounds(279, 105, 148, 14);
		panel_1.add(lblNacionalidade);
		
		textNacionalidade = new JTextField();
		textNacionalidade.setBounds(279, 130, 275, 25);
		panel_1.add(textNacionalidade);
		textNacionalidade.setColumns(10);
		
		JLabel lblNascimento = new JLabel("NASCIMENTO:");
		lblNascimento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNascimento.setBounds(10, 166, 110, 14);
		panel_1.add(lblNascimento);
		
		JFormattedTextField textNascimento = new JFormattedTextField(mascaraNascimento);
		textNascimento.setBounds(10, 191, 110, 25);
		panel_1.add(textNascimento);
		
		JLabel lblGenero = new JLabel("GENERO:");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGenero.setBounds(143, 166, 95, 14);
		panel_1.add(lblGenero);
		
		JComboBox boxGenero = new JComboBox();
		boxGenero.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino", "Outros"}));
		boxGenero.setBounds(143, 191, 110, 25);
		panel_1.add(boxGenero);
		
		JLabel lblTelefone = new JLabel("TELEFONE:");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTelefone.setBounds(279, 166, 135, 14);
		panel_1.add(lblTelefone);
		
		JFormattedTextField textTelefone = new JFormattedTextField(mascaraTelefone);
		textTelefone.setBounds(279, 191, 275, 25);
		panel_1.add(textTelefone);
		
		JLabel lblEmail = new JLabel("EMAIL:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(10, 227, 72, 14);
		panel_1.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(10, 252, 544, 25);
		panel_1.add(textEmail);
		textEmail.setColumns(10);
		
		ourFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ourFrame.setBounds(200, 100, 400, 200);
		
		Container container = ourFrame.getContentPane();
		container.setLayout(null);
		ourFrame.setVisible(false);
		
		JLabel logo = new JLabel("CADASTRO REALIZADO COM SUCESSO!");
		logo.setBounds(60,5,250,30);
		
		JButton subBtn  = new JButton("OK");
		subBtn.setBounds(150,90,100,30);
		subBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				ourFrame.setVisible(false);
				new TelaQuarto().setVisible(true);
			}
		});
		
		container.add(logo);
		container.add(subBtn);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//si.lerArquivo();
				Cliente cliente = new Cliente();
				cliente.setNome(textNome.getText());
				cliente.setCpf(textCpf.getText());
				cliente.setDataDeNascimento(textNascimento.getText());
				cliente.setEmail(textEmail.getText());
				cliente.setNacionalidade(textNacionalidade.getText());
				cliente.setGenero(boxGenero.getActionCommand());
				cliente.setNacionalidade(textNacionalidade.getText());
				
				
				si.clientes.add(cliente);
				si.escreverArquivo();
				
				ourFrame.setVisible(true);
			}
		});
		btnCadastrar.setBounds(444, 288, 110, 30);
		panel_1.add(btnCadastrar);
	}
}
