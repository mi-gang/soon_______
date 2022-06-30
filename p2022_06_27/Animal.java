package p2022_06_27;

public class Animal {
	// 사용자 정의 클래스(자료형)
	
	
	
	
	
	int age;					// 멤버변수(클래스를 구성하는 멤버), 필드(field), 전역변수 : heap 메모리에 저장
								// 값을 저장하는 역할
								// : 메소드 바깥쪽에 정의되는 변수
	
	
	
	
	
	
	public Animal() {			// 기본 생성자(Default Constructor: 괄호가 빈 매개변수가 없는 생성자) 클래스명과 동일하게, 괄호를 반드시 가짐 
								// 객체를 생성할 때 호출점에서 객체 값을 초기화하는 역할
								// 앞에는 접근제어자만 올수있음 (생성자와 메소드의 차이점)
		
		System.out.println("생성자 호출 성공");				// 객체 생성과 동시에 호출되어 객체 값을 초기화시킴 (0)
		// -> 출력된다는 것은 생성자가 호출되었다는 것 ...
	}

	
	
	
	
	
	public static void main(String[] args) {			// 메소드 - 값 수정, 설정, 출력 등 기능이 제일 많음
		// TODO Auto-generated method stub

		int a = 10;				// 지역변수 : stack 메모리 영역에 저장		// 변수에 따라 저장되는 영역이 모두 다름
		
		String str = new String("자바");								// String 객체 생성  "자바
		
		Animal 		a1 		= 	new 		Animal();
// 		클래스	레퍼런스 변수		연산자		생성자 호출
//		(자료형)								 객체를 생성할때만 호출 가능함
		
		// new-> 필드가 저장되가 위한 자리가 생성됨  // int age; -> 4바이트 자리 생김 	//		a1(stack) -> age(heap) 에 저장됨 
																		// a1 주소를 참조해야  age에 접근할 수 이씀(여러 변수 생성시 주소값이 있으야 어떤 변수인지 알기때문에) -> 참조변수
		// 매개변수가 없을 땐 호출자 자동으로 생성해줌
		
		
		
		
		
		
		
//		System.out.println(age);				// 오류남 레퍼런스 변수(a1)를 꼭 거쳐야 함
		System.out.println(a1.age);				// 0
		a1.age = 5;								// 값 수정
		System.out.println(a1.age);				// 5
		
		Animal		a2		=		new Animal();
		System.out.println(a2.age);				// 0(설정된 초기값)		// a2가 주소를 가짐
		
		if(a1 == a2) {							// 주소값 비교
			System.out.println("같은 주소");
			} else {
			System.out.println("다른 주소");
			}		
		
		
	}

}
