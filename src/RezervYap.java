import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class RezervYap extends JFrame {
	JPanel panel=new JPanel();
	private JTextField textField;
	
	public static void main(String[] args) {
		

		
	}
	
	public RezervYap() {
		setTitle("Sine Go");
		setSize(671,431);
		setLocation(600,200);
		panel.setBackground(new Color(51, 51, 51));
		panel.setLayout(null);
		getContentPane().add(panel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 36, 201, 22);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(221, 36, 201, 22);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(432, 36, 201, 22);
		panel.add(comboBox_2);
		
		JButton btnNewButton_1 =new JButton("Koltuk Se\u00E7");
	
		btnNewButton_1.setForeground(new Color(51, 51, 51));
		btnNewButton_1.setBackground(new Color(255, 204, 0));
		btnNewButton_1.setBounds(444, 358, 201, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Film Se\u00E7iniz");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 204, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(10, 11, 201, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblSeansSeiniz = new JLabel("Seans Se\u00E7iniz");
		lblSeansSeiniz.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeansSeiniz.setForeground(new Color(255, 204, 0));
		lblSeansSeiniz.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblSeansSeiniz.setBounds(221, 11, 201, 14);
		panel.add(lblSeansSeiniz);
		
		JLabel lblSalonSeiniz = new JLabel("Salon Se\u00E7iniz");
		lblSalonSeiniz.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalonSeiniz.setForeground(new Color(255, 204, 0));
		lblSalonSeiniz.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblSalonSeiniz.setBounds(432, 11, 201, 14);
		panel.add(lblSalonSeiniz);
		
		
		
		ButtonGroup group = new ButtonGroup();
		
		
		JCheckBox F1 = new JCheckBox("F1");
		F1.setForeground(new Color(51, 51, 51));
		F1.setBackground(new Color(255, 204, 0));
		F1.setBounds(588, 130, 45, 23);
		F1.setActionCommand("F1");
		panel.add(F1);
		group.add(F1);
		
		
		JCheckBox B1 = new JCheckBox("B1");
		B1.setForeground(new Color(51, 51, 51));
		B1.setBackground(new Color(255, 204, 0));
		B1.setBounds(588, 234, 45, 23);
		B1.setActionCommand("B1");
		panel.add(B1);
		group.add(B1);
		
		JCheckBox C1 = new JCheckBox("C1");
		C1.setForeground(new Color(51, 51, 51));
		C1.setBackground(new Color(255, 204, 0));
		C1.setBounds(588, 208, 45, 23);
		C1.setActionCommand("C1");
		panel.add(C1);
		group.add(C1);
		
		JCheckBox D1 = new JCheckBox("D1");
		D1.setForeground(new Color(51, 51, 51));
		D1.setBackground(new Color(255, 204, 0));
		D1.setBounds(588, 182, 45, 23);
		D1.setActionCommand("D1");
		panel.add(D1);
		group.add(D1);
		
		JCheckBox E1 = new JCheckBox("E1");
		E1.setForeground(new Color(51, 51, 51));
		E1.setBackground(new Color(255, 204, 0));
		E1.setBounds(588, 156, 45, 23);
		E1.setActionCommand("E1");
		panel.add(E1);
		group.add(E1);
		
		JCheckBox A1 = new JCheckBox("A1");
		A1.setForeground(new Color(51, 51, 51));
		A1.setBackground(new Color(255, 204, 0));
		A1.setBounds(588, 261, 45, 23);
		A1.setActionCommand("A1");
		panel.add(A1);
		group.add(A1);
		
		JCheckBox A2 = new JCheckBox("A2");
		A2.setForeground(new Color(51, 51, 51));
		A2.setBackground(new Color(255, 204, 0));
		A2.setBounds(541, 261, 45, 23);
		A2.setActionCommand("A2");
		panel.add(A2);
		group.add(A2);
		
		JCheckBox B2 = new JCheckBox("B2");
		B2.setForeground(new Color(51, 51, 51));
		B2.setBackground(new Color(255, 204, 0));
		B2.setBounds(541, 234, 45, 23);
		B2.setActionCommand("B2");
		panel.add(B2);
		group.add(B2);
		
		JCheckBox C2 = new JCheckBox("C2");
		C2.setForeground(new Color(51, 51, 51));
		C2.setBackground(new Color(255, 204, 0));
		C2.setBounds(541, 208, 45, 23);
		C2.setActionCommand("C2");
		panel.add(C2);
		group.add(C2);
		
		JCheckBox D2 = new JCheckBox("D2");
		D2.setForeground(new Color(51, 51, 51));
		D2.setBackground(new Color(255, 204, 0));
		D2.setBounds(541, 182, 45, 23);
		D2.setActionCommand("D2");
		panel.add(D2);
		group.add(D2);
		
		JCheckBox E2 = new JCheckBox("E2");
		E2.setForeground(new Color(51, 51, 51));
		E2.setBackground(new Color(255, 204, 0));
		E2.setBounds(541, 156, 45, 23);
		E2.setActionCommand("E2");
		panel.add(E2);
		group.add(E2);
		
		JCheckBox F2 = new JCheckBox("F2");
		F2.setForeground(new Color(51, 51, 51));
		F2.setBackground(new Color(255, 204, 0));
		F2.setBounds(541, 130, 45, 23);
		F2.setActionCommand("F2");
		panel.add(F2);
		group.add(F2);
		
		JCheckBox A3 = new JCheckBox("A3");
		A3.setForeground(new Color(51, 51, 51));
		A3.setBackground(new Color(255, 204, 0));
		A3.setBounds(494, 261, 45, 23);
		A3.setActionCommand("A3");
		panel.add(A3);
		group.add(A3);
		
		JCheckBox B3 = new JCheckBox("B3");
		B3.setForeground(new Color(51, 51, 51));
		B3.setBackground(new Color(255, 204, 0));
		B3.setBounds(494, 234, 45, 23);
		B3.setActionCommand("B3");
		panel.add(B3);
		group.add(B3);
		
		JCheckBox C3 = new JCheckBox("C3");
		C3.setForeground(new Color(51, 51, 51));
		C3.setBackground(new Color(255, 204, 0));
		C3.setBounds(494, 208, 45, 23);
		C3.setActionCommand("C3");
		panel.add(C3);
		group.add(C3);
		
		JCheckBox D3 = new JCheckBox("D3");
		D3.setForeground(new Color(51, 51, 51));
		D3.setBackground(new Color(255, 204, 0));
		D3.setBounds(494, 182, 45, 23);
		D3.setActionCommand("D3");
		panel.add(D3);
		group.add(D3);
		
		JCheckBox E3 = new JCheckBox("E3");
		E3.setForeground(new Color(51, 51, 51));
		E3.setBackground(new Color(255, 204, 0));
		E3.setBounds(494, 156, 45, 23);
		E3.setActionCommand("E3");
		panel.add(E3);
		group.add(E3);
		
		JCheckBox F3 = new JCheckBox("F3");
		F3.setForeground(new Color(51, 51, 51));
		F3.setBackground(new Color(255, 204, 0));
		F3.setBounds(494, 130, 45, 23);
		F3.setActionCommand("F3");
		panel.add(F3);
		group.add(F3);
		
		JCheckBox A4 = new JCheckBox("A4");
		A4.setForeground(new Color(51, 51, 51));
		A4.setBackground(new Color(255, 204, 0));
		A4.setBounds(447, 261, 45, 23);
		A4.setActionCommand("A4");
		panel.add(A4);
		group.add(A4);
		
		JCheckBox B4 = new JCheckBox("B4");
		B4.setForeground(new Color(51, 51, 51));
		B4.setBackground(new Color(255, 204, 0));
		B4.setBounds(447, 234, 45, 23);
		B4.setActionCommand("B4");
		panel.add(B4);
		group.add(B4);
		
		JCheckBox C4 = new JCheckBox("C4");
		C4.setForeground(new Color(51, 51, 51));
		C4.setBackground(new Color(255, 204, 0));
		C4.setBounds(447, 208, 45, 23);
		C4.setActionCommand("C4");
		panel.add(C4);
		group.add(C4);
		
		JCheckBox D4 = new JCheckBox("D4");
		D4.setForeground(new Color(51, 51, 51));
		D4.setBackground(new Color(255, 204, 0));
		D4.setBounds(447, 182, 45, 23);
		D4.setActionCommand("D4");
		panel.add(D4);
		group.add(D4);
		
		JCheckBox E4 = new JCheckBox("E4");
		E4.setForeground(new Color(51, 51, 51));
		E4.setBackground(new Color(255, 204, 0));
		E4.setBounds(447, 156, 45, 23);
		E4.setActionCommand("E4");
		panel.add(E4);
		group.add(E4);
		
		JCheckBox F4 = new JCheckBox("F4");
		F4.setForeground(new Color(51, 51, 51));
		F4.setBackground(new Color(255, 204, 0));
		F4.setBounds(447, 130, 45, 23);
		F4.setActionCommand("F4");
		panel.add(F4);
		group.add(F4);
		
		JCheckBox A5 = new JCheckBox("A5");
		A5.setForeground(new Color(51, 51, 51));
		A5.setBackground(new Color(255, 204, 0));
		A5.setBounds(400, 261, 45, 23);
		A5.setActionCommand("A5");
		panel.add(A5);
		group.add(A5);
		
		JCheckBox B5 = new JCheckBox("B5");
		B5.setForeground(new Color(51, 51, 51));
		B5.setBackground(new Color(255, 204, 0));
		B5.setBounds(400, 234, 45, 23);
		B5.setActionCommand("B5");
		panel.add(B5);
		group.add(B5);
		
		JCheckBox C5 = new JCheckBox("C5");
		C5.setForeground(new Color(51, 51, 51));
		C5.setBackground(new Color(255, 204, 0));
		C5.setBounds(400, 208, 45, 23);
		C5.setActionCommand("C5");
		panel.add(C5);
		group.add(C5);
		
		JCheckBox D5 = new JCheckBox("D5");
		D5.setForeground(new Color(51, 51, 51));
		D5.setBackground(new Color(255, 204, 0));
		D5.setBounds(400, 182, 45, 23);
		D5.setActionCommand("D5");
		panel.add(D5);
		group.add(D5);
		
		JCheckBox E5 = new JCheckBox("E5");
		E5.setForeground(new Color(51, 51, 51));
		E5.setBackground(new Color(255, 204, 0));
		E5.setBounds(400, 156, 45, 23);
		E5.setActionCommand("E5");
		panel.add(E5);
		group.add(E5);
		
		JCheckBox F5 = new JCheckBox("F5");
		F5.setForeground(new Color(51, 51, 51));
		F5.setBackground(new Color(255, 204, 0));
		F5.setBounds(400, 130, 45, 23);
		F5.setActionCommand("F5");
		panel.add(F5);
		group.add(F5);
		
		JCheckBox A6 = new JCheckBox("A6");
		A6.setForeground(new Color(51, 51, 51));
		A6.setBackground(new Color(255, 204, 0));
		A6.setBounds(353, 261, 45, 23);
		A6.setActionCommand("A6");
		panel.add(A6);
		group.add(A6);
		
		JCheckBox B6 = new JCheckBox("B6");
		B6.setForeground(new Color(51, 51, 51));
		B6.setBackground(new Color(255, 204, 0));
		B6.setBounds(353, 234, 45, 23);
		B6.setActionCommand("B6");
		panel.add(B6);
		group.add(B6);
		
		JCheckBox C6 = new JCheckBox("C6");
		C6.setForeground(new Color(51, 51, 51));
		C6.setBackground(new Color(255, 204, 0));
		C6.setBounds(353, 208, 45, 23);
		C6.setActionCommand("C6");
		panel.add(C6);
		group.add(C6);
		
		JCheckBox D6 = new JCheckBox("D6");
		D6.setForeground(new Color(51, 51, 51));
		D6.setBackground(new Color(255, 204, 0));
		D6.setBounds(353, 182, 45, 23);
		D6.setActionCommand("D6");
		panel.add(D6);
		group.add(D6);
		
		JCheckBox E6 = new JCheckBox("E6");
		E6.setForeground(new Color(51, 51, 51));
		E6.setBackground(new Color(255, 204, 0));
		E6.setBounds(353, 156, 45, 23);
		E6.setActionCommand("E6");
		panel.add(E6);
		group.add(E6);
		
		JCheckBox F6 = new JCheckBox("F6");
		F6.setForeground(new Color(51, 51, 51));
		F6.setBackground(new Color(255, 204, 0));
		F6.setBounds(353, 130, 45, 23);
		F6.setActionCommand("F6");
		panel.add(F6);
		group.add(F6);
		
		JCheckBox A7 = new JCheckBox("A7");
		A7.setForeground(new Color(51, 51, 51));
		A7.setBackground(new Color(255, 204, 0));
		A7.setBounds(306, 261, 45, 23);
		A7.setActionCommand("A7");
		panel.add(A7);
		group.add(A7);
		
		JCheckBox B7 = new JCheckBox("B7");
		B7.setForeground(new Color(51, 51, 51));
		B7.setBackground(new Color(255, 204, 0));
		B7.setBounds(306, 234, 45, 23);
		B7.setActionCommand("B7");
		panel.add(B7);
		group.add(B7);
		
		JCheckBox C7 = new JCheckBox("C7");
		C7.setForeground(new Color(51, 51, 51));
		C7.setBackground(new Color(255, 204, 0));
		C7.setBounds(306, 208, 45, 23);
		C7.setActionCommand("C7");
		panel.add(C7);
		group.add(C7);
		
		JCheckBox D7 = new JCheckBox("D7");
		D7.setForeground(new Color(51, 51, 51));
		D7.setBackground(new Color(255, 204, 0));
		D7.setBounds(306, 182, 45, 23);
		D7.setActionCommand("D7");
		panel.add(D7);
		group.add(D7);
		
		JCheckBox E7 = new JCheckBox("E7");
		E7.setForeground(new Color(51, 51, 51));
		E7.setBackground(new Color(255, 204, 0));
		E7.setBounds(306, 156, 45, 23);
		E7.setActionCommand("E7");
		panel.add(E7);
		group.add(E7);
		
		JCheckBox F7 = new JCheckBox("F7");
		F7.setForeground(new Color(51, 51, 51));
		F7.setBackground(new Color(255, 204, 0));
		F7.setBounds(306, 130, 45, 23);
		F7.setActionCommand("F7");
		panel.add(F7);
		group.add(F7);
		
		JCheckBox A8 = new JCheckBox("A8");
		A8.setForeground(new Color(51, 51, 51));
		A8.setBackground(new Color(255, 204, 0));
		A8.setBounds(259, 261, 45, 23);
		A8.setActionCommand("A8");
		panel.add(A8);
		group.add(A8);
		
		JCheckBox B8 = new JCheckBox("B8");
		B8.setForeground(new Color(51, 51, 51));
		B8.setBackground(new Color(255, 204, 0));
		B8.setBounds(259, 234, 45, 23);
		B8.setActionCommand("B8");
		panel.add(B8);
		group.add(B8);
		
		JCheckBox C8 = new JCheckBox("C8");
		C8.setForeground(new Color(51, 51, 51));
		C8.setBackground(new Color(255, 204, 0));
		C8.setBounds(259, 208, 45, 23);
		C8.setActionCommand("C8");
		panel.add(C8);
		group.add(C8);
		
		JCheckBox D8 = new JCheckBox("D8");
		D8.setForeground(new Color(51, 51, 51));
		D8.setBackground(new Color(255, 204, 0));
		D8.setBounds(259, 182, 45, 23);
		D8.setActionCommand("D8");
		panel.add(D8);
		group.add(D8);
		
		JCheckBox E8 = new JCheckBox("E8");
		E8.setForeground(new Color(51, 51, 51));
		E8.setBackground(new Color(255, 204, 0));
		E8.setBounds(259, 156, 45, 23);
		E8.setActionCommand("E8");
		panel.add(E8);
		group.add(E8);
		
		JCheckBox F8 = new JCheckBox("F8");
		F8.setForeground(new Color(51, 51, 51));
		F8.setBackground(new Color(255, 204, 0));
		F8.setBounds(259, 130, 45, 23);
		F8.setActionCommand("F8");
		panel.add(F8);
		group.add(F8);
		
		JCheckBox A9 = new JCheckBox("A9");
		A9.setForeground(new Color(51, 51, 51));
		A9.setBackground(new Color(255, 204, 0));
		A9.setBounds(212, 261, 45, 23);
		A9.setActionCommand("A9");
		panel.add(A9);
		group.add(A9);
		
		JCheckBox B9 = new JCheckBox("B9");
		B9.setForeground(new Color(51, 51, 51));
		B9.setBackground(new Color(255, 204, 0));
		B9.setBounds(212, 234, 45, 23);
		B9.setActionCommand("B9");
		panel.add(B9);
		group.add(B9);
		
		JCheckBox C9 = new JCheckBox("C9");
		C9.setForeground(new Color(51, 51, 51));
		C9.setBackground(new Color(255, 204, 0));
		C9.setBounds(212, 208, 45, 23);
		C9.setActionCommand("C9");
		panel.add(C9);
		group.add(C9);
		
		JCheckBox D9 = new JCheckBox("D9");
		D9.setForeground(new Color(51, 51, 51));
		D9.setBackground(new Color(255, 204, 0));
		D9.setBounds(212, 182, 45, 23);
		D9.setActionCommand("D9");
		panel.add(D9);
		group.add(D9);
		
		JCheckBox E9 = new JCheckBox("E9");
		E9.setForeground(new Color(51, 51, 51));
		E9.setBackground(new Color(255, 204, 0));
		E9.setBounds(212, 156, 45, 23);
		E9.setActionCommand("E9");
		panel.add(E9);
		group.add(E9);
		
		JCheckBox F9 = new JCheckBox("F9");
		F9.setForeground(new Color(51, 51, 51));
		F9.setBackground(new Color(255, 204, 0));
		F9.setBounds(212, 130, 45, 23);
		F9.setActionCommand("F9");
		panel.add(F9);
		group.add(F9);
		
		JCheckBox A10 = new JCheckBox("A10");
		A10.setForeground(new Color(51, 51, 51));
		A10.setBackground(new Color(255, 204, 0));
		A10.setBounds(161, 261, 48, 23);
		A10.setActionCommand("A10");
		panel.add(A10);
		group.add(A10);
		
		JCheckBox B10 = new JCheckBox("B10");
		B10.setForeground(new Color(51, 51, 51));
		B10.setBackground(new Color(255, 204, 0));
		B10.setBounds(161, 235, 48, 23);
		B10.setActionCommand("B10");
		panel.add(B10);
		group.add(B10);
		
		JCheckBox C10 = new JCheckBox("C10");
		C10.setForeground(new Color(51, 51, 51));
		C10.setBackground(new Color(255, 204, 0));
		C10.setBounds(161, 208, 48, 23);
		C10.setActionCommand("C10");
		panel.add(C10);
		group.add(C10);
		
		JCheckBox D10 = new JCheckBox("D10");
		D10.setForeground(new Color(51, 51, 51));
		D10.setBackground(new Color(255, 204, 0));
		D10.setBounds(161, 182, 48, 23);
		D10.setActionCommand("D10");
		panel.add(D10);
		group.add(D10);
		
		JCheckBox E10 = new JCheckBox("E10");
		E10.setForeground(new Color(51, 51, 51));
		E10.setBackground(new Color(255, 204, 0));
		E10.setBounds(161, 156, 48, 23);
		E10.setActionCommand("E10");
		panel.add(E10);
		group.add(E10);
		
		JCheckBox F10 = new JCheckBox("F10");
		F10.setForeground(new Color(51, 51, 51));
		F10.setBackground(new Color(255, 204, 0));
		F10.setBounds(161, 130, 48, 23);
		F10.setActionCommand("F10");
		panel.add(F10);
		group.add(F10);
		
		JLabel label = new JLabel("EKRAN");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(255, 204, 0));
		label.setBackground(new Color(204, 0, 0));
		label.setBounds(161, 302, 472, 23);
		panel.add(label);
		
		JLabel lblAdSoyad = new JLabel("AD & SOYAD");
		lblAdSoyad.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdSoyad.setForeground(new Color(255, 204, 0));
		lblAdSoyad.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblAdSoyad.setBounds(10, 185, 145, 14);
		panel.add(lblAdSoyad);
		
		textField = new JTextField();
		textField.setBounds(10, 209, 145, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("sinema-1_16_9_1519228583.jpg"));
		label_1.setBounds(0, 0, 655, 392);
		panel.add(label_1);
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
File file2=new File("fss.txt");
	
	try {
		Scanner sc=new Scanner(file2);
		String temp;
		String[] info;
		while(sc.hasNext()){
			temp = sc.nextLine();
			info = temp.split(",");
			
				if (comboBox.getSelectedItem().equals(info[0]))
				comboBox_1.addItem(info[1]);
				
			
		}
		
                 sc.close();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
      }
File file3=new File("fss.txt");
	
	try {
		Scanner sc=new Scanner(file3);
		String temp;
		String[] info;
		while(sc.hasNext()){
			temp = sc.nextLine();
			info = temp.split(",");
			
				if (comboBox.getSelectedItem().equals(info[0]))
				comboBox_2.addItem(info[2]);
				
			
		}
		
                 sc.close();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
      }
	
	comboBox.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
comboBox_1.removeAllItems();
comboBox_2.removeAllItems();
			
			File file2=new File("fss.txt");
		
			
			try {
				Scanner sc=new Scanner(file2);
				String temp;
				String[] info;
				while(sc.hasNext()){
					temp = sc.nextLine();
					info = temp.split(",");
					
						if (comboBox.getSelectedItem().equals(info[0]))
						{
						comboBox_1.addItem(info[1]);
						comboBox_2.addItem(info[2]);
						}
						
				}
				
		                 sc.close();
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
		      }
			
		}
	});
	
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			File filem=new File("rezerv.txt");
		
			boolean rezerveMi=false;
			try {
				BufferedReader file = new BufferedReader(new FileReader(filem));
				String line;
				String[] info;
				try {
					while ((line = file.readLine()) != null) {
						info=line.split(",");
							if (comboBox.getSelectedItem().equals(info[0]) && comboBox_1.getSelectedItem().equals(info[1]) 
									&& comboBox_2.getSelectedItem().equals(info[2]) && group.getSelection().getActionCommand().equals(info[3]))
							{
								
								rezerveMi=true;
							
							}
							
					}
					if(rezerveMi==true)
					JOptionPane.showMessageDialog(null, "Bu koltuk rezerve edilmiþtir");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
		      }
			if(rezerveMi==false)
			{
				BufferedWriter bw = null;
				FileWriter fw = null;

				try {

			
					String s="";
					s+= (String) comboBox.getSelectedItem() + ",";
					s+= (String) comboBox_1.getSelectedItem() + ",";
					s+= (String) comboBox_2.getSelectedItem() + ",";
					s+= group.getSelection().getActionCommand()+ ",";
					s+= textField.getText();

					File file = new File("rezerv.txt");

					fw = new FileWriter(file.getAbsoluteFile(), true);
					bw = new BufferedWriter(fw);

					bw.write(s);
					bw.newLine();
					bw.close();
					fw.close();
					System.out.println("Satýþ Baþarýlý");

				} catch (IOException e) {

					e.printStackTrace();

				}
				
			}
				
			
				
		}
	});


}
}