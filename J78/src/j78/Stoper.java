package j78;

import java.util.Scanner;

public class Stoper {

	public static void main(String[] args) {
		while (true){
			Scanner sc = new Scanner(System.in);
			System.out.print("Press eneter to start stoper: ");
			String a = sc.nextLine();
			long nowMillis1 = System.currentTimeMillis();
			System.out.print("Press eneter to stop stoper: ");
			String b = sc.nextLine();
			long nowMillis2 = System.currentTimeMillis();
			System.out.println((nowMillis2 - nowMillis1));
			System.out.print("Start again?");
			String c = sc.nextLine();
			if (c.equals("Y")){
				continue;
			}
			else{
				break;
			}
		}
	}

}
