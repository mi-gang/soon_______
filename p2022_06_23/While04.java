package p2022_06_23;

public class While04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while문을 이용해서 구구단(2~9단)을 출력하는 프로그램을 작성하세요?

		int dan = 2;
		while (dan <= 9) {
			int i = 1; // -> while문 안에서 i값을 초기화함
			System.out.println("[" + dan + "단]");
			while (i <= 9) {
				System.out.println(dan + "*" + i + "=" + dan * i);
				i++;
			}
			dan++;
			System.out.println();
		}

//			int dan = 2, i = 1;					-> i값이 while문 밖에 있기 때문에 다시 1로 초기화 되지 않음
//			while(dan <= 9) {
//				while (i <= 9) {
//					System.out.println(dan+"*"+i+"="+dan*i);
//					i++;										-> i값이 10이 됨
//					}
//					dan++;
//				}
//		

	}

}
