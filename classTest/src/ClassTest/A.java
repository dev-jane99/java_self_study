package ClassTest;

public class A {
//	compiler가 자동으로 data 초기값으로 만들어준다.
	int age;
	String name;
	public A() {;};
	public A(String name, int age) {
		this.age = age;
		this.name = name;
	}
	public static void main(String[] args) {
		A person1 = new A();
//		이미 넣어야할 값을 알땐, 생성자로 초기화 해준다.
		A person2 = new A("류재은", 24);
		System.out.println(person1.name);
		System.out.println(person2.name);
		
		
	}
}
