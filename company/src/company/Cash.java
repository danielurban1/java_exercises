package company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Cash {
	public ArrayList addToChart(HashMap<String, Integer> products) {
		Scanner scr = new Scanner(System.in);
		ArrayList<String> inChart = new ArrayList<>();
		System.out.print(products);
		while (true) {
			System.out.print("Choose your product or type end to exit.\nAvalible products " + products + ": ");
			String chooseProduct = scr.nextLine();
			for (int i = 0; i < products.size(); i++) {
				System.out.println(products.get(chooseProduct));
				if (chooseProduct.equals(products.get(chooseProduct))) {
					inChart.add(chooseProduct);
					System.out.println("Added " + chooseProduct + " to chart.");
					System.out.println("Your chart " + inChart);
				} else if (chooseProduct.equals("end")) {
					return inChart;
				} else {
					System.out.println("Such product does not exist. Try again.");
				}

			}
		}

	}
	public void toPay(ArrayList<String> inChart, HashMap<String, Integer> products){
		int toPay = 0;
		for (int y = 0; y < inChart.size(); y++){
			for (int x = 0; x < products.size(); x++){
				if (inChart.get(y).equals(products.get(x))){
					toPay += products.get(inChart.get(y));
				}
			}
		}
		System.out.println("You have to pay: " + toPay);
		return;
		
	}
}
