package p2022_06_23;

import java.util.Scanner;

public class Ffdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("팩토리얼 계산을 위한 정수값 입력");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int fac = 1;	// 초기값 설정
		for (int i=1; i<=num; i++) {
			fac = fac * i;	// fac *= i; 
		}
		System.out.println(num + "! = " + fac);
		
		
		
		
	}

}
