package access2;

public class UserTask1 {
	
//이름, 나이, 인스타, 전화번호
//	1. 필드구성
	private String name;
	private int age;
	private String insta;
	private String phone;
	
//	기본 생성자
	
	public UserTask1() {;}
	
	
//	초기화 생성자
	public UserTask1(String name, int age, String insta, String phone) {
	super();
	this.name = name;
	this.age = age;
	this.insta = insta;
	this.phone = phone;
}
	
//	2. private 의 getter 와 setter를 만들어준다.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getInsta() {
		return insta;
	}
	public void setInsta(String insta) {
		this.insta = insta;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	
	
}
