package consoleTest;

public class ConsoleTest {

	public static void main(String[] args) {
		
		//Ctrl + F11
		//print() : 마지막에 자동으로 줄바꿈이 되지않고, 아래의 문장과 이어서 출력한다.
		//println() : 마지막에 자동으로 줄바꿈이 된다.
		//printf() : format의 형식을 사용할 수 있다.
		
		//출력 메소드의 목적
		//전달받은 데이터 및 전달할 데이터 검사, 오류 발생지점 구체화 및 검사(QA)
		
		
	// 줄 바꿈 안되는 출력
		System.out.print("콘솔에 출력하기!");
		System.out.print("류재은");
		System.out.print("24");
	// 줄 바꿈 되는 출력
		System.out.println("류재은");
		System.out.println("");
	}
	
}
