package controlStatement;

public class BadWhile {
	public static void main(String[] args) {
		int count = 0;
		while (count != 10) {
			System.out.println(count + "jane");
			count++;
		}
//		이렇게 하면 안된다 . 왜냐하면  while문 은 몇번 반복할지 모를떄 쓰는거기 때문이다.
	}
}
