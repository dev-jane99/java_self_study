package study0730;

public class MethodStudy04 {
//	Q. 1~10 까지 짝수를 출력하는 메소드
	public static void add() {
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
//	MethodStudy03 ms = new MethodStudy03();
	add();
	
	}
}
