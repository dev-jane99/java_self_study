package castingTest;

public class StringTesk {

public static void main(String[] args) {

//		casting 이란 형변환이다.

		int num1 = 1;

		String str1 = "8.24", str2 = "7.8";

		int num2 = 0, num3 = 0;

		//number1 + str1 + str2로 115 만들기

		

	

	

		//str1 = (int)Integer.parseInt("8.24");

		//num2 = (int)8.24

		num2 = (int)Double.parseDouble(str1);

		//num3 = (int)7.8

		num3 = (int)Double.parseDouble(str2);

	

		//15

		// 1 + (int)8.24 + (int) 7.8

		

		//System.out.println("1" +  (num2 + num3));

		System.out.println(String.valueOf(num1) + (num2 + num3));

		

		

		//String -> int 하려면

		//String.valueOf (num1); //"1"

		

		

	}

}
