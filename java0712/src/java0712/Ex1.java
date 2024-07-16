package java0712;
import java.util.Random;
public class Ex1 {
	public static void main(String[] args) {
		Random rd = new Random();
		for (int i= 0; i < 6; i++) {
			System.out.println(rd.nextInt(45)+1); //강제 형변환(int)(Math.random()*45+1)
		}
	}
}
