package java0710;
//구구단 출력하기(전체)
public class EX05 {
	public static void main(String[] args) {
		int i, j, result;
		for(i=1; i<=9; i++) {
			for(j=1; j<=9; j++) {
				result = i * j;
				System.out.printf("%d * %d = %d \n", i, j, result);
			}
		}
	}
}
