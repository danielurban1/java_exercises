package firstproject;

import java.util.Random;
//import java.util.Random;
import java.util.Scanner;

public class SecondProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		/*int a = 300;
		int b = 301;
		if (a > b){
			System.out.println("A is bigger than B.");
		}
		else if (a==b){
			System.out.println("A is equal to B.");
		}
		else{
			System.out.println("B is bigger than A.");
		}
		int i = 4;
		switch(i){
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		default:
			System.out.println("Other value");
		}
		
		
		System.out.print("Input first value: ");
		double x = scr.nextDouble();
		scr.nextLine();
		System.out.print("Choose opearion (/, *, +, -, %): ");
		String operation = scr.nextLine();
		System.out.print("Input second value: ");
		double y = scr.nextDouble();
		switch (operation){
		case "*":
			System.out.println(x * y);
			break;
		case "/":
			System.out.println(x / y);
			break;
		case "+":
			System.out.println(x + y);
			break;
		case "-":
			System.out.println(x - y);
			break;
		case "%":
			System.out.println(x % y);
			break;
		default:
			System.out.println("Unknown operation");
		}
		
		System.out.println("Input value");
		double a = scr.nextDouble();
		if (a > 0 && a < 1){
			System.out.println("Number is bigger than 0 and lower than 1");
	}
		else if (a >= 1){
			System.out.println("Number is equal or bigger than 1.");
	}
		else{
			System.out.println("Number is equal or lower than 0.");
	}
		while (true){
			System.out.println("C - calculator, R - random, Q - quit");
			String option = scr.nextLine();
			switch (option){
			case "c":
				System.out.print("Input first value: ");
				double x = scr.nextDouble();
				scr.nextLine();
				System.out.print("Choose opearion (/, *, +, -, %): ");
				String operation = scr.nextLine();
				System.out.print("Input second value: ");
				double y = scr.nextDouble();
				switch (operation){
				case "*":
					System.out.println(x * y);
					break;
				case "/":
					System.out.println(x / y);
					break;
				case "+":
					System.out.println(x + y);
					break;
				case "-":
					System.out.println(x - y);
					break;
				case "%":
					System.out.println(x % y);
					break;
				default:
					System.out.println("Unknown operation");
				}
			break;
			case "r":
				Random rnd = new Random();
				System.out.println("Input value");
				double a = scr.nextDouble();
				for (int i = 0; i <5; i++){
					int c = rnd.nextInt(100);
					if (a > c){
						System.out.println("Input value is greater than " + c);				
					}
					else if (a < c){
						System.out.println("Input value is lower than " + c);				
					}
					else{
						System.out.println("Input value is equal to " + c);				
					}
				}
			break;
			default:
				System.exit(0);
			break;
				
			}
		}
		System.out.println("Input value: ");
		int a = scr.nextInt();
		int sum = 0;
		for (int i =0; i <=a; i++){
			if (i % 2 != 0){
				System.out.println(i);
				sum += i;
			}
		}
		for (int i =0; i <=a; i++){
			if (i % 2 == 0 && i >0){
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("Sum = " + sum);
		System.out.println("Input first value: ");
		String s1 = scr.nextLine();
		System.out.println("Input second value: ");
		String s2 = scr.nextLine();
		char s3 = s2.charAt(s2.length()-3);
		int position1 = 0;
		int position2 = 0;
		System.out.println(s3);
		for (int a = 0; a < s1.length(); a ++){
			if (s1.charAt(a) != s3){
				System.out.print(s1.charAt(a));
			}
			else {
				System.out.println();
			}
		}
		System.out.print("Input your age: ");
		int age = scr.nextInt();
		if (age >= 18){
			System.out.println("You can vote.");
		}
		else{
			System.out.println("You are too young to vote.");
		}
		System.out.print("Input a string: ");
		String a = scr.nextLine();
		System.out.print("Input a values: ");
		int v = scr.nextInt();
		for (int i = 0; i < a.length(); i += v){
			System.out.println(a.charAt(i));
		}
		System.out.print("Input first value: ");
		int v1 = scr.nextInt();
		System.out.print("Input second value: ");
		int v2 = scr.nextInt();
		int sum = 0;
		
		
		for (int a = v1; a <= v2; a++){
			sum += a;
		}
		System.out.println(sum);
		sum = 0;
		
		
		int b = v1;
		while (b <=v2){
			sum += b;
			b ++;
		}
		System.out.println(sum);
		sum = 0;
		b = v1;
		
		
		do {
			sum += b;
			b ++;
		}
		while (b <=v2);
		System.out.println(sum);
		System.out.print("Input integer number: ");
		int a = scr.nextInt();
		for (int i = 0; i <= a; i++){
			System.out.println((int)Math.pow(2, i));
		}
		int a = 0;
		int max = 0;
		int min = 0;
		while(true){
			System.out.print("Input value: ");
			int b = scr.nextInt();
			if (b == 0){
				break;
			}
			else if (b > max || max == 0){
				max = b;
			}
			else if (b < min || min == 0 ){
				min = b;
			}
			a += b;
			
		}
		System.out.println("Sum = " + a + "\nMax value =" + max + "\nMin value = " + min + "\nSum of min and max = " + (min+max) + "\nAverage value of min and max = " + ((min+max)/2d));
		
		
		int max = 1;
		int min = 101;
		while(true){
				int ans = (min + max)/2;
				System.out.print("Is your number = " + ans + "\n1 - yes, 2 - bigger, 3 - lowwer: ");
				int guess = scr.nextInt();
				System.out.println(guess);
				if (guess == 1){
					System.out.println("Your number = " + ans);
					break;
				}
				else if (guess ==2){
					max = ans;		
				}
				else if (guess ==3){	
					min = ans;
				}
				else {
					System.out.println("break");
					break;
				}
			}
		Random rnd = new Random();
		while (true){
			int t = 10;
			int max = 1;
			int min = 101;
			int x = rnd.nextInt(100);
			System.out.println(x);
			while (t >=0){
				System.out.print("Input your guess: ");
				int g = scr.nextInt();
				if (g == x){
					System.out.println("You won!");
					break;
				}
				else if (g > x){
					System.out.println("Too big!");
				}
				else if (g < x){
					System.out.println("Too small!");
				}
				t --;
				System.out.println("You have " + t + " chancess left.");
			}
			System.out.print("Would you like to play again (y): ");
			scr.nextLine();
			String p = scr.nextLine();
			if (p.equals("y")){
				continue;
			}
			else{
				break;
			}
		}
		System.out.print("Input first value: ");
		int a = scr.nextInt();
		System.out.print("Input secound value: ");
		int b = scr.nextInt();
		for(int a1 = 1; a1 <= a; a1++){
			for(int b1 = 1; b1 <= b; b1++){
				if (a1 == 1){
					System.out.print("_");
				}
				else if (a1 == a){
					System.out.print("-");
				}
				
				else if (b1 == 1 || b1 == b){
					System.out.print("|");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/

		System.out.println("Input value: ");
        int poziomy = scr.nextInt();

        for (int i = 0; i < poziomy; i++) {
            for (int j = 0; j < poziomy * 2; j++) {
                if (j < (poziomy - i) || j > (poziomy + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                
            }
            System.out.println();
            }
        }
	}


