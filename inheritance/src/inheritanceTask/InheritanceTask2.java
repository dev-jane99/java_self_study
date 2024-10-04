package inheritanceTask;

public class InheritanceTask2 {

	public static void main(String[] args) {
		PersonTask person = new PersonTask("류재은", 24, "서울특별시 서초구", "010-9935-7301");	
		System.out.println(person.name + person.age + person.add + person.phone);
	    person.work();
	    person.sleep();
	    person.eat();
	    
	    StudentTask student = new StudentTask("안유림", 24, "서울특별시 강남구", "010-8827-7301", "ahn00");
	  
	    student.work();
	    student.sleep();
	    student.eat();
	    
	    EmployeeTask employee = new EmployeeTask("박상욱", 24, "서울특별시 성동구", "010-4738-7301", 100_000);
	    
		employee.work();
		employee.sleep();
		employee.eat();
		
	}
}
