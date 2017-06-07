package firstproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ThirdProject {
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scr = new Scanner(System.in);
		/*
		Scanner scr = new Scanner(System.in); 
		System.out.print("Input integer number: ");
		int num = scr.nextInt();
		for (int number = 1; number <= num; number ++){
			if (num % number == 0){
				System.out.println(number);
			}			
		}
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 50;
		numbers[2] = 100;
		numbers[3] = 200;
		numbers[4] = 400;
		
		int[] numbers2 = new int[5];
		numbers2[0] = 1;
		numbers2[1] = 50;
		numbers2[2] = 100;
		numbers2[3] = 200;
		numbers2[4] = 400;
		int sum = 0;
		
		for (int len = 0; len <numbers2.length; len ++ ){
			sum += numbers[len] + numbers2[len];
		}
		System.out.println(sum);
		String[] firstName = {"Karol", "Basia", "Kasia"};
		String[] lastName = {"Kowalski", "Nowakowska", "Wadecka"};
		String[][] firstLast = {firstName, lastName};
		System.out.println(firstLast[0][1] + " " + firstLast[1][1]);
		int[] randomList = new int[10];
		
		int max = -10;
		int min = 10;
		int sum = 0;
		int lower = 0;
		int bigger = 0;
		for (int i = 0; i < randomList.length; i ++){
			randomList[i] = rnd.nextInt(21)-10;
			if (randomList[i] > max){
				max = randomList[i];
			}
			if (randomList[i] > min){
				min = randomList[i];
			}
			sum += randomList[i];
		}
		for (int i = 0; i < randomList.length; i ++){
			if (randomList[i] < sum/randomList.length){
				lower += 1;
			}
			else {
				bigger += 1;
			}
		}
		System.out.print("List contains: " + Arrays.toString(randomList) +"\nMax value: " + max + "\nMin value: " + min + "\nAvg value: "+ sum/randomList.length + "\nNumber o values > avg: " + bigger + "\nNumber o values < avg: " + lower);
		 
		int[] randomList = new int[20];
		for (int i = 0; i < randomList.length; i ++) {
			randomList[i] = rnd.nextInt(20) + 1;
		}
		System.out.print("List contains: " + Arrays.toString(randomList));
		for (int i = 0; i < randomList.length; i ++) {
			randomList[i] = rnd.nextInt(11)+10;
		}
		int[] ints = Ints.toArray(randomList);
		for (int i = 0; i < randomList.length; i ++) {
			
		}
		int[][] randomList = new int[5][5];
		int [][] minMax = new int [5][2];
		int a = 0;
		for (int[] randomcol: randomList){
			int i = 0;
			int max = -5;
			int min =5;
			for (int ranval: randomcol){
				ranval = rnd.nextInt(11)-5;
				System.out.print(ranval + " ");
				if (ranval > max){
					ranval = max;
				}
				if (ranval < min){
					ranval = max;
				}
				i ++;
			}
			
			System.out.println("Max value in row: ");
		}
		System.out.println(Arrays.toString(randomList));
		System.out.print("Input int value: ");
		int toConver = scr.nextInt();
		int[] bitValue = new int[32];
		int index = bitValue.length -1;
		int copyToConvert = toConver;
		while (copyToConvert > 0) {
			System.out.println("Before % "+copyToConvert);
			bitValue[index--] = (byte)(copyToConvert %2);
			System.out.println("After % "+copyToConvert);
			copyToConvert /= 2;
			System.out.println("After / "+copyToConvert);
		}
		System.out.println(Arrays.toString(bitValue));
		int[][] matrix1 = new int[3][];
		int[][] matrix2 = new int[3][];
		int[][] matrix3 = new int[3][3];
		int[] row1_matrix1 = {1, 0, 0};
		int[] row2_matrix1 = {0, 1, 0};
		int[] row3_matrix1 = {0, 0, 1};
		int[] row1_matrix2 = {1, 0, 0};
		int[] row2_matrix2 = {0, 1, 0};
		int[] row3_matrix2 = {0, 0, 1};
		matrix1[0] = row1_matrix1;
		matrix1[1] = row2_matrix1;
		matrix1[2] = row3_matrix1;
		matrix2[0] = row1_matrix2;
		matrix2[1] = row2_matrix2;
		matrix2[2] = row3_matrix2;
		for (int y = 0; y < 3; y++){
			for (int x = 0; x < 3; x++){
				matrix3[x][y] = matrix1[x][y] + matrix2[x][y];
				System.out.print(matrix3[x][y] + ", ");
			}
			System.out.println();
		}
		
		int[][] matrix1 = new int[10][10];
		for (int y = 0; y < matrix1.length; y ++){
			for (int x = 0; x < matrix1.length; x ++){
				matrix1[x][y] = (x+1) * (y+1);
				System.out.print(matrix1[x][y] + "\t");
			}
			System.out.println();
		}
		ArrayList<String> newList = new ArrayList<>();
		newList.add("Daniel");
		newList.add("Urban");
		newList.add("Monika");
		System.out.println(newList.size());
		newList.remove(1);
		System.out.println(newList);*/
		/*
		HashSet<String> zbior = new HashSet<>();
		zbior.add("Daniel");
		zbior.add("Urban");
		System.out.println(zbior.contains("a"));*/
		/*
		HashMap<String, String> map = new HashMap<>();
		map.put("1", "Daniel");
		map.put("2", "Urban");
		map.put("3", "Monika");
		System.out.println(map);
		map.remove("1");
		System.out.println(map);*/
		/*
		ArrayList<String> newList = new ArrayList<>();
		while (true){
			System.out.print("Insert something into list or type end to exit: ");
			String newListElement = scr.nextLine();
			if (newListElement.equals("end")){
				break;
			}
			else{
				newList.add(newListElement);
			}
			
		}
	System.out.println(newList);*/
		HashMap<String, Double> shopItems = new HashMap<>();
		ArrayList<String> inChart = new ArrayList<>();
		shopItems.put("Eggs", 2.5);
		shopItems.put("Milk", 1.5);
		shopItems.put("Ham", 4.5);
		double toPay = 0;
		while (true){
			System.out.print("Choose your product " + shopItems +": ");
			String buy = scr.nextLine();
			if (buy.equals("end")){
				break;
			}
			if (inChart.size() != 0){
				for (int i = 0; i <inChart.size(); i++){
					if (buy.equals(inChart.get(i))){
						System.out.print("This product is already in your chart. Add it anyway? (y): ");
						String yes = scr.nextLine();
						if (yes.equals("y")){
							continue;
						}
						else{
							break;
						}
					}
				}
				}
			
				try{
					toPay += shopItems.get(buy);
					System.out.println(buy + " was added to chart.");
					inChart.add(buy);
				}
				catch(NullPointerException z){
					System.out.println("Such product does not exist. Try again.");
				}
			
			

		}
		System.out.println("To pay: " + toPay);
	}
		
}
