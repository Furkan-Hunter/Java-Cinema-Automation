import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Giris {

	private JFrame frmSinema;
	private JTextField txtuser;
	private JPasswordField txtpass;
	Scanner x;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Giris window = new Giris();
					window.frmSinema.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Giris() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSinema = new JFrame();
		frmSinema.getContentPane().setForeground(Color.WHITE);
		frmSinema.setForeground(SystemColor.menu);
		frmSinema.setBackground(SystemColor.menu);
		frmSinema.setTitle("Sinema");
		frmSinema.getContentPane().setBackground(new Color(51, 51, 51));
		frmSinema.setBounds(100, 100, 500, 400);
		frmSinema.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSinema.getContentPane().setLayout(null);
		
		JLabel label_3 = new JLabel("...");
		label_3.setIcon(new ImageIcon("C:\\Users\\ADM\u0130N\\Desktop\\06d15012511c08810906bf207e3b2c14 (2).jpg"));
		label_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		
		label_3.setForeground(new Color(255, 204, 0));
		label_3.setBackground(new Color(255, 204, 51));
		label_3.setBounds(384, 245, 32, 32);
		frmSinema.getContentPane().add(label_3);
		
		JLabel user = new JLabel("Kullanýcý Adý:");
		user.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		user.setForeground(new Color(255, 204, 0));
		user.setBounds(81, 186, 97, 26);
		frmSinema.getContentPane().add(user);
		
		JLabel pass = new JLabel("Þifre:");
		pass.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		pass.setForeground(new Color(255, 204, 0));
		pass.setBackground(Color.WHITE);
		pass.setBounds(141, 245, 37, 26);
		frmSinema.getContentPane().add(pass);
		
		txtuser = new JTextField();
		txtuser.setBounds(188, 185, 186, 32);
		frmSinema.getContentPane().add(txtuser);
		txtuser.setColumns(10);
		
		txtpass = new JPasswordField();
		txtpass.setEchoChar('*');
		txtpass.setColumns(10);
		txtpass.setBounds(188, 244, 186, 32);
		frmSinema.getContentPane().add(txtpass);
		
		JButton login = new JButton("Giriþ");
		login.setBackground(new Color(255, 204, 0));
		login.setForeground(new Color(51, 51, 51));
		login.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = txtuser.getText();
				String password = txtpass.getText();
				openFile();
				verification(name, password);
			}
		});
		login.setBounds(52, 298, 186, 35);
		frmSinema.getContentPane().add(login);
		
		JLabel label = new JLabel("");
		label.setBounds(339, 120, 46, 14);
		frmSinema.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("SINE");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setForeground(new Color(255, 204, 0));
		label_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 72));
		label_1.setBackground(new Color(255, 215, 0));
		label_1.setBounds(70, 39, 168, 60);
		frmSinema.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("GO\u25BA");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setForeground(new Color(255, 204, 0));
		label_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 72));
		label_2.setBackground(new Color(255, 215, 0));
		label_2.setBounds(248, 39, 175, 60);
		frmSinema.getContentPane().add(label_2);
		
		JButton btnKaytOl = new JButton("Kay\u0131t Ol");
		btnKaytOl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MusKayit mk = new MusKayit();
			    mk.setVisible(true);
			    return;
				
			}
		});
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				txtpass.setEchoChar('\0');
				
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				txtpass.setEchoChar('*');
			}
		});
		
		btnKaytOl.setForeground(new Color(51, 51, 51));
		btnKaytOl.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnKaytOl.setBackground(new Color(255, 204, 0));
		btnKaytOl.setBounds(263, 298, 175, 35);
		frmSinema.getContentPane().add(btnKaytOl);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("bu_hafta_6_film_vizyona_girecek_fragmanlar_1478175980_8512.jpg"));
		lblNewLabel.setBounds(0, 0, 484, 361);
		frmSinema.getContentPane().add(lblNewLabel);
	}
	
	public void openFile() {
		
		try{
			x = new Scanner(new File("database.txt"));
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "Dosya bulunamadý");
			System.exit(0);
		}
		
	}
	
	private boolean verification(String username, String passwrd) {
		String temp;
		String[] info;
		
		while(x.hasNext()){
			temp = x.nextLine();
			info = temp.split(",");
			if (info[1].equals(username)&& info[2].equals(passwrd))
			{
				if (info[0].equals("0"))
				{
				    YonPanel yp = new YonPanel();
				    yp.setVisible(true);
				    return true;
			    }
				else if (info[0].equals("1"))
				{
					PerPanel pp = new PerPanel();
					pp.setVisible(true);
					return true;
				}
				else
				{
					MusPanel mp = new MusPanel();
					mp.setVisible(true);
					return true;
				}
			}
		}
		
			JOptionPane.showMessageDialog(null, "Yanlýþ kullanýcý adý veya þifre girdiniz");
			return false;
			
			}
	}
