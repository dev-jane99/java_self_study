package objectTest;

import java.util.Objects;

public class Student {
	
//	필드 만들기
	private int id;
	private String name;
	private int age;

//	해당 유저를 만들었을 때 해야하는 것들을 모두 하기.

	public Student() {;}

	public Student(int id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
//	equals 재생성
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id;
	}

//	또는 직접 이렇게 써도 되지만 단축키가 존재함. alt shift s -> hashcode & equals
//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj) {
//			return true;
//		}
//		if(obj instanceof Student) {
//			Student anotherStudent = (Student)obj;
//			if(this.id == anotherStudent.getId()) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student = new Student(991027, "류재은", 24);
//		System.out.println(student.toString());
		
//		책 대여 프로그램
		if(student.equals(new Student(991027, "류재은", 24))){
			System.out.println("대여 완료");
		}else {
			System.out.println("도난 신고");
		}
		
	}


}
