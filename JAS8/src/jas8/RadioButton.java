package jas8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RadioButton extends JFrame implements ActionListener{
	JFrame radioB;
	JLabel l1;
	JRadioButton b1;
	JRadioButton b2;
	
	RadioButton(){
		setSize(500, 500);
		setLayout(null);
		
		l1 = new JLabel("Choose");
		l1.setBounds(50, 60, 100, 50);
		this.add(l1);
		
		
		radioB = new JFrame();
		b1 = new JRadioButton("a");
		b2 = new JRadioButton("b");
		ButtonGroup bg=new ButtonGroup();
		bg.add(b1); 
		bg.add(b2);
		radioB.add(b1); 
		radioB.add(b2);
		b1.setBounds(50, 100, 50, 50);
		b2.setBounds(50, 150, 50, 50);
		b1.addActionListener(this);
		b2.addActionListener(this);
		this.add(b1);
		this.add(b2);
		
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (b1.isSelected()){
			l1.setText("A is selected");
		}
		else if(b2.isSelected()){
			l1.setText("B is selected");
		}
		
	}
	public static void main(String[] args) {
		new RadioButton();
	}
}
