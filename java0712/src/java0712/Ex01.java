package java0712;

import java.util.Scanner;

//2차원 배열을 이용하여 국어점수와 수학점수를 입력받아서 학생별 평균을 출력하는 프로그램 작성
//double scores[][] = new double[num][3];
public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수 입력");
		int num = Integer.parseInt(scan.nextLine());
		double scores[][] = new double[num][3]; // 국, 수 평균
		
		for (int i=0; i < scores.length; i++) {
			System.out.println(i+1 +"번째 학생");
			System.out.print("국어 점수:");
			scores[i][0] = Double.parseDouble(scan.nextLine());
			System.out.print("수학 점수:");
			scores[i][1] = Double.parseDouble(scan.nextLine());
			scores[i][2] = (scores[i][0] + scores[i][1]) /2 ;
		}
		System.out.printf("\t국어\t수학\t평균\n");
		System.out.println("=================================");
		for (int i=0; i < scores.length; i++) {
			System.out.printf("%d번 학생\t%3.2f\t %3.2f\t %3.2f\n", i+1, scores[i][0], scores[i][1], scores[i][2]);
			}
		}

	}
