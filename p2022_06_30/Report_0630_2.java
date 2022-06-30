package p2022_06_30;

import java.util.Calendar;

// 2. Calendar 클래스를 이용해서 오늘 날짜, 시간, 요일을 출력하는 프로그램을 작성 하세요?
// Calendar클래스에서 제공되는 요일 정적 필드찾기, 1~7 요일 숫자 형태 -> 문자로 바꿔야함//  1차원 배열 쓰면 간단하게 할 수 있음 시작 요일 잘 설정해야함

public class Report_0630_2 {

	public static void main(String[] args) {

		Calendar c1 = Calendar.getInstance();
		
		int y = c1.get(Calendar.YEAR);
		int m = c1.get(Calendar.MONTH)+1;
		int d = c1.get(Calendar.DATE);
		int w = c1.get(Calendar.DAY_OF_WEEK);
		
		String[] score = {"일", "월", "화", "수", "목", "금", "토"};
		

		System.out.print(y+"/"+m+"/"+d+"/");
		System.out.println(score[w-1]+"요일");
		
		
		
	}
}

