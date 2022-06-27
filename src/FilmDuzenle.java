import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class FilmDuzenle extends JFrame {
	JPanel panel=new JPanel();
	
	public static void main(String[] args) {
		

		
	}
	
	public FilmDuzenle() {
		setTitle("Sine Go");
		setSize(400,300);
		setLocation(600,200);
		panel.setBackground(new Color(51, 51, 51));
		panel.setLayout(null);
		getContentPane().add(panel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(135, 52, 201, 22);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(135, 106, 201, 22);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(135, 160, 201, 22);
		panel.add(comboBox_2);
		
		JButton btnNewButton_1 = new JButton("Seans & Salon Ekle");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					BufferedWriter bw = null;
					FileWriter fw = null;

					try {

				
						String s="";
						s+= (String) comboBox.getSelectedItem() + ",";
						s+= (String) comboBox_1.getSelectedItem() + ",";
						s+= (String) comboBox_2.getSelectedItem() + "\n";

						File file = new File("fss.txt");

						fw = new FileWriter(file.getAbsoluteFile(), true);
						bw = new BufferedWriter(fw);

						bw.write(s);
						bw.newLine();
						bw.close();
						fw.close();
						System.out.println("Personel eklendi");

					} catch (IOException e) {

						e.printStackTrace();

					} 
			}
		});
		btnNewButton_1.setForeground(new Color(51, 51, 51));
		btnNewButton_1.setBackground(new Color(255, 204, 0));
		btnNewButton_1.setBounds(10, 227, 174, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Yeni Film Ekle");
		btnNewButton_2.setForeground(new Color(51, 51, 51));
		btnNewButton_2.setBackground(new Color(255, 204, 0));
		btnNewButton_2.setBounds(200, 227, 174, 23);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Film D\u00FCzenleme Paneli");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 204, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(10, 11, 364, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Film Se\u00E7iniz");
		lblNewLabel_1.setForeground(new Color(255, 204, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(46, 55, 76, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblSeansSeiniz = new JLabel("Seans Se\u00E7iniz");
		lblSeansSeiniz.setForeground(new Color(255, 204, 0));
		lblSeansSeiniz.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblSeansSeiniz.setBounds(43, 109, 79, 14);
		panel.add(lblSeansSeiniz);
		
		JLabel lblSalonSeiniz = new JLabel("Salon Se\u00E7iniz");
		lblSalonSeiniz.setForeground(new Color(255, 204, 0));
		lblSalonSeiniz.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblSalonSeiniz.setBounds(46, 163, 79, 14);
		panel.add(lblSalonSeiniz);
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FilmEkle fe = new FilmEkle();
				fe.setVisible(true);
				
			}
		});
		setVisible(true);
	
	File file=new File("film.txt");
	
	try {
		Scanner sc=new Scanner(file);
		String temp;
		String[] info;
		while(sc.hasNext()){
			temp = sc.nextLine();
			info = temp.split("\n");
			
				comboBox.addItem(info[0]);
			
			   
		}
		
                 sc.close();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
      }
File file2=new File("seans.txt");
	
	try {
		Scanner sc=new Scanner(file2);
		String temp;
		String[] info;
		while(sc.hasNext()){
			temp = sc.nextLine();
			info = temp.split("\n");
			
				comboBox_1.addItem(info[0]);
			
			   
		}
		
                 sc.close();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
      }
File file3=new File("salon.txt");
	
	try {
		Scanner sc=new Scanner(file3);
		String temp;
		String[] info;
		while(sc.hasNext()){
			temp = sc.nextLine();
			info = temp.split("\n");
			
				comboBox_2.addItem(info[0]);
			
			   
		}
		
                 sc.close();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
      }
}
}