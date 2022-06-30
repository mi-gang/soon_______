package p2022_06_24;

public class Break02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// break : 반복문을 빠져나오는 역할
		// 무한루프 : while문
		
		
		int i=1;
		while(true) {								// while(true), while(1<2) -> 참인 조건식을 넣으면 돌아감
													// true를 가장 많이 사용함
			System.out.println(i+"무한출력");
			if(i==100) break;
			i++;									// 증감식
		}
		
		int i2=1;
		while(true) {			
													
			System.out.println(i2+"무한출력");
			i2++;									
			if(i2==100) break;						// i가 100이면 빠져나오기 때문에 100번째는 출력되지 않음
		}
		
		
		
		
	}

}
