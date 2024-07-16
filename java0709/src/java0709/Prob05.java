package java0709;

public class Prob05 {
	public static void main(String[] args) {
		int in = 77;
		String score = (in >= 90) ? "A" :
						(in >= 80) ? "B" :
						(in >= 70) ? "C" :
							(in >= 60)? "D" : "F";
		
		switch(in/10) {
		case 10:
		case 9:
			score = "A";
			break;
		case 8:
			score = "B";
			break;
		case 7:
			score = "C";
			break;
		case 6:
			score = "D";
			break;
		default:
			score = "F";
		}
		System.out.println(score);
	}
}
