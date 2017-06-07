package j73;

public abstract class Animal {
	private String name;
	private int legs;
	
	Animal(String name, int legs){
		setName(name);
		setLegs(legs);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public abstract void printInfo();
}
