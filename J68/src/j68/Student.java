package j68;

public class Student {
	private String name;
	private String sureName;
	private int indexNumber;
	private static int id;
	
	Student(String name, String sureName, int indexNumber){
		this.name = name;
		this.sureName = sureName;
		this.indexNumber = indexNumber;
		setId(getId() + 1);
	}
	
	public static int getId() {
		return id;
	}
	
	public static void setId(int id) {
		Student.id = id;
	}
}
