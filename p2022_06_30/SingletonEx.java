package p2022_06_30;

// p244

// 싱글톤(Singleton)으로 check 호출하기

class Singleton{
	
	// 싱글톤(Singleton) : 객체 생성을 한 번만 수행하는 것을 의미함
	// private 때문에 직접 접근하지 못함 -> 정적 메소드로 접근
	
	// 정적 필드
	private static Singleton s = new Singleton();		//	이때 객체 생성 한번만 함

	// 정적 메소드
	public static Singleton getInstance() {				// 정적 메소드 -> 클래스가 종료될 때까지 유지됨
		//		   (자료형)
		//			클래스
		return s;
		//	      클래스로 만든 s를 리턴해줘야함	// 맞는 값을 돌려줘야하기때문
	}
	
																	//원래는 new로 객체 생성을 했음 그러나 싱글톤은 생성된 객체.
	public void check() {
		System.out.println("메소드 호출 성공1");
	}
	public void check1() {
		System.out.println("메소드 호출 성공2");
	}
}

public class SingletonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton obj1 = Singleton.getInstance();			// 클래스명.메소드	-> 정적메소드 호출
		Singleton obj2 = Singleton.getInstance();
		// 클래스(자료형일치)로 값을 돌려줌	// int-int처럼 class-class임
		
		System.out.println(obj1);							// -> 주소값이 나옴 
		System.out.println(obj2);							// 한번만 저장하고 그것을 공유하기 때문에 주소값이 같음
		
		if(obj1==obj2) {								// 주소값 비교
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		obj1.check();
		obj1.check1();
		obj2.check();
		obj2.check1();

	}

}
