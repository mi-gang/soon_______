package p2022_06_23;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while문을 이용해서 1~100까지 홀수, 짝수의 합을 구하는 프로그램을 작성하세요?
		// 단, while문 1개와 if ~ else문으로 작성하세요.

		int i = 1, odd = 0, even = 0; // 초기값 지역변수는 자동으로 초기화되지 않음 -> 항상 초기화해줘야 함
		while (i <= 100) { // 조건식
			if (i % 2 == 1) { // 홀수
				odd += i;
			} else { // 짝수
				even += i;
			}
			i++; // 증감식
		}

		System.out.println("1~100 홀수의 합=" + odd);
		System.out.println("1~100 짝수의 합=" + even);

	}

}
