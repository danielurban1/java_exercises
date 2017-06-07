package jas6;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Logged extends JFrame{
	JLabel l1;

	
	Logged(String log){
		setSize(300, 200);
		setLayout(null);
		
		l1 = new JLabel(log);
		l1.setBounds(70, 30, 200, 100);
		this.add(l1);
		
		setVisible(true);
	}
}
