package jas14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Popup extends JFrame implements ActionListener{
	JFrame f1;
	JLabel l1;
	JTextField t1;
	JButton b1;
	JOptionPane op1;
	
	Popup(){
		f1 = new JFrame();
		f1.setSize(500, 500);
		f1.setLayout(null);
		
		l1 = new JLabel("Input your name:");
		l1.setBounds(30, 30, 100, 30);
		f1.add(l1);
		
		t1 = new JTextField();
		t1.setBounds(30, 70, 100, 30);
		f1.add(t1);
		
		b1 = new JButton("ok");
		b1.setBounds(80, 110, 50, 30);
		b1.addActionListener(this);
		f1.add(b1);
		
		f1.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(f1,"Welcome " + t1.getText());
		
	}

	public static void main(String[] args){
		new Popup();
	}
}
