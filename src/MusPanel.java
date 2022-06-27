import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Window.Type;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import java.awt.List;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;

public class MusPanel extends JFrame {
	JPanel panel=new JPanel();
	
	public static void main(String[] args) {
		

		
	}
	
	public MusPanel() {
		
		setTitle("Müþteri Paneli");
		setSize(348,300);
		setLocation(600,200);
		panel.setLayout(null);
		getContentPane().add(panel);
		
		
			
		setVisible(true);
	}
}
