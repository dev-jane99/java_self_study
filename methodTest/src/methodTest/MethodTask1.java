package methodTest;

public class MethodTask1 {

//		int minus(int num1, int num2, int num3) {
//			return num1 - num2 - num3;
//		}
//		
//		public static void main(String[] args) {
//			MethodTask1 mt = new MethodTask1();
//			mt.minus(50, 20, 10);  
//			System.out.println(mt.minus(50, 20, 10));
//			
//			//통채로가 리턴값이다. 그래서 0,0,0 자리에 각각 숫자를 넣고 출력하면 메소드에서 정한대로 계산된다.
////			mt.print();
//		}
		
//	}

//1~10까지 println()으로 출력하는 메소드
//void print(int num) {
//System.out.println(num);
//}
//public static void main(String[] args) {
//
//int[] num1 = new int[10];
//for(int i = 0; i < 10; i++) {
//	System.out.println(i + 1);
//}
//
////선생님 풀이
   void print() {
	 for(int i = 0; i < 10; i++) {
		System.out.println(i + 1);
		}
   }
	 public static void main(String[] args) {
			MethodTask1 mt = new MethodTask1();
	        mt.print();
//			System.out.println();
}
}


