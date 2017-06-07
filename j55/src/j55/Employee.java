package j55;

public class Employee {
	String name;
	String surename;
	int age = 0;
	
	Employee(String name){
		this.name = name;
		this.surename =  "placeholder";
		this.age = 0;
		

	}
	Employee(String name, String surename){
		this(name);
		this.surename = surename;
	}
	Employee( int age){
		this.age = age;
	}
}
