package java0711;
//*을 n개 출력하되 w개마다 줄을 바꿔서 출력
import java.util.Scanner;
public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, w;
		
		System.out.println("*을 n개 출력하되 w개마다 줄을 바꿔서 출력합니다");
		
		do {
			System.out.print("n값 :");
			n = scan.nextInt();
		} while (n <= 0);
		
		do {
			System.out.print("w값 :");
			w = scan.nextInt();
		}while ( w<= 0 || w > n);
		
//		for(int i = 0; i < n; i++) {
//			System.out.print("*");
//			if (i % w == w-1) {
//				System.out.println();
//			}
//		}
//		if (n % w !=0) {
//			System.out.println();
//		}
//		System.out.println("완료");
		
		for (int i = 0; i <n /w; i++)
			System.out.println("*".repeat(n));
		
		int rest = n% w;
		if(rest != 0)	
			System.out.println("*".repeat(rest));
		
		System.out.println("완료!");
	}
}
