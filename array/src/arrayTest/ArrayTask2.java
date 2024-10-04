package arrayTest; 

import java.util.Scanner;

public class ArrayTask2 { 
	public static void main(String[] args) {  
////		브론즈
////		1~10 까지 배열에 담고 출력
////		int[] num1 = new int[10];
////		for(int i = 0; i < num1.length; i++) {
////			num1[i] = i + 1;
////		System.out.println(num1[i]);
////		}
////		
////		
//////		1~100 까지 배열에 담고 홀수만 출력
////		int[] num2 = new int[100];
////		
////		for(int i = 0; i < num2.length; i += 2) {
////			num2[i] = i + 1;
////			System.out.println(num2[i]);
////		}
//				
////		또는
//		
//		
//		
////		실버
////		1~100 까지 담고 짝수의 합을 출력
//		int[] arData1 = new int[100];
//		int sum = 0;
//		
//		for (int i = 0; i < arData1.length; i++) {
//			arData1[i] = i + 1;
//			if ( i % 2 != 0) {
//			sum += arData1[i];
//		    }
//		}
//			System.out.println(sum);
//	
////		A~F까지 담고 출력
//			
//	   char[] arData = new char[5];
//      
//      for(int i = 0; i < arData.length; i++) {
//         arData[i] = (char)(i > 64 && i < 91);??? 이거 아닌데...
//         System.out.println((arData[i]));
//      }


//		
////		A~F까지중 C를 제외하고 배열에 담고 출력
//        char[] letter1 = new char[5];
//		
//		for (int i = 0; i < letter1.length; i++) {
//			letter1[i] = (char)(1 > i ? 66 + i : 67 + i);
//			System.out.println(letter1[i]);
//		}
////		
////					
////		골드
////		5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//		Scanner sc = new Scanner(System.in);
//		int min = 0, max = 0;
//		int[] arData = new int[5];
//		String message = "5개의 정수를 입력하세요.", exMessage = "3 4 5 6 7";
//		
//				System.out.println(message);
//		        System.out.println(exMessage);
//		        
//		for ( int i = 0; i < arData.length; i++) {
//			arData[i] = sc.nextInt();
//		}
//		min = arData[0];
//		max = arData[0];
//		
//		for ( int i = 1; i < arData.length; i++) {
//			if(max < arData[i]) {max = arData[i];}
//			if(min > arData[i]) {min = arData[i];}
//		}
//		System.out.println("최소값:" + min);
//		System.out.println("최댓값:" + max);
		
//		다이아 (그룹문제)
//		사용자가 입력할 정수의 갯수만큼 배열을 만든후 정수를 입력받고
//		average 구하기
		
////        1. 스캐너 입력
//		Scanner sc = new Scanner(System.in);
//		String message = "몇개의 정수를 입력할래?";
//		String nextMessage = "정수 입력해";
//
//		
//		double avg = 0.0;
//		int sum = 0;
//		int choice = 0;
//		
////		2. 메시지 입력
//		System.out.println(message);
//		choice = sc.nextInt();
//		System.out.println(nextMessage);
//		int choice2 = sc.nextInt();
//		
//	
////	    4. 배열 만들기
//		int[] num = new int[choice2]; 
//		for( int i = 0; i < choice2; i++) {
//		 
//		 num[i] = sc.nextInt();
//		 sum += num[i];
//		}
//		System.out.println((double)sum / num.length);
		  Scanner sc = new Scanner(System.in);
	      int[] arData = null;
	      String message1 = "정수의 개수를 입력하세요.", message2 = "번 째 정수";
	      int length = 0, total = 0;
	      double average = 0.0;
	      
	      System.out.println(message1);
	      
	      length = sc.nextInt();
	      arData = new int[length];
	      
	      for(int i = 0; i < arData.length; i++) {
	         System.out.println(i+1+message2);
	         arData[i] = sc.nextInt();
	      }
	      
	      for(int i = 0; i < arData.length; i++) {
	         total += arData[i];
	      }
	      
	      average = (double)total/length;
	      
	      System.out.print("[");
	      for(int i = 0; i < arData.length; i++) {
	         System.out.print(arData[i]);
	         if(i != length - 1) {
	            System.out.print(" ");
	         }
	      }
	      System.out.println("]");
	      System.out.println("평균 :" + average);

		
				
		
		
	
		
	}
}
