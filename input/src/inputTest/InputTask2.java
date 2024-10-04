package inputTest;

import java.util.Scanner;

public class InputTask2 {

	public static void main(String[] args) {

		// 3개의 정수를 한번에 입력받은 후

		// 세 정수의 곱셈을 출력 

		///next() 이용

		

//		Scanner sc = new Scanner(System.in);

//		String message = "곱할 세개의 정수를 입력하세요";

//		

//		

//		

//		int num1 = 0, num2 = 0, num3 = 0, result = 0;

//		System.out.println(message);

//	

//		num1 = Integer.parseInt(sc.next());

//		num2 = Integer.parseInt(sc.next());

//	    num3 = Integer.parseInt(sc.next());

//		result = (num1 * num2 * num3);

//		System.out.printf("%d * %d * %d = %d", num1, num2, num3, result);

//		

		Scanner sc = new Scanner (System.in);

		int num1 = 0, num2 = 0, num3 = 0, result = 0;

		String message ="세 정수를 입력하슈",

			 exampleMessage = "ex)1 3 5";

		

		System.out.println(message);

		System.out.println(exampleMessage);

		num1 = Integer.parseInt(sc.next());

		num2 = Integer.parseInt(sc.next());

		num3 = Integer.parseInt(sc.next());

		

		result = num1 * num2 * num3;

		

		System.out.printf("%d * %d * %d = %d", num1, num2, num3, result);

		

	}

}
