package study0727;

import java.util.Scanner;

public class StringStudy2 {
	public static void main(String[] args) {
//		Q. 입력받은 영어이름을 대소문자 상관없이 모두 대문자로 변환하기

		
//		1. 스캐너
		Scanner sc = new Scanner(System.in);
		
//		2. 메세지
		String message = "영어이름을 성과 함께 입력하세요."
				+ "\n예)Jane Ryo";
		System.out.println(message);
		
//		3. 초기값
		
		String fullName = "";
	
		int gap = 32;
		String result = "";
/*	    a : 97 - z :122
		A : 65 - Z :90 */
		
//		4. 입력
		fullName = sc.nextLine();
	
		
//		입력받은 스트링 풀네임을 캐릭터로 변환시켜주기
		for(int i = 0; i < fullName.length(); i++) {
			char letter = fullName.charAt(i);
		
//		5. 형변환
		if (letter >= 97 && letter <= 122) {
			result += (char)(letter - gap);
		}else if (letter >= 65 && letter <= 90) {
			result += letter;
		}else {
			result += letter;
		}
		}
//		6. 출력
			System.out.println(result);
			
			
//	  완
		
		
		
	}
}
