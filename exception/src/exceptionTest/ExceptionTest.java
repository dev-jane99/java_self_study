package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
//		int[] arData = new int[5];
//		try {
//			System.out.println(arData[5]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.err.println("인덱스 잘못 입력했어");
//		} catch (Exception e) {
//			System.out.println("알수 없는 오류 발생");
//		}
//		
		
		int[] arData = {10, 20, 30, 40, 50};
		System.out.println("안녕");
		try {
			System.out.println(arData[5]);
			System.out.println(arData[4]/0);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.err.println("인덱스 잘못 입력했어");
		} catch (ArithmeticException e) {
			System.out.println("0으로 값을 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("알수 없는 오류 발생");
			e.printStackTrace();  //아니면 이것으로 통해서 오류가 어디서 났는지 알려준다.
		}
	
		
	}
	

}
