package java0709;

public class EX01 {
	public static void EX01(int x, int y) {
		
	}
	public static void main(String[] args) {
	
		int x = 10;
		int y = 20;
		System.out.printf("x=%d" ,"y=%d\n" ,x, y);
		EX01(x, y);
		int z;
		
		z=y;
		y=x;
		x=z;
		System.out.printf("x=%d" ,"y=%d\n" ,x, y);

	}
}
