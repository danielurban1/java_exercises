package j77;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompanyApp {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		Company c = new Company();
		
		File file = new File("C:/Users/Daniel/Desktop/employees.txt");
		Scanner in = new Scanner(file);
		
		while (in.hasNextLine()){
		String emp = in.nextLine();
		Employee e1 = new Employee();
		c.setEmployeeList(e1.getEmployeeString(emp));
		}
		System.out.println(c.getEmployeeList());
	}

}
