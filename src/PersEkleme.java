import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Color;

public class PersEkleme extends JFrame {
	JPanel panel=new JPanel();
	private JTextField txtAd;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtifre;
	private JTextField textField_5;
	private JTextField textField_6;
	
	public static void main(String[] args) {
		


	}
	
	public PersEkleme() {
		setTitle("Sine Go");
		setSize(320,500);
		setLocation(600,200);
		panel.setForeground(Color.RED);
		panel.setBackground(new Color(51, 51, 51));
		panel.setLayout(null);
		getContentPane().add(panel);
		
		JLabel lblPersonelEkle = new JLabel("PERSONEL EKLEME");
		lblPersonelEkle.setForeground(new Color(255, 204, 0));
		lblPersonelEkle.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonelEkle.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblPersonelEkle.setBounds(10, 11, 264, 37);
		panel.add(lblPersonelEkle);
		
		txtAd = new JTextField();
		txtAd.setToolTipText("");
		txtAd.setBounds(125, 59, 149, 20);
		panel.add(txtAd);
		txtAd.setColumns(10);
		
		JButton btnNewButton = new JButton("PERSONEL\u0130 EKLE");
		btnNewButton.setBackground(new Color(255, 204, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setForeground(new Color(51, 51, 51));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ekleme();
			}
		});
		btnNewButton.setBounds(10, 406, 284, 44);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("ADI:");
		lblNewLabel.setForeground(new Color(255, 204, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel.setBounds(79, 62, 26, 14);
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(125, 103, 149, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(125, 152, 149, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(125, 202, 149, 20);
		panel.add(textField_3);
		
		txtifre = new JTextField();
		txtifre.setColumns(10);
		txtifre.setBounds(125, 247, 149, 20);
		panel.add(txtifre);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(125, 294, 149, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(125, 336, 149, 20);
		panel.add(textField_6);
		
		JLabel label = new JLabel("SOYADI:");
		label.setForeground(new Color(255, 204, 0));
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		label.setBounds(59, 106, 56, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("DOÐUM YILI:");
		label_1.setForeground(new Color(255, 204, 0));
		label_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		label_1.setBounds(27, 155, 78, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("E POSTA:");
		label_2.setForeground(new Color(255, 204, 0));
		label_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		label_2.setBounds(49, 205, 56, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("CEP TELEFONU:");
		label_3.setForeground(new Color(255, 204, 0));
		label_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		label_3.setBounds(10, 250, 95, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("KULLANICI ADI:");
		label_4.setForeground(new Color(255, 204, 0));
		label_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		label_4.setBounds(10, 297, 95, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("ÞÝFRE:");
		label_5.setForeground(new Color(255, 204, 0));
		label_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		label_5.setBounds(59, 339, 46, 14);
		panel.add(label_5);
		setVisible(true);
	}
	private static final String FILENAME = "database.txt";
	public void ekleme() {
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

	
	String uname = textField_5.getText();
	String upass = textField_6.getText();

			File file = new File(FILENAME);

			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);

			bw.write("1"+","+uname+","+upass);
			bw.newLine();
			bw.close();
			fw.close();
			System.out.println("Personel eklendi");

		} catch (IOException e) {

			e.printStackTrace();

		} 
			
		
	}
}
