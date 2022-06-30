package p2022_06_30;

import java.util.Scanner;


//1.
//키보드를 통해서 각 회원들의 정보를 입력 받는 클래스(MemberInput)를 작성한다. 
//이때 입력 받는 회원의 정보는 성명, 나이, 이메일,주소를  
//입력 받는다. 그리고 키보드를 입력한 회원의 정보는 새로운
//회원정보를 저장하는 클래스(MemberInfo)의 멤버변수에 저장을 시킨후 출력하는 프로그램을 작성하시오.
//(단, 1명의 회원정보를 입력 받아서 처리한다. 가능하면 2명 이상의 회원 정보도 입력 받아서 처리 해본다.)
//
//MemberInfo클래스의 멤버변수를 초기화 방법을 생성자 대신에 setter 메소드를 이용해서 초기화 시켜서 프로그램을 작성하세요.
//
//예)   
// MemberInput 클래스
//public static void main(String[] args){
//
//}
//
// MemberInfo클래스
//private  String name;
//	 private int age;
//	 private String email;
//      private String address;
//
//      setter() 메소드

//public void setMonth(int month) {
//	this.month = month;


class MemberInfo2 {		

	// 필드	(멤버변수)
	private String name;
	private int age;
	private String email;
	private String address;
	
	// private 필드 사용하는 방법
	// 1. 생성자의 매개변수로 필드 값을 초기화해서 private을 사용할 수 있도록 함
	// 2. setter 메소드로 매개변수 전달된 값 수정 변경
	
	// 생성자		
//	public MemberInfo2(String name, int age, String email, String address) {	
//		setName(name);
//		setAge(age);
//		setEmail(email);
//		setAddress(address);


	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	// 메소드
	public void print() {
		System.out.println(name + "/" + age + "/" + email + "/" + address);
	}

}

class MemberInput2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("성명을 입력하세요");
		String s1 = sc.nextLine();

		System.out.println("나이를 입력하세요");
		int i1 = sc.nextInt();

		System.out.println("이메일을 입력하세요");
		String s2 = sc.next();
		sc.nextLine();

		System.out.println("주소를 입력하세요");
		String s3 = sc.nextLine();
		
		MemberInfo2 m = new MemberInfo2();
		m.setName(s1);
		m.setAge(i1);
		m.setEmail(s2);
		m.setAddress(s3);

		m.print();

	}
}
