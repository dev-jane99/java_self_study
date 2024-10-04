package study0730;

public class MethodStudy03 {
//  Q. 홍길동을 n번 출력하는 메서드
	public static void hong (int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("홍길동");
		}
	}
	public static void main(String[] args) {
		hong(5);
	}
}
