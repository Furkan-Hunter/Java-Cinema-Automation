import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class YonPanel extends JFrame {
	JPanel panel=new JPanel();
	
	public static void main(String[] args) {
		

		
	}
	
	public YonPanel() {
		setTitle("Yönetici Paneli");
		setSize(600,300);
		setLocation(600,200);
		panel.setBackground(new Color(51, 51, 51));
		panel.setLayout(null);
		getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("PERSONEL EKLE");
		btnNewButton.setBackground(new Color(255, 204, 0));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				PersEkleme pe = new PersEkleme();
				pe.setVisible(true);
				return;
			}
		});
		btnNewButton.setForeground(new Color(51, 51, 51));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 200, 274, 50);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PERSONEL \u00C7IKAR");
		btnNewButton_1.setBackground(new Color(255, 204, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PersCikar pc = new PersCikar();
				pc.setVisible(true);
			return;
			}
		});
		btnNewButton_1.setForeground(new Color(51, 51, 51));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_1.setBounds(300, 200, 274, 50);
		panel.add(btnNewButton_1);
		
		JLabel lblSineGo = new JLabel("SINE");
		lblSineGo.setForeground(new Color(255, 215, 0));
		lblSineGo.setBackground(new Color(255, 215, 0));
		lblSineGo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSineGo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 72));
		lblSineGo.setBounds(10, 11, 274, 60);
		panel.add(lblSineGo);
		
		JLabel lblGo = new JLabel("GO\u25BA");
		lblGo.setHorizontalAlignment(SwingConstants.LEFT);
		lblGo.setForeground(new Color(255, 215, 0));
		lblGo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 72));
		lblGo.setBackground(new Color(255, 215, 0));
		lblGo.setBounds(300, 11, 274, 60);
		panel.add(lblGo);
		setVisible(true);
	}

}
