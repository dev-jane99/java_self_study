//package ClassTask;
//
//
//class SuperCar{
////	브랜드
//	String brand;
////	색상
//	String colour;
////	가격
//	int price;
////	엔진
//	boolean engine;
////	비밀번호
//	String password;
////	비밍번호 오류 횟수
//	int errorCount;
//	
////	초기화 블록
//	{
//		this.password = "0000";
//	}
////	스테틱 블록 (무조건 한번 실행될 문장)
//	static {
//		System.out.println("출고 축하드립니다~!");
//	}
//	
////	초기화
//	public SuperCar() {;}
////	생성자
//	public SuperCar(String brand, String colour, int price) {
//	    super();
//	    this.brand = brand;
//	    this.colour = colour;
//	    this.price = price;
//}
//
//	public SuperCar(String brand, String colour, int price, int passWord) {
//		super();
//		this.brand = brand;
//		this.colour = colour;
//		this.price = price;
//		this.password = password;
//	};
//
////	1) 시동 켜기
////	메소드
//	SuperCar start (SuperCar superCar) {
//		SuperCar superCar = new SuperCar();
//		
//		if("1234".equals(password)) {
//			engine = true;
//		}
//		for(int i = 0, i < 2; i++) {
//			System.out.println("1234".equals(password)? "시동켜짐" : "비밀번호 틀림" );
//		}
//		System.out.println("경찰 출동");
//			return superCar;
//		}
//	
//	}
////	"ABC" == "ABC"  (X)하면 안됨
////	"ABC".equals("ABC");  문자열값은 equals로 비교한다.
////	사용자가 입력한 비밀번호가 맞을 때에만 
////	연속 3번 틀리면 경찰 출동
//	
////	2) 시동끄기
//    boolean end (boolean engine) {
//    	return engine != false;
//    }
////	3) 비밀번호 검사
//
//
//
//
//public class ClassTask1 {
//	public static void main(String[] args) {
//		SuperCar rb = new SuperCar("람보르기니", "빨간색", 3000);
//		SuperCar f = new SuperCar("페라리", "초록색", 5000);
//		f.start(rb);
//	
//		
//	}
//}
//}