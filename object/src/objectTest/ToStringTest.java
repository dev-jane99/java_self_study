package objectTest;

public class ToStringTest { //부모는 Object
	public static void main(String[] args) {
		ToStringTest ts = new ToStringTest();
//		ts.toString();   얘는 주소값이다.
		System.out.println(ts.toString()); // 위에 애를 그대로 넣으면 주소값이 뜬다
		System.out.println(ts); //얘도 같은 주소값을 가짐
		
	}

}
