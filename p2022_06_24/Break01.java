package p2022_06_24;

public class Break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// break : 반복문을 빠져나오는 역할
		// 무한루프 : for문
		
		for(int i=1;;i++) {						// for(;;) 무한루프 돌리는 방법 // while을 더 많이 사용함
			System.out.println(i+"무한출력");
			if(i==100) break;					// 조건식 + break 세트임	// 만족시 빠져나오도록
		}
		
		
		for(int i=1;;i++) {						// for(;;) 무한루프 돌리는 방법 // while을 더 많이 사용함
			if(i==100) break;					// 위로 올라오면 99에서 끝남!
			System.out.println(i+"무한출력");
		}
		
		
		
		
		
	}

}
