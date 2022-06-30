package p2022_06_22;

public class ImplicitConversion {

	public static void main(String[] args) {

		// char 변수 선언 및 초기화.
		char charValue = 'a';
		System.out.println("charValue = " + charValue);

		// int 변수 선언 및 'a'의 값으로 초기화.
//	int intValueOfChar = charValue;    자동 형변환 2->4
		int intValueOfChar = 'a'; // 아스키코드(문자를 컴퓨터가 이해하기 위한 것, 10진수 = int형 변슈이기때문에 97로 나옴)
									// 'a' 문자의 10진수 아스키코드값은 97
		System.out.println("intValueOfChar = " + intValueOfChar);

		// int 변수 선언 및 초기화.
		int intValue = 30;
		System.out.println("intValue = " + intValue);

		// float 변수 선언 및 intValue 변수 값 할당
		float floatValue = intValue; // 같은 4byte지만 float이 더 크기 때문에 자동 형변환됨
										// float은 실수형이라 00.0으로 출력됨
		System.out.println("floatValue = " + floatValue);

		// double 변수 선언및 floatValue,intValue 변수 값 할당
		double doubleValue1 = floatValue; // 자동 형변환 4->8
		double doubleValue2 = intValue; // 자동 형변환 4->8
		System.out.println("doubleValue1 =" + doubleValue1);
		System.out.println("doubleValue2 =" + doubleValue2);

	}// main end
}// class end
