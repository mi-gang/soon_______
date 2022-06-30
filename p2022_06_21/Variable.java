package p2022_06_21;

import java.util.ArrayList;
import java.util.List;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수 : 메모리상에 데이터를 저장하기 위한 기억 공간
		// 변수를 만드는 형식 : 자료형 변수명 = 데이터(값);

		// 기본 자료형 변수

		// 1. 정수형 변수
		byte b1 = 10; // -128 ~ 127
		// byte b2 = 130; // 오버플로우 발생
		short s = 100; // -32768 ~ 32767
		int i = 1000; // -21억 ~ 21억
		long l = 100000L;
		
		System.out.println("b1=" + b1);
		System.out.println("s=" + s);
		System.out.println("i=" + i);
		System.out.println("l=" + l);

		// 2. 실수형 변수
		float ft1 = 3.14f;
		float ft2 = 3.14F; // f 붙이지 않으면 double으로 인식함
		double d = 42.195;

		System.out.println("ft1" + ft1);
		System.out.println("ft2=" + ft2);
		System.out.println("d=" + d);
		System.out.printf("%.1f\n", d); // 소수점 첫째자리까지출력 : 42.2
		System.out.printf("%.2f\n", d); // 소수점 둘째자리까지 출력 : 42.20, \n는 줄바꿈 해줌

		// 3. 문자형 변수
		char c1 = 'A';
		char c2 = '안';
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);

		// 4. 논리형 변수
		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn1=" + bn1);
		System.out.println("bn2=" + bn2);

		// 참조형 변수 : 클래스
		String s1 = "자바";
		String s2 = new String("자바");
		System.out.println("s1=" + s1);
		System.out.println("s2=" + s2);

		if (s1 == s2) {
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소");
		}

		if (s1.equals(s2)) { // 데이터 (값) 비교
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}

		// 참조형 변수 : 배열 - 동일한 자료형의 데이터를 저장하는 정적인 자료구조
		int[] score = { 80, 90, 100 };

		for (int j = 0; j < score.length; j++) {
			System.out.println(score[j] + "\t");
		}

		// 참조형 변수 : 인터페이스(list)
		// 1. 순차적인 자료구조
		// 2. 여러가지 자료형과 데이터를 저장할 수 있다.
		// 3. 동적으로 공간의 크기를 늘릴 수 있다.

		// List list = new List(); // 오류발생
		List list = new ArrayList(); // 업캐스팅
		
		list.add(30);
		list.add(3.14);
		list.add('j');
		list.add(true);
		list.add("자바");

		for (int k = 0; k < list.size(); k++) {
			System.out.println(list.get(k) + "\t"); // Ctrl + Shift + F {}  이거 정렬
		}
		
	} // main 메소드
	
}  // class
