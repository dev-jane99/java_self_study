package study0728;

public class ArrayStudy1 {
	public static void main(String[] args) {
//	    Q. 1~20 까지 배열에 담고 출력
		
//		   배열 선언
		    int[] num = new int[20];
		   
//		   조건 입력하고 출력
		    for (int i = 0; i < num.length; i++) {
				num[i] = i + 1;
				System.out.println(num[i]);
			}

//			완

//		Q. 1~100 까지 배열에 담고 짝수만 다 더한값 출력

//		   배열 선언
			int[] num2 = new int[100];

//		   초기값
			int sum = 0;

//			조건 입력하고 출력
			for (int i = 0; i < num2.length; i++) {
				num2[i] = i + 1;
				if (i % 2 != 0) { // 여기 설명좀 해줘용...i 가 2 로 나눌때 나머지가 0이 아닌숫자들
					sum += num2[i];
				}
			}
			System.out.println(sum);

//         	완   

		}
}
