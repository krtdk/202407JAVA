package java0719;

public class Ex1 {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String2");
			System.out.println("클래스 있다");
		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		// TODO Auto-generated method stub

	}

}
