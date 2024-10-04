package castingTest;

public class StringTest2 {

public static void main(String[] args) {

		

		boolean isTrue = false;

		double data1 =0.0;

		

		//문자열을 다른 타입으로 변경

		//String 은 클래스, 기본 자료형과 격이 달라서 변경할 수 없다

		//System.out.println((int)"1") 은 사용할 수 없다

		//대문자로 시작하는 타입을 이용해서 형변환을 하는 경우는 

		System.out.println(Integer.parseInt("1") + (3 + 8));  //12

		

		isTrue = Boolean.parseBoolean("true");

		data1 = Double.parseDouble("10.2");

		

		//엄마 불러오기

		//int Integer

		//boolean Boolean

		//double Double

		//float Float

		//char Character

	}

}
