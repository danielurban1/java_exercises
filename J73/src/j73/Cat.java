package j73;

public class Cat extends Animal{

	Cat(String name) {
		super(name, 4);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printInfo() {
		System.out.println("Cat " + getName() +" has " + getLegs() + " legs.");
		
	}

}
