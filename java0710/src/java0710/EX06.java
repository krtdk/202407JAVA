package java0710;
//구구단 출력하기(단 입력 받아서)
import java.util.Scanner;

public class EX06 {
	public static void multiple(int x) {
		for(int y = 1; y <= 9; y++) {
			int z = x * y;
			System.out.printf("%d * %d = %d\n", x, y, z);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int i = scan.nextInt();
		System.out.printf("%d단 출력\n", i);
		multiple(i);
	}
}