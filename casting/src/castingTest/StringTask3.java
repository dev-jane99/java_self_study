package castingTest;

public class StringTask3 {

public static void main(String[] args) {

		

//		"12.123"

//		"345.789"

//		"6789.456"

//		3개 값을 더해서 123456789 출력하기

		

		String do1 = "12.123", do2 = "345.789", do3 = "6789.456";

		

		int num1 = 0, num2 = 0, num3 = 0;

		

		num1 = (int)Double.parseDouble(do1);

		num2 = (int)Double.parseDouble(do2);

		num3 = (int)Double.parseDouble(do3);

		System.out.println(String.valueOf(num1) + String.valueOf(num2) + String.valueOf(num3));

		

		

		

		

		double a = Double.parseDouble("12.123");

		double b = Double.parseDouble("345.789");

		double c = Double.parseDouble("6789.456");

		int i1 = 0, i2 = 0, i3 = 0;

		

		i1 = (int)a;

		i2 = (int)b;

		i3 = (int)c;

		

		

		

		System.out.println(String.valueOf(i1) + i2 + i3);

		

		

		//선생님 풀이

		

		

		String str1 = "12.123", str2 = "345.789", str3 = "6789.456";

		double dou1 = 0.0, dou2 = 0.0, dou3 = 0.0;

		int in1 = 0, in2 = 0, in3 = 0;

		

		dou1 = Double.parseDouble(str1);

		dou2 = Double.parseDouble(str2);

		dou3 = Double.parseDouble(str3);

		

		in1 = (int)dou1;

		in2 = (int)dou2;

		in3 = (int)dou3;

		

		System.out.println("" + in1 + in2 + in3);

		

	System.out.println('a' + 10);

	

	

		

	}

}
