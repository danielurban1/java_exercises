package j65;
import j65.Point;

public class PointControler {
		
	public void addX(Point point) {
		int x = point.getPointX();
		point.setPointX(x + 1);
	}
	
	public void minusX(Point point) {
		int x = point.getPointX();
		point.setPointX(x - 1);
	}
	
	public void addY(Point point) {
		int y = point.getPointX();
		point.setPointX(y + 1);
	}
	
	public void minusY(Point point) {
		int y = point.getPointX();
		point.setPointX(y - 1);
	}
}
