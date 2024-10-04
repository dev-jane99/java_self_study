package controlStatement;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		//                     저장공간
		String message = "1.분실 신고\n2.통산사 이동\n3.결제 수단 변경\n0.상담원 연결";
		Scanner sc = new Scanner(System.in);
		int choice = 0; 
		do {
			System.out.println(message);
			choice = sc.nextInt();
		}while (choice != 0);
		
	}
}
