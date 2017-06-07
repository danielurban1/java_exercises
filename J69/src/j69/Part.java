package j69;
import j69.Wholesale;

public class Part {
	protected String name;
	protected String brand;
	protected String series;
	protected static int id;
	Part(String name, String brand, String series){
		this.name = name;
		this.brand = brand;
		this.series = series;
		setId(getId() + 1);
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Part.id = id;
	}
	
	public void appendWholesale(Wholesale wholesale){
		String part ="Name: " +  name + ", brand: " + brand + ", series: " + series + " id: " + getId() +"\n";
		wholesale.setParts(part);
	}
}