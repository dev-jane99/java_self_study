package arrayTest;

import java.util.Scanner;

public class ArrTask4 {
	public static void main(String[] args) {
//		그룹문제
//		정수를 한글로 변형하기
//		ex)
//		입력)1024
//		출력)일공이사
		
//		힌트: 입력받은 정수를 문자열로 변경, 한글을 담은 배열을 만들어서 출력
		Scanner sc = new Scanner(System.in);
		String hangle = "공일이삼사오육칠팔구", input = null;
	    String message = "정수를 입력하세요.", result = "";
	    
	    System.out.println(message);
	    input = sc.next();
	    
	    for(int i = 0; i < input.length(); i++) {
	    	result += hangle.charAt(input.charAt(i) - 48);  //숫자 0 은 아스키코드에서 48번이다.
	    }
	    System.out.println(result);
		
////	    스캐너
//		Scanner sc = new Scanner(System.in);
////		메세지 입력-출력
//		String message = "정수 입력하세요.", input = "", result = "";
//		
//		System.out.println(message);
//		input = sc.nextLine();
//
////		배열
////		String[] num = new String[10];
//		String[] num = {"영","일","이","삼","사","오","육","칠","팔","구"};
//		for(int i = 0; i < num.length(); i++) {
////			int num2 = input.charAt(i);
//			System.out.println(num[num.length]);
//			num[i] = sc.next();
//			result += num[i];
//		}
//		System.out.println(result);
//		}
//		
////		출력
	   
}
	
}

