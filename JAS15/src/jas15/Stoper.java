package jas15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Stoper extends JFrame implements ActionListener{
	static JFrame f1;
	JTextField t1;
	JButton b1;
	static JLabel l1;
	static boolean isOver = true;
	static int time;
	
	Stoper(){
		f1 = new JFrame();
		f1.setSize(500, 500);
		f1.setLayout(null);
		
		l1 = new JLabel("Input time");
		l1.setBounds(30, 30, 200, 25);
		f1.add(l1);
		
		t1 = new JTextField("");
		t1.setBounds(30, 55, 100, 25);
		f1.add(t1);
		
		b1 = new JButton("Start");
		b1.setBounds(30, 80, 80, 35);
		b1.addActionListener(this);
		f1.add(b1);
		
		f1.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try{
			time = Integer.parseInt(t1.getText());
			isOver = false;
			
		}
		catch (NumberFormatException n){
			l1.setText("You can only input integer values");
		}
	}

	static void Time(int timeLeft){
		for (int num = timeLeft; num >=0; num--){
			l1.setText(Integer.toString(num));
			f1.repaint();
			System.out.println("oooaaa");
			try{Thread.sleep(1000);}catch(InterruptedException i){System.out.println(i);}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Stoper();
		System.out.println("oooaaa");
		while (true){
			if (!isOver){
				Time(time);
				break;
			}
		}
	}
}
