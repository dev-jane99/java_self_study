package classCastingTask2;

public class MonsterTeacher {
	 private String name;
	   private int hp;
	   private int experience;
	   
	   public MonsterTeacher() {;}
	   
	   public MonsterTeacher(String name, int hp, int experience) {
	      this.name = name;
	      this.hp = hp;
	      this.experience = experience;
	   }

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public int getHp() {
	      return hp;
	   }

	   public void setHp(int hp) {
	      this.hp = hp;
	   }

	   public int getExperience() {
	      return experience;
	   }

	   public void setExperience(int experience) {
	      this.experience = experience;
	   }

	   void dropItems() {
	      System.out.println("아이템을 떨궜습니다.");
	   }
	}



