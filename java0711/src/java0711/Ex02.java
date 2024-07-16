package java0711;
//for 문으로 1부터 n까지의 합을 구하시오(n은 입력받은 정수)
import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		int sum=0;
		int n;
		System.out.print("정수 입력:");
		do {
			System.out.print("n의 값:");
			n = scan.nextInt();
		}while (n<=0);
		
	
		for(i=1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}

}
