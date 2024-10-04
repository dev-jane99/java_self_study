package lambdaTest;

public class LambdaTest {
//	lambda: 함수형 인터페이스
//	인터페이스: 추상화 되어있음, 구현되지 않음
	public static void main(String[] args) {
		LambdaInter lambda = (int num) -> true; //일회성.
//		LambdaInter lambda = (int num) -> num % 2 == 0 //true 짝수이다.
//		System.out.println(lambda.even(20));
		
//		중괄호를 생략하는 방법, 1 줄로 작성해야한다.
//		PrintName print = (String firstName, String lastName) -> firstName + lastName;
//			System.out.println(print.name("안녕", "하세요"));
	
//  1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
//		PrintNum p = () -> {};
//			for(int i = 0; i < 10; i++) {
//				System.out.println(i + 1);
//			}
//			p.printUpTo10();
//	};
//		
//			System.out.println(print.printUpTo10(int[]));
//  2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다구현 PrintString, strCount()
//		1.
//	LambdaInter lamb = new LambdaInter() {
//		
//		@Override
//		public boolean even(int num) {
//			System.out.println("출력");
//			return false;
//		};
//	};
//	
//	    2.
//	LambdaInter lamb = num -> false;
		
		
		
//  3) 문자열을 받으면 뒤집은 문자열로 리턴해주는 람다구현 Reverse reverseString()
//		Reverse reverse = (String str) -> {
//			String result = "";
//			for(int i = 0; i < str.length(); i++) {
//				result += str.charAt(str.length() - i - 1); //str.length() 는 사용이다. 왜? 뒤에 중괄호(선언부) 가 없기 때문에.
//			}
//			return result;
//		};
//		String a = reverse.reverseString("로꾸꺼 로꾸꺼"
//				+"아니"
//				+"그게"
//				+"아니라");
//		System.out.println(a);
//
//	
	}
}
