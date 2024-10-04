package streamTask2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class User {
	
//  5) 각각의 User가 들어가 있는 ArrayList<User>가 존재한다.
//  모든 User의 취미를 검토하여, 개발을 좋아하는 사람만 출력하기.
	//  이름, 취미, 소개
	//  홍길동, 축구_농구_야구, 나는 축구왕!
	//  이순신, 개발_당구_축구, 나는 개발자 좋아!
	//  장보고, 피아노, 피아노만 한 우물!
	//  김철수, 스포츠댄스_개발, 취미로 춤을 춘다~
	//  김영희, 골프_야구, 운동 선수는 나의 꿈
	//  흰둥이, 개발_축구_농구, 개발도 운동도 다 잘해요!
		private String name;
		private String hobby;
		private String intro;
		
		public User() {;}
		

		public User(String name, String hobby, String intro) {
			super();
			this.name = name;
			this.hobby = hobby;
			this.intro = intro;
		}



		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getHobby() {
			return hobby;
		}

		public void setHobby(String hobby) {
			this.hobby = hobby;
		}

		public String getIntro() {
			return intro;
		}

		public void setIntro(String intro) {
			this.intro = intro;
		}
		
		
		
}
	