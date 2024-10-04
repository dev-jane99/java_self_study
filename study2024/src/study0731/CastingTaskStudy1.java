package study0731;

public class CastingTaskStudy1 {
	
//  넷플릭스 구현
//  애니메이션, 영화, 드라마 클래스를 선언
//	사용자가 선택한 영상이
//	애니메이션이라면 "자막 지원 기능 사용" 출력
//	영화라면 "4D 기능 사용" 출력
//  드라마라면 "굿즈 기능 사용" 출력
//	클래스 파일로 나누기
	
	//  애니메이션, 영화, 드라마 각각 객체화를 시키고,
	//   checkVideo로 확인!
	
	void checkVideo(NetflixStudy1 netflix) {
		if(netflix instanceof AnimationStudy1) {
			AnimationStudy1 animation = (AnimationStudy1)netflix;
			animation.caption();
		}else if(netflix instanceof DramaStudy1) {
			DramaStudy1 drama = (DramaStudy1)netflix;
			drama.caption();
		}else if(netflix instanceof FilmStudy1) {
			FilmStudy1 film = (FilmStudy1)netflix;
			film.caption();
		}
			
	}
	public static void main(String[] args) {
	  AnimationStudy1 a = new AnimationStudy1();
	  DramaStudy1 d = new DramaStudy1();
	  FilmStudy1 f = new FilmStudy1();
	  a.caption();
	  d.caption();
	  f.caption();
	  
	}
}
