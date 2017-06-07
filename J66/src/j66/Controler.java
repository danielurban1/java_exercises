package j66;
import java.util.Scanner;

import j66.Magazin;
import j66.Product;

public class Controler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		Magazin magazin = new Magazin();
		while (true){
			System.out.print("A - add new product, D - del product, U - change product quantity: ");
			String option = scr.nextLine();
			if (option.equals("A")){
				System.out.print("Input product name: ");
				String product_name = scr.nextLine();
				
				System.out.print("Input product quantity: ");
				int product_quantity = scr.nextInt();
				
				System.out.print("Input product price: ");
				double product_price = scr.nextDouble();
				
				Product product = new Product(product_name, product_quantity, product_price);
				product.addProduct(magazin);
				
				System.out.println(magazin.getInStock());
				System.out.println(magazin.getPrice());
			}
			else if (option.equals("D")){
				System.out.print("Input product name: ");
				String product_name = scr.nextLine();
				magazin.delProduct(product_name);
				
				System.out.println(magazin.getInStock());
				System.out.println(magazin.getPrice());
			}
			else if (option.equals("U")){
				magazin.changeQuantity();
			}
		}
		
	}

}
