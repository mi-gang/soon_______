package p2022_06_23;

public class For06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 구구단 (2~9단)을 출력하는 프로그램을 작성하세요? -> 다중 for문 사용

		for (int dan = 2; dan <= 9; dan++) { // 단을 2~9 늘림
			System.out.println("[" + dan + "단]");
			for (int i = 1; i <= 9; i++) { // 1~9를 곱함
				System.out.println(dan + "*" + i + '=' + dan * i);
			}
			System.out.println(); // 각단 줄간격 벌리기(안쪽 for문이 끝나고)
		}

	}

}
