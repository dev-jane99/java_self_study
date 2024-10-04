package ClassTask;

class Human {
	String name;
	public Human() {;}
	public Human(String name) {
		this.name = name;
	}
	
	void eat() {
		System.out.println("먹기");
	}
	void sleep() {
		System.out.println("잠자기");
	}
	void walk() {
		System.out.println("두 발로 걷기");
	}
	
}
class Monkey extends Human{
	@Override //anoxide???Override
	void walk() {
		System.out.println("네발로 걷기");
	}
	
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		Monkey kingkong = new Monkey();
		kingkong.eat();
		kingkong.sleep();
		kingkong.walk();
		kingkong.toString();
	}
}
