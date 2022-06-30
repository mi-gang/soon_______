package p2022_06_30;

import java.util.Date;
import java.util.Random;

import java.util.*;		// java.util.안에 있는 모든 클래스를 불러오겠다는 의미

public class RandomTest {
	
	// random 클래스 - 난수 발생시켜주는 클래스
	// 기본 클래스 안에 들어가있음

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 난수 발생 방법 : 1. Math.random
		//				2. Random 클래스
		
		Random r = new Random();			// 자동 import 단축키 : ctrl shift o 
		
//		java.util.Random r = new java.util.Random(); 이런 방식도 가능함
		
		int n1 = r.nextInt(10);			// 0~9
		System.out.println("n1="+n1);
		
		// 1~45난수 발생
		int n2 = r.nextInt(45);		
		System.out.println("n2="+(n2+1));

		// 0.0 < = Math.random() < 1.0 난수 발생
		int n3 = (int)(Math.random()*45) +1;
		System.out.println("n3="+n3);
		
		Date d = new Date(); 					// Date = 날짜, 시간 관련 클래스
		System.out.println(d);
		
	}

}
