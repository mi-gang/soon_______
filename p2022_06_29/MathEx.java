package p2022_06_29;

public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Math 클래스
		// Math 클래스 : 정적 필드 + 정적 메소드 (생성자 없음)
		
		// Math 클래스는 생성자가 제공되지 않기 때문에, Math 클래스로 직접 객체를 생성할 수 없다.
		
//		Math m = new Math();			// 생성자 호출 시 오류 발생
		
		System.out.println("E="+Math.E);			// 클래스명. 으로 접근
		System.out.println("PI="+Math.PI);
		
		System.out.println("abs()="+Math.abs(-10));	 			 // abs() 메소드 = 절대값
		System.out.println("ceil()="+Math.ceil(3.14));			 // ceil() 메소드 = 올림기능
		System.out.println("round()="+Math.round(10.5));		 // round() 메소드 = 반올림
		System.out.println("floor()="+Math.floor(10.9));		 // floor() 메소드 = 내림기능
		System.out.println("max()="+Math.max(10, 20));			 // max() 메소드 = 최대값		// 최대 두개 비교 가능 
		System.out.println("min()="+Math.min(10, 20));			 // min() 메소드 = 최소값
		System.out.println("pow()="+Math.pow(2, 3));	 		 // pow() 메소드 = 2의 3승

		//  0.0 <= random() < 1.0 	범위의 난수 발생
		System.out.println("random()="+Math.random());	 		 // random() 메소드 = 난수
		System.out.println("sqrt()="+Math.sqrt(5));	 		 	 // sqrt() 메소드 = 제곱근
		
	}

}
