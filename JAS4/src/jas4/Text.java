package jas4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Text extends JFrame implements ActionListener{
	JButton  b1;
	JLabel l1;
	JTextField t1;
	
	Text(){
		setSize(500, 500);
		setLayout(null);
		
		
		l1 = new JLabel("Hello guest");
		l1.setBounds(200, 60, 80, 30);
		this.add(l1);
		
		t1 = new JTextField("");
		t1.setBounds(150, 100, 100, 50);
		this.add(t1);
		
		b1 = new JButton("Ok");
		b1.setBounds(200, 150, 50, 50);
		b1.addActionListener(this);
		this.add(b1);
		
		setVisible(true);
		}
	public void actionPerformed(ActionEvent e){
		if (e.getSource().equals(b1)){
			l1.setText("Hello " + t1.getText());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Text();
	}

}
