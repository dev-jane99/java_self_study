package study0730;

public class MethodStudy02 {
//  세 정수를 더해주는 메소드 
	int add (int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
		public static void main(String[] args) {
			MethodStudy02 ms = new MethodStudy02();
			ms.add(0, 0, 0);
			System.out.println(ms.add(1, 2, 3));
		}
}
