import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Window.Type;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTree;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PerPanel extends JFrame {
	JPanel panel=new JPanel();
	
	public static void main(String[] args) {
		

		
	}
	
	public PerPanel() {
		setTitle("Müþteri Paneli");
		setSize(400,400);
		setLocation(600,200);
		panel.setBackground(new Color(51, 51, 51));
		panel.setLayout(null);
		getContentPane().add(panel);
		
		JLabel lblPersonelPaneli = new JLabel("Personel Paneli");
		lblPersonelPaneli.setForeground(new Color(255, 204, 0));
		lblPersonelPaneli.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 31));
		lblPersonelPaneli.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonelPaneli.setBounds(10, 11, 364, 69);
		panel.add(lblPersonelPaneli);
		
		JButton btnNewButton = new JButton("REZERVASYON YAP");
		btnNewButton.setBackground(new Color(255, 204, 0));
		btnNewButton.setForeground(new Color(51, 51, 51));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		
		btnNewButton.setBounds(10, 163, 364, 90);
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("F\u0130LMLER\u0130 D\u00DCZENLE");
		btnNewButton_2.setForeground(new Color(51, 51, 51));
		btnNewButton_2.setBackground(new Color(255, 204, 0));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		btnNewButton_2.setBounds(10, 264, 364, 86);
		panel.add(btnNewButton_2);
		setVisible(true);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FilmDuzenle fd = new FilmDuzenle();
				fd.setVisible(true);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RezervYap ry = new RezervYap();
				ry.setVisible(true);
			}
		});
	}
}
