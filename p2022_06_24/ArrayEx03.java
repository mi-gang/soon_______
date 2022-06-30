package p2022_06_24;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 키보드로 5과목의 점수를 입력받아서, 총점과 평균을 구하는 프로그램을 작성하세요?
		
		int[] s = new int[5];
		System.out.println("5과목의 점수를 입력하세요?");
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;							// 합이 누적될 변수
		for(int i=0; i<s.length; i++ ) {
			s[i] = sc.nextInt();				// for문으로 입력 값을 받게 됨
												// 변수에 저장하던 걸 배열에 저장하기 때문에 코드가 늘어나지 않음
			sum+=s[i];							// sum = sum + s[i]
		}
		
		double avg = sum / 5.0;
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avg);
	}

}
