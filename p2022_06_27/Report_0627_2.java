package p2022_06_27;

public class Report_0627_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	    구구단(2~9단)의 연산 결과를 2차원 배열에 저장하고, 배열에 저장된 결과를 이용해서 구구단을 출력하는 프로그램을 작성하세요?
		// 다중for문으로 연산 후 다시 출력해야함
		// 8행 9열

//		->

		int[][] g = new int[8][9];

		for (int dan = 0; dan <= 7; dan++) {			// 0행 0열부터 시작해야 하기 때문에 0부터
			for (int i = 0; i <= 8; i++) {
				g[dan][i] = (dan+2) * (i+1);
				System.out.print(g[dan][i]+"\t");
			}
			System.out.println();


		}
	}
}