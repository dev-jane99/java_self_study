package interfaceTest3;

import java.util.concurrent.BrokenBarrierException;

public class MovieLab {
//	모든 영화는 Movie 의 자식이다
//	checkKinds 구성
//	markerInterdace 를 이용해서 각 장르마다 분류한다.
//	마커인터페이스는 이름뒤에 Marker 를 붙여준다.
//	부모로 한번에 매개변수로 받는다 (업캐스팅)
//	각자 가지고 있는 메서드를 (다운캐스팅) 출력
	
	 void checkKinds(Movie[] movie) {
		for(int i = 0; i < movie.length; i++) {
			if(movie[i] instanceof ActionMarker) {
				if(movie[i] instanceof SpiderMan) {
					SpiderMan sp = (SpiderMan)movie[i];
					sp.fly();
				}else {
					CityOfCrime coc = (CityOfCrime)movie[i];
					coc.cry();
				}
				
			}else if(movie[i] instanceof KidsMarker) {
				TinyPing tp = (TinyPing)movie[i];
				tp.broke();
				
			}else if(movie[i] instanceof HorrorMarker) {
				It it = (It)movie[i];
				it.shake();
				
			}else if(movie[i] instanceof FantasyMarker) {
				Doom doom = (Doom)movie[i];
				doom.inFantasy();
				
			}else if(movie[i] instanceof RomanceMarker) {
				BeforeSunrise bs = (BeforeSunrise)movie[i];
				bs.tearsShower();

			}else {
				System.out.println("다른 영화");
			}
		}
		
	
	}
	
		public static void main(String[] args) {
		MovieLab Mlab = new MovieLab();
		Mlab.checkKinds(new Movie[] {new It(), new TinyPing(), new Doom()});
//		ml.checkKinds(new Movie[] {new SpiderMan(), new CityOfCrime()});

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
}
