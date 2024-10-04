package study0731;

import java.util.Scanner;

public class MethodStudy001 {
//	문자열을 입력받고 원하는 문자의 개수를 구해주는 메서드
	
	private static int count(String word, char letter) {
		int count = 0;
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == letter) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		MethodStudy001 ms = new MethodStudy001();
		Scanner sc = new Scanner(System.in);
		
		String message = "문자열을 입력하세요";
		System.out.println(message);
		String input = "";
		char findInput = ' ';
		input = sc.next();
		findInput = sc.next().charAt(0);
		int result = 0;
//		result = input.charAt(sc.nextInt());
//		result = ms.count(input, Character.valueOf(input))
		result = ms.count(input, findInput);
		System.out.println(result);
		

	}

}
