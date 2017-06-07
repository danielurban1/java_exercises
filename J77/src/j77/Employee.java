package j77;

public class Employee extends Person{
	private int income;
	
	Employee(String name, String surename, int income) {
		super(name, surename);
		this.income = income;
	}
	
	Employee() {
		super("", "");
		this.income = 0;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}
	
	public String getEmployeeString(String employee){
		return employee;
	}
	
	public String getEmployee(){
		String employee = getName() + " " + getSurename() + " " + getIncome();
		return employee;	
	}
	
}
