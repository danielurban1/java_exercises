package j72;

public class Fruit {
	private String info;
	
	Fruit(){
		this.setInfo("fruit");
	}
	Fruit(String fruit){
		this.setInfo(fruit);
	}
	
	protected String printInfo(){
		return getInfo();
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
