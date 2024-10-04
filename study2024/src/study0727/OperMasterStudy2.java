package study0727;

import java.util.Scanner;

public class OperMasterStudy2 {
	public static void main(String[] args) {
		
//		사용자에게 값를 입력받고
//		정수라면 정수입니다를 출력
//		실수라면 실수입니다를 출력
		
//		1. 스캐너
		Scanner sc = new Scanner(System.in);
		
//		2. 메세지 및 출력
		String message = "숫자를 하나만 입력하시오.",
				jung = "정수입니다.",
				shil = "실수입니다.",
		        errorMessage = "잘못 입력하셨습니다.";
		System.out.println(message);
		
//		3. 초기값
		double num1 = 0.0;
		int num2 = 0;
		String input = null;
		String result = null;
 
		
//		4. 입력받기
		input = sc.next();
		
//		5. 형변환
		num1 = Double.parseDouble(input);
		num2 = (int)num1;

		
//		6. 출력
		result = num1 == num2 ? jung : shil;
		System.out.println(result);
		

		
//		if문 사용
//		if(num1 == num2) {
//			System.out.println(jung);
//		}else if (num1 != num2) {
//			System.out.println(shil);
//		}else {
//			System.out.println(errorMessage);
		}
//		
//		int[]num = new int[9];
//				for (int i = 0;)
				
//		챗지피티가 준 답
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("값을 입력하세요: ");
//        String input = scanner.nextLine();
//
//        if (input.matches("^-?\\d+$")) {
//            // 입력된 값이 정수인 경우
//            System.out.println("입력한 값은 정수입니다.");
//        } else if (input.matches("^-?\\d*\\.\\d+$")) {
//            // 입력된 값이 실수인 경우
//            System.out.println("입력한 값은 실수입니다.");
//        } else {
//            // 입력된 값이 유효한 숫자가 아닌 경우
//            System.out.println("유효한 숫자를 입력하세요.");
//        }

    }



