package sec06.exam03.package2;

import sec06.exam03.package1.A;

public class C {
	
	A a; //A가 public이 아닐 시 오류 
	
	void method() {
		a.x = 200;
	}
}
