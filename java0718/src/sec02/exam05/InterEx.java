package sec02.exam05;

public class InterEx {
	public static void main(String[] args) {
		ImpleC implC = new ImpleC();
		
		InterfaceA ia= implC;
		ia.methodA();
		
		InterfaceB ib = implC;
		ib.methodB();
		
	}
}
