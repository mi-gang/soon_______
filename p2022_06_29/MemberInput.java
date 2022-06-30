package p2022_06_29;

import java.util.Scanner;

// 키보드를 통해서 각 회원들의 정보를 입력 받는 클래스(MemberInput)를 작성한다. 이때 입력받는 회원의 정보는 성명, 나이, 이메일, 주소를 입력 받는다.
//	->  스캐너 클래스로
//
// 그리고 키보드로 입력한 회원의 정보는 새로운 회원정보를 저장하는 클래스(MemberInfo)의 멤버변수에 저장을 시킨후 출력하는 프로그램을 작성하시오.
// (단, 1명의 회원정보를 입력 받아서 처리한다. 가능하면 2명 이상의 회원 정보도 입력 받아서 처리 해본다. 객체 배열, 리스트 둘 중 하나 써야함)
//		-> 모두 저장 후 한꺼번에 출력
//
// 예)   
// MemberInput클래스 	
// public static void main(String[] args){
// }
//
//MemberInfo클래스
//필드 네개
//private String name;
// private int age;
// private String email;
//private String address;					-> 생성자 매개변수 만들기(키보드로 받은 값을 여기 저장) 또는 
//											-> 메소드로 출력
//	생성자
//public MemberInfo(){  
//	}
//	메소드

class MemberInfo {		

	// 필드	(멤버변수)
	private String name;
	private int age;
	private String email;
	private String address;
	
	// private 필드 사용하는 방법
	// 1. 생성자의 매개변수로 필드 값을 초기화해서 private을 사용할 수 있도록 함
	// 2. setter 메소드로 매개변수 전달된 값 수정 변경
	
	
	// 생성자		
	public MemberInfo(String name, int age, String email, String address) {	
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	// 메소드
	public void print() {
		System.out.println(name + "/" + age + "/" + email + "/" + address);
	}

}

class MemberInput {
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
		
//		System.out.println("성명, 나이, 이메일, 주소를 입력하세요");
//		
//		String s1 = sc.nextLine();
//		int i1 = sc.nextInt();
//		String s2 = sc.nextLine();
//		String s3 = sc.nextLine();

		MemberInfo m = new MemberInfo(s1, i1, s2, s3);

		m.print();

	}
}
