package p2022_06_29;

import java.util.Arrays;

class Lotto1 {

	public static void main(String[] args) {

		int num[] = new int[6];

		for (int i = 0; i < num.length; i++) {

			num[i] = (int) (Math.random() * 45) + 1;	// 1 ~ 45
//			num[0]=5, num[1]=5,
			for (int j = 0; j < i; j++) {	// 값을 배열에 저장해서 비교해야함
				//			0   0  -> 처음엔 둘다 0이라 for문 돌아가지 않음
				if (num[i] == num[j]) {		// 중복
					i--;
					break;
				} // if end

			} // for end
		} // for end

		
		
		
		// 오름차순 정렬 : 버블정렬(자신의 옆자리에 있는 것과 비교)
		int temp = 0;
		for (int i = 0; i < num.length; i++){
			for (int j = i+1; j < num.length; j++) {
				if(num[i] > num[j]){
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		
		
//		Arrays.sort(num); : Arrays클래스-sort 함수 이용하여 오름차순 정렬

		// 향상된 for문 사용하여 num을 k에 대입함
		for (int k : num) {
			System.out.print(k + "\t");
		}
	}
}


/*
 * 난수 발생 공식 난수 =(정수화) ((상한값-하한값+1)* Math.random()) + 하한값
 * 
 */