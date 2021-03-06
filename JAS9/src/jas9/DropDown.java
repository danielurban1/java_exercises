package jas9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DropDown extends JFrame implements ActionListener{
	JComboBox c1;
	JLabel l1;
	JTextField t1;
	JButton b1;
	String c[];
	
	DropDown(){
		setSize(500, 500);
		setLayout(null);
		String c[]={"C to F","F to C"};
		
		t1 = new JTextField("");
		t1.setBounds(100, 20, 200, 50);
		this.add(t1);
		
		c1 = new JComboBox(c);
		c1.setBounds(100, 100, 200, 50);
		this.add(c1);
		
		b1 = new JButton("Ok");
		b1.setBounds(100, 200, 50, 50);
		b1.addActionListener(this);
		this.add(b1);
		
		l1 = new JLabel("");
		l1.setBounds(100, 250, 200, 50);
		this.add(l1);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(b1)){
			try{
			int a =Integer.parseInt((String)t1.getText());
			if (c1.getSelectedItem().equals("C to F")){
				l1.setText(String.valueOf((a*9/5+32)));
			}
			else{
				l1.setText(String.valueOf((a-32)/1.8));
			}
			}
			catch (NumberFormatException z){
				l1.setText("Invalid value");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DropDown();
	}



}
