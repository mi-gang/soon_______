package p2022_06_23;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("메세지를 입력하세요?");
		System.out.println("프로그램을 종료하려면 q를 입력하세요?");

		Scanner sc = new Scanner(System.in);
		String input; // 문자를 입력받기 때문에 String 사용함

		do {
			System.out.print(">");
			input = sc.nextLine(); // nextLine -> 문자로 입력받음 String으로 저장함 (띄어쓰기 있어도 문자로 인식함)
			System.out.println("입력 문자:" + input);
		} while (!input.equals("q")); // equals -> 값끼리 비교
		// !로 true -> false로 바꿈 true가 되면 빠져나오게 됨

		System.out.println("프로그램 종료");
		sc.close();

	}

}
