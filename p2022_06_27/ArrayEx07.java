package p2022_06_27;

public class ArrayEx07 {

	
	// 절대값을 구해주는 메소드
	
	static int abs(int data) {			// int기 때문에 return으로 값 받음
		if(data < 0)
			data = -data;
		return data;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 값을 전달하면 ........... 1ㅏ차원 배열로 전달받음 ,,,,, 잘 사용하는 방식은 아님 .......

		
		// args[0] = "-10", args[1] = "-20"
		System.out.println("args[0]:" + args[0]);
		System.out.println("args[1]:" + args[1]);
		
		// args[0] = "-10" -> -10 형변환  // String -> int 변환
		int num = Integer.parseInt(args[0]);					// args[0](String) -> num(int)  // int num = -10  // // 많이 씀 기억하고 있기 ..
		System.out.println("절대값:" + abs(num));					// abs(-10)호출
		
		int num2 = Integer.parseInt(args[1]);	
		System.out.println("절대값:" + abs(num2));	
		
//		System.out.println("절대값:" + abs(args[0]));  -> 오류(자료형이 안맞음)
		
		
		// java ArrayEx07  -10 -20

		
	}

}
