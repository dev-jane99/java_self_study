package prepareTask;

public class Calculator {
//	Calculator 클래스 만들기
	
//  calcNum
//  정수형 2개의 ‘매개변수’를 넘겨 받아, 더한 값을 출력해주는 기능을 가진 메소드 구현
	void calcNum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	//  calcNum 
	//  정수형 1개, 실수형 1개의 ‘매개변수’를 넘겨 받아 더한 결과값을 주는 기능을 가진 메소드 구현
	double calcNum(int jung, double shil) {
		return (double)jung + shil;
	}
	//  calcNum
	//  실수형 1개를 ‘매개변수’로 넘겨 받아 정수형으로 바꿔주는 기능을 가진 메소드 메소드 구현
	int calcNum(double shil1) {
		return (int)shil1;
	}
	//  calcNum
	//  문자열 매개변수 2개를 넘겨받아 연결해서 출력하는 기능을 가진 메소드
	void calcNum(String context1, String context2) {
		System.out.println(context1 + context2);
}

//  클래스의 객체를 메모리에 할당하여, 클래스 객체가 가진 모든 메소드 호출하여
//  오류를 검증하고 결과 확인한다.
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
//		1.
		c.calcNum(3, 4);
		
//		2.
		c.calcNum(1, 1.5);
		System.out.println(c.calcNum(1, 1.5));
//		3.
		c.calcNum(1.5);
		System.out.println(c.calcNum(1.5));
//		4.
		c.calcNum("너는", " 정말 멋져!");
		
	}
}
