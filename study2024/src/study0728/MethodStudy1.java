package study0728;

import java.util.Scanner;

public class MethodStudy1 {
	
//	Q. 정해진 티켓값에 입력받은 인원수를 곱해서 
//	   전체에서 50% 할인된 가격 출력하기, 메소드 먼저 만들어주기
	
//	    메소드 만들기
	    double ticket (int num1, int person, double num3) {
		     return (num1 * person) * num3;
	    }
	
//	    main 메소드
	    public static void main(String[] args) {
	    	
//	    그냥 직접 입력
	    MethodStudy1 ms = new MethodStudy1 ();
	    ms.ticket(2000, 5, 0.5);
	    System.out.println( (int) ms.ticket(2000, 5, 0.5) + "원 입니다.");
//	    System.out.println("총" + person + "명을 입력하셨습니다."
//	    		+ num3 * 100 + "%의 할인이 적용되었습니다"
//	    		+ ms.ticket(2500, 5, 0.5) + " 원 입니다.");
	    	
	    
	    
////	    인원수 입력받을 스캐너
//	    Scanner sc = new Scanner(System.in);
//	    
////	    메세지
//	    String message = "예매하려는 총 인원을 입력 해 주세요.";
//	    System.out.println(message);
//		
////		초기값
//		int num1 = 2500;
//		int person = 0;
//		double num3 = 0.5;
//	    double total = 0.0;
//		
////	    조건
//	    total = (num1 * person) * num3;
//	    
////	    입력
//	    person = sc.nextInt();
//	    
////		출력
//		System.out.println("50% 할인이 적용된 가격입니다! \n총 " + total + "원 입니다.");

		
	}
	}

