package p303;

public class Person {
	final String nation = "Korea";
//	final String ssn;
	String name;
	static final double PI = 3.141592;
//	
//	public Person(String ssn, String name) {
//		this.ssn = ssn;
//		this.name = name;
//	}
	
	public static void main(String[] ar) {
		Person p1 = new Person();
		/* p1.nation = "USA"; */
		System.out.println(p1.nation);
	}
}
