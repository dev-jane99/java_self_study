package variableTask;

public class FormatTask {
	public static void main(String[] args) {
		int month = 7, day = 23;
		String message = "오늘 날짜는 %d 월 %d 일입니다\n",
				goodbye = "안녕",
		       message2 = "하지만 %s";
		System.out.printf(message, month, day);
		System.out.printf(message2, goodbye);
		       
		 // String word = "안녕";      
//		System.out.printf("오늘 날짜는 %d월", month);
//		System.out.printf("%d 일입니다.\n", day);
//		System.out.printf("하지만%s", word);
//		
	}
}
