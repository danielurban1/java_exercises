package j69;

import java.util.ArrayList;

public class Wholesale {
	private ArrayList<String> parts;
	
	Wholesale(){
		parts = new ArrayList<String>();
	}

	public ArrayList<String> getParts() {
		return parts;
	}

	public void setParts(String part) {
		this.parts.add(part);
	} 
	
	public void printList(){
		for(int i = 0; i < getParts().size(); i++){
			System.out.print(getParts().get(i));
		}

	}
}
