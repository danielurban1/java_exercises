package example;

public class Printer {
	private String text = "Sample text";
	
	public void printText(){
		System.out.println(getText());
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
