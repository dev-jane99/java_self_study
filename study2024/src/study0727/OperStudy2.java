package study0727;

import java.util.Scanner;

public class OperStudy2 {
	public static void main(String[] args) {
		
//	      번호로 입력 받기

//	      Q. 당신의 성별을 선택하세요.
//	      1. 여성
//	      2. 남성
//	      여성 : A 방으로 가세요
//		  남성 : B 방으로 가세요

//		1. 스캐너
		Scanner sc = new Scanner(System.in);
		
//		2. 메세지
		String message = "Q. what are u.\r\n"
				+ "1. female\r\n"
				+ "2. male";
		String answer1 = "go to room A.",
				answer2 = "go to room B.",
				errorAnswer = "try it again";
		
		System.out.println(message);
		
//		3. 초기값
		int choice = 0;
		
//		4. 입력창 만들기
		choice = sc.nextInt();
		
//	    5. 삼항연산자 써서 출력
	    System.out.println(choice == 1 ? answer1
	    		: choice == 2 ? answer2
	    				: errorAnswer);
		
//		완
		
		
	}
}
