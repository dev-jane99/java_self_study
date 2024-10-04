package study0805;

public class InstanceInnerClassStudy1 {
//	클래스 안에 선언된 클래스, 즉 필드를 선언하는 위치에 있는 클래스로,
//	중첩 클래스 또는 인스턴스 클래스라고 부르기도 한다.
	class C {
		int num = 0;

		public void plus() {
			num++;
		}
	}

	public static void main(String[] args) {
		InstanceInnerClassStudy1 inner = new InstanceInnerClassStudy1();
		InstanceInnerClassStudy1.C c = inner.new C();
		c.plus();
		System.out.println(c.num);

	}
}
