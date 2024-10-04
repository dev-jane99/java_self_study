package classCastingTest;

//  넷플릭스 구현
//  애니메이션, 영화, 드라마 클래스를 선언
//	사용자가 선택한 영상이
//	애니메이션이라면 "자막 지원 기능 사용" 출력
//	영화라면 "4D 기능 사용" 출력
//  드라마라면 "굿즈 기능 사용" 출력
//	클래스 파일로 나누기


public class CastingTask1 {
	void checkVideo(Netflix vid) {
		if(vid instanceof Animation) {
			Animation animation = (Animation)vid;
			animation.ani();
		}else if(vid instanceof Movie) {
			Movie movie = (Movie)vid;
			movie.effect();
		}else if(vid instanceof Drama){
			Drama drama = (Drama)vid;
			drama.dra();
			
		}
	}
	
	
	public static void main(String[] args) {
		
		CastingTask1 ct = new CastingTask1();
		ct.checkVideo(new Animation()); //업캐스팅한 객체를 넘긴다
		ct.checkVideo(new Movie());
		ct.checkVideo(new Drama());
		
	//  애니메이션, 영화, 드라마 각각 객체화를 시키고,
	//   checkVideo로 확인!
	}
}
