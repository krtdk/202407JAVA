package java0711;
//+, - 기호를 번갈아 출력하는 프로그램을 작성
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		do{
			System.out.print("n값 입력:");
			n = scan.nextInt();
		}while ( n<= 0);
		
//		for(int i = 1; i <=n; i++) {
//			if(i%2==0) {
//				System.out.print("-");
//			}else {
//				System.out.print("+");
//			}
//		}
		
		for(int i = 0; i < n/2 ; i++) {
			System.out.print("+-");
		}
		if (n % 2 !=0) { //홀수이면
			System.out.print("+");
		}
	}
}

