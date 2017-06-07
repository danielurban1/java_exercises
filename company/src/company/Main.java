package company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		Goods products = new Goods();
		HashMap<String, Integer> listOfProducts = new HashMap<>();
		System.out.println(products.setGoods());
		listOfProducts = products.setGoods();
		Cash shopCash = new Cash();
		ArrayList<String> chartStatus = new ArrayList<>();
		shopCash.addToChart(listOfProducts);
	}

}
