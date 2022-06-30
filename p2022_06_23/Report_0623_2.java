package p2022_06_23;

public class Report_0623_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		구구단(2~9단)을 열방향(세로방향)으로 출력하는 프로그램을 작성 하세요?
//		\t -> 수평 간격 벌림		가로방향으로 출력하기
		
		
		for(int i=2; i<=9; i++) {
			System.out.print("["+i+"단]\t");
		}
		System.out.println();
			
		for(int i=1; i<=9; i++) {				// i가 1일때
			for(int dan=2; dan<=9; dan++) {		// 2단부터 9단까지 실행함
				System.out.print(dan+"*"+i+'='+dan*i+" \t");	
			}
			System.out.println();
		}
		
		
	}

}
