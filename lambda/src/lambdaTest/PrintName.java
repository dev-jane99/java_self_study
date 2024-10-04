package lambdaTest;

@FunctionalInterface
public interface PrintName {
//	fullname 을 만들어주는 메소드
	String name(String firstName, String lastName);
	// 추상 메소드 이름과 성
}
