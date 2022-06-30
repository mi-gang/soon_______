package p2022_06_29;

// p 232
// 메소드 오버로딩(Method Overloading)	-> 객체지향언어만 가능함
// : 한 개의 클래스 안에 동일한 이름을 가진 메소드를 여러개 정의하는 것 
// 메소드 오버로딩 조건: 매개변수의 데이터 타입, 개수, 순서


class Calculator2{
	
	double areaRectangle(double width) {
		return width * width;
	}
	
	double areaRectangle(double width, double height) {			// -> 개수 다르게 오버로딩
		return width * height;
	}
	

}


public class CalculatorEx2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator2 mycal = new Calculator2();
		
		// 정사각형의 넓이
		double result1 = mycal.areaRectangle(10);
		
		// 직사각형의 넓이
		double result2 = mycal.areaRectangle(10, 20);
		
		System.out.println("정사각형의 넓이: " + result1);
		System.out.println("직사각형의 넓이: " + result2);
		
		
		
	}

}
