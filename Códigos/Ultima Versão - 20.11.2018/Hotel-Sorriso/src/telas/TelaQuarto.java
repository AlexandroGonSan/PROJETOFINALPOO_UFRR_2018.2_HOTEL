package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Container;

import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import br.com.hotel.hotel_sorriso.modelo.Quarto;
import br.com.hotel.hotel_sorriso.modelo.SistemaInterno;

import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class TelaQuarto extends JFrame {

	public SistemaInterno si = new SistemaInterno();
	private JFrame ourFrame = new JFrame("Pesquisa");
	private JFrame ourFrame_1 = new JFrame("checkin");
	private JPanel contentPane;
	private JTextField textQuarto;
	private JTextField cpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaQuarto frame = new TelaQuarto();
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
	public TelaQuarto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3, true), "Menu Principal", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(10, 11, 564, 74);
		contentPane.add(panel);
		
		JButton button = new JButton("Check-out\r\n");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new TelaCheckOut().setVisible(true);
			}
		});
		button.setBounds(143, 25, 113, 31);
		panel.add(button);
		
		JButton button_1 = new JButton("Check-in");
		button_1.setEnabled(false);
		button_1.setBounds(20, 25, 113, 31);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Cadastro Cliente\r\n");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new TelaCadastroCliente().setVisible(true);
			}
		});
		button_2.setBounds(266, 25, 138, 31);
		panel.add(button_2);
		
		JButton btnAdm = new JButton("ADM\r\n");
		btnAdm.setEnabled(false);
		btnAdm.setBounds(414, 25, 63, 31);
		panel.add(btnAdm);
		if(si.usuarioLogado.getAcesso() == 1) {
			btnAdm.setVisible(true);
		} else {
			btnAdm.setVisible(false);
		}
		
		JButton button_4 = new JButton("Sair");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new TelaLogin().setVisible(true);
			}
		});
		button_4.setBounds(487, 25, 67, 31);
		panel.add(button_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3, true), "Check-In", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(0, 128, 128));
		panel_1.setBounds(10, 96, 564, 305);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblQuarto = new JLabel("Quarto:");
		lblQuarto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQuarto.setBounds(168, 29, 73, 14);
		panel_1.add(lblQuarto);
		
		textQuarto = new JTextField();
		textQuarto.setEditable(false);
		textQuarto.setBounds(168, 54, 242, 25);
		panel_1.add(textQuarto);
		textQuarto.setColumns(10);
		
		JComboBox txtTipoQuarto = new JComboBox();
		txtTipoQuarto.setModel(new DefaultComboBoxModel(new String[] {"Simples", "Casal", "Presid\u00EAncial"}));
		txtTipoQuarto.setBounds(10, 54, 148, 25);
		panel_1.add(txtTipoQuarto);
		
		JSpinner indexQuarto = new JSpinner();
		indexQuarto.setBounds(525, 241, 29, 20);
		indexQuarto.setVisible(false);
		panel_1.add(indexQuarto);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				si.lerArquivoQuarto();
				Quarto quarto = si.buscarQuarto((String) txtTipoQuarto.getSelectedItem());
				if(quarto != null) {
					System.out.println("COLOCANDO INDEX : " + quarto.getNumero());
					indexQuarto.setValue(quarto.getNumero());
					textQuarto.setText("N° " + quarto.getNumero());
				}
			} 
		});
		btnProcurar.setBounds(420, 54, 134, 25);
		panel_1.add(btnProcurar);
		
		JLabel lblCliente = new JLabel("CLIENTE:");
		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCliente.setBounds(10, 90, 79, 14);
		panel_1.add(lblCliente);
		
		JFormattedTextField textCliente = new JFormattedTextField();
		textCliente.setEditable(false);
		textCliente.setBounds(10, 115, 400, 25);
		panel_1.add(textCliente);
		
		cpf = new JTextField();
		cpf.setEnabled(false);
		cpf.setBounds(468, 266, 86, 20);
		cpf.setVisible(false);
		panel_1.add(cpf);
		cpf.setColumns(10);
		
		ourFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ourFrame.setBounds(200, 100, 400, 200);
		
		Container container = ourFrame.getContentPane();
		container.setLayout(null);
		ourFrame.setVisible(false);
		
		JLabel logo = new JLabel("PESQUISA DE CLIENTE PELO CPF!");
		logo.setBounds(60,5,250,30);
		
		MaskFormatter mascaraCpf = null;
		
		try {
			mascaraCpf = new MaskFormatter("###.###.###-##");
			mascaraCpf.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JFormattedTextField textCpf = new JFormattedTextField(mascaraCpf);
		textCpf.setBounds(60, 40, 150, 25);
		
		JLabel erro = new JLabel("CPF NÃO ENCONTRADO!");
		erro.setBounds(60,65,250,30);
		erro.setVisible(false);
		

		JButton btnProcurarCliente = new JButton("Pesquisar");
		btnProcurarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				si.lerArquivo();
				String n = si.buscarCliente(textCpf.getText());
				cpf.setText(textCpf.getText());
				textCpf.setText("");
				if(!n.equals(" ")) {
					textCliente.setText(n);
					erro.setVisible(false);
					ourFrame.setVisible(false);
				} else {
					erro.setVisible(true);
				}
			}
		});
		btnProcurarCliente.setBounds(220, 40, 100, 25);
		
		JButton subBtn  = new JButton("Cancelar");
		subBtn.setBounds(150,90,100,30);
		subBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ourFrame.setVisible(false);
			}
		});
		
		container.add(logo);
		container.add(textCpf);
		container.add(btnProcurarCliente);
		container.add(erro);
		container.add(subBtn);
		
		JButton btnProcurar_1 = new JButton("Procurar");
		btnProcurar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ourFrame.setVisible(true);
				/*si.lerArquivo();
				String n = si.buscarCliente(textCliente.getText());
				textCliente.setText(n);*/
			}
		});
		btnProcurar_1.setBounds(420, 115, 134, 25);
		panel_1.add(btnProcurar_1);
		
		JLabel lblDirias = new JLabel("DI\u00C1RIAS:");
		lblDirias.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDirias.setBounds(10, 151, 79, 14);
		panel_1.add(lblDirias);
		
		JSpinner textDiaria = new JSpinner();
		textDiaria.setBounds(10, 176, 73, 25);
		panel_1.add(textDiaria);
		
		JLabel lblMtodoDePagamento = new JLabel("M\u00C9TODO DE PAGAMENTO:");
		lblMtodoDePagamento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtodoDePagamento.setBounds(110, 151, 204, 14);
		panel_1.add(lblMtodoDePagamento);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"D\u00E9bito", "Cr\u00E9dito", "Dinheiro"}));
		comboBox.setBounds(110, 176, 204, 25);
		panel_1.add(comboBox);
		
		ourFrame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ourFrame_1.setBounds(200, 100, 400, 200);
		
		Container containe_1 = ourFrame_1.getContentPane();
		containe_1.setLayout(null);
		ourFrame_1.setVisible(false);
		
		JLabel logo_1 = new JLabel("CONFIRMAÇÃO DE CHECK-IN!");
		logo_1.setBounds(60,5,250,30);
		
		JLabel quarto = new JLabel();
		quarto.setBounds(60,30,250,30);
		
		JLabel cliente = new JLabel();
		cliente.setBounds(60,50,250,30);
		
		JLabel preco = new JLabel();
		preco.setBounds(60,70,250,30);
		
		JButton btnCancel  = new JButton("Cancelar");
		btnCancel.setBounds(170,100,100,30);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ourFrame_1.setVisible(false);
			}
		});
		
		JButton btnConf = new JButton("Confirmar");
		btnConf.setBounds(60,100,100,30);
		btnConf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//System.out.println("INDEX : " + indexQuarto.getComponentCount());
				Quarto quarto = si.buscarQuarto((Integer) indexQuarto.getValue() - 1);
				quarto.setLocado(true);
				quarto.setDiasAlocado((Integer) textDiaria.getValue());
				quarto.setPrecoLocado();
				quarto.setCpfDoCliente(cpf.getText());
				si.escreverArquivoQuarto();
				textQuarto.setText("");
				textCliente.setText("");
				textDiaria.setValue(0);
				comboBox.setSelectedIndex(0);
		
				ourFrame_1.setVisible(false);
			}
		});
		
		containe_1.add(logo_1);
		containe_1.add(quarto);
		containe_1.add(cliente);
		containe_1.add(preco);
		containe_1.add(btnCancel);
		containe_1.add(btnConf);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Integer index = (Integer) indexQuarto.getValue() - 1;
				System.out.println("INDEX : " + index);
				Integer dias = (Integer) textDiaria.getValue();
				double precoTotal = si.quartos.get(index).getPreco() * dias; 
				//System.out.println("Diaria: " + textDiaria.getValue() + "Preço " + si.quartos.get(index).getPreco());
				quarto.setText("QUARTO: " + txtTipoQuarto.getSelectedItem() + " " + textQuarto.getText());
				cliente.setText("CLIENTE: " + textCliente.getText());
				preco.setText("DIÁRIA(S): " + dias + " dia(s) PREÇO: R$ " + precoTotal);
				ourFrame_1.setVisible(true);
			}
		});
		btnConfirmar.setBounds(10, 264, 99, 25);
		panel_1.add(btnConfirmar);
		
		
		JLabel lblTipo = new JLabel("TIPO:");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTipo.setBounds(10, 29, 53, 14);
		panel_1.add(lblTipo);
		
		
	}
}
