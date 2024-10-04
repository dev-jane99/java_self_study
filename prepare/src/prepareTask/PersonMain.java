package prepareTask;

public class PersonMain{
//  PersonMain 클래스
//  main 메소드를 구성하여 아래의 조건을 모두 실행하세요.
//  1.학생(student), 프로그래머(programmer)를 Person 클래스 타입으로 업캐스팅하여 객체화(instance)를 생성한다.
//  2. Person으로 업캐스팅한 객체를 다운캐스팅하여 각 객체가 가진 메소드를 모두 호출하세요.
	public static void main(String[] args) {
		Person student = new Student();
		Person programmer = new Programmer();
		
	
		if(student instanceof Student) {
			Student st = (Student)student;
			st.name();
			st.age();
			st.hobby();
			st.work();
			st.printNumber();
			
		}
		if(programmer instanceof Programmer) {
			Programmer pr = (Programmer)programmer;
			pr.name();
			pr.age();
			pr.work();
			pr.hobby();
			pr.notebook();
			pr.isNotebook();	
		}
	}
//	선생님 풀이
//    Person student = new Student("김세환", 10, "초등학생", "물어뜯기", 20240820);
//    Person programmer = new Programmer("김세환", 20, "개발자", "노트북으로 찍기", true);
//    
//    Student st = (Student)student;
//    Programmer pr = (Programmer)programmer;
//       
//    st.work();
//    st.hobby();
//    st.printNumber();
//    pr.work();
//    pr.hobby();
//    pr.isNotebook();
}
