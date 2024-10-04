package methodTest;


public class MethodTask3 {
		
//		(실버)
//		홀수를 짝수로, 짝수를 홀수로 (2 -> 3, 5 -> 6)
//		int evenOdd(int num) {
//			return ++num;
//		}
		
		
//		(골드)
//		문자열을 입력받고 소문자는 대문자로, 대문자를 소문자로 바꿔주는 메소드
		String upperLower (String words) {
			String result = "";
			for(int i = 0; i < words.length(); i++) {
//				문자열마다 하나씩 추출한다.
				char c = words.charAt(i);
//				a : 97
//				A : 65
//				65~90 까지 아스키 코드의 범위 안에서 c 를 검사한다.
				if(c >= 65 && c <= 90) {
//					각각의 결과값을 형변환해서 result에 연결한다.
					result += (char)(c + 32);
				}else if (c >= 97 && c <= 122) {
					
					result +=(char)(c - 32);
				}else {
					result += c;
				}
			}
			return result;
			}
			
			
		
		
		public static void main(String[] args) {
		MethodTask3 mt = new MethodTask3();
//		mt.evenOdd(2);
//		System.out.println(mt.evenOdd(2));
		mt.upperLower("Hey 내가 누군지아니?");
		System.out.println(mt.upperLower("Hey 내가 누군지아니?"));
		
		
	}
}
