package SwingAWT;

import javax.swing.*;
public class Appka extends JFrame{ //dziedziczenie po klasie JFrame
	Appka(){
		JButton b=new JButton("click"); //nowy przycisk
		b.setBounds(130,100,100, 40);
		add(b); //dodanie przycisku do okienka
		setSize(400,500);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Appka();
	}
	}