package j72;

public class Apple extends Fruit{
	private String appleType;
	
	Apple(){
		super();
		this.setAppleType("aaa");
	}
	
	Apple(String type, String appleType){
		super(type);
		this.setAppleType(appleType);
	}
	
	protected String printInfo(){
		return super.printInfo() + ": " + getAppleType();
	}

	public String getAppleType() {
		return appleType;
	}

	public void setAppleType(String appleType) {
		this.appleType = appleType;
	}
}
