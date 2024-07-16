package java0711;
//1부터 n까지의 합과 구하는 과정을 출력하는 프로그램 작성
import java.util.Scanner;
public class EX04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum=0;
		int n;
		System.out.print("정수 입력:");
		do {
			System.out.print("n의 값:");
			n = scan.nextInt();
		}while (n<=0);
		
	
//		for(int i=1; i <= n; i++) {
//			sum += i;
//			if(i<n) {
//				System.out.print(i+"+");
//			}else {
//				System.out.print(i+"=");
//			}
//		}
//		System.out.println(sum);
		
		
		for(int i=1; i < n; i++) {
			System.out.print(i+"+");
			sum += i;
		}
		System.out.print(n+"=");
		sum += n;
		System.out.println(sum);

	}

}
