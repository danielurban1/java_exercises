package j74;

public class Cat extends Animal{

	Cat(String name, String type) {
		super(name, type);
		// TODO Auto-generated constructor stub
	}
	public void printInfo(){
		super.printInfo();
		System.out.println("Meow!");
	}
	public void interact(Organism organism) {
		while (true){
		if (organism instanceof Cat){
			System.out.println("Pryyy!");
			break;
		}
		else{
		super.interact(organism);
		break;
		}
	}}
}
