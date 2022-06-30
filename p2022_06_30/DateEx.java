package p2022_06_30;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 날짜, 시간 관련 클래스 : Date, Timestamp, Calender
		// 1. Date
		
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd EEE a hh:mm:ss", Locale.US);
		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd EEE a HH:mm:ss", Locale.US);
		System.out.println(sd.format(d));
		System.out.println(sd1.format(d));
		
		// 2. Timestamp
		
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		// Timestamp -> long형으로 받음, System.currentTimeMillis -> long형
		System.out.println(ts);
		
		SimpleDateFormat sd3 = new SimpleDateFormat("yyyy년 MM월 dd일 EEE HH:mm:ss");
		System.out.println(sd3.format(ts));
				
	}

}
