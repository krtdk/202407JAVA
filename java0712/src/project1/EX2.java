package project1;

import java.io.*;
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Member[] members = new Member[10];
        int memberCount = 0; // 현재 회원 수
        Member mb = null; // 로그인한 회원 정보를 저장할 변수
        Scanner scanner = new Scanner(System.in);

        // 프로그램이 시작될 때 파일에서 객체 배열을 읽어 온다
        try (FileInputStream fis = new FileInputStream("C:\\temp\\members.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Member[] loadedMembers = (Member[]) ois.readObject();
            System.arraycopy(loadedMembers, 0, members, 0, loadedMembers.length);
            memberCount = loadedMembers.length;
            System.out.println("파일에서 객체를 가져왔습니다.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        boolean mainRun = true;

        while (mainRun) {
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
                    String loginPwd = scanner.nextLine();
                    int find = -1;

                    // 로그인 시 객체 배열에서 검색하여 로그인 처리
                    for (int i = 0; i < memberCount; i++) {
                        if (members[i].name.equals(loginId) && members[i].ssn.equals(loginPwd)) {
                            find = i;
                            mb = members[i];
                            break;
                        }
                    }

                    if (mb != null) {
                        System.out.println("로그인 성공");
                    } else {
                        System.out.println("로그인 실패 : 아이디 또는 패스워드가 틀림");
                    }
                    break;

                case 2:
                    if (memberCount >= 10) {
                        System.out.println("회원 가입이 불가능합니다. 최대 회원 수에 도달했습니다.");
                    } else {
                        System.out.println("회원 가입 \n [필수 정보 입력]");
                        System.out.print("1. 이름:");
                        String usrName = scanner.nextLine();
                        System.out.print("2. 주민번호 앞 6자리:");
                        String usrNumber = scanner.nextLine();
                        System.out.print("3. 전화번호:");
                        String usrPhone = scanner.nextLine();
                        System.out.println("[입력된 내용]");
                        System.out.printf("1. 이름: %s \n2. 주민번호 앞 6자리: %s \n3. 전화번호: %s\n", usrName, usrNumber, usrPhone);

                        // 회원가입 시 객체 배열에 추가
                        Member newMember = new Member(usrName, usrNumber, usrPhone, 0);
                        members[memberCount] = newMember;
                        memberCount++;

                        // 새로 추가된 회원 정보를 파일에 저장
                        try (FileOutputStream fos = new FileOutputStream("C:\\temp\\members.dat");
                             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                            oos.writeObject(members);
                            System.out.println("회원 정보를 파일에 저장했습니다.");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

                case 3:
                    if (mb == null) {
                        System.out.println("로그인이 필요합니다.");
                    } else {
                        boolean run = true;
                        while (run) {
                            System.out.println("--------------------------");
                            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
                            System.out.println("--------------------------");
                            System.out.print("선택>");

                            int bankMenuNum = Integer.parseInt(scanner.nextLine());

                            switch (bankMenuNum) {
                                case 1:
                                    System.out.print("예금액> ");
                                    mb.balance += Integer.parseInt(scanner.nextLine());
                                    break;
                                case 2:
                                    System.out.print("출금액> ");
                                    int withdrawAmount = Integer.parseInt(scanner.nextLine());
                                    mb.balance -= withdrawAmount;
                                    break;
                                case 3:
                                    System.out.print("잔액> ");
                                    System.out.println(mb.balance);
                                    break;
                                case 4:
                                    run = false;
                            }
                        }
                    }
                    break;

                case 4:
                    mainRun = false;
                    // 프로그램이 종료되기 직전에 파일에 저장하고 저장했다는 메세지를 출력
                    try (FileOutputStream fos = new FileOutputStream("C:\\temp\\members.dat");
                         ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                        oos.writeObject(members);
                        System.out.println("회원 정보를 파일에 저장했습니다.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
        scanner.close();
    }
}
