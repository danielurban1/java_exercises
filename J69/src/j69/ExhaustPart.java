package j69;

public class ExhaustPart extends Tire{
	protected boolean euFriendly;
	
	ExhaustPart(String name, String brand, String series, int size, int width, boolean euFriendly) {
		super(name, brand, series, size, width);
		this.euFriendly = euFriendly;
	}
	
	public void appendWholesale(Wholesale wholesale){
		String part = "Name: " +  name + ", brand: " + brand + ", series: " + series + ", size:" + ", width: " + size + ", euFriendly: " + euFriendly + " id: " + getId() +"\n";
		wholesale.setParts(part);
	}
}
