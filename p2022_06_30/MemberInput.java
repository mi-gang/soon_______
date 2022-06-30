package p2022_06_30;

import java.util.Scanner;

public class MemberInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체 배열
		MemberInfo[] m = new MemberInfo[5];
		int i = 0;										// 루프 돌릴 변수
		String yn;
		Scanner sc = new Scanner(System.in);			// 스캐너 객체는 한번만 만들어도 됨
		
		String name, email, address;
		int age;
		
		
		do {											// 최소 한번은 돌아감				
			System.out.print("성명을 입력하세요? ");
			name = sc.nextLine();						// String 입력을 받는 메소드 - nextLine, next
														// nextLine - 엔터키 누르기 전까지 전체를 저장함 / next - 띄어쓰기가 있으면 잘림
			System.out.print("나이를 입력하세요? ");
			age = sc.nextInt(); 			// 숫자를 입력받은후에 enter키를 누르면 null값을 return하게 됨
			sc.nextLine();	    			// 얘를 만들어서 엔터키를 입력받게 하면 이메일을 입력할 수 있게 됨
			System.out.print("E-Mail을 입력하세요? ");
			email = sc.nextLine();			
			System.out.print("주소를 입력하세요? ");
			address = sc.nextLine();		
	
			m[i] = new MemberInfo(name, age, email, address);
			// m.name="홍길동";		-> private이기 때문에 바로 접근할 수 없음
			i++;									// 한명 끝

			
			System.out.print("계속할려면 y, 멈출려면 n을 입력?");
			yn = sc.nextLine();
			if (yn.equals("y") || yn.equals("Y")) {
				continue;		// 반복문으로 돌아감
			} else if (yn.equals("n") || yn.equals("N")) {
				break;			// 반복문 탈출
			}

		} while (true);

		//				
		for (int j = 0; j < i; j++) {
			System.out.println("성명:" + m[j].getName());
			System.out.println("나이:" + m[j].getAge());
			System.out.println("E-Mail:" + m[j].getEmail());
			System.out.println("주소:" + m[j].getAddress());
			
//			m[j].print();
		}
	}

}



// DTO(Data Transfer Object) 클래스	데이터상의 값을 입력 출ㄹ력 ..??
class MemberInfo {
	
	// 필드
	private String name;
	private int age;					// 초기값 0 설정
	private String email;
	private String address;

	// 생성자
	public MemberInfo(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	// 메소드
	public String getName() {
		return name;				// 값을 돌려주거나, 출력해도 됨 getter메소드 - return으로 값을 돌려주고 출력은 메인메소드에서 함
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}
	
	// 값 출력
//	public void print() {
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(email);
//		System.out.println(address);
//	}

	

}
