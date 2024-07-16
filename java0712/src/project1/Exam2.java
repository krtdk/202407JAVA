package project1;

public class Exam2 {
	public static void main(String[] args) {
		Member mb = null; //로그인 했을때 가져올 변수 
		Member[] list = { //초기회원정보
				new Member("강하나", "911224", "010-1234-5678",0),
				new Member("김하나", "891224", "010-1234-5678",0),
				new Member("이하나", "911224", "010-1234-5678",0)
		};
		 for (Member member : list) {
			 System.out.println(member);
		 }
		 int find = -1; // 찾기 전 또는 못찾았을때
		 
		 for(int i=0; i <list.length; i++) {
			 if(list[i].name.equals("김하나") && list[i].ssn.equals("891224")) {
				 find = i;
				 mb = list[i];
				 break;
			 }
		 }
		 System.out.println("인덱스:"+ find);
		 System.out.println(mb);
	}
}
