package castingTest;

public class StringTest {

	public static void main(String[] args) {

		String str1 = "안", str2 = "녕";

		int num1 = 3;

		boolean isTrue = false;

		

		

		// 문자열끼리는 연결됨

		//정수가 문자열로 형변환됨

		//논리형 타입이 문자열로 형변환됨

		System.out.println(str1 + str2); //안녕

		str2 = str1 + num1; //안3

		str2 = str1 + isTrue; //안false

		System.out.println(str2);

	

		

		//111 (1, 3, 8) 이용해서 111 도출하기

		System.out.println("1" + (3 + 8)); 

	}

}
