package java0709;
//3개의 정수값을 받아서 최대값을 구하여 출력
import java.util.Scanner;

public class EX0404 {
	public static int getCount(String msg, Scanner sc) {
		System.out.print(msg);
		String input = sc.nextLine();
		return Integer.parseInt(input);
	}	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		int first = getCount("첫번째 수 입력:", scan); 
        int second = getCount("두번째 수 입력:", scan); 
        int third = getCount("세번째 수 입력:", scan);

        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        System.out.printf("가장 큰 수 = %d\n", max);
    }}
}