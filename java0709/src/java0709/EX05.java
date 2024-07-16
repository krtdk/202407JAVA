package java0709;
//문제 5 : 학점 계산
import java.util.Scanner;

public class EX05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char grade;
		int score;
		while(true) {
		System.out.print("점수 입력: ");
		score = Integer.parseInt(scan.nextLine());
		
		if (score >= 90 && score <= 100) {
			grade = 'A';
		}else if(score >= 80 && score < 90) {
			grade = 'B';
		}else if(score >= 70 && score < 80) {
			grade = 'C';
		}else if(score >= 60 && score < 70) {
			grade = 'D';
		}else if(score >=0 && score < 60) {
			grade = 'F';
		}else {
			System.out.println("다시 입력하세요");
			continue;
		}		
		System.out.printf("학점은 %c\n", grade);
	}}
}			


