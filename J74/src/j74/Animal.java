package j74;

public class Animal extends Organism{

	Animal(String name, String type) {
		super(name, type);
	}

	@Override
	public void printInfo() {
		System.out.println("Plant name: " + getName() + ", type: " + getType());
	}

	@Override
	public void doStuff() {
		System.out.println("Run!");
		
	}

	@Override
	public void interact(Organism organism) {
		if (organism instanceof Plant){
			eat((Plant)organism);
		}
		else if (organism instanceof Animal){
			System.out.println("Fight");
		}
		else if (organism instanceof Bactery){
			System.out.println("Get infected!");
		}
		}
	public void eat(Plant plant){
		if (plant.getHeight() > 0){
			plant.setHeight(plant.getHeight()-2);
			System.out.println("Animal is eating Plant! Current plant height is: "  + plant.getHeight());
			}
		else{
			System.out.println("Plant is already eaten");	
			}
	} 

		
	}


