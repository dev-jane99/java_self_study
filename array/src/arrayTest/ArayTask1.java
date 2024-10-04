package arrayTest;

public class ArayTask1 {
	 public static void main(String[] args) {
		//브론즈
//		 10~1 까지 짝수만 배열에 담고 출력
		 int[] arData = {10, 8, 6, 4, 2};
		 for(int i = 0; i < arData.length; i++) {
		 System.out.println(arData[i]);
		 }
		 
		 int[] arData2 = new int[10];
		 for(int i = 0; i < arData2.length; i += 2) {
			 arData2[i] = 10 - i;
			 System.out.println(arData2[i]);
		 }
		 
		 int[] arData3 = new int[5];
		 arData3[0] = 10;
		 arData3[1] = 8;
		 arData3[2] = 6;
		 arData3[3] = 4;
		 arData3[4] = 2;
		 
		 for(int i = 0; i < arData.length; i++) {
			 System.out.println(arData3[i]);
		 }
		 
		 int[] arData4 = new int[5];
		 for(int i = 0; i < arData.length; i++) {
			 arData4[i] = (5 - i)*2;
			 System.out.println(arData4[i]);
		 }
		 
		 
		 
	}
}
