package app;
import j65.Point;
import j65.PointControler;

public class PointAplication {

	public static void main(String[] args) {
		Point point = new Point(45,45);
		PointControler controler = new PointControler();
		controler.addX(point);
		System.out.println(point.getPointX());
	}

}
