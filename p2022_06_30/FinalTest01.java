package p2022_06_30;


class FinalMember {
	
	// 필드
	final int a = 10; 		// 가장 마지막에 저장되는 값 = 상수

	// 메소드
	public void setA(int a) {
//		this.a = a;			// a가 상수이기 때문에 값 변경 불가능함
	}
}



public class FinalTest01 {
	public static void main(String[] args) {
		
		FinalMember ft = new FinalMember();
		final int a = 1000;
		ft.setA(100);
		System.out.println(a);
	}
}
