package study0727;

import java.util.Scanner;

public class OperStudy1 {
	public static void main(String[] args) {
//		Q. 사용자에게 두 정수를 입력 받아서 대소를 비교하기
//		삼항연산자 이용하기

//		1. 스캐너
		Scanner sc = new Scanner(System.in);
		
//		2. 사용자 메세지
		String message = "정수 두개를 적어주세요", exMessage = "예)10 4";
		System.out.println(message);
		System.out.println(exMessage);
		
//		3. 최소값 제시
		int num1 = 0;
		int num2 = 0;
		
//		4. sc.next() 사용, 입력 받을 입력칸 만들어주기
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
//		5. 삼항연산자 써서 출력
//		System.out.println(num1 > num2 ? "더 큰값:" + num1 
//				: num1 < num2 ? "더 큰값:" + num2
//						: num1 == num2 ? "두 수가 같습니다." : "다시 입력 하세요.");
		System.out.println(num1 > num2 ? "더 큰값:" + num1 
				: num1 == num2 ? "두 수의 크기는 같습니다." 
					: "더 큰값:" + num2);
		
		
//		완
		
	}
}
