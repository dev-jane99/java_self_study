package methodTest;

public class MethodTask2 {
	
//  (a)
//  Q. 이름을 출력해주는 메소드
//	void printName(String name) {
//		System.out.println(name);
//	}
	
//  Q. 1부터 10까지 짝수만 출력해주는 메소드
//	void printEven() {
//		for(int i = 0; i < 10; i++) {
//			System.out.println((i + 1) % 2 == 0 ? i + 1 : "출력 안함");
//		}
//	}
//	public static void main(String[] args) {
//		MethodTask2 mt = new MethodTask2();
//		mt.printEven();
//	}
	
//	선생님 풀이
//	void printEven() {
//		for(int i = 0; i < 10; i++) {
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}else {
//				continue;
//			}
//		}
//	}
	
	
////  Q. 10을 5번 출력해주는 메소드
//	void repeat() {
//		for(int i = 0; i < 5; i++) {
//			System.out.println(10);
//		}
//	}
	
////  Q. 나이에 10을 더해주는 메소드
//	int add10(int age) {
//		return age + 10;
//	}
	
////  Q. 두 정수를 곱해주는 메소드
//	int mul (int num1, int num2) {
//		return num1 * num2;
//	}
	
////  세 정수를 더해주는 메소드 
//	int add (int num1, int num2, int num3) {
//		return num1 + num2 + num3;
//	}
	
//  (b)
//  Q. 홍길동을 n번 출력하는 메서드
	void repeatName (int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("홍길동");
		}
	}
	
//  Q. 두 정수의 나눗셈 후 몫과 나머지 두개를 구하는 메소드
	int[] complex (int num1, int num2) {
	int[] arData = new int[2];
	arData[0] = num1 / num2;
	arData[1] = num1 % num2;
	return arData;
	}
////  Q. 1~n 까지의 합을 구해주는 메소드
	int sum (int n) {
	int result = 0;
		for(int i = 0; i < n; i++) {
			result += i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		MethodTask2 mt = new MethodTask2();
//		mt.printEven();  //메소드 사용
//	    mt.mul(2, 3);
		
//		String message = "이름을 몇번 출력하시겠습니까?";
//		System.out.println(message);
//	    mt.repeatName();

	
	}
}
