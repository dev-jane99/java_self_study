package operExpert;

import java.util.Scanner;

public class Oper {
	public static void main(String[] args) {
		//재은 태혁 승용 소연
		//(마스터)
//		사용자에게 값를 입력받고
//		정수라면 정수입니다를 출력
//		실수라면 실수입니다를 출력
		
//		예) 183 -> 입력한 값은 정수입니다.
//		183.5 -> 입력한 값은 실수 입니다.
		
//		형변/스캐너/연산자 사용
		
////		1. 스캐너 필요함
//		Scanner sc = new Scanner(System.in);
////		2. sc.next();
//		String inputValue = null, result = "";
//		String message = "정수 또는 실수를 입력하세요.";
//		String intMessage = "입력한 값은 정수입니다..";
//		String doMessage = "입력한 값은 실수입니다.";
//		String result = null;
//		
//		double num1 = 0.0;
//		int num2 = 0;
//		boolean isInteger = false;
//	
//		System.out.println(message);
//		inputValue = sc.next();
//		num1 = Double.parseDouble(inputValue);
//		num2 = (int)num1;
//		isInteger = num1 == num2; 
//		
////		result = num1 == num2 ? "입력한 값은 정수입니다." : "입력한 값은 실수입니다.";
//		result = isInteger ? intMessage : doMessage;
//		System.out.println(result);
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		double num1 = 0.0;
		int num2 = 0;
			
		
		String message = "정수 또는 실수를 입력하세요.", 
			   exampleMessage = "예)183 or 183.5";
		String intMessage = "입력한 값은 정수입니다.";
		String doubleMessage = "입력한 값은 실수입니다.";

		
		System.out.println(message);
		System.out.println(exampleMessage);
		
		num1 = sc.nextDouble();
		num2 = (int)num1;
		System.out.println(num1 == num2 ? intMessage : doubleMessage);
		
		

		
		
		
	}
}
