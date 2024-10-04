package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
//		thread 는 일꾼이다. 
//		단일 thread : 처리 경로가 하나 (비효율적이다) 5분짜리 1시간 짜리 1분짜리... 1분이 주어져도 
//					 5분짜리가 맨 먼저 진행되기때문에 하나도 일을 마무리 하지 못한다.(직렬구조, 설계하기 쉬움, 안정성과 보안성은 높음)
//		멀티 thread : (병렬구조, 효율이 좋다, 안전성에 취약하다, 비용적인 부분이 많이 감소된다) 
//					 세로로 세워놨지만, 동시에 진행되는 작업은 아니다. 
//					 무조건 단일 스레드에서 시작하고 멀티로 만들어줘야 한다
//		JAVA 는 멀티스레드 이자 컴파일 언어이다.
//		소스코드를 따로 따로 한줄씩 번역해주는 애는 인터프리터라고 하는데, 컴파일은 파일 전체를 한번에 번역 해 준다.
//		Thread thread1 = new Thread1("?");
//		Thread thread2 = new Thread1("!");
		
//		thread1.run();
//		thread2.run();
//		또는
//		thread1.start();
//		thread2.start();
		
		Thread2 target1 = new Thread2();
		Thread2 target2 = new Thread2();
		
		Thread thread1 = new Thread(target1 , "★");
		Thread thread2 = new Thread(target2 , "♥");
//		우선 순서가 main 이 제일 높지만,
//		아무리 올려도 순서가 바뀔 수 있다.
//		그래서 강제로 "무조건" 단일로 처리하듯이 처리할 수 있어야 한다
//		thread1.setPriority(1);
		
//		우선순위를 올리기 위한 목적으로 join()을 사용한다.
//		만약 join() 보다 먼저 start() 를 작성하면 join()은 무시되며,
//		join()은 단일 쓰레드처럼 변해서 먼저 작업된다.
//		처음으로 적힌 친구가 끝나야만 다음것이 시작될 수 있게 하려고.
		
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 쓰레드 작업");

	}
}
