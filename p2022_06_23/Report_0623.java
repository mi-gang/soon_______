package p2022_06_23;

import java.util.Scanner;

public class Report_0623 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//			키보드를 이용해서 입력한 정수의 팩토리얼을 구하는 프로그램을 작성 하세요?
//				ex) 3! = 3 * 2 * 1
//		       		5! = 5 * 4 * 3 * 2 * 1
//					for문으로
		
		
		
		System.out.println("정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();								// n = 5
		
		int f = 1;		// 곱하기 연산이기 때문에 1로 설정 // int형 변수이기 때문에 ~21억까지만 가능함	 // 초기값    f = 1 
		for(int h=1; h<=n; h++)	{							// h는 1이고 h가 n(5)보다 커지면 멈춤, h는 1씩 증가함
//		   (int h=n; h>0; h--)
			f *= h;											// 1 * 1 = 1 에프는 1임 2 6 24 120
		}
		System.out.println(n+"! = "+f);
		
		//	n은 입력받은 값, h는 n만큼 곱해줄 횟수, f는 곱한거 저장해두는 곳
		


}

	
}