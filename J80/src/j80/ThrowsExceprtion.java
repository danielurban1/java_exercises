package j80;

import java.util.Random;

public class ThrowsExceprtion {
	
	static void shuffle() throws Exc, Exc2, Exc3 {
		Random rd = new Random(); 
		switch (rd.nextInt(3)){
		case 0:
			throw new Exc();
		case 1:
			throw new Exc2();
		case 2:
			throw new Exc3();
		}
	} 
	
	public static void main(String[] args){
		try{
			shuffle();
		}
		catch (Exc a){
				a.sendMsq();
		} catch (Exc2 b) {
			// TODO Auto-generated catch block
			b.sendMsq();
		} catch (Exc3 c) {
			// TODO Auto-generated catch block
			c.sendMsq();
		}
	}
}
