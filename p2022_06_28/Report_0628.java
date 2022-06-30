package p2022_06_28;

public class Report_0628 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1 ~ 45 사이의 숫자를 6개 추출하는 프로그램을 작성 하세요?
//		(단, 중복된 숫자는 1번만 출력 되도록 한다.)
//		Math.random() 이용해서 프로그램을 작성 하세요.		0.0 <= Math.random() < 1.0

		// 발생한 난수를 배열에 저장 , 다중for문, break 활용해야함

		int[] s = new int[6];

		for (int i = 0; i <= 5; i++) {
			s[i] = (int) (Math.random() * 45) + 1; // 6

			for (int h = 0; h < i; h++) {
				if (s[i] == s[h]) {
					i--;
					break;
				}
			}

		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);

		}
	}
}