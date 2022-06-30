package p2022_06_28;

class MyDate06{ 
	
	// 메소드를 통해 값 수정
	// 생성자는 호출시에만 사용 가능하기 때문에 값을 수정하는건 불가능함 (생성자 사용시 new 때문에 새로운 공간이 만들어짐)
	// -> 메소드(매개변수)를 이용해야함
  
	// 필드
	private int year;    
	private int month;    
	private int day;
 
	//  public MyDate06(){//default 생성자				->메인 메소드에서 호출할경우 필요, 안할경우 안만들어도됨
	//  }  
  
	public MyDate06(int new_year, int new_month, int new_day){
		year=new_year;			// 2017
		month=new_month;  		// 7  
		day=new_day; 			// 19
		} 
	
	// 메소드 기능
	// 1. 출력
	// 2. 수정
	// 3. return 이용하여 값 돌려주기
	
	// 연도 수정 메소드
//	public void SetYear(int year){			// void -> return 생략
//		 this.year=year; 
//		// year=year; 			-> 값 전달 불가능
//		}
//	
//	// 월 수정 메소드
//	public void SetMonth(int new_month){
//		month=new_month; 		// month=8
//		}
	
	
	public int getYear() {						// getters method: 값을 돌려주는 역할
		return year;							// int 호출한 곳에 return해줌
	}

	public void setYear(int year) {				// setters method: 매개변수로 전달된 값을 받아 값을 수정하는 역할
		this.year = year;						
		
// 		변수 여러개로 한꺼번에 만들어도 됨
//		public void setYear(int year, day) {	
//			this.year = year;	
//			this.day = day;	
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void print(){
		System.out.println(year+ "/" +month+ "/" +day); 
		}
	}


public class ConstructorTest06 {     
	public static void main(String[] args) {	
		
		MyDate06 d = new MyDate06(2017, 7, 19);		// stack에 d -> heap에 year=2017, month=7, day=19
		
		
		d.setYear(2022);
		d.setMonth(6);
		d.setDay(28);
		d.print();
		
		System.out.println("year:" + d.getYear());
		System.out.println("month:" + d.getMonth());
		System.out.println("day:" + d.getDay());
		
		
		
		
		
		
		
		
		
		
		
		
//		d.print();               
//		d.SetYear(2022);   //변경되지 않음 
//		d.print();        
//		d.SetMonth(8);    //변경됨 
//		d.print();         
		
		
		}
}     