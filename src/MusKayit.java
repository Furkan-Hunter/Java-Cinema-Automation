import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class MusKayit extends JFrame {
	JPanel panel=new JPanel();
	
	public static void main(String[] args) {
			
	}
	
	public MusKayit() {
		setTitle("Sine Go");
		setSize(350,400);
		setLocation(600,200);
		panel.setBackground(new Color(51, 51, 51));
		panel.setLayout(null);
		getContentPane().add(panel);
		
		JLabel lblAd = new JLabel("ADI:*");
		lblAd.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblAd.setForeground(new Color(255, 204, 0));
		lblAd.setBounds(79, 74, 32, 14);
		panel.add(lblAd);
		
		JLabel lblSoyad = new JLabel("SOYADI:*");
		lblSoyad.setForeground(new Color(255, 204, 0));
		lblSoyad.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblSoyad.setBounds(56, 116, 55, 14);
		panel.add(lblSoyad);
		
		JLabel lblEposta = new JLabel("E-POSTA:");
		lblEposta.setForeground(new Color(255, 204, 0));
		lblEposta.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblEposta.setBounds(56, 158, 55, 14);
		panel.add(lblEposta);
		
		JLabel lblKullancAd = new JLabel("KULLANICI ADI:*");
		lblKullancAd.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblKullancAd.setForeground(new Color(255, 204, 0));
		lblKullancAd.setBounds(10, 201, 101, 14);
		panel.add(lblKullancAd);
		
		JLabel lblifre = new JLabel("\u015E\u0130FRE:*");
		lblifre.setForeground(new Color(255, 204, 0));
		lblifre.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblifre.setBounds(60, 242, 46, 14);
		panel.add(lblifre);
		
		lblMteriKayt = new JLabel("M\u00FC\u015Fteri Kay\u0131t");
		lblMteriKayt.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblMteriKayt.setForeground(new Color(255, 204, 0));
		lblMteriKayt.setHorizontalAlignment(SwingConstants.CENTER);
		lblMteriKayt.setBounds(10, 11, 314, 20);
		panel.add(lblMteriKayt);
		
		btnKaydol = new JButton("KAYDOL");
		btnKaydol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ekleme();
			}
		});
		btnKaydol.setBackground(new Color(255, 204, 0));
		btnKaydol.setForeground(new Color(51, 51, 51));
		btnKaydol.setBounds(235, 327, 89, 23);
		panel.add(btnKaydol);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(116, 71, 169, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(116, 113, 169, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(116, 155, 169, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(117, 198, 169, 20);
		panel.add(textField_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(116, 239, 169, 20);
		panel.add(passwordField);
	}
	
	private static final String FILENAME = "database.txt";
	private JLabel lblMteriKayt;
	private JButton btnKaydol;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	public void ekleme() {
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {
	String name = textField.getText();
	String surname = textField_1.getText();
	String uname = textField_3.getText();
	String upass = passwordField.getText();

			File file = new File(FILENAME);

			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);

			bw.write("2"+","+uname+","+upass+","+name+" "+surname);
			bw.newLine();
			bw.close();
			fw.close();
			System.out.println("Personel eklendi");

		} catch (IOException e) {

			e.printStackTrace();

		} 
			
		
	}
}
