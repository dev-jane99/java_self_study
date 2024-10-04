package operTest;

public class OperTest4 {

public static void main(String[] args) {

		

		int data = 10;

		

//		A && B 결과에서 앞이 이미 false 면 뒤의 것은 아예 돌리지도 않는다

		System.out.println(data == 10 && ++data == 10); //true 라서 

		System.out.println(data); // 얘가 11 인거임 ++data 가 돌았기 때문

		

		

	}

}

