package study0730;

public class MethodStudy01 {
//		1~10까지 println()으로 출력하는 메소드
		void print (int num) {
			System.out.println(num);
		}
		
	public static void main(String[] args) {
		int[] num = new int[10];
		for(int i = 0; i < num.length; i++) {
			num[i] += i + 1;
			System.out.println(num[i]);
		}
	}
}
