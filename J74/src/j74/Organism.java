package j74;

public abstract class Organism {
	private String name;
	private String type;
	
	Organism(String name, String type){
		setName(name);
		setType(type);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public abstract void printInfo();
	
	public abstract void doStuff();
	

	public void interact(Organism organism){
		
	}

}
