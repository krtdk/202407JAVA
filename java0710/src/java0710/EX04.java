package java0710;
//1부터 100까지 짝수의 합계를 구하세요
public class EX04 {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		for(i=1; i<=100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		} 
		System.out.println(sum);
	}
}
