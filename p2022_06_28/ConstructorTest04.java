package p2022_06_28;

class MyDate04{   
		
	// 필드
	int year;    
	int month;    
	int day;  

	// 기본 생성자				-> 원하는 값으로 초기화하기위해 쓰는거임
	public MyDate04(){			
		year=2016;
		month=4;
		day=1;
		}
	
 
	public MyDate04(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}


	// this. : 내부 레퍼런스 변수
	// -> d2가 가진 주소값을 받음
	// 이 방식을 더 많이 사용함
	
//	public MyDate04(int year,int month,int day){
//		this.year = year;						// 2017			
//		this.month = month;						// 7	
//		this.day = day;							// 19
//		멤버변수 = 지역변수
		// 객체마다 값 다를때 사용함
//		}
	
	
  
  
	public void print(){
		System.out.println(year+ "/" +month+ "/" +day); 
		}
  
  
}// MyDate end




public class ConstructorTest04 {     
	public static void main(String[] args) {
		
		
		
		MyDate04 d = new MyDate04();		//	-> 필드가 저장 될 공간 생성 후 생성자 호출함
		d.print();
		System.out.println(d.year);
		System.out.println(d.month);
		System.out.println(d.day);
		System.out.println(d.year + "/" + d.month +"/" + d.day);
    
    
		MyDate04 d2 = new MyDate04(2017, 7, 19);
		//					생성자 호출
		d2.print();
		System.out.println(d2.year);
		System.out.println(d2.month);
		System.out.println(d2.day);
		System.out.println(d2.year + "/" + d2.month +"/" + d2.day);
		
		MyDate04 d3 = new MyDate04(2022, 6, 28);
		d3.print();
    
    
    
  }
}            