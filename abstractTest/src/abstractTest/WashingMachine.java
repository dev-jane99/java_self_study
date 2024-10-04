package abstractTest;

public class WashingMachine extends Electronics{

	   @Override
	   public void off() {
	      System.out.println("눌러서 끈다");
	   }

	   @Override
	   public void on() {
	      System.out.println("눌러서 킨다");
	   }

}
