package jas5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class A extends JFrame implements ActionListener{
	JButton  b1;
	JTextField t1;
	JTextField t2;
	A(){
		setSize(500, 500);
		setLayout(null);
		
		b1 = new JButton("Ok");
		b1.setBounds(200, 350, 50, 50);
		b1.addActionListener(this);
		this.add(b1);
		
		t1 = new JTextField("");
		t1.setBounds(200, 150, 100, 50);
		this.add(t1);
		
		t2 = new JTextField("");
		t2.setBounds(200, 250, 100, 50);
		this.add(t2);
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(b1)){
			String temp1;
			String temp2;
			
			temp1 = t1.getText();
			temp2 = t2.getText();
			
			t1.setText(temp2);
			t2.setText(temp1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A();
	}

}
