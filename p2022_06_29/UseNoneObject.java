package p2022_06_29;

public class UseNoneObject {

    public static void main( String[] args ) {
    
    NoneObject no = new NoneObject();						// static 메모리에 저장됨	
    														// 잘 쓰지 않는 방식 .. 굳이 객체 생성 안해도 됨
    System.out.println("no.number = " + no.number);
    
    no.printNumber();
    
    
    
    System.out.println("NoneObject.number = " + 
									NoneObject.number);		// 클래스명.메소드로 바로 접근 가능
    
    NoneObject.printNumber();
    
    }
}    