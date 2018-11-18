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
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCheckOut extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCheckOut frame = new TelaCheckOut();
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
	public TelaCheckOut() {
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
		button.setEnabled(false);
		button.setBounds(143, 25, 113, 31);
		panel.add(button);
		
		JButton button_1 = new JButton("Check-in");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new TelaQuarto().setVisible(true);
			}
		});
		button_1.setBounds(20, 25, 113, 31);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Cadastro Cliente\r\n");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3, true), "Check-Out", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(0, 128, 128));
		panel_1.setBounds(10, 96, 564, 197);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAquiUmDia = new JLabel("AQUI UM DIA VAI FUNCIONAR O CHECK-OUT");
		lblAquiUmDia.setHorizontalAlignment(SwingConstants.CENTER);
		lblAquiUmDia.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblAquiUmDia.setBounds(10, 85, 544, 32);
		panel_1.add(lblAquiUmDia);
	}

}
