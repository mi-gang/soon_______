package p2022_06_28;

class MyDate {
	// 생성자 호출 시기 알아보는 프로그램
	
	
	// 필드
	private int year;			
	int month;
	private int day;

	
	
	// 생성자	(클래스명과 동일, 괄호 반드시 가짐, 앞에 접근제어자만 올 수 있음)
	public MyDate() {		// 기본 생성자 (Default Constructor)
		System.out.println("[생성자] : 객체가 생성될 때 자동 호출됩니다.");
	}

	public void print() {		// 특별한 경우 (싱글톤,,?) 아닌 이상 static 잘 사용 안함)
		System.out.println(year + "/" + month + "/" + day);
	}
	
	// void기 때문에 return 생략
	
	
}// MyDate end




public class ConstructorTest02 {
	
	public static void main(String[] args) {
		
		MyDate d = new MyDate();			// d는 stack에 -> heap에 year = 0, month = 0, day = 0 (초기값) 저장함
		//				생성자 호출	: 생성자는 객체를 생성할 때 호출된다.
//		ConstructorTest02 c = new ConstructorTest02();   -> 생성은 가능하나 클래스 멤버가 없기 때문에 무의미함 
		
		
//		d.print(d.year);		- > (private int year;) 접근제어자가 private이기 때문에 외부클래스에서 직접 접근 불가능함	
								 // private = 같은 클래스 내에서만 접근 허용함(가장 좁은 접근 허용)
		
		d.print();			// 정적 메소드 아니기때문에 
//		d.print(d.month);
		
//	System.out.println(d.year);
//	MyDate dd =  new MyDate();
	}
}