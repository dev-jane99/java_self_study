package arrayTest;

public class arrTask2 {
	public static void main(String[] args) {
		String data = "AbCdㅁ";
		for(int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);
//			a : 97
//			A : 65
//			90은 아스키코드표에서 마지막 대문자인 'Z'의 번호이다
			if(c >= 65 && c <= 90) {
				System.out.println("대문자:" + c); 
			}else if(c >= 97 && c <= 122){
				System.out.println("소문자:" + c);
			}else {
				System.out.println("알파벳이 아닙니다.");
			}
		}
		
		
		
		
	}
}
