package java0710;
//1부터 100까지 합을 구하세요
public class EX02 {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		for(i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
