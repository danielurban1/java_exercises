package SwingAWT;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Intercafe {
	public static void main(String[] args) {
		JFrame f=new JFrame();//stworzenie obiektu klasy JFrame
		JButton b=new JButton("click"); //stworzenie obiektu klasy JButton
		b.setBounds(130,100,100, 40); //o� x, o� y, szeroko��, wysoko��
		f.add(b); //dodanie przysisku
		f.setSize(400,500); //szer i wys przysisku
		f.setLayout(null); //bez Layout Managera
		f.setVisible(true); //ustawienie widoczno�ci okna
		}
		}