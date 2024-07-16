package java0711;

import java.lang.reflect.Array;

public class Max {
	public static void main(String[] args) {
		int a[] = {1, 3, 10, 2, 8};
		int max = a[0  ];
	
		for (int i = 0; i<a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
			
		//최대값을 출력
	
		System.out.println("최대값:"+ max);
	}
}
