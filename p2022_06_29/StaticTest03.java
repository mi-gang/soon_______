package p2022_06_29;

class StaticTest3{
	
	
  private static int a=10;		// 정적 필드
  private int b=20;				// 
  
  
  public static void printA(){    		// 정적 메서드에서는 this를 사용하지 못함
    System.out.println(a);         

//    System.out.println(b);         	일반 필드 사용 불가능 -> 저장된 영역이 다르기 때문에
//    System.out.println(this.a);       컴파일 에러 발생  (this -> heap메모리 주소를 가지기 때문)
  }

  
  public void printB(){        //this는 인스턴스 메서드에서 여러 객체에 의해서 
    System.out.println(b); //메서드가 호출될 때 이를 구분하기 위해서 사용된다. 
  }                           
}

public class StaticTest03 {
  public static void main(String[] args) {
	  
    StaticTest3.printA();  
    StaticTest3 s1 = new StaticTest3();
    StaticTest3 s2 = new StaticTest3();
    s1.printB();
    s2.printB();
  }    
}     