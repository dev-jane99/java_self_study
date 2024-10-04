package objectTest;

public class EqualsTest {
	public static void main(String[] args) {
		
//		기본 자료형의 참조 불변성으로 인해,,, 주소값이 다르지 않다
		String data1 = "ABC";
		String data2 = "ABC";
		int num1 = 10;
		int num2 = 10;
//		기본 자료형이 아니다,
		String data3 = new String("ABC");
		String data4 = new String("ABC");
		
		
		System.out.println(num1 == num2); // true
		System.out.println(data1 == data2); // true
		System.out.println(data1.equals(data2)); // true
		
		System.out.println(data1 == data4); // false
		System.out.println(data3 == data4); // false
		System.out.println(data3.equals(data4)); // true
		
	}
}
