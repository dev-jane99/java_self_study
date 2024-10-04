package study0805;

import java.util.Scanner;

public abstract class AnonymousStudy1 implements Button{
	public static void main(String[] args) {
//	버튼 눌러 키고 끄기
//	익명 내부 클래스 이용
//	기본 생성자는 끌어다 쓸 인터페이스 이름으로
	
	Button click = new Button() {

//		오버라이드 하는 법: 인터페이스에서 정의해준 주소값 이름 치고 ctrl + space
		@Override
		public void clickToStart() {
			System.out.println("시스템을 실행 합니다 \n 환영합니다.");
		}

		@Override
		public void clickToShut() {
			System.out.println("시스템을 종료합니다 \n 이용 해 주셔서 감사합니다.");
			
		}

	};
	
	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		String message = "원하시는 옵션을 선택하여 주세요"
//				+ "\n1. 시스템 실행"
//				+ "\n2. 시스템 종료";
//		System.out.println(message);
//		int choose = 0;
//		choose = sc.nextInt();
//		if(choose == 1) {
//			System.out.println();
//		}
	}
}
