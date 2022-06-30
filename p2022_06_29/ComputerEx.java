package p2022_06_29;

class Computer{
	
	
	// 주소값 전달에 의한 메소드 호출 (Call by Reference) 방식
	
	
	int sum1(int[] values) {
		int sum=0;
		for(int i = 0; i<values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
	
	
	
	// vargus : 전달된 값은 배열로 받음(정해진 수 없이 계속 받을 수 있음)
	//				values에 배열로 저장됨
	
	int sum2(int ... values) {					// 받은 값 만큼 배열 생성
		int sum=0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}




public class ComputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer com = new Computer();
		
		int[] values1 = {1, 2, 3};					// 배열 생성
		// 	values1가 주소값을 갖게됨
		
		int result1 = com.sum1(values1);			// sum1 메소드  호출			// sum1 메소드로 values1의 주소값을 전달함
													// heap 메모리에 저장 된 값보다 stack에 있는 주소값을 전달하는게 효율적이고, 빠름
		System.out.println("result1: " + result1);
		
		
		int result2 = com.sum1(new int[] {1,2,3,4,5});		// 바로 배열을 만들어서 전달함
															// result1과 다르게 값을 받는 변수가 없기 때문에(명명되지 않음) 재사용 불가능
															// heap메모리에 접근할 수 없을때 참조할 주소가 없을때 (결과가 나오면) 바로 사라짐
		System.out.println("result2: " + result2);
		
		
		int result3 = com.sum2(1,2,3);
		System.out.println("result3: " + result3);
		
		
		int result4 = com.sum2(1,2,3,4,5);
		System.out.println("result4: " + result4);

		
	}

}
