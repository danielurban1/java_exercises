package jas2;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ok extends JFrame{

	Ok(){
		setSize(300, 200);
		setLayout(null);
		setVisible(true);
		
		JButton b1 = new JButton("OK");
		b1.setBounds(110, 60, 60, 40);
		add(b1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ok();
	}
}
