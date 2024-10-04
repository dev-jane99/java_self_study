package StaticTask;

import ClassTest.ClassTest;

public class Company {
//	필드
//	money 회사의 총 수입
	static long money;
//	name 이름
	String name;
//	age 나이
	int age;
//	income 수입
	long income;
	
//	기본생성자 생성
	public Company() {;}
	public Company (String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Company (long income) {
	    this.income = income;
    }
//	long sum (long money) {
//		
//	}
	
//	초기화 생성자 생성: 이름, 나이
//	1번 사원: "류재은", 24 
//	2번 사원: "류보명", 23
//	3번 사원: "안유림", 24
//	4번 사원: "박상욱", 24

	public static void main(String[] args) {
//	필드 구성 후 객체화
//	객체화 시 생성자로 초기화
		Company employee1 = new Company("류재은", 24);
		Company employee2 = new Company("류보명", 23);
		Company employee3 = new Company("안유림", 24);
		Company employee4 = new Company("박상욱", 24);
		
		System.out.println(employee1.name +" "+ employee1.age);
		System.out.println(employee2.name +" "+ employee2.age);
		System.out.println(employee3.name +" "+ employee3.age);
		System.out.println(employee4.name +" "+ employee4.age);
		
//	회사원 employee1 총 수입 10000
//	회사원 employee2 총 수입 1000
//	회사원 employee3 총 수입 2000
//	회사원 employee4 총 수입 -10000
		employee1.income += 10_000;
		employee2.income += 1_000;
		employee3.income += 2_000;
		employee4.income -= 10_000;
		
//	회사의 총 수입 출력
		Company.money += employee1.income;
		Company.money += employee2.income;
		Company.money += employee3.income;
		Company.money += employee4.income;
		
		System.out.println(Company.money);
	}
//	완
}

