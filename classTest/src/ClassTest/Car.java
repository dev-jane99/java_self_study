package ClassTest;

public class Car {
	String name ="이름";
	
	public Car() {;}
	public Car(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Car 엄마차 = new Car("엄마차");
		Car 아빠차 = new Car("아빠차");
		Car 오빠차 = new Car("오빠차");
	}
}
