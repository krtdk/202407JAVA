package java0709;

import java.util.Scanner;

public class EX03 {
	public static int getCount(String msg, Scanner sc) {
		System.out.print(msg);
		String input = sc.nextLine();
		return Integer.parseInt(input);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int inputApple = getCount("사과 입력:", scan); 
		
		int inputPeople= getCount("사람 입력:", scan); 
		
			//System.out.println("사과 입력: ");
			//String input = scanner.nextLine();
			//int apple = Integer.parseInt(input);
			//System.out.println("사람 입력: ");
			//String input = scanner.nextLine();
			//int apple = Integer.parseInt(input);
			int inputRemain = inputApple % inputPeople;
			System.out.printf("남는 사과 개수 = %d", inputRemain);
			
		}
	}
