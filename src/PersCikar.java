import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JComboBox;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class PersCikar extends JFrame {
	JPanel panel=new JPanel();
	
	
	
	public static void main(String[] args) {
		
			}
		
	
	public PersCikar() {
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 67, 264, 22);
		panel.setBackground(new Color(51, 51, 51));
		panel.add(comboBox);

		setTitle("Sine Go");
		setSize(300,300);
		setLocation(600,200);
		panel.setLayout(null);
		getContentPane().add(panel);
		
		

		
		
		JButton btnNewButton_1 = new JButton("Personeli Kov");
		btnNewButton_1.setForeground(new Color(51, 51, 51));
		btnNewButton_1.setBackground(new Color(255, 204, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String deger = (String) comboBox.getSelectedItem();

				try {
					BufferedReader file = new BufferedReader(new FileReader("database.txt"));
					String line;
					String input = "";
					while ((line = file.readLine()) != null) {

						if (line.contains(deger)) {
							line = "";
							System.out.println("Line deleted.");
						}

						if (line != "")
							input += line + "\n";

					}
					FileOutputStream File = new FileOutputStream("database.txt");

					BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(File));

					String[] words = input.split("\n");
					for (String word : words) {
						writer.write(word);
						writer.newLine();

					}

					writer.close();
					file.close();
					File.close();
																	
				} catch (Exception e) {
					System.out.println("Problem reading file.");
				}comboBox.removeItemAt(comboBox.getSelectedIndex());

			}
		});
			
		btnNewButton_1.setBounds(10, 227, 264, 23);
		panel.add(btnNewButton_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("kovulma_buyuk.jpg"));
		label.setBounds(0, 0, 284, 261);
		panel.add(label);
		
	
		
		File file=new File("database.txt");
		
		try {
			Scanner sc=new Scanner(file);
			String temp;
			String[] info;
			while(sc.hasNext()){
				temp = sc.nextLine();
				info = temp.split(",");
				if (info[0].equals("1")) {
					comboBox.addItem(info[1]);
				}
				   
			}
			
	                 sc.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
          }
		
		
		
  }
}