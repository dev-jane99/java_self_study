package variableTest;

public class FormatTest {
	public static void main(String[] args) {
		// 출력에서 사용할 수 있는 서식문자
		// System.out.printf();
		// %d : decimal (10진수 정수)
		// %o : octal (8진수 정수)
		// %x : hexadecimal (16진수 정수)
		// %f : float (실수)
		// %c : character (문자형)
		// %s : String (문자열)
		
//		double number1 = 0.0, number2 = 0.0;
//		number1 = 0.1;
//		number2 = 0.2;
//		System.out.println(number1 + number2);
		
		String name = "류재은";
		int age = 24;
		double height = 163.5;
		
		//이름은 :
		//나이는 :
		//키는 :
		System.out.printf("이름은 %s\n", name);
		System.out.printf("나이는 %d\n", age);
		System.out.printf("키는 %.1fcm", height);
		//.1 은 소숫점자리 첫번째까지만 알려줘 라는 뜻
		//.3 소숫점 셋째자리까지 나타내줘 라는 듯...cont
	}
}
