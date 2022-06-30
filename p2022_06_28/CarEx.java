package p2022_06_28;

// p 201
// class 두개 예제
// main 메소드를 가진 클래스와 파일명이 일체되어야 함
// public은 Main 메소드를 가진 클래스만 쓸 수 있음 (1개만!)
// 컴파일 되면 클래스 각각 바이트 코드가 만들어져 저장됨

class Car{
	// 필드(field)
	String company = "현대 자동차";			//  company = "현대 자동차" 모두 heap 메모리에 저장됨
											// 참조할 주소(mycar)를 사용할 수 없어지면 정보가 모두 지워짐
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;								// 자동 초기화 0
	
	public Car()  {							// 기본 생성자 (독립적 실행 안됨)
		System.out.println("생성자 호출 성공");
	}
	
	
}


public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 객체 생성
		Car mycar = new Car();	// 멤버가 있는 클래스로 객체를 생성해야함	// 이때 heap메모리에 필드가 저장될 저장공간 생성됨 (company, model 등등 저장됨)
								// 객체를 생성할 때 생성자가 호출된다.
		System.out.println("제작회사:"+mycar.company);			// 주소값(mycar.)으로 접근해야함
		System.out.println("모델명:"+mycar.model);
		System.out.println("색깔:"+mycar.color);
		System.out.println("최고속도:"+mycar.maxSpeed);
		System.out.println("현재속도:"+mycar.speed);				// 0
		
		// 필드값 변경
		mycar.speed = 60;					
		System.out.println("수정된 속도:" +mycar.speed);			// 60

	}

}
