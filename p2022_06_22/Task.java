package p2022_06_22;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2, n3, result1, result2, max, min;
		System.out.println("정수 3개를 입력하세요?");

		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();

		result1 = (n1 > n2) ? n1 : n2; // 최대값(max에 할당됨)
		max = (result1 > n3) ? result1 : n3; // 최대값(max에 할당됨)

		result2 = (n1 < n2) ? n1 : n2; // 최소값
		min = (result2 < n2) ? result2 : n2; // 최소값

		System.out.println("max=" + max);
		System.out.println("min=" + min);

		sc.close();

	}

}
