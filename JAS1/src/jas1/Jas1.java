package jas1;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Jas1 extends JFrame{
	Jas1(){
		setSize(700,300);
		setLayout(null);
		setVisible(true);
		
		JButton b1 = new JButton("OK");
		b1.setBounds(100, 150, 70, 60);
		add(b1);
	}
	public static void main(String[] args) {
		new Jas1();
	}
}
