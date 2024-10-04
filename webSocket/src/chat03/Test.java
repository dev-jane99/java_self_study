package chat03;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(10, 20, 30));
//		빠른 for문 이렇게 쓰는거야
		for(int a : ar) {
			System.out.println(a);
		}
	}
}
