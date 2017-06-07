//This program display strings


package firstproject;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names = "imie_1 imie_2 imie_3";
		String course_content = "SQL\nPython\nFront-end\nJava";
		//System.out.println(names);
		//System.out.println(System.getProperty("java.runtime.version"));
		//System.out.println(course_content);
		System.out.println(names + "\n" + course_content);
		System.out.println("  J  a  v   v  a\n  J  a  v  v  aa\nJ  J  a  v  v  aa\n");
		System.out.println(73.5d);
		System.out.println("CZeœæ Jan, s³usza³em, ¿e masz " + 25 + "lat i uczysz siê programowania,"
				+ "czy to prawda?");
		System.out.println(true);
		System.out.println("Czy towje inicja³y to J K?");
		System.out.println("Tak: " + true);
		
		double f = 18.5d;
		int liczba =1;
		int liczba2 = liczba;
		final double PI = 3.14;
		System.out.println(f);
		System.out.println(PI);
		String abc = "abcdefghi";
		System.out.println(abc.substring(1,3));
		System.out.println(abc.replaceAll("a", "z"));
		System.out.println(abc.charAt(3));
		StringBuffer sb = new StringBuffer(abc);
		sb.reverse();
		sb.append(" aaa");
		sb.insert(10, " dob ");
		System.out.println(sb);
		
		
		String word1 = "Word1";
		String word2 = "Word2";
		StringBuffer w3 = new StringBuffer((word1 + word2).toUpperCase());
		StringBuffer w4 = new StringBuffer((w3.append("Word4")).toString().toLowerCase());
		String word3 = word1+ word2;
		String word4 = word3 + "Word4";
		System.out.println(w3 +""+ w4);
		System.out.println(w4.length());
		System.out.println(w3.charAt(2) + " " + w3.charAt(5));
		System.out.println(w3.charAt(w3.length()-3));
		System.out.println(w4.substring(0, word1.length()) + " " + w4.substring(word1.length(),  word1.length() + word2.length()));
		System.out.println(5.0/2);
		int a = 5;
		System.out.println(a++);
		boolean spr = "a" instanceof java.lang.String || "Kasia" instanceof java.lang.String;
		System.out.println(spr);
		int ab = 5;
		int b = 7;
		String wynik = ab == b ? "tak": "nie";
		System.out.println(wynik);
		float g = 27.5f;
		float h = 13.2f;
		int x = 5;
		int y = 2;
		System.out.println((int)(g/h));
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println((double)x / y);
		System.out.println(x / y);
		System.out.println(x % y);
		System.out.println(-5 + 8 * 6);
		System.out.println((55+9)%9);
		System.out.println(20 + -3 *(double)5 / 8);
		System.out.println(5 + 15f / 3 * 2 - 8 % 3);
		
		int xyz = 10;
		for (int i = 10; i > 0; i--){
			System.out.println(xyz * i);
		}
		System.out.println(((25.5*3.5-3.5*3.5)/(40.5-4.5)));
		System.out.println(Math.round(4.0 * (1 - (1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11))));
		
		System.out.println(ab > b ? "tak": "nie");
		System.out.println(ab * 2 > b ? "tak": "nie");
		System.out.println(ab +3 > b && x - 2 < b ? "tak": "nie");
		System.out.println((ab * b) % 2 ==0 ? "tak": "nie");
		
		Random rnd = new Random();
		int c = rnd.nextInt(100);
		System.out.println(Math.pow(c, 3));
		BigInteger big1 = new BigInteger("344542344444444444444444444444444444444444444444444444444565423");
		BigInteger big2 = new BigInteger("3445424545454634634444499999999999999999999999999999999999999999999999999999999999999999999999999999444444444444565423");
		System.out.println(big1.multiply(big2).multiply(big2).multiply(big2).multiply(big2).multiply(big2));
		
		
		Scanner scr = new Scanner(System.in);
		System.out.print("Podaj imiê: ");
		//String abz = scr.Line();
		/*double a1 = scr.Double();
		a1 += scr.Double();
		a1 += scr.Double();
		System.out.println(Math.round(a1/3*100)/100.0);
		
		double a1 = scr.Double();
		double a2 = scr.Double();
		System.out.println(a1 == a2);
		System.out.println(a1 > a2);
		System.out.println(a1 < a2);
		System.out.println(a1 >= a2);
		System.out.println(a1 <= a2);
		System.out.println(a1 != a2);
		System.out.print("Podaj bok szeœciok¹ta formenego: ");
		double a1 = scr.Double();
		System.out.println();
		System.out.println(Math.pow(1.0, -3));
		System.out.println("Pole wynosi: " + (3 * Math.pow(a1, 2) * Math.sqrt(3)/2));
		double x1 = scr.Double();
		double x2 = scr.Double();
		double y1 = scr.Double();
		double y2 = scr.Double();
		System.out.println(Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((Math.cos((x1 * Math.PI)/180)*(y2 - y1)), 2)*111));*/
		String a1 = scr.nextLine();
		StringBuffer sbw3 = new StringBuffer(a1);
		System.out.println(sbw3.reverse());
	}

}
