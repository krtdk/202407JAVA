package p367;

import java.util.Scanner;

public class DriverEx {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("차량을 선택: 1.버스, 2.택시");
		int num = scan.nextInt();
		
		Driver driver = new Driver();
		Vehicle v1 = null;
		switch (num) {
		case 1: v1 = new Bus();
			break;
		case 2: v1 = new Taxi();
		break;
		default:
			System.out.println("선택오류");
		}
		
//		driver.drive(v1);
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		driver.drive(bus);
		driver.drive(taxi);
	}
}
