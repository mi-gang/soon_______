package p2022_06_23;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 ~ 10까지 합을 구하는 프로그램을 작성하세요

		int sum = 0; // 지역변수 (local variable) main매소드가 끝나면 자동으로 삭제되는 변수
//		+연산에 영향을 받지 않는 0으로 초기값을 설정해야함  / 곱하기라면 1로 설정해야함   main매소드 안에서만 사용할 수 있음
//		초기값을 설정하지 않으면 오류 발생함

		for (int i = 1; i <= 10; i++) { // 지역 변수 : for문 안에서만 사용 가능함
			sum = sum + i; // sum += i;
//			 1  =  0  + 1 
//			 3  =  1  + 2 
//			 6  =  3  + 3 

			System.out.println("1~" + i + "=" + sum); // i 변수도 for문 안에서만 사용 가능함
														// 지역변수이기 때문에 for문이 끝나면 지워짐
		}

		System.out.println("sum=" + sum);
//		System.out.println(i);							// 지역 변수 (오류 발생)

	}

}
