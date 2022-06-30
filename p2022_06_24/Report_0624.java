package p2022_06_24;

import java.util.Scanner;

public class Report_0624 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	        키보드를 이용해서 정수 5개를 입력 받은후 int형 배열에 저장한다.
//		이때 배열에 저장된 값중에서 최대값과 최소값을 구하는 프로그램을 작성하세요?

//	첫번째 방 값을 max, min에 저장하고 그 뒤에 그것보다 크거나 작은 방이 있으면 다시 max, min에 저장하면 됨
		// for, if문 2개 사용
		// if(data[i] > max)  max = data[i]
		
		
		
		int[] s = new int[5];
		System.out.println("정수 5개를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		int max, min;
		
		s[0]= sc.nextInt();				// 값 입력, 이거 안넣어서 계속 오류남 ...
		max = s[0];						// 0번 방에 할당
		min = s[0];						// 0번 방에 할당
		
		
		for(int i=1; i<s.length; i++) {		// 비교 for문
			s[i] = sc.nextInt();
			if (s[i] > max)  max = s[i];
			if (s[i] < min)  min = s[i];
		}
		
		
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		

		
		
	}

}
