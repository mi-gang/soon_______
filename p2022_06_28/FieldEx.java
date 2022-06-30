package p2022_06_28;

// p 202
class FieldInitValue{
	
	
	
	// 필드(field) 초기화 확인 예제
	//	
	
	
	
	byte byteField;						// 정수형은 0으로 초기화됨
	short shortField;					
	int intField;
	long longField;
	
	float floatField;					// 실수형은 0.0으로 초기화됨
	double doubleField;
	
	char charField;				
	boolean booleanField;				// 논리형은 false로 초기화됨
	
	int[] arrField;						// 참조형(배열, 클래스)는  null(: 참조할 주소가 없다는 의미)로 초기화
	String referenceField;
	
}



public class FieldEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FieldInitValue f = new FieldInitValue();
		
		System.out.println("byteField:" + f.byteField);
		System.out.println("shortField:" + f.shortField);
		System.out.println("intField:" + f.intField);
		System.out.println("longField:" + f.longField);
		
		System.out.println("floatField:" + f.floatField);
		System.out.println("doubleField:" + f.doubleField);
		
		System.out.println("charField:" + f.charField);
		System.out.println("booleanField:" + f.booleanField);
		
		System.out.println("intField:" + f.arrField);
		System.out.println("referenceField:" + f.referenceField);

	}

}
