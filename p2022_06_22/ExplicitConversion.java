package p2022_06_22;

public class ExplicitConversion {

	public static void main(String[] args) {

		// int형 변수를 97로 초기화
		int intValue = 97;

		// char형 변수에 int형 변수 값을 할당 4->2
		char charValue = (char) intValue; // 강제 형변환
		System.out.println("charValue = " + charValue);

		// float형 변수 초기화.
		float floatValue = 3.14F;

		// int형 변수에 float형 변수 값을 할당
		int intValue2 = (int) floatValue; // 강제 형변환, 소수점 이하 부분은 버려짐 데이터 손실 (int가 정수형이기 때문에)
		System.out.println("intValue2 = " + intValue2);

		// float형 변수 초기화
		double doubleValue = 21.12345;

		// float형 변수에 double형 변수 값을 할당 8->4
		float floatValue2 = (float) doubleValue; // 강제 형변환, 숫자가 길어지면 데이터 손실 있을 수 있음 .,
		System.out.println("floatValue3 = " + floatValue2);

	}
}