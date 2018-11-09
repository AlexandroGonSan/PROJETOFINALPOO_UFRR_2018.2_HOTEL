import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JList;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DropMode;
import javax.swing.JSpinner;
import javax.swing.border.TitledBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Toolkit;

public class TelaQuarto extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Marksu Kaul\\Downloads\\pp.jpg"));
		setTitle("Hotel Sorriso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Menu", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JButton btnCadastrarCliente = new JButton("Cadastrar Cliente");
		
		JButton btnAlocarQuarto = new JButton("Check-In");
		btnAlocarQuarto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnCheckout = new JButton("Check-Out");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAlocarQuarto, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
						.addComponent(btnCheckout, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
						.addComponent(btnCadastrarCliente, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
						.addComponent(btnLogOut, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(btnAlocarQuarto, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCheckout, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCadastrarCliente)
					.addPreferredGap(ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
					.addComponent(btnLogOut)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Check-In", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setLayout(null);
		
		JLabel lblQuartos = new JLabel("Quartos");
		lblQuartos.setBounds(10, 23, 46, 14);
		panel_1.add(lblQuartos);
		
		textField = new JTextField();
		textField.setBounds(10, 44, 239, 23);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(10, 78, 46, 14);
		panel_1.add(lblCliente);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 103, 239, 24);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDiria = new JLabel("Di\u00E1rias");
		lblDiria.setBounds(10, 135, 46, 14);
		panel_1.add(lblDiria);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(10, 160, 56, 23);
		panel_1.add(spinner);
		
		JLabel lblMtodoDePagamento = new JLabel("M\u00E9todo de Pagamento");
		lblMtodoDePagamento.setBounds(99, 134, 143, 14);
		panel_1.add(lblMtodoDePagamento);
		
		JRadioButton rdbtnCrdito = new JRadioButton("Cr\u00E9dito");
		buttonGroup_1.add(rdbtnCrdito);
		rdbtnCrdito.setBounds(99, 155, 109, 23);
		panel_1.add(rdbtnCrdito);
		
		JRadioButton rdbtnDbito = new JRadioButton("D\u00E9bito");
		buttonGroup_1.add(rdbtnDbito);
		rdbtnDbito.setBounds(99, 181, 109, 23);
		panel_1.add(rdbtnDbito);
		
		JRadioButton rdbtnDinheiro = new JRadioButton("Dinheiro");
		buttonGroup_1.add(rdbtnDinheiro);
		rdbtnDinheiro.setBounds(99, 209, 109, 23);
		panel_1.add(rdbtnDinheiro);
		
		JButton btnNewButton = new JButton("Procurar");
		btnNewButton.setBounds(259, 44, 100, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Procurar");
		btnNewButton_1.setBounds(259, 104, 100, 23);
		panel_1.add(btnNewButton_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(10, 253, 109, 23);
		panel_1.add(btnConfirmar);
		contentPane.setLayout(gl_contentPane);
	}
}