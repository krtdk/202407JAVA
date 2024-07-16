package java0711;
import java.util.Scanner;
//3개의 정수 중 중간값 구하기
public class EX01 {
	public static int middle(int a, int b, int c) {
		if((b >= a && c <= a) || (b <= a && c >= a) ) {
			return a;
		}else if ((a > b && c < b) || (a < b && c > b)) {
			return b;
		}
		return c;
		
//		if(a>=b) {
//			if(b>=c) {
//				return b;
//			}else if(a <= c) {
//				return a;
//			}else {
//				return c;
//			}
//		} else if (a>c) {	//a는b보다 작다
//			return a;
//		}else if (b>c) {	//a는b보다 작다
//			return c;
//		}else {	//a는b보다 작다, a는 c보다 작거나 같다, b는 c보다 작거나 같다
//			return b;
//		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번쨰 수 입력:");
		int x = scan.nextInt();
		System.out.print("두번쨰 수 입력:");
		int y = scan.nextInt();
		System.out.print("세번쨰 수 입력:");
		int z = scan.nextInt();
	
		System.out.printf("중간값은 %d", middle(x,y,z));
		
	}
}
