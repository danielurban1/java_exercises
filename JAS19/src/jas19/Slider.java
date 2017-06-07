package jas19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider extends JFrame implements  ChangeListener{
	JFrame f1;
	JSlider s1;
	JLabel l1;
	JLabel l2;
	JSpinner sp1;
	
	Slider(){
		f1 = new JFrame();
		s1 = new JSlider();
		l1 = new JLabel();
		
		f1.setSize(800, 600);
		f1.setLayout(null);
		
		l1 = new JLabel();
		l1.setBounds(300, 100, 100, 50);
		f1.add(l1);
		
		l2 = new JLabel("Set value to 145395");
		l2.setBounds(300, 100, 200, 100);
		f1.add(l2);
		
		sp1 = new JSpinner(new SpinnerNumberModel(25, 0, 10000000, 1));
		sp1.setBounds(300, 400, 200, 100);
		sp1.addChangeListener(this);
		sp1.setToolTipText("aaa");
		f1.add(sp1);
		
		s1 = new JSlider(JSlider.HORIZONTAL, 0, 10000000, 25);
		s1.setBounds(300, 200, 80, 50);
		s1.setToolTipText("Best slider ever");
		s1.addChangeListener(this);
		f1.add(s1);
		
		f1.setVisible(true);
	}
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		if (e.getSource().equals(s1)){
			l1.setText("" + s1.getValue());
			sp1.setValue(s1.getValue());
		}
		else if (e.getSource().equals(sp1)){
			l1.setText("" + s1.getValue());
			s1.setValue((int) sp1.getValue());
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Slider();
	}

}
