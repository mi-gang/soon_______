package p2022_06_24;


// 메소드 : 여러가지 코드를 묶어 놓은 것
// 메소드를 사용하는 이유는 코드를 재사용하기 위해서 사용된다.
// 중첩메소드 불가능 : 메인메소드 안에 메소드가 들어갈 수 없음   -> 위나 아래에 들어가게됨


public class MethodEx01 {

	
	// 사용자 정의 메소드
	// 사용자 정의 메소드는 프로그래머가 직접 호출해야만 실행된다.
	
	
	 static void check() {							// 정적 메소드
		System.out.println("함수 호출 성공");
		return;										// void의 경우 return 생략가능함
	}
	 
	 
	 
	 
	 // 값 전달에 의한 메소드 호출 (call by Value 방식)
	 
	 static void check(int a) {						// 매개변수(parameter): int a = 30 (stack에 저장, 메소드 종료시 자료 지워짐)
		 											// 지역변수임(메소드 안에서 사용됨), 받은 값을 밑에 문장에 보내기 때문에 매개변수라고 함
		 System.out.println("전달된 값:"+a);			// 정수값을 전달해서 호출해야함
	 }
	 
	 static void check(int a, double d) {
		 double result = a + d;							// 결과 저장 double로 됨
		 System.out.println("전달된 값의 합:" + result);
	 }
	 
	 static void check(char c) {				// char c = 'A'
		 System.out.println("전달된 값:"+ c);
	 }
	 
	 static void check(boolean b) {				// boolean b = true;
		 System.out.println("전달된 값:"+ b);
	 }
	 
	 
	 
	 
	 
	 
	 // 주소값 전달에 의한 메소드 호출 방식(call by Reference 방식)
	 
	 static void check(String s) {								// String s = "자바"
		 														// String s = new String("파이썬")
		 System.out.println("전달된 값:"+ s);

	 }
	 
	 
	 // return문 : 메소드를 호출한 곳에 값을 돌려주는 역할
	 // return문 : 메소드 가장 마지막 줄에 사용해야 한다.
	 static int check01() {							// check는 이미 있는 메소드라 다른 이름 사용해야함
		 System.out.println("출력");
		 return 50;									// int형으로 , 값을 돌려주기 때문에 가장 마지막 줄에 위치해아함
	 }
	 
	 // 매개변수 2개 있음, 
	 static double check02(int a, double d) {
		 double result = a + d;
		 return result;
	 }
	 
	 
	 
	
	 public static void main(String[] args) {		// 객체지향언어는 메소드 자리가 변경되어도 사용가능함
		 // TODO Auto-generated method stub			// 호출이 어디에 있든 가능함
		 
		 MethodEx01.check();				// check 메소드 호출
		 									// 클래스명.을 쓰고 호출하는게 원칙이지만 같은 class내에서는 생략해도 호출 가능함
		 									// 정적메소드가 아니라면 객체를 생성해서 호출해야함
		 
		 check(30);							// 매개변수가 있고 int형이기 때문에 자료형에 맞는 30을 입력해야함
		 									// 한개의 클래스 내에 동일한 이름의 메소드 호출 - 메소드 오버로딩 ,,,,?
		 	
		 // 직접 전달
		 check(10, 20.5);
		 check('A');
		 check(true);
		 
		 // 주소값 전달함
		 check("자바");
		 check(new String("파이썬"));						// String만 가능함
		 
		 check01();										// return문으로 돌려받은 값이 출력되지 않음
		 int result = check01();						// static int이기 때문에 int로 받아야 함
		 System.out.println("돌려받은 값 1:"+result);		// 돌려받은 값을 새로운 변수에 넣어서 출력하는 방법
		 System.out.println("돌려받은 값 2:"+check01());	// 돌려받은 값을 바로 출력하는 방법
		 
		 double result2 = check02(50, 3.14);
		 System.out.println("돌려받은 값 3:"+result2);	
		 System.out.println("돌려받은 값 4:"+check02(50, 3.14));	
		 
		 
		 
		 
	 }

}
