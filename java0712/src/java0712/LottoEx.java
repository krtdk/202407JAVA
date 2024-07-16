package java0712;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoEx {

	public static void main(String[] args) {
		int [] lotto = new int[6];
		Random rand = new Random();
		Set<Integer> lottoSet = new HashSet<>(); // 중복을 허용하지 않는 Set사용
		
		while (lottoSet.size() < 6) {
			int number = rand.nextInt(45) + 1; //1~45 사이의 난수 생성
			lottoSet.add(number);
		}
		//Set의 크기가 6이 될 떄 까지 번호를 추가
//		lottoSet.add(14);
//		lottoSet.add(14);
//		System.out.println(lottoSet.size());
		System.out.println(lottoSet);

}
}
