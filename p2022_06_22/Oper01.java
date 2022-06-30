package p2022_06_22;

public class Oper01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 산술 연산자 : +, -, *, /(몫), %(나머지)

		int a = 10, b = 3, c; // 자료형은 한번만 써두 됨

		c = a + b;

		System.out.println("a+b=" + c);
		System.out.println("a+b=" + (a + b)); // 13
		System.out.println("a-b=" + (a - b)); // 7
		System.out.println("a*b=" + (a * b)); // 30
		System.out.println("a/b=" + (a / b)); // 3(몫) -> int형끼리 산술시 결과도 int형으로 나옴
		System.out.println("a%b=" + (a % b)); // 1(나머지) -> 짝수, 홀수 판별 위해 많이 사용함

		// int형과 int형 변수를 산술연산을 수행하면, 결과는 int형으로 처리된다.

	}

}
