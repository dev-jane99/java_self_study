package study0731;

public class CastingTask2Study1 {
//	캐릭터 hunt(Monster monster)
//	몬스터(부모), 오크, 요정, 휴면
//	오크의 가죽을 얻었습니다.
//	요정의 날개를 얻었습니다.
//	휴먼의 값옷을 얻었습니다.
	
	void hunt(MonsterStudy1 monster) {
		if(monster instanceof OakStudy1) {
			OakStudy1 o = (OakStudy1) monster;
			o.caption();
		}else if (monster instanceof FairyStudy1) {
			FairyStudy1 f = (FairyStudy1)monster;
			f.caption();
		}else if (monster instanceof HumanStudy1) {
			HumanStudy1 h = (HumanStudy1)monster;
			h.caption();
		}
	}
	
	public static void main(String[] args) {
		MonsterStudy1 mon = new MonsterStudy1();
		FairyStudy1 fairy = new FairyStudy1();
		OakStudy1 oak = new OakStudy1();
		HumanStudy1 human = new HumanStudy1();
		
		fairy.caption();
		oak.caption();
		human.caption();
	}
}
