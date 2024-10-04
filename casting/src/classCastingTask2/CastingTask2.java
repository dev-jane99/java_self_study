package classCastingTask2;


//	캐릭터 hunt()
//	몬스터(부모), 오크, 요정, 휴면
//	오크의 가죽을 얻었습니다.
//	요정의 날개를 얻었습니다.
//	휴먼의 값옷을 얻었습니다.

public class CastingTask2 {
	
	void hunt(Monster monster) {
		if(monster instanceof Oak) {
			Oak oak = (Oak)monster;
			oak.skin();
		}else if(monster instanceof Fairy) {
			Fairy fairy = (Fairy)monster;
			fairy.wings();
		}else if(monster instanceof Human){
			Human human = (Human)monster;
			human.armor();
		}
	}
	
	public static void main(String[] args) {
		
		CastingTask2 ct = new CastingTask2();
		ct.hunt(new Oak()); //업캐스팅한 객체를 넘긴다
		ct.hunt(new Fairy());
		ct.hunt(new Human());
}
}

