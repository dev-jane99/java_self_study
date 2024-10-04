package ClassTest;

public class ClassTest {
//	초기화/ 필드
	String name;
	int age;
	
//	'아무것도 하지마'기본생성자 / 필드
	public ClassTest() {;};
	
//	오버해서 불러오기 / 필드
	public ClassTest(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	main 메소드 안에서 출력
	public static void main(String[] args) {
		
//		객체화
//		값을 알고 있을땐 생성자로 초기화하기
		ClassTest per1 = new ClassTest("짱구", 5); //per1(주소값)자리를  를 인스턴스 변수 라고 부른다.
		ClassTest per2 = new ClassTest("철수", 6); //new ClassTest("철수", 6)전체를 다형성의 오버로딩이라고 한다.
		ClassTest per3 = new ClassTest("영희", 20);
		
		System.out.println(per1.name +" "+ per1.age);
		System.out.println(per2.name +" "+ per2.age);
		System.out.println(per3.name +" "+ per3.age);
	}
}
