package p2022_06_29;


class StaticTest{
	
	static int a=10;			// 정적 필드 : 메소드 영역에 저장
	int b=20;					// 인스턴스 멤버변수(필드) : heap 메모리에 저장
}


class  StaticTest01 {
	public static void main(String[] args){
		System.out.println("StaticTest.a->" + StaticTest.a); 
		StaticTest s1 = new StaticTest();
		StaticTest s2 = new StaticTest();
 
		System.out.println("s1.a->" + s1.a + "\t  s2.a->" + s2.a);
		System.out.println("s1.b->" + s1.b + "\t  s2.b->" + s2.b);

    s1.a=100; 
    	System.out.print("s1.a->" + s1.a );
    	System.out.println("\t  s2.a->" + s2.a+"  ");
    	System.out.println(StaticTest.a);

    s1.b=200;													// 값 변경
    	System.out.print("s1.b->" + s1.b);						// 200
    	System.out.println("\t  s2.b->" + s2.b);				// 20
    	
  }
}                              