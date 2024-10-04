package controlStatement;

public class ForTest {
	public static void main(String[] args) {
		
////		1 부터 10 까지 출력
//		for (int i = 0; i < 10; i++) { //i 가 true 면 i++ i는 그 후에 실행됨 그래서 i++ 던, ++i 던 여기에서는 상관없음
//		System.out.println(i + 1); // 1이다. 그리고 다시 바로 증감식으로 돌아가서 반복됨. 조건식을 충족할때까지
//		}
//		
////		10부터 1까지 출력 
//		for (int i = 0; i < 10; i++) {
//			System.out.println(10 - i);
//		}
//		
//		이름 10 번 출력
//	
//		for (int i = 0; i < 10; i++) {
//			System.out.println("류재은");
//		}
		
		int value = 100;
		value /= 10;
		System.out.println(value); //10
		
		for (int i = 0; i < 10; i+=2) {
			System.out.println(i);
		}
		
		
		
	}
}
