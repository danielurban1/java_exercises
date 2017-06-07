package j74;

public class Main {

	public static void main(String[] args) {
		Organism o1 = new Plant("a", "b");
		Animal c1 = new Cat("Gruppy", "b");
		Animal a1 = new Animal("Wolf", "b");
		Animal c2 = new Cat("Gruppy", "b");
		c1.doStuff();
		c1.printInfo();
		c1.interact(o1);
		c1.interact(o1);
		c1.interact(o1);
		c1.interact(o1);
		c1.interact(o1);
		c1.interact(a1);
		a1.interact(c1);
		c1.interact(c2);
	}

}
