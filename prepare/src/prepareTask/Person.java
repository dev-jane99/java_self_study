package prepareTask;

public class Person extends PersonMain{
//  Person 클래스(부모클래스) - extends
//  각 필드의 이름과 타입을 정확히 입력하세요.
//  이름(name), 나이(age), 직업(job), 취미(hobby)
	
	String name;
	int age;
	String job;
	String hobby;
	
	public Person() {;}
	public Person(String name, int age, String job, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.hobby = hobby;
	
	}
	

		void name() {
			System.out.println(this.name);
		}

		void age() {
			System.out.println(this.age);
		}

//이름을 출력 메소드를 구현하세요.
//ex) "홍길동"
//1. 메소드의 이름은 printName이다.
//2. 리턴타입은 존재하지 않는다.
//3. 매개변수를 받지 않는다.

		void printName() {
			System.out.println(name);
		}

//하고 있는 일을 출력하는 메소드(work) : 리턴타입 x, 매개변수 x
//ex)"OO은 하는 일이 없습니다."
//*OO은 해당 필드의 직업의 이름을 넣으세요.

		void work() {
			System.out.println(job + "은 하는 일이 없습니다");
		}

//직업을 출력하는 메소드(hobby) : 리턴타입x, 매개변수 x
//"취미는 잠자기 입니다."를 출력하는 메소드

		void hobby() {
			System.out.println("취미는 잠자기 입니다");
		}


//  기본 생성자와 매개변수 2개가 있는 생성자,
//  총 2개를 생성자를 생성하세요.
//  이름(name)과 나이(age)를 초기화 생성자로 설정한다.
//  *참조 : this는 생략가능하지만 무조건 사용해야 한다.
	public static void main(String[] args) {
		Person p = new Person();
		Student s = new Student();
		Programmer pro = new Programmer();
		p.printName();
		p.work();
		p.hobby();
		s.name();
		s.age();
		s.work();
		s.hobby();
		s.printNumber();
		pro.work();
		pro.hobby();
		pro.notebook();
		pro.isNotebook();

	}
//		선생님 풀이
//	  String name;
//	   long age;
//	   String job;
//	   String hobby;
//	   
//	   public Person() {;}
//	   public Person(String name, long age, String job, String hobby) {
//	      this.name = name;
//	      this.age = age;
//	      this.job = job;
//	      this.hobby = hobby;
//	   }
//
//	   void printName() {
//	      System.out.println(name);
//	   }
//	   
//	   void work() {
//	      System.out.println(job + "하는 일은 없습니다.");
//	   }
//	   
//	   void hobby(){
//	      System.out.println("취미는 잠자기 입니다.");
//	   }

}
	

