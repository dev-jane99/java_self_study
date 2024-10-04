package dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateTest2 {
	public static void main(String[] args) {
//		싱글턴 패턴 singleturn pattern
//		Calendar calendar = Calendar.getInstance();
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy/MM/dd HH/mm/ss"); 
//		
//		System.out.println(calendar.getTime());
//		simpleDateFormat.format(calendar.getTime());
//		System.out.println(simpleDateFormat.format(calendar.getTime()));
//		
//		try {
//			System.out.println(simpleDateFormat.parse(simpleDateFormat.format(calendar.getTime())));
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);
		
		now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));
		try {
			System.out.println(LocalDate.parse("1900년 10월 10일", DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
