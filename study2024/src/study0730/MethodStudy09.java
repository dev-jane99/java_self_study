package study0730;

import java.security.DomainCombiner;

public class MethodStudy09 {
//	홀수를 짝수로,  짝수를 홀수로
//	int change(int num) {
//		return ++num;
//	}
//	public static void main(String[] args) {
//		MethodStudy09 ms = new MethodStudy09();
//		ms.change(0);
//		System.out.println(ms.change(7));
//	}
	public static void change(int num) {
		for(int i = 0; i < num; i++) {
				System.out.println(num + 1);
		break;
		}
	}
	public static void main(String[] args) {
		change(7);
	}
}
//   완