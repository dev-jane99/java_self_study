package access1;

public class Access1 {
//	int data1;
//	public int data2;
//	protected int data3;
//	private int data4;
//	단축키 Alt + Shift + A 해서 드래그 해서 커서 자리 맞춰주고 한번에 private 붙여주기 가능!
	private String name;
	private int age;
	private String address;
	private String phone;
	
	
	
//	1. getter, setter 만들기
//	단축키 : Alt + Shift + s + r -> Alt + a + r 순으로 치면 아래처럼 만들어진다.
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
//	public Access1(int data1, int data2, int data3, int data4) {
//		super();
//		this.data1 = data1;
//		this.data2 = data2;
//		this.data3 = data3;
//		this.data4 = data4;
//	}
//	또는,
//	public int getData4() { //게터 getter 라고 부른다.
//		return data4;
//	}
//	public void setData4(int data4) { //세터 setter 라고 부른다.
//		this.data4 = data4;
//	}
	
}
