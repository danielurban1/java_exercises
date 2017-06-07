package j74;

public class Bactery extends Organism{
	Bactery(String name, String type){
		super(name, type);
	}

	@Override
	public void printInfo() {
		System.out.println("Bactery name: " + getName() + ", type: " + getType());
		
	}

	@Override
	public void doStuff() {
		System.out.println("Infect!");
		
	}




	
}
