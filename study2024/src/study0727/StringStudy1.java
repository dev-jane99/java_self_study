package study0727;

import java.util.Scanner;

public class StringStudy1 {
	public static void main(String[] args) {

//		Q. 세가지 실수 또는 정수 입력 받아서 무조건 정수값 나오게 하기
//		예시) 2.5, 3, 8.3 = 13
		
		
//		1. 스캐너
		Scanner sc = new Scanner(System.in);
		
//		2. 메세지
		String message = "더할 세가지 실수 또는 정수를 입력하세요.\n참고로 답은 무조건 정수로 나타납니다.",
				exMessage = "예)3.5 8 2\n정답 예시)답은, 13입니다";
		
		System.out.println(message);
		System.out.println(exMessage);
		
//		3. 초기값
		double num1 = 0.0,
				num2 = 0.0,
				num3 = 0.0;
		int result = 0;
		
//		4. 입력받기
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		num3 = sc.nextDouble();
		
//		5. 출력
		result = (int)(num1 + num2 + num3);
		System.out.println("답은, " + result + "입니다.");
		
		
//		완
		
		
				
		
		
		
	}
}
