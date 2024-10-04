package operTest;

import java.util.Scanner;

public class OperTest2 {

	public static void main(String[] args) {

//		사용자에게 두 정수를 입력 받아서 대소를 비교하라

//		삼항연산자 이용

//		

////		알고리즘 짜기

////		1. 초기변수 설정 및 초기값

//		int num1 = 0, num2 = 0;

//		String message = "두 정수 입력하세요", exampleMessage = "ex)1 2", result = "";

////		2. 스캐너 가져오기

//		Scanner sc = new Scanner (System.in);

////		3. 출력 메세지 작성

//		System.out.println(message + exampleMessage);

////      4. 사용자에게 입력값을 받는다

//		num1 = sc.nextInt();

//		num2 = sc.nextInt();

////		5. 변환값을 변수에 담는다

////		6. 변수를 가지고 비교한다

//		result = num1 > num2 ? "더 큰값:" + num1 

//				: num1 == num2 ? "두 수는 같습니다." 

//						: "더 큰값:" + num2;

//		

//		7. 결과 출력

//		System.out.println(result);

		

		Scanner sc = new Scanner(System.in);

		String message = "대소를 구분할 숫자를 입력하시오",

				exampleMessage = "ex)1 2",

				number1 = "",

				number2 = "";

		System.out.println(message);

		System.out.println(exampleMessage);

		

		int num1 = 0, num2 = 0;

		

		num1 = Integer.parseInt(sc.next());

		num2 = Integer.parseInt(sc.next());

		System.out.println( num1 < num2 ? num1 + "이" + num2 + "보다 작다." 

						: num1 == num2 ? num1 + "가" + num2 + "와 같다" 

								: num1 > num2 ? num1 + "이" + num2 + "보다 크다."

								       : num1 + "가" + num2 + "와 같지 않다");

			

//		System.out.println((num1 == num2) ? num1 + "가" + num2 + "와 같다" : num1 + "가" + num2 + "와 같지 않다");

		

		

	}

}
