package p2022_06_22;

public class Oper04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 비교 연산자 : >, >=, <, <=, ==(같다), !=(같지 않다)
		// 비교 연산자의 결과가 참이면 true, 거짓이면 false값을 리턴한다.

		String str1 = "자바";
		String str2 = "자바"; // str1, str2 둘 다 같은 주소값을 가짐
		String str3 = new String("자바"); // new String -> 새로운 공간을 만듦(=주소값이 다름)

		// str1, str2, str3 -> stack에 저장(주소값)
		// "자바" -> heap에 저장(값)

		// 비교 연산자로 주소값을 비교
		if (str1 == str2) {
			System.out.println("같은 주소"); // 같은 주소
		} else {
			System.out.println("다른 주소");

		}

		if (str1 == str3) {
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소"); // 다른 주소

		}

		// 값을 비교(비교 연산자 사용 불가능함)
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.equals(str3)); // true

	}

}
