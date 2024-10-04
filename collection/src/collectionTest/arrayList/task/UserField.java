package collectionTest.arrayList.task;

import java.util.ArrayList;

public class UserField {
	public ArrayList<User> users = DBConnector.users;
	public static String userId;
	public static String code;
	final int KEY = 100;

//	아이디 검사 (id 값을 넘겨주는 게 효율이 좋다)
	public User checkId(String id) {
		for (User user : users) {
			if (user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}

//	회원가입
	public void join(User user) {
		User userInDb = checkId(user.getId()); // 조회
		if (userInDb == null) {
			users.add(user); // 유저 받기
		}
	}

//	로그인 로직
//	이런 방법이 있지만, 위에서 이미 아이디를 검사함.
//	public boolean login(User user) {
//		for(User userInDb : users) {
//			if(userInDb.getId().equals(user.getId())) {
//				if(userInDb.getPassword().equals(user.getPassword())) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}

//	아이디를 검사하였으니 여기에서는 아이디를 넘겨받고, 이걸로 비밀번호만 검사 ( 그래서 총 2개 이용 ) 
	public boolean login(User user) {
		User userInDb = checkId(user.getId());
		if (userInDb != null) {
			if (userInDb.getPassword().equals(user.getPassword())) {
				userId = user.getId();
				return true;
			}
		}
		return false;
	}

//	로그아웃
	public void logout(User user) {
		userId = null;
	}

//	비밀번호 변경(마이페이지)

	void update(User user) { // user 통째로 가져오기
		User userInDb = checkId(user.getId()); // 유저 정보 검사하기, 해당 유저의 정보가 담김.
		if (userInDb != null) { // 유저정보를 갖고있으니?, 혹시 없을때 오류가 있을 수 있으니
//		userInDb.setPassword(user.getPassword());//setpassword에서 비밀번호를 변경해줄건데, 원래 비밀번호를 (암호화로) 받아와서 세팅(바꿔줌) 해줌
			userInDb.setPassword((user.getPassword())); // 암호화.
	}
	}
//	암호화
	String encrypt(String password) {
		String encryptedPassword = "";
		for (int i = 0; i < password.length(); i++) {
			encryptedPassword += (char) (password.charAt(i) * KEY);
		}
		return encryptedPassword;
	}

//	비밀번호 변경 (비밀번호 변경 30일)
	public boolean update(String password, String newPassword) { // 오버로딩
		User foundUser = checkId(userId);
		if (foundUser.getPassword().equals(password)) {
			foundUser.setPassword(encrypt(newPassword));
			return true;
		}
		return false;
	}

//	연습겸
//	인증번호 전송
//	인증메일 전송 
	

//	인증번호 확인

	public static void main(String[] args) {
		UserField uf = new UserField();
		System.out.println(uf.encrypt("fbwodms99"));

	}

}
