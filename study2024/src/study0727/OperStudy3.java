package study0727;

import java.util.Scanner;

public class OperStudy3 {
	public static void main(String[] args) {
//		Q. 청소년, 성인 구별하기
		
//		1. 스캐너
		Scanner sc = new Scanner(System.in);
		
//		2. 메세지
		String message = "나이를 입력 해 주세요.",
				minors = "서비스를 이용 하실 수 없습니다.",
				adults = "환영합니다.";
		
		System.out.println(message);
		
//		3. 초기값
		int age = 0;
		
//		4. 입력창
		age = sc.nextInt();
		
//		5. 삼항연산자 이용 출력
		System.out.println(age < 18 ? minors
				: adults);
		
//		완
		
	}
}
