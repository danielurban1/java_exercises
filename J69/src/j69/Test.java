package j69;

public class Test {

	public static void main(String[] args) {
		Wholesale wholesale = new Wholesale();
		Part part1 = new Part("a", "b", "s");
		part1.appendWholesale(wholesale);
		Wheel wheel1 = new Wheel("wheel", "cb", "sa", 1 ,3);
		wheel1.appendWholesale(wholesale);
		Part part3 = new Part("a", "b", "s");
		part3.appendWholesale(wholesale);
		Wheel wheel2 = new Wheel("wheel", "cb", "sa", 1 ,3);
		wheel2.appendWholesale(wholesale);
		ExhaustPart ep = new ExhaustPart("ExhaustPart", "cb", "sa", 1 ,3, true);
		ep.appendWholesale(wholesale);
		Tire tire1 = new Tire("tire1", "cb", "sa", 1 ,3);
		tire1.appendWholesale(wholesale);
		wholesale.printList();

	}

}
