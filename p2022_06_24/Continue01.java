package p2022_06_24;

public class Continue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// continue문
		// 1. 다시 반복문으로 돌아가라는 의미를 가지고 있다.
		// 2. continue문이 실행되면, continue문 아래쪽의 내용들은 실행되지 않고 다시 반복문으로 돌아가게 된다.
		
		for(int i=1; i<=10; i++) {
			
			if(i==5) continue;		// if문과 같이 사용	//	i==5가 되면 출력하지 않고 다시 반복문으로 돌아감
			System.out.println("출력"+i);
		}
		
		
		
		
		
	}

}
