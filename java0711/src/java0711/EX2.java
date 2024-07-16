package java0711;

import java.util.Scanner;

public class EX2 {
	public static void main(String[] args) {
		boolean mainRun= true;
		Scanner scanner = new Scanner(System.in);
		int balance = 0;
		String id="java";
		int password=1234;
		
		while(mainRun) {
			System.out.println("--------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택>");
			
			int menuNum = Integer.parseInt(scanner.nextLine());
			
					
			switch (menuNum) {
			case 1:
				System.out.println("로그인 처리");
				System.out.print("아이디:");
				String loginId = scanner.nextLine();
				System.out.print("패스워드:");
				int loginPwd = Integer.parseInt(scanner.nextLine());
				if(loginId.equals(id) && loginPwd == password) {
					System.out.println("로그인 성공");
				}else if (loginId.equals(id) && loginPwd != password) {
					System.out.println("로그인 실패 : 패스워드가 틀림");
				}else {
					System.out.println("로그인 실패 : 아이디가 틀림");
				}
				break;
			case 2:
				System.out.println("회원 가입 \n [필수 정보 입력]");
				System.out.print("1. 이름:");
				String usrName = scanner.nextLine();
				System.out.print("2. 주민번호 앞 6자리:");
				int usrNumber = Integer.parseInt(scanner.nextLine());
				System.out.print("3. 전화번호:");
				String usrPhone = scanner.nextLine();
				System.out.print("4. 아이디:");
				String usrId = scanner.nextLine();
				id = usrId;
				System.out.print("5. 비밀번호:");
				int usrPwd = Integer.parseInt(scanner.nextLine());
				password = usrPwd;
				System.out.println("[입력된 내용]");
				System.out.printf("1. 이름: %s \n 2. 주민번호 앞 6자리: %d \n 3. 전화번호: %s\n", usrName, usrNumber, usrPhone);
				System.out.printf("4. 아이디: %s \n 5. 비밀번호: %d\n", usrId, usrPwd);
				break;
			case 3:
				boolean run = true;
				while(run) {
					System.out.println("--------------------------");
					System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
					System.out.println("--------------------------");
					System.out.print("선택>");
					
					int bankMenuNum = Integer.parseInt(scanner.nextLine());
					
					switch(bankMenuNum) {
					case 1:
						System.out.print("예금액> ");
						balance += Integer.parseInt(scanner.nextLine());
						break;
					case 2:
						System.out.print("출금액> ");
						balance -= Integer.parseInt(scanner.nextLine());
						break;
					case 3:
						System.out.print("잔액> ");
						System.out.println(balance);
						break;
					case 4:
						run = false;
					}
				} break;
			case 4:
				mainRun = false;
			}
		}
	}
}
				
			
	
	

