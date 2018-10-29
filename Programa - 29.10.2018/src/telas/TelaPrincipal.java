package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;

public class TelaPrincipal {

	private JFrame frmSistemaHotelSorriso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
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
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSistemaHotelSorriso = new JFrame();
		frmSistemaHotelSorriso.getContentPane().setBackground(Color.DARK_GRAY);
		frmSistemaHotelSorriso.setTitle("SISTEMA HOTEL SORRISO");
		frmSistemaHotelSorriso.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\MobileAPP\\Desktop\\WhatsApp Image 2018-09-14 at 21.21.29.jpeg"));
		frmSistemaHotelSorriso.setBounds(100, 100, 910, 730);
		frmSistemaHotelSorriso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
