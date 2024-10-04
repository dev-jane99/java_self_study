package inheritanceTest;

class A{
	String name;
	int age;
	
	public A() {
		System.out.println(this);
		System.out.println("부모 생성자 호출");
	}

	public A(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
class B extends A{
//	need more Methods
	public B() {;}
	public B(String name, int age) {
		super(name, age);   //B 의 부모인  A 를 호출하는 생성자
		System.out.println(this);
		System.out.println("자식 생성자 호출");
	}
	void printData() {
		
	}
	
}

public class InheritanceTest {
	public static void main(String[] args) {
		B b = new B("이름", 1234);
	    System.out.println(b.name);
	}
}