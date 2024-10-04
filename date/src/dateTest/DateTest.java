package dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		Date date = new Date();
		
//		System.out.println(date);
//		simpleDateFormat.format(date);
//		System.out.println(simpleDateFormat.format(date));
		
//		형식이 잘못 되어있을수도 있기때문에 try ~ catch 문으로 강제한다.
//	    밖에서 이렇게 지정할 수 도 있는거당
		try {
			simpleDateFormat.parse("1900년 12월 4일");
			System.out.println(simpleDateFormat.parse("1900년 12월 4일"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
