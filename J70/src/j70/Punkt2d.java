package j70;

public class Punkt2d {
	private int x;
	private int y;

	Punkt2d(){
		this.x = 0;
		this.y = 0;
	}
	
	Punkt2d(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void moveX(int move){
		setX(getX() + move);
	}
	
	public void moveY(int move){
		setY(getY() + move);
	}
}
