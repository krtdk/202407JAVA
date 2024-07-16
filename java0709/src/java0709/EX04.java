package java0709;
import java.util.Scanner;

public class EX04 {
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

		if(first > second) {
			System.out.println(first);
		}else if(first < second) {
			System.out.println(second);
		}else if(first == second) {
			System.out.println("같음");
		}
		}
	
	}
}			

	