package jas18;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Labels extends JFrame implements ActionListener, MouseListener{
	JFrame f1;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	static Color temp1;
	static Color temp2;
	static Color temp3;
	
	Labels(){
		f1 = new JFrame();
		f1.setSize(500, 500);
		f1.setLayout(null);
		
		l1 = new JLabel("aaa");
		l1.setBounds(30, 30, 150, 30);
		l1.addMouseListener(this);
		f1.add(l1);
		
		l2 = new JLabel("aaa");
		l2.setBounds(30, 50, 150, 60);
		l2.addMouseListener(this);
		f1.add(l2);
		
		l3 = new JLabel("aaa");
		l3.setBounds(30, 100, 150, 90);
		l3.addMouseListener(this);
		f1.add(l3);
		
		f1.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent a) {
		if (a.getSource().equals(l1)){
			l1.setForeground(Color.CYAN);
		}
		else if (a.getSource().equals(l2)){
			l2.setForeground(Color.LIGHT_GRAY);
		}
		else if (a.getSource().equals(l3)){
			l3.setForeground(Color.RED);
		}
	}

	@Override
	public void mouseExited(MouseEvent b) {
		if (b.getSource().equals(l1)){
			l1.setForeground(temp1);
		}
		else if (b.getSource().equals(l2)){
			l2.setForeground(temp2);
		}
		else if (b.getSource().equals(l3)){
			l3.setForeground(temp3);
		}
		
	}

	@Override
	public void mousePressed(MouseEvent b) {
		if (b.getSource().equals(l1)){
			temp1 = JColorChooser.showDialog(f1, "Color chooseer", Color.BLACK);
		}
		else if (b.getSource().equals(l2)){
			temp2 = JColorChooser.showDialog(f1, "Color chooseer", Color.BLACK);
		}
		else if (b.getSource().equals(l3)){
			temp3 = JColorChooser.showDialog(f1, "Color chooseer", Color.BLACK);
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Labels();
	}
}
