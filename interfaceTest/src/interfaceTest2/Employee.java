package interfaceTest2;

public abstract class Employee extends SalesAdapter{
//	회사원 employee
//	필드 (name, age, history, phone)

	public String name;
	public int age;
	public int history;
	public String phone;
	String playHobby;
	
	public Employee() {;}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Employee(String name, int age, int history, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.history = history;
		this.phone = phone;
	}
	public Employee(String playHobby) {
		this.playHobby = playHobby;
	}
	void playHobby() {
		System.out.println("취미는 노래");
	}
	
//	comeInMoney 없음,
//	sell , social 만 구현하는 메소드 연습
	@Override
	public void sell() {
		System.err.println("꿈을 팔고 있음");
	}
	@Override
	public void social() {
		System.out.println(this.history + " 년 정도 일했습니다.");
	}
	private void eat() {
		System.out.println("식당을 간다");
	}
	private void sleep() {
		System.out.println("침대로 간다");
	}
	private void poop() {
		System.out.println("화장실로 간다");
	}
	
	
//	선생님 풀이
//  회사원 Employee
//  필드 name, age, history, phone
//  private String name;
//  private int age;
//  private int history;
//  private String phone;
//
//  public Employee() {;}
//
//  public Employee(String name, int age, int history, String phone) {
//     super(name, age);
//     this.history = history;
//     this.phone = phone;
//  }
//
//  public String getName() {
//     return name;
//  }
//
//  public void setName(String name) {
//     this.name = name;
//  }
//
//  public int getAge() {
//     return age;
//  }
//
//  public void setAge(int age) {
//     this.age = age;
//  }
//
//  public int getHistory() {
//     return history;
//  }
//
//  public void setHistory(int history) {
//     this.history = history;
//  }
//
//  public String getPhone() {
//     return phone;
//  }
//
//  public void setPhone(String phone) {
//     this.phone = phone;
//  }
//  
////  comeInMoney 없음
//  
////  sell 구현
////  social 구현
//  @Override
//  public void sell() {
//     System.out.println("꿈을 팔고 있습니다.");
//  }
//  @Override
//  public void social() {
//     System.out.println(this.history + "년 정도 일했습니다.");
//  }
//  
//  @Override
//  public void mitting() {
//  }

}
