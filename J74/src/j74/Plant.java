package j74;

public class Plant extends Organism{
	private int height;

	Plant(String name, String type) {
		super(name, type);
		setHeight(10);
	}

	@Override
	public void printInfo() {
		System.out.println("Plant name: " + getName() + ", type: " + getType());
	}

	@Override
	public void doStuff() {
		setHeight(getHeight()+10);
		System.out.println("Grow! Current height: " +  getHeight());
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


}
