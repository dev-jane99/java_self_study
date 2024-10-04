package StaticTask;

public class Student {
//  학생 총점과 평균을 구해주는 클래스 만들기 
//	필드 : 학번, 이름, 국어점수, 영어점수, 수학점수, 토탈, 평균
	String studentNum;
	String name;
	int korean;
	int english;
	int mathmatical;
	int total;
	static double average;
	
	public Student() {;}
	public Student(String studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	public Student(int korean, int english, int mathmatical) {
		this.korean = korean;
		this.english = english;
		this.mathmatical = mathmatical;
	}
	
	public static void main(String[] args) {
//		객체화
//		생성자로 초기화 : 학번, 이름, 국어점수, 영어점수, 수학점수
		Student student1 = new Student("0001", "류재은");
//		Student student2 = new Student("0002", "류보명");
//		Student student3 = new Student("0003", "안유림");
//		Student student4 = new Student("0004", "박상욱");
		
		System.out.println("학번: " + student1.studentNum + " " + student1.name);
//		System.out.println(student2.studentNum + " " + student2.name);
//		System.out.println(student3.studentNum + " " + student3.name);
//		System.out.println(student4.studentNum + " " + student4.name);
//		
		student1.korean = 45;
		student1.english = 90;
		student1.mathmatical = 35;
		
//		student2.korean = 50;
//		student2.english = 70;
//		student2.mathmatical = 85;
//		
//		student3.korean = 60;
//		student3.english = 74;
//		student3.mathmatical = 77;
//		
//		student4.korean = 89;
//		student4.english = 64;
//		student4.mathmatical = 75;
		
//		총점과 평균을 출력 (평균은 소수점 두자리까지만 출력)
		
		student1.total += student1.korean + student1.english + student1.mathmatical;
//		student2.total += student2.korean + student2.english + student2.mathmatical;
//		student3.total += student3.korean + student3.english + student3.mathmatical;
//		student4.total += student4.korean + student4.english + student4.mathmatical;
		
		Student.average += (student1.total) / 3;
		System.out.println("총 점수: " + student1.total);
		System.out.printf("평균 점수: " + "%.2f", Student.average);
	}

}
