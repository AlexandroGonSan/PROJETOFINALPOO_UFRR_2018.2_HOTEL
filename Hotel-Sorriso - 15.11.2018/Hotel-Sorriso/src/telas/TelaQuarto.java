package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
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
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class TelaQuarto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		
		JButton button_3 = new JButton("ADM\r\n");
		button_3.setEnabled(false);
		button_3.setBounds(414, 25, 63, 31);
		panel.add(button_3);
		
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
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(168, 54, 242, 25);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setBounds(420, 54, 134, 25);
		panel_1.add(btnProcurar);
		
		JLabel lblCliente = new JLabel("CLIENTE:");
		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCliente.setBounds(10, 90, 79, 14);
		panel_1.add(lblCliente);
		
		JButton btnProcurar_1 = new JButton("Procurar");
		btnProcurar_1.setBounds(420, 115, 134, 25);
		panel_1.add(btnProcurar_1);
		
		JLabel lblDirias = new JLabel("DI\u00C1RIAS:");
		lblDirias.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDirias.setBounds(10, 151, 79, 14);
		panel_1.add(lblDirias);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(10, 176, 73, 25);
		panel_1.add(spinner);
		
		JLabel lblMtodoDePagamento = new JLabel("M\u00C9TODO DE PAGAMENTO:");
		lblMtodoDePagamento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtodoDePagamento.setBounds(110, 151, 204, 14);
		panel_1.add(lblMtodoDePagamento);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"D\u00E9bito", "Cr\u00E9dito", "Dinheiro"}));
		comboBox.setBounds(110, 176, 204, 25);
		panel_1.add(comboBox);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(10, 264, 99, 25);
		panel_1.add(btnConfirmar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 128));
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Informa\u00E7\u00F5es da Compra", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_2.setBounds(346, 151, 208, 88);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblValorDaDiria = new JLabel("Valor da di\u00E1ria:");
		lblValorDaDiria.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblValorDaDiria.setBounds(10, 30, 90, 14);
		panel_2.add(lblValorDaDiria);
		
		JLabel lblValorFinal = new JLabel("Valor  final:");
		lblValorFinal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblValorFinal.setBounds(10, 55, 72, 14);
		panel_2.add(lblValorFinal);
		
		JLabel lblR = new JLabel("R$0,00");
		lblR.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblR.setBounds(102, 30, 98, 14);
		panel_2.add(lblR);
		
		JLabel lblR_1 = new JLabel("R$0,00");
		lblR_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblR_1.setBounds(81, 56, 117, 14);
		panel_2.add(lblR_1);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(10, 115, 400, 25);
		panel_1.add(formattedTextField);
		
		JLabel lblTipo = new JLabel("TIPO:");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTipo.setBounds(10, 29, 53, 14);
		panel_1.add(lblTipo);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Simples", "Casal", "Presid\u00EAncial"}));
		comboBox_1.setBounds(10, 54, 148, 25);
		panel_1.add(comboBox_1);
	}
}
