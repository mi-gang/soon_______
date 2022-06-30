package p2022_06_30;

class FinalMethod {								// 부모 클래스
	
	// 필드
	String str = "Java ";

	// 메소드
	// public void setStr(String s) {
	public final void setStr(String s) {		// final 붙이면 서브 클래스에서 오버라이딩이 불가.
		str = s;
		System.out.println(str);
	}
}

class FinalEx extends FinalMethod {				// 자식 클래스 (FinalMethod를 상속받고 있음)
	int a = 10; // final 붙이면 밑에서 a값 대입 불가.

	public void setA(int a) {
		this.a = a;
	}

//	public void setStr(String s) {				// 메소드 오버라이딩
		str += s;
		System.out.println(str);
//	}

}

public class FinalTest02 {
	public static void main(String[] args) {
		FinalEx ft = new FinalEx();
		ft.setA(100);
		ft.setStr("hi");// 슈퍼 클래스의 setStr을 실행.
		FinalMethod ft1 = new FinalMethod();
		ft1.setStr("hi");// 자신의 클래스의 setStr을 실행.
	}
}