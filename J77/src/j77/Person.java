package j77;

public class Person {
	private String name;
	private String surename;
	
	Person(String name, String surename){
		setName(name);
		setSurename(surename);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurename() {
		return surename;
	}
	public void setSurename(String surename) {
		this.surename = surename;
	}
	
}
