package study0727;

import java.util.Scanner;

public class OperMasterStudy1 {
	public static void main(String[] args) {
//		그룹으로 풀었던 문제 각색
		
//		Q. 사용자에게 값를 입력받고
//		정수라면 나이는 ?살 입니다를 출력
//		이름이면 이름은 ? 입니다를 출력
		
//		1. 스캐너
		Scanner sc = new Scanner(System.in);
		
//		2. 메세지 및 출력
		String message = "나이와 이름을 입력하세요.",
				exMessage = "예)24 류재은";
		System.out.println(message);
		System.out.println(exMessage);
		
//		3. 초기값
		int age = 0;
		String name = "";
		
//		4. 사용자가 입력할거임
		age = sc.nextInt();
		name = sc.next();
		
//		5. 출력
		System.out.println("나이는" + age + "살 입니다." + "\n이름은" + name + "입니다.");
		
//		완
		
		
		
	}
}
