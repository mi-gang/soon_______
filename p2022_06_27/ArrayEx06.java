package p2022_06_27;

public class ArrayEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 향상된 for문. 확장 for문
		// 형식 : for(변수 : 순차적인 자료구조(배열, 컬렉션(list))){		배열에 있는 값을 변수에 계속 입력함
		// 			실행될 문장;
		//			}
		
		// 배열에 들어간 숫자의 합 구하는 프로그램
		
		
		// 기본 for문
		
		int[] score = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int i = 0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("총합:" + sum);
		
		
		// 확장 for문 : 간결하게 작성 가능 -> 순차적인 자료구조의 원소를 처리할 때 자주 사용함
		
		int sum1 = 0;					// 0으로 초기값 설정
		for(int s : score) {			// 값 받을 변수 (s) (int형으로 통일) // score 이라는 배열 -> 배열에 있는 값 s로 전달
			sum1 += s;
		}
		
		System.out.println("총합:" + sum1);

		
		
		
		
	}

}
