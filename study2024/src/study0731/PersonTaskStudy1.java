package study0731;

public class PersonTaskStudy1 {
	//PersonTask
		//이름, 나이, 주소, 핸드폰
		//각 메서드 출력
		//work 일을 한다
		//sleep 잠을 잔다
		//eat 세 끼를 먹는다
	String name;
	int age;
	String add;
	String phone;
	
	public PersonTaskStudy1() {;}
	
	public PersonTaskStudy1(String name, int age, String add, String phone) {
		this.name = name;
		this.age = age;
		this.add = add;
		this.phone = phone;
	}
	void work() {
		System.out.println("일을 한다");
	}
	void sleep() {
		System.out.println("잠을 잔다");
	}
	void eat() {
		System.out.println("세 끼를 먹는다");
	}
	
	}

