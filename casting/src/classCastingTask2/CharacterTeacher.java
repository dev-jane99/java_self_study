package classCastingTask2;

public class CharacterTeacher {
	 private String id;
	   private String job;
	   private int hp;

	   public CharacterTeacher() {;}
	   public CharacterTeacher(String id, String job, int hp) {
	      this.id = id;
	      this.job = job;
	      this.hp = hp;
	   }

	   public String getId() {
	      return id;
	   }
	   public void setId(String id) {
	      this.id = id;
	   }
	   public String getJob() {
	      return job;
	   }
	   public void setJob(String job) {
	      this.job = job;
	   }
	   public int getHp() {
	      return hp;
	   }
	   public void setHp(int hp) {
	      this.hp = hp;
	   }
	   
	   void hunt(MonsterTeacher monster) {
	      if(monster instanceof FairyTeacher) {
	         FairyTeacher fairy = (FairyTeacher)monster;
	         System.out.println(fairy.getName() +"사냥 당했습니다");
	         System.out.println(id + "이(가) 사냥에 성공했습니다.");
	         fairy.dropItems();
	      }else if(monster instanceof OakTeacher) {
	         OakTeacher oak = (OakTeacher)monster;
	         System.out.println(oak.getName() +"사냥 당했습니다");
	         System.out.println(id + "이(가) 사냥에 성공했습니다.");
	         oak.dropItems();
	         
	      }else if(monster instanceof HumanTeacher) {
	         HumanTeacher human = (HumanTeacher)monster;
	         System.out.println(human.getName() +"사냥 당했습니다");
	         System.out.println(id + "이(가) 사냥에 성공했습니다.");
	         human.dropItems();
	      }
	      
	   }

	   
	}

	      
	   
	


