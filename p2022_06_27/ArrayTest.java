package p2022_06_27;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max, min;				// 값을 저장할 변수
		int[] s = new int[5];		// 키보드로 입력받아야 하기 때문에 첫번째 형식으로 해야함

		System.out.print("정수 5개를 입력 하세요?");
		Scanner sc = new Scanner(System.in);

		
		for (int i = 0; i < s.length; i++) {		// 값 입력 for문
			s[i] = sc.nextInt();					// 값 저장 완
		}
		max = s[0];									// 0번 방에 할당
		min = s[0]; 								// 0번 방에 할당
		
		
		for (int i = 1; i < s.length; i++) {		// 값 비교 for문, 이미 0번 방 할당되어있기 때문에 1부터 비교
			if (max < s[i]) max = s[i];
			if (min > s[i]) min = s[i];
		}
		System.out.println("max=" + max);
		System.out.println("min=" + min);
	}

}
