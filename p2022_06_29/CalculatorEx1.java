package p2022_06_29;

// p227
// 클래스 내부에서 메소드 호출: 메소드 안에서 다른 메소드 호출

class Calculator1{
	
	// 메소드
	
	int plus(int x, int y) {
		int result = x + y;						// 17
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);					// plus() 메소드 호출			// double로 받기 때문에 17.0으로 저장됨
		double result = sum / 2;				// 일반 메소드에서 다른 메소드를 불러올 땐 메소드명만 불러주면 호출됨
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);				// avg() 메소드 호출
		println("실행결과: " + result);			// println() 메소드 호출
	}
	void println(String message) {				// println -> 예약어 아니기 때문에 메소드명으로 사용가능함
		System.out.println(message);
	}
}



public class CalculatorEx1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator1 mycal = new Calculator1();		// 메인 메소드에서 다른 메소드를 불러오기 위해선 객체를 생성 후 호출해야함
													// (정적 메소드가 아니기 때문에)
		
		mycal.execute();							// execute() 메소드 호출
//		execute();									// 오류발생
		
		
		
	}

}
