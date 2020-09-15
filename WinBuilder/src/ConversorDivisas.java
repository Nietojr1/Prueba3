import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;

public class ConversorDivisas extends JFrame {

	private JPanel pnlContenedor;
	private JTextField txtDolares;
	private JTextField txtEuros;
	private JTextField txtPesos;
	double Pesos = 0.0;
	double Dolares = 0.0;
	double Euros = 0.0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorDivisas frame = new ConversorDivisas();
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
	public ConversorDivisas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ConversorDivisas.class.getResource("/Imagenes/moneda.png")));
		setTitle("Converor de Divisas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		pnlContenedor = new JPanel();
		pnlContenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnlContenedor);
		pnlContenedor.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dolares");
		lblNewLabel.setBounds(10, 11, 46, 14);
		pnlContenedor.add(lblNewLabel);
		
		txtDolares = new JTextField();
		txtDolares.setBounds(118, 8, 86, 20);
		pnlContenedor.add(txtDolares);
		txtDolares.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Euros");
		lblNewLabel_1.setBounds(10, 52, 86, 14);
		pnlContenedor.add(lblNewLabel_1);
		
		txtEuros = new JTextField();
		txtEuros.setBounds(118, 49, 86, 20);
		pnlContenedor.add(txtEuros);
		txtEuros.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Pesos");
		lblNewLabel_2.setBounds(10, 97, 46, 14);
		pnlContenedor.add(lblNewLabel_2);
		
		txtPesos = new JTextField();
		txtPesos.setEditable(false);
		txtPesos.setForeground(Color.RED);
		txtPesos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtPesos.setText("");
		txtPesos.setBounds(118, 94, 112, 20);
		pnlContenedor.add(txtPesos);
		txtPesos.setColumns(10);
		
		JButton btnDolarPesos = new JButton("Dolar a Pesos");
		btnDolarPesos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Dolares = Double.parseDouble(txtDolares.getText());
					Pesos  = Dolares * 3782.00;
					txtPesos.setText(""+ Pesos);
				}catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error de datos");
					
				}
				
				
				
			}
		});
		btnDolarPesos.setBounds(239, 11, 142, 23);
		pnlContenedor.add(btnDolarPesos);
		
		JButton btnEuroPesos = new JButton("Euros a PesosSSSSSSSS");
		btnEuroPesos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Euros = Double.parseDouble(txtEuros.getText());
					Pesos  = Euros * 4466.49;
					txtPesos.setText(""+ Pesos);
				}catch (Exception x) {
					JOptionPane.showMessageDialog(null, "Error de datos");
					
				}
				
				
				
				
			}
		});
		btnEuroPesos.setBounds(239, 48, 142, 23);
		pnlContenedor.add(btnEuroPesos);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(118, 180, 238, 20);
		pnlContenedor.add(comboBox);
	}
}
