package ClassTest;

public class StaticTest {
//		Static은 정적(멈춰있다), 이렇게 변수를 만들면 어딜가서든 값을 똑같이 공유해서 apply됨
//		Static은 컴파일러가 먼저 올려줌. 
//	초기화 되어서 다시 15가 나옴.
//	st = new StaticTest(); //Heap영역에 다시 하나 만들어, 그래서 
//	
//}

int data = 10;
static int data_s = 10;//static은 정적. 멈춰있다. 특징은, Static 을 이렇게 선언 하는 순간에 컴파일러를 이미 올려줌.

public StaticTest() {;}

void increase() {
   System.out.println(++data);
}

void increase_s() {
   System.out.println(++data_s);
}


public static void main(String[] args) {
   StaticTest st = new StaticTest(); //객체화 작업
   st.increase();//10
   st.increase();
   st.increase();
   st.increase();
   st.increase();//15
   st = new StaticTest(); //다시 new로 heap에 넣고 수행하기
   st.increase();
   st.increase();
   st.increase();
   st.increase();
   st.increase();
   
//   System.gc();
   
//   st.increase_s();//10
//   st.increase_s();
//   st.increase_s();
//   st.increase_s();
//   st.increase_s();
//   st = new StaticTest(); //아무리 올려도 static은 상관이 없음
//   st.increase_s();
//   st.increase_s();
//   st.increase_s();
//   st.increase_s();
//   st.increase_s();//20
   
   
}
}
