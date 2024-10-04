package lambdaTest;

@FunctionalInterface
public interface LambdaInter {
//	짝수인지 알려주는 메소드, 짝수면 true, 아니면 false
	boolean even(int num); //추상 메소드. 상수만 가질 수 있다. 상수는 앞에 final이 붙는다
	
}
