package inheritanceTest;
class Car2 {
	String name;
	String colour;
	  public Car2() {;}
	   public Car2(String name, String colour) {
	      super();
	      this.name = name;
	      this.colour = colour;
	   }
	   void engineStart() {
	      System.out.println("열쇠로 켜기");
	   }
	   void engineStop() {
	      System.out.println("열쇠로 시동 끄기");
	   }
	}

	class SuperCar2 extends Car2{
		public SuperCar2() {;}
		public SuperCar2(String name, String colour) {
			super(name, colour);
		}
		

//		부모클래스에 선언된 메소드를 재정의하여
		@Override
		void engineStart() {
			super.engineStart();
			System.out.println("음성으로 시동 켜기");
		}
		@Override
		void engineStop() {
			System.out.println("음성으로 시동끄기");
//		음성으로 시동 켜기, 음성으로 시동끄기 후 
//		프로그램에서 객체 생성 후 2개의 메소드를 모두 실행하기
	}
}
public class InheritanceTask1 {
	public static void main(String[] args) {
		SuperCar2 ferrari = new SuperCar2("페라리", "빨간색");
		System.out.println("Brand: " + ferrari.name + "\nColour: " + ferrari.colour);
		ferrari.engineStart();
		ferrari.engineStop();
	}
}
