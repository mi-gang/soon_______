package p2022_06_28;

class MyDate05{   
	
	// 매개변수를 가진 생성자 
	
	// 필드
	private int year;    
	private int month;    
	private int day;

  
	// 기본 생성자
	// 기본 생성자는 객체를 생성할 때 컴파일러가 자동으로 만들어 주지만, 예외적으로 매개변수를 가진 생성자가 있을 경우에는 더이상 기본생성자를 만들어주지 않음
	public MyDate05(){				// 매개변수가 있는 생성자가 있을 땐 기본 생성자를 컴파일러가 자동으로 생성해주지 않음 꼭 써야함
	}
  
	
	// 매개변수 가진 생성자
	// 형태 메소드와 거의 비슷
	public MyDate05(int new_year, int new_month, int new_day){
		year=new_year;				// 2017
		month=new_month;			// 7
		day=new_day;				// 19
		
		
	// 멤버변수 = 매개변수  -> 다른 것 끼리 값 전달 가능함, 동일한 경우 값 전달을 할 수 없음
		
		
		

//		public MyDate05(int year, int month, int day){
//			year=year;		
//			month=month;		
//			day=day;		 -> 0/0/0 (값 전달되지 않음)
		}  
  
	
	
	
	
	
	// 메소드
	public void print(){			//private을 출력할 수 있음
		System.out.println(year+ "/" +month+ "/" +day); 
	}
}




public class ConstructorTest05 {     
  public static void main(String[] args) {		// -> main 메소드 내용이 가장 먼저 실행됨
	  
	  
	  
    MyDate05 d=new MyDate05();  
   //				기본 생성자 호출
    d.print();
    // 메소드 호출
    
    
   //  System.out.println(d.year);  -> 접근제어자 때문에 불가능하기 떄문에 위에 방식을 사용해야함
    
    

    MyDate05 d2=new MyDate05(2017, 7, 19);		// d2(stack) -> heap에 year, month, day 생성 
    //				 매개변수가 있는 생성자 호출
    d2.print();
    
    
    
  }
}      