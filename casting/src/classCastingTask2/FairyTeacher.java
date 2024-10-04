package classCastingTask2;

public class FairyTeacher extends MonsterTeacher {
	   public FairyTeacher() {;}
	   public FairyTeacher(String name, int hp, int experience) {
	      super(name, hp, experience);
	   }
	   
	   
	   @Override
	   void dropItems() {
	      System.out.println("날개를 떨궜습니다.");
	   }
	}
