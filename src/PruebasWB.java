import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.UIManager;

public class PruebasWB extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private DefaultComboBoxModel<ClasePruebaCombo> dcbm;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebasWB frame = new PruebasWB();
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
	public PruebasWB() {
		setBackground(UIManager.getColor("Button.background"));
		inicializar();
	}

	private void inicializar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new PanelImagen(400, 300);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBorder(new LineBorder(Color.BLACK, 3, true));
		btnNewButton_1.setIcon(new ImageIcon(PruebasWB.class.getResource("/img/toque.png")));
		btnNewButton_1.setBounds(211, 11, 60, 60);
		contentPane.add(btnNewButton_1);
		
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(PruebasWB.class.getResource("/img/like.png")));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnNewButton.setBounds(108, 11, 60, 60);
		contentPane.add(btnNewButton);
		
		comboBox = new JComboBox();
		cargarCombo();
		comboBox.setBounds(108, 114, 163, 20);
		contentPane.add(comboBox);
		
		setSize(400,300);
		setLocationRelativeTo(null);
	}

	private void cargarCombo() {
		dcbm = new DefaultComboBoxModel<ClasePruebaCombo>();
		
		ClasePruebaCombo cpc = new ClasePruebaCombo(1, "Descripcion 1");
		dcbm.addElement(cpc);
		
		cpc = new ClasePruebaCombo(2, "Descripcion 2");
		dcbm.addElement(cpc);
		
		cpc = new ClasePruebaCombo(3, "Descripcion 3");
		dcbm.addElement(cpc);
		
		comboBox.setModel(dcbm);
		
	}
	
	
}
