package p2022_06_29;

// p 217~218



class Calculator{
	
	
	// 메소드
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
		return;					// 생략 가능
	}
	
	
	int plus(int x, int y) {				// 매개변수(괄호 안에 사용되는 변수) = 지역변수 : x, y, result
											// 메소드 종료시 값 삭제
											// 메소드 실행되는 동안 필요한 값을 매개변수로 전달받음
	int result = x + y;
	return result;							// return문 생략 불가능, int형 값을 불러줘야함
											// result1으로 전달
	}
	
	// return문 : plus() 메소드를 호출한 곳에 값을 돌려주는 역할
	// return문은 메소드 가장 마지막 줄에 사용해야 함
	
	
	double divide(int x, int y) {			// byte형 값을 받아 int형에 저장하게됨 : 자동형변환 
		double result = x / (double)y;		// int형끼리 산술시 데이터 손실 -> 분자 또는 분모를 double형으로 강제 형변환 시켜 소수점 아래자리까지 나타나도록 함
		return result;
	}
	
	// int x, int y 지역변수이기 때문에 여러 메소드에서 같은 이름을 사용해도 오류가 나지 않는다.
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
}

public class CalculatorEx {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal = new Calculator();
		cal.powerOn();						// 메소드 접근 - cal.(메소드명)
		
		int result1 = cal.plus(5, 6);
		System.out.println("result1:" + result1);

		
		byte x = 10;
		byte y = 4;
		double result2 = cal.divide(x, y);
	//			   		 divide 메소드 호출
		System.out.println("result2:" + result2);
		
		cal.powerOff();
		
		
		
	}

}
