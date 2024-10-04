package inputTest;

import java.util.Scanner;

public class InputTask1 {

	 public static void main(String[] args) {

			

		 //두 정수를 입력한 뒤 덧셈 결과를 출력

		 // 단, next() 만 사용한다.

		 //input 형변환

		 Scanner sc = new Scanner(System.in);

		

		 String message = "숫자를 입력하시오.", firstNum = "", secondNum = "";

		 String exampleMessage = "ex)3 4",

		 message1 = "두개의 정수를 입력하세요.",

		 message2 = "첫번째 정수:",

		 message3 = "두번째 정수:";

		 int num1 = 0, num2 =0, result = 0;

		 

		 System.out.println(message1);

		 System.out.println(exampleMessage);

		 

		 num1 = Integer.parseInt(sc.next()); //기억해 sc.next()

		 num2 = Integer.parseInt(sc.next());

		 result = num1 +num2;

	

		 System.out.printf("%d + %d = %d", num1, num2, result);

		 

	     

		 

//		 System.out.println(message);

//		 

//		 firstNum = sc.next();

//		 secondNum = sc.next();

//		 

//		 int num1 = Integer.parseInt(firstNum);  // 바보야 이름이 달라야지 sysout에 넣지

//		 int num2 = Integer.parseInt(secondNum);

//

//		 

//		 System.out.println("두 수의 합은," + (num1 + num2) + "입니다.");

		 

		 

	}

}
