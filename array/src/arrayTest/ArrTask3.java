package arrayTest;

import java.util.Scanner;

public class ArrTask3 {
	public static void main(String[] args) {
//		 사용자에게 입력받은 문자열중 소문자는 모두 대문자로
//		대문자는 모두 소문자로 변경한다.
		
//		입력) 안녕hI!!
//		출력) 안녕Hi!!
		Scanner sc = new Scanner(System.in);
		String message = "문자열 입력 :", input = "", result = "";
		
		System.out.println(message);
		input = sc.nextLine();
		
				for(int i = 0; i < input.length(); i++) {
					char c = input.charAt(i);
//				System.out.print(word.charAt(i));  //word 입력된 값 그대로 출력됨
					if(c >= 65 && c <= 90) {
						result += (char)(c + 32); //누적 복합형(+=)으로 글 옆으로 붙이기
					
					}else if(c >= 97 && c <= 122){
						result += (char)(c - 32);
					   
				    }else {
					    result += c;
				}
				}
				System.out.println(result);
	}
}
