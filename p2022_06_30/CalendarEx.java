package p2022_06_30;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 3. calendar 클래스
		// new연산자로 객체를 생성하면 오류
		
//		Calendar c1 = new Calendar();	// 오류 발생
										// 시스템상 날짜를 불러오는 것이기 때문에 새로운 자리를 형성해야하는게 아님 -> new 사용시 오류
		
		Calendar c2 = new GregorianCalendar();		// 업캐스팅
													// 자식 객체의 주소를 부모에게 전달하는 것
													// 세번째 자료형변환 -> 상속관계가 형성되어 있을 때 가능함
												
		
		Calendar c = Calendar.getInstance();	// .getInstance -> 인스턴스를 구해오는 매소드	// 많이 사용
		System.out.println(c); 					// 1970 0시 0분 부터 시작된 시간을 구해줌
		System.out.println(Calendar.YEAR); 					// 1970 0시 0분 부터 시작된 시간을 구해줌
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH)+1;
									// 더하기 1을 해야 현재 달이나옴
		int d = c.get(Calendar.DATE);
		System.out.println(y+"-"+d);
		
		System.out.println(y+"-"+m);
							
		int h1 = c.get(Calendar.HOUR);							// 12시간
		int h2 = c.get(Calendar.HOUR_OF_DAY);					// 14시잔
		int ap = c.get(Calendar.AM_PM);
		if(ap==0) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		
		int mm = c.get(Calendar.MINUTE);				// 분
				int s = c.get(Calendar.SECOND);			// 초

		
		System.out.println(h1+":"+mm+":" +s );
		System.out.println(h2+":"+mm+":" +s );
		System.out.println(h2);
		
	}

}
