import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class FilmEkle extends JFrame {
	JPanel panel=new JPanel();
	private JTextField textField;
	
	public static void main(String[] args) {
		

		
	}
	
	public FilmEkle() {
		setTitle("Müþteri Paneli");
		setSize(250,250);
		setLocation(600,200);
		panel.setBackground(new Color(51, 51, 51));
		panel.setLayout(null);
		getContentPane().add(panel);
		
		textField = new JTextField();
		textField.setBounds(10, 117, 214, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Film Ekle");
		lblNewLabel.setForeground(new Color(255, 204, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(10, 11, 214, 14);
		panel.add(lblNewLabel);
		
		JLabel lblEklemekIstediinizFilmin = new JLabel("Eklemek \u0130stedi\u011Finiz Filmin Ad\u0131n\u0131 Yaz\u0131n\u0131z");
		lblEklemekIstediinizFilmin.setForeground(new Color(255, 204, 0));
		lblEklemekIstediinizFilmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblEklemekIstediinizFilmin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblEklemekIstediinizFilmin.setBounds(10, 91, 214, 14);
		panel.add(lblEklemekIstediinizFilmin);
		
		JButton btnNewButton = new JButton("Filmi Ekle");
		btnNewButton.setForeground(new Color(51, 51, 51));
		btnNewButton.setBackground(new Color(255, 204, 0));
		btnNewButton.setBounds(74, 160, 89, 23);
		panel.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				BufferedWriter bw = null;
				FileWriter fw = null;

				try {
			
					String f="";
					f = textField.getText();

					File file = new File("film.txt");

					fw = new FileWriter(file.getAbsoluteFile(), true);
					bw = new BufferedWriter(fw);

					bw.write(f);
					bw.newLine();
					bw.close();
					fw.close();
					System.out.println("Personel eklendi");

				} catch (IOException e) {

					e.printStackTrace();

				} 
			}
		});
		setVisible(true);
	}
}