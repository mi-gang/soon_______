package p2022_06_24;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// p152~153
		
		int[] score = {83, 90, 87};
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);

		int sum = 0;
		for(int i=0; i<score.length; i++)
			sum += score[i];			// sum = sum + score[i]
		
		System.out.println("총점:"+sum); 		// 총점 : 260
		double avg = (double)sum/3;				// 평균: 
		//				분모 또는 분자를 double형으로 만들어야 데이터 손실이 일어나지 않음
		System.out.println("평균:" +avg);
		
		// 평균값을 소수점 둘째자리까지 출력하세요?
		
		System.out.printf("평균: %.2f", avg);	// 평균: 86.67
		
		
		
		
		
	}

}
