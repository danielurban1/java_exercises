package j66;
import java.util.Scanner;

import j66.Magazin;

public class Product {
	Scanner scr = new Scanner(System.in);
	
	private String product;
	private int quantity;
	private double price;
	
	Product(String product, int quantity, double price){
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void addProduct(Magazin magazin){
		magazin.setInStock(product, quantity);
		magazin.setPrice(product, price);
	}
	
}
