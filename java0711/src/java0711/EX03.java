package java0711;
//정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드를 작성 ex)sumOf(4,2)
import java.util.Scanner;
public class EX03 {
	public static int sumOf(int x, int y) {
//		int sum = 0;
//		if(x<y) {
//			for(int i=x; i<=y; i++) {
//				sum += i;
//			}
//		}else if(x>y){
//			for(int i=y; i<=x; i++) {
//				sum += i;
//			}
//		}return sum;
		
		int min, max;
		if (x < y) {
			min = x; max =y;	
		}else {
			min = y; max = x;
		}
		int sum = 0;
		for (int i=min; i <= max; i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a 값:");
		int a = scan.nextInt();
		System.out.print("b 값:");
		int b = scan.nextInt();
		System.out.println("a,b 사이 총합은" + sumOf(a,b));
	}
}
