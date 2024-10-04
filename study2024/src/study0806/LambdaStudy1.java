package study0806;

public class LambdaStudy1 {
	public static void main(String[] args) {
		Calculator add = (a, b) -> a + b;
		System.out.println("덧셈 결과: " + add.calculator(1, 2));
	}
}
