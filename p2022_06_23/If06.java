package p2022_06_23;

public class If06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 난수 발생 공식
		// 난수 = (정수화) (Math.random() * (상한값 - 하한값 + 1)) + 하한값;

		// 난수 발생
		// 0.0 <= Math.random() < 1.0 실수 형태의 난수 발생
		// 1 ~ 6

		System.out.println("E" + Math.E); // E값
		System.out.println("PI" + Math.PI); // PI값
		System.out.println(Math.random()); // 난수 발생 Math안에 random매소드 사용(java.lang 안에 있음)

		// 주사위 번호 뽑기 : 1 ~ 6
		int num = (int) (Math.random() * 6) + 1; // 1 ~6
		// *6을 하면 5.999999 -> int로 변경하면 소수점뒤 버려서 5가 됨 -> + 1함
		// double형 난수 -> int형으로 강제 형변환함

		System.out.println("num" + num);

		if (num == 1) {
			System.out.println("1번");
		} else if (num == 2) {
			System.out.println("2번");
		} else if (num == 3) {
			System.out.println("3번");
		} else if (num == 4) {
			System.out.println("4번");
		} else if (num == 5) {
			System.out.println("5번");
		} else {
			System.out.println("6번");
		}

		// 1~45 사이의 난수 발생

		int num2 = (int) (Math.random() * 45) + 1;
		System.out.println("난수: " + num2);

	}

}
