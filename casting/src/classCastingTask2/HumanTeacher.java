package classCastingTask2;

public class HumanTeacher extends MonsterTeacher {
	   public HumanTeacher() {;}
	   public HumanTeacher(String name, int hp, int experience) {
	      super(name, hp, experience);
	   }

	   @Override
	   void dropItems() {
	      System.out.println("갑옷을 떨궜습니다.");
	   }
	}

