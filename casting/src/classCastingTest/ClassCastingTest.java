package classCastingTest;
	class Car{
		public Car() {;}
			void engineStart() {
				System.out.println("열쇠로 시동 켬");
		}
	}

	
	class SuperCar extends Car{
		public SuperCar() {;}
		
		@Override
		void engineStart() {
			System.out.println("음성으로 시동 켬");
		}
		
		void openRoof() {
			System.out.println("뚜껑 오픈!");
		}
	}
public class ClassCastingTest {
//	class의 casting (형변환)
	public static void main(String[] args) {
//		객체화
		Car matiz = new Car();
		Car kia = new SuperCar();  //업캐스팅
		SuperCar ferrari = new SuperCar();
		SuperCar kiaFullOption = (SuperCar) kia; //다운캐스팅 부모가 선언한게 나옴
//		kiaFullOption.openRoof();
//		kia.engineStart(); //자식의 값이 답으로 나온다여
//		SuperCar lamb = (SuperCar)kia; //다운캐스팅 부모가 선언한게 나온다
//		Car car = new Car();
//		car.engineStart(); //부모가 선언한것 나옴
//		SuperCar benz = new Car();   얘는 안된다! 부족한 부분을 채울 수 없으니까.
		
//		type instanceof type : 참 또는 거짓
		  System.out.println(matiz instanceof Car);
	      System.out.println(matiz instanceof SuperCar);
	      System.out.println(kia instanceof Car);
	      System.out.println(kia instanceof SuperCar);
	      System.out.println(ferrari instanceof Car);
	      System.out.println(ferrari instanceof SuperCar);
	      System.out.println(kiaFullOption instanceof Car);
	      System.out.println(kiaFullOption instanceof SuperCar);
	      

		
	}
}
