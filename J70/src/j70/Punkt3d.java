package j70;

public class Punkt3d extends Punkt2d{
	private int z;
	
	Punkt3d(){
		setX(0);
		setY(0);
		this.setZ(0);
	}
	
	Punkt3d(int x, int y, int z){
		setX(x);
		setY(y);
		this.setZ(z);
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void moveZ(int move){
		setZ(getZ() + move);
	}
}
