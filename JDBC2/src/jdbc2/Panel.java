package jdbc2;

public class Panel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DB db1 = new DB("aaa fff", 3, 7);
		db1.insert();
		DB.show();
		//db1.insert();
	}

}
