package p2022_06_28;

class MyDate03{   
	
	// 필드
	private int year;    
	private int month;    
	private int day;
  
	// 생성자 : 객체를 생성할 때 생성자가 호출되고 필드값을 초기화 시켜주는 역할을 한다.
	public MyDate03(){ 		// () 비어있음 -> 기본 생성자 
		
		year=2016;			// 값이 변경됨
		month=4;
		day=1;
		}
  
	// 메소드
	public void print(){
		System.out.println(year+ "/" +month+ "/" +day); 		// -> 필드값 출력
		}
	
	} // MyDate end

// 메인 메소드가 없기 때문에 독립적으로 실행하지 못함 -> 다른 클래스에 메인 메소드를 만들어서 실행하는 방식
// 클래스 내에 메인 메소드 넣어서 실행할 수도 있음


	public class ConstructorTest03 {     
		public static void main(String[] args) {
	  
			MyDate03 d = new MyDate03();
			//				 생성자 호출
			d.print(); 
    
    
  }
}               