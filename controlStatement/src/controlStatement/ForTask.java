package controlStatement;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		//(브론즈)
////		1 ~ 100까지 출력
//		
//		for (int i = 0; i < 101; i++) {
//			System.out.println(i);
//		}
//		
////		100 ~ 1까지 출력
//		for (int i = 0; i < 100; i++) {
//			System.out.println(100 - i);
//	    }
//		
////		1 ~ 100까지 출력
//		for (int i = 0; i < 101; i+=2) {
//			System.out.println(i);
//		}
		
//		for (int i = 0; i < 100; i++) {
//			System.out.println((100 - i)*2); //곱하기 2 해줘서 200 까지 반복 시킴
//		}
//		
//		for (int i = 0; i <= 100; i++) {
//			if (!(i % 2 == 0)) { // true 라서 계속됨
//				continue;
//			}
//			System.out.println(i);
//		}
//		(골드)
//		1 ~ 10 까지의 합값 출력
//		알고리즘 1. 합을 담을 변수 필요함
//		2. 반복을 돌려서 변수에 누적합한다
//		3. 출력하기
		
//		int sum = 0;
//		for (int i = 0; i < 10; i++) {
//			sum += i + 1;
//		}
//		System.out.println(sum);
		
		
		
		
		
		
//		(골드)
//		1 ~ n 까지 합을 출력하기 (사용자가 15를 입력하면 1~15까지 합산됨)
//		
//		String message = "1 부터 원하는 정수까지의 합산을 보려면 원하는 정수를 입력하세요.";
//		Scanner sc = new Scanner(System.in);
//		int num = 0, result = 0;
//		
//		System.out.println(message);
//	
//		num = sc.nextInt();
//		
//		for (int i = 0; i < num; i++) {
//			result += i + 1;
//		}
//		
//		System.out.println(result);
		

//      (플레티넘)
//      A ~ F까지 출력
//		for(int i = 0; i < 6; i++) {
//			System.out.println((char)('A' + i));
//		}
		
//      A ~ F까지 C를 제외하고 출력, if 문은 사용불가
//		for(int i = 0; i < 5; i++) {
//        System.out.println((char)((i > 1 ? 66 : 65) + i));
//		}
		
//		
//		
//		잘 쓰는중
//      (다이아)
//		반복 돌리기 5번
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i);
//		}
		
		
//      012340123401234 출력 (%5) 쓰면됨
		
//		int result = 0;
//		for(int i = 0; i < 15; i++) {
//	        result = i%5;
//	        System.out.println(result);  
//			}
//		더 쉽게
//		for(int i = 0; i < 15; i++) {
//	        System.out.println(i % 5);  
//			}
		
		
//      aBcDeF...Z출력

		
//		'A' = 65
//		a =97

//		for (int i = 0 ; i < 26; i++) {
//			System.out.print((char)((i % 2 == 0 ? 97 : 65) + i));
//		}
      
//      (마스터)
//         *
//        ***
//       *****
//      *******
//     *********
		for (int i = 0; i < 10; i += 2) {
			for(int j = 10; j > i; j -= 2) {
				System.out.print(" ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print("*");
			}
			System.out.println("\n");
			
		}
//		
		
		
		
	}
	
}
