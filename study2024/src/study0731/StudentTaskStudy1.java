package study0731;

public class StudentTaskStudy1 extends PersonTaskStudy1 {
	//StudentTask
		//인스타아이디
		//각 메서드 출력
		//work 아르바이트를 한다
		//sleep 수업 시간에 잠을 잔다
		//eat 아침을 거른다
	String id;
	public StudentTaskStudy1() {;}
	public StudentTaskStudy1(String name, int age, String add, String phone, String id) {
		super(name, age, add, phone);
		this.id = id;
	}
	@Override
	void work() {
		System.out.println("아르바이트를 한다");
	}
	@Override
	void sleep() {
		System.out.println("수업시간에 잠");
	}
}

