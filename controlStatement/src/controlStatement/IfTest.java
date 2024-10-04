package controlStatement;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//   두 수를 입력 받고 if 문으로 더 큰 수를 출력해보기
		
//		 스캐너
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		String result = null;
		String message = "두 정수를 입력해 주세용", exMessage = "예)3 6";
		
		System.out.println(message);
		System.out.println(exMessage);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			result = "더 큰값:" + num1;
		}else if (num1 == num2) {
			result = "두 수가 같습니다";
		}else {
			result = "더 큰값:" + num2;
		}
		System.out.println(result);
		
	}
}
