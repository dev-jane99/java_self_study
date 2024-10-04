package collectionTest.arrayList.task;

//	로그인 단위 테스트
public class Login {
	public static void main(String[] args) {
		UserField userField = new UserField();
		
		User user = new User();
		user.setId("jane1027");
		user.setPassword("1234");
		
//		회원가입 테스트 
		if(userField.checkId(user.getId()) == null) {
			userField.join(user);
			System.out.println(DBConnector.users);
		}
//		로그인 테스트
		User userForLogin = new User();
		userForLogin.setId("jane1027");
		userForLogin.setPassword("1234");
		
		if(userField.login(userForLogin)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
//		마이 페이지, if 담기
		System.out.println(UserField.userId);
		User foundUser = userField.checkId((UserField.userId));
		foundUser.setPassword("1027");
		
//		비밀번호 변경
		userField.update(foundUser);
		
//		로그아웃
//		userField.logout();
		
//		재로그인
		userForLogin = new User();
		userForLogin.setId("jane1027");
		userForLogin.setPassword("1027");
		
		if(userField.login(userForLogin)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
	}
}
