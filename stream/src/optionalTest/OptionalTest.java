package optionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {
//	필드 선언
	ArrayList<User> users = new ArrayList<User>(Arrays.asList(
			new User("류재은", "ryo", "1234"),
			new User("류재준", "rue", "2345"),
			new User("류재현", "rue", "3456"),
			new User("류재민", "rue", "4567")
			));
//	for 문에 한번이라도 안들어갔다면, null 값을 리턴
//	NPE 뜨는 상황 (NullPointException)
//	단일 객체만!  Optional 로 바꾼다
//	강조 ※Optional 로 감쌌다고 다 Optional 로 감싸지 말아라.
//	반드시 리턴 타입에서만 Optional 을 사용하고, 단일 객체만 감싸준다.
	public Optional<User> findById(Long id) { //아이디 받고
		User user = null;   //유저 선언
		for(User userInDb : users) {
			if(userInDb.getId() == id) { //현재 아이디값 비교, 같으면,
				user = userInDb; //아이디가 같다.
			}
		}
		return Optional.ofNullable(user); //null이 있을수도 있어~라는 뜻
	}
		
	
	public static void main(String[] args) {
		OptionalTest optionalTest = new OptionalTest();
		Optional<User> foundUser = optionalTest.findById(10L);
		
//		orElseThrow : 실무에서 가장많이 사용되는 메소드
//		user 가 null 이 아니면 통째로 user
//		user 가 없으면 통째로 예외
		
//		User user = foundUser.orElseThrow(() -> {
//			throw new RuntimeException("그런 사람은 없습니다");
//		});
		
//		boolean 이용하기
		optionalTest.findById(10L).map(User::getUserId).isPresent(); //true, false 유저를 들고 오는 친구
		optionalTest.findById(10L).map(User::getUserId).ifPresent(System.out::println); //진짜로 값이 있을때만 접근하는 친구 
		optionalTest.findById(10L).map(User::getUserId).ifPresentOrElse((userId) -> { //if else 처럼 사용
			System.out.println(userId);
		}, () -> {
			System.out.println("존재하지 않는 유저입니다");
		});
		
	}
}
