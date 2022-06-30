package p2022_06_30;

// 1) 같은 패키지 안에 들어있는 클래스에 접근하기 위해서는 접근 제어제가 public이나  default 접근 제어자로 되어있어야 한다.
// 2) 같은 패키지 안에 들어있는 클래스에 접근하기 위해서는 import를 하지 않아도 된다.

public class Calling {

	public static void main(String[] args) {

		Called c = new Called();
		c.check();
	}

}
