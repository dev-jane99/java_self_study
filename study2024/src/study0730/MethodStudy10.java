package study0730;

import java.util.Scanner;

public class MethodStudy10 {
//	문자열 소문자를 대문자로, 대문자를 소문자로
	
	public static void upperLower(String word) {
		int num;
		for(int i = 0; i < word.length(); i++) {
			if((char)i > 97 && (char)i < 122) {
				num = (int)word.charAt(i -= 32);
				System.out.println(String.valueOf(num));
			}else if((char)i > 65 && (char)i < 90) {
				num = (int)word.charAt(i += 32);
				System.out.println(String.valueOf(num));
			}else {
				num = (int)word.charAt(i);
				System.out.println(String.valueOf(num));
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "문자를 입력하세요";
		System.out.println(message);
	
		
		String input;
		input = sc.nextLine();
		upperLower(input);
	}
}
