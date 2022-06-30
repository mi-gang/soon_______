package p2022_06_28;

class MyDate10{   

	// this() 예제
	// this() : 같은 클래스 안에 있는 생성자를 호출하라는 의미로 사용됨
	
  
	
	
	
	private int year;   
	private int month;    
	private int day;

	
	
	// 생성자 오버로딩: 한 개의 클래스에 여러개의 생성자를 정의하는 것
	// : 매개변수의 자료형(다르게 기술), 매개변수의 개수, 매개변수의 순서 가 달라야 함  -> 호출할때 구분이 가능해야 하기때문에
	
	public MyDate10(){						// 기본 생성자
		this(2016, 1, 1);  // -> 매개변수가 세개인 새엇ㅇ자 호출       	// 같은 클래스 안에 있는 생성자 호출 (바로 아래에)  
													
		}  
	
	
	public MyDate10(int new_year){
		this(new_year, 1, 1);              			// 같은 클래스 안에 있는 생성자 호출 (바로 아래에)      
		}  
	public MyDate10(int new_year, int new_month){
		this(new_year, new_month, 1);    			// 같은 클래스 안에 있는 생성자 호출 (바로 아래에)
		}  
	public MyDate10(int new_year,int new_month,int new_day){
		year=new_year;
		month=new_month;
		day=new_day;
		}    

	
	
  
	public void print(){
		System.out.println(year+ "/" +month+ "/" +day); 
		}
	}




public class ConstructorTest10 {     
	public static void main(String[] args) {
  
		MyDate10 d=new MyDate10(2017, 7, 19);  
		d.print();
		MyDate10 d2=new MyDate10(2017, 7);     
		d2.print();
		MyDate10 d3=new MyDate10(2017);       
		d3.print();
		MyDate10 d4=new MyDate10();          
		d4.print();
		
	}
}