package java0709;
//정수 값을 입력받고 입력ㄹ받은 값이 양의 정수이면 그냥 출력하고 음의 정수이면 양의 정수로 변환하여 출력
import java.util.Scanner;

public class EX06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.print("정수를 입력하세요: ");
		int number = Integer.parseInt(scan.nextLine());
		
		if(number < 0) {
			number = number*-1;
		}
		System.out.printf("입력한 값 = %d\n", number);
		}
	}
}
