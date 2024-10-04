package anonymous;

public interface AnonymousTest {
	public static void main(String[] args) {
		Study study = new Study() {  //study는 익명클래스의 주소값 , upcasting이다,  new Study()는 익명클래스를 접근할 수 있는 주소값
			
			@Override
			public void setTopic() {  //딱 한번만 사용 가능. 왜냐하면, 위에 new Study()  ???{ 이렇게 중괄호 앞에 이름이 없어서 다시 불러와서 쓸수 없게 된다.(익명 내부 클래스 = 일회성)
				// TODO Auto-generated method stub
				
			}
		};
		study.setTopic();
		}
	}

