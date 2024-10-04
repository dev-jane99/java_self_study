package methodTest;

public class MethodTest {
//	class 안에는 method 가 들어있음.
	
//  f(x) = 2x + 1;
	int f (int num) {
		return 2 * num + 1;
	}
	
//	두 정수를 빼주는 메소드
	int minus (int num1 , int num2) {
		return num1 - num2;
	}
		
//	이름을 출력해주는 메소드
	void print(String name) {
		System.out.println(name);
	}
	
//	두 정수를 곱해주는 메소드
	int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
//	나이를 출력해주는 메소드
	void printAge(int age) {
		System.out.println(age);
	}
	

	
	public static void main(String[] args) {
		
//	RAM에게 클래스 주소를 할당하기 (mt 가 주소값임)
		MethodTest mt = new MethodTest();
//		mt.minus(20, 30);
//		mt.printAge(24);
//		System.out.println(mt.f(50));	
		
		
		
		
		
	}
	}
	


