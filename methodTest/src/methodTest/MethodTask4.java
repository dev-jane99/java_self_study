package methodTest;

import java.util.Scanner;

public class MethodTask4 {
//	 Q. 문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
//		문자열과 문자형을 받기
//		반복문을 돌린다
//		문자열을 문자형으로 분리시키기
//		count를 만들어서 문자를 센다
//		count를 반환한다.
		int numOfWords (String content, char character) {
		int count = 0;
		for(int i = 0; i < content.length(); i++) {
			if(content.charAt(i) == character) {
				count++;
			}
		}
		
		return count;
		}
	
		
//	 Q. 5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
//		배열을 받는다, 인덱스 받는다
//		배열 [인덱스]
//		int wantIndex (int[] arData, int index) {
//			return arData[index];
//			
//		}
		
		
		
		
//	 Q. 한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024)
//		문자열 받는다
//		문자열을 하나씩 검사한다 (for)
//		charAt(i)
//		하나씩 검사하기 위해서 한글을 담을 문자열을 만든다
//		그 한글을 담은 문자열의 인덱스와 입력한 문자와 같으면 인덱스를 넘겨준다.
//		int changeToInteger (String korean) {
//			String koreans = "공일이삼사오육칠팔구";
//			String result = "";
//			for(int i = 0; i < korean.length(); i++) {
//				result += koreans.indexOf(korean.charAt(i));
//			}
//			return Integer.parseInt(result);
//		}
		
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		MethodTask4 mt = new MethodTask4();

		Scanner sc = new Scanner(System.in);
//		String message = "5개의 정수를 입력하세요.";
//				System.out.println(message);
//				
//		int[] arData = new int[5];
//		for(int i = 0; i < arData.length; i++) {
//		arData[i] = sc.nextInt();
//		}
//		
//		mt.wantIndex(arData, 0);
//		System.out.println(mt.wantIndex(arData, 2));
//	}
		String message = "단어를 적고 찾고싶은 알파벳을 적으시오.";
				System.out.println(message);
		int result = 0;
		String[] wordNum = null;
		for (int i = 0; i < wordNum.length; i++) {
			wordNum[i] = sc.next();
			
		}
		result = mt.numOfWords(wordNum[0], wordNum[1].charAt(0));
		System.out.println(result);
	}
}
