package study0728;

import java.util.Scanner;

public class ArrayGroupStudy1 {
	public static void main(String[] args) {
		
//		Q. 사용자가 입력할 정수의 갯수만큼 배열을 만든후 정수를 입력받고
//		   average 구하기
//		스캐너
		Scanner sc = new Scanner(System.in);
		
//		입력받을 정수의 개수의 변수와 
		int count = 0;
//		다 더하기할 변수를 만든다
		int sum = 0;
//		평균의 초기값 만들기
		double avg = 0.0;
		
//		메세지
		String message1 = "입력하실 정수의 개수를 먼저 입력하세요", message2 = "입력하신 숫자만큼 정수를 입력하세요.";
		System.out.println(message1);
		count = sc.nextInt();
		System.out.println(message2);
		
		
//		받은 정수의 갯수로 배열 만들기
		int[] getNumber = new int[count];
		
		for(int i = 0; i < getNumber.length; i++) {
			getNumber[i] = sc.nextInt();
		}
		
//		누적복합해서 다 더하는거 반복
		for(int i = 0; i < getNumber.length; i++) {
			sum += getNumber[i];
		}
		avg = (double) sum / getNumber.length;
		System.out.println(avg);
		
		
//		완
	}
}
