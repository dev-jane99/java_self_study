package study0727;

import java.util.Scanner;

public class IdPassword1 {
	public static void main(String[] args) {
		
//		아이디와 비밀번호를 저장해두고 사용자에게 입력을 받기
		Scanner sc = new Scanner(System.in);
		String idMessage = "아이디를 입력하세요", 
				pwMessage = "비밀번호를 입력하세요",
				wrongInfo = "아이디 또는 비밀번호가 올바르지 않습니다.",
				rightInfo = "로그인 되었습니다.";

		
//		초기값과 사용자의 아이디와 비밀번호
		String inputId = null, inputPw = null;

		
//		조건
		String id = "Passwordis@",
			pw = "12345678";

		
//		입력받기
		System.out.println(idMessage);
		inputId = sc.next();
		System.out.println(pwMessage);
		inputPw = sc.next();
		
		
//		출력하기
		if (id == inputId && pw == inputPw) {
			System.out.println(rightInfo);
		}else {
			System.out.println(wrongInfo);
		}		
		
//		System.out.println(id == inputId && pw == inputPw ? rightInfo : wrongInfo);


		
				
	}
}

