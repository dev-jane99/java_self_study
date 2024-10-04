package castingTest;

public class CastingTest {

	public static void main(String[] args) {

		//저장공간 만들기 * 초기값은 값이 없는 값들로 들어감 그냥 int age; 하면 쓰레기 값이 되니까

		//초기값

		final char KEY ='a';

		int age = 0;

		double height = 0.0;

		char lastName = ' ';

		String Message = " ", input = null;

	    boolean isTrue = false;

		

	    //double 의 강제 형변환

		age = 24;

		height = 163.5;

		age = (int)height;

		System.out.println(age);

		

		//boolean 은 int 로 강제형변환을 해줄 수 없다./ boolean 의 강제 형변환

//		isTrue = true;

//		age = (int)isTrue; 안됨요

		

		lastName = 'A';

		age = lastName; //아스키코드임

		System.out.println((char)age*KEY); //char 는 아스키코드 생각하기

		

	

		

		// 8.43 + 2.59 = 10이 되도록 하라

		int number1 = 0, number2 = 0;

		number1 = (int)8.43;

		number2 = (int)2.59;

		System.out.println(number1 + number2);

		

		double number3 = 0, number4 = 0;

		number3 = (int)8.43;

		number4 = (int)2.59;

		System.out.println(number3 + number4);

		

		

		

		double a = 8.43;

		double b = 2.59;

		System.out.println((int)a + (int)b);

		

		

	

		

		

	}

}