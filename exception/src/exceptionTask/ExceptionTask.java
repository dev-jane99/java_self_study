package exceptionTask;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {

//	다섯개의 정수만 입력받는 프로그램
//	q 입력시 나가기
//	각 정수는 배열에 담기
//	if 문은 딱 한번만 사용하기
//	무한 while 문으로 무한입력 상태로 구현
		Scanner sc = new Scanner(System.in);
		String expression = null;
		String message = "정수를 5개 순서대로 입력하세요." + "\nq 입력시 나가게 됩니다.", exampleMessage = "번 째 정수";

		int[] arData = new int[5];
		int count = 0;

		System.out.println(message);
		while (true) {
			count++;
			System.out.println(count + exampleMessage);
			expression = sc.next();

			if (expression.equals("q")) {
				break;
			}

			try {
				arData[count - 1] = Integer.parseInt(expression);
				if (count >= 5) {
					throw new ArrayIndexOutOfBoundsException();
				}

//			alt + shift + z  해주면 try-catch 문안에 포함된다.

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("정수를 5개 모두 입력했습니다.");
				for (int value : arData) {
					System.out.println(value + " ");
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("정수를 입력하세요.");
				count--;
			} catch (Exception e) {
				System.out.println("알수 없는 오류 발생.");
				e.printStackTrace();
			}
//		} finally {
//			System.out.println("finally는 무조건, 한번 실행한다.");
//		}
		}

	}
}
