//package p2022_06_27;
//
//public class Ggngh {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// add 메소드를 호출해서, 리턴된 총합을 sum2에 저장
//		int sum2 = add(new int[] {83, 90, 87});			// 여기서 new로 주소값을 전달해줌 (메소드가 실행되는 동안만)
//		System.out.println("총합:" + sum2);				// 총합 = 260
//
//		// main() end
//	}	// 메소드 중첩 ,,, 주의하기 ...
//		
//		
//		// 사용자 정의 메소드: 합을 구해주는 메소드
//		
//	
//		public static int add(int[] scores) {			// int[] scores -> new 없음, 주소값을 갖지 못한 상태임
//			int sum = 0;
//			for(int i=0; i<3; i++) {
//				sum+= scores[i];
//			}
//			return sum;						// 호출한 곳으로 돌려줌
//		}
//	
//	}
//


package p2022_06_28;

import p2022_06_28.MyDate;

class MyDate1 {
	// 생성자 호출 시기 알아보는 프로그램
	
	
	// 필드
	int year;			
	int month;
	int day;

	
	
	// 생성자	(클래스명과 동일, 괄호 반드시 가짐, 앞에 접근제어자만 올 수 있음)
	public MyDate1() {		// 기본 생성자 (Default Constructor)
		System.out.println("[생성자] : 객체가 생성될 때 자동 호출됩니다.");
	}

	public void print() {		// 특별한 경우 (싱글톤,,?) 아닌 이상 static 잘 사용 안함)
		System.out.println(year + "/" + month + "/" + day);
	}
	
	// void기 때문에 return 생략
	
	
}// MyDate end




public class Ggngh {
	
	public static void main(String[] args) {
		
		MyDate1 d = new MyDate1();			// d는 stack에 -> heap에 year = 0, month = 0, day = 0 (초기값) 저장함
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