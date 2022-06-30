package p2022_06_27;

public class ArrayEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// p 154
		// 총 합을 계산하여 리턴하는 프로그램
		
		
		int[] scores;									// 배열 정의
		scores = new int[] {83, 90, 87};				// new 연산자로 새로운 자리 만듦
//		int[] scores;= new int[] {83, 90, 87};
		
		int sum1 = 0;									// 합 누적 변수
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
			
		System.out.println("총합:" + sum1);				// 총합 = 260
		
		
		
		
		// add 메소드를 호출해서, 리턴된 총합을 sum2에 저장
		
		
		int sum2 = add(new int[] {83, 90, 87});			// 여기서 new로 주소값을 전달해줌 (메소드가 실행되는 동안만)
//		int sum2 = ArrayEx05.add(new int[] {83, 90, 87});가 원칙이지만 같은 클래스 내에서 생략 가능
		
		System.out.println("총합:" + sum2);				// 총합 = 260

		// main() end
	}	// 메소드 중첩 ,,, 주의하기 ...
		
		
		// 사용자 정의 메소드: 합을 구해주는 메소드
		
	
		public static int add(int[] scores) {			// int[] scores -> new 없음, 주소값을 갖지 못한 상태임
			int sum = 0;
			for(int i=0; i<3; i++) {
				sum += scores[i];
			}
			return sum;									// 호출한 곳으로 돌려줌 -> sum2로 보냄
			
						
		}
	

}
