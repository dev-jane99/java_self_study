package inputTest;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {

		//타입  변수명 =  값

		//""=빈문자 

		Scanner sc = new Scanner (System.in);

		String message = "이름을 입력하세요.", 

				firstName = null , lastName = null, name = null;

		

		

		System.out.println(message);

		//lastName = sc.next();  //입력한 값을 가지고 있는 친구

		//firstName = sc.next();

		name = sc.nextLine();

		

		System.out.println(name + "님 환영합니다.");

		

		

		

	}

	

}
