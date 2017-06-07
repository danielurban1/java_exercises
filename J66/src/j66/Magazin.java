package j66;

import java.util.HashMap;
import java.util.Scanner;

public class Magazin {
	Scanner scr = new Scanner(System.in);
	private HashMap<String, Integer> inStock = new HashMap<String, Integer>();
	private HashMap<String, Double> price = new HashMap<String, Double>();
	
	public HashMap<String, Integer> getInStock() {
		return inStock;
	}
	
	public void setInStock(String product, int quantity) {
		this.inStock.put(product, quantity);
	}
	
	public HashMap<String, Double> getPrice() {
		return price;
	}
	
	public void setPrice(String product, double price) {
		this.price.put(product,  price);
	}
	
	public void delProduct(String product) {
		this.price.remove(product);
		this.inStock.remove(product);
	}
	public void changeQuantity(){
		while (true){
			System.out.print("Input product name: ");
			String productName = scr.nextLine();
			
			if (getInStock().containsKey(productName)){
				System.out.println(getInStock().get(productName));
				System.out.print("Input new product quantity: ");
				
				int quantity = scr.nextInt();
				setInStock(productName, quantity);
				break;
			} 
			else {
				System.out.println("Such product does not exist.");
				break;
			}
			
	}}
	
}
