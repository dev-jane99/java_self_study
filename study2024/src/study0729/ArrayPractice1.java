package study0729;

import java.util.Scanner;

public class ArrayPractice1 {
	public static void main(String[] args) {
//      Q. 5개의 정수를 입력 받고 배열에 담은 후 최대값과 최소값을 출력
		
//		스캐너 작성
		Scanner sc = new Scanner(System.in);

//		출력 메세지
		String message = "5개의 정수를 입력하세요";
		System.out.println(message);
		
//		int 배열에 담는다
		int[] num = new int[5];
		
//		초기값
		int min = 0;
		int max = 0;
		
//		반복문 돌린다
		for(int i = 0; i < num.length; i++) {
//		입력창을 넣어준다
			num[i] = sc.nextInt();
		}
			min = num[0];
			max = num[0];
//		최대값과 최소값의 범위 정해주기
			for(int i = 0; i < num.length; i++) {
			if(num[i] < min) {
				min = num[i];
			}if(num[i] > max) {
				max = num[i];
			}
		}
//			for문 밖에서 출력
			System.out.println("최대값: " + max);
			System.out.println("최소값: " + min);
		
//		완
		
		
	}
}
