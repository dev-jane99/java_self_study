package classCastingTask2;

public class OakTeacher extends MonsterTeacher {
	   public OakTeacher() {;}
	   public OakTeacher(String name, int hp, int experience) {
	      super(name, hp, experience);
	   }
	   
	   @Override
	   void dropItems() {
	      System.out.println("가죽을 떨궜습니다.");
	   }
	}
