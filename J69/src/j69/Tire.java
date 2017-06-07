package j69;

public class Tire extends Part{
	protected int size;
	protected int width;
	
	Tire(String name, String brand, String series, int size, int width) {
		super(name, brand, series);
		this.size = size;
		this.width = width;
	}
	
	public void appendWholesale(Wholesale wholesale){
		String part ="Name: " +  name + ", brand: " + brand + ", series: " + series + ", size:" + ", width: " + size + " id: " + getId() +"\n";
		wholesale.setParts(part);
	}
}
