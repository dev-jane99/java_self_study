package objectTest;

public class Sports {
	private String type;
	private int total;
	
	public Sports() {;}

	public Sports(String type, int total) {
		this.type = type;
		this.total = total;
	}
	// getter, setter 단축기 사용
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
//	alt + shift + s
//	toString 재정의
	@Override
	public String toString() {
		return "Sports [type=" + type + ", total=" + total + "]";
	}
	
	
	public static void main(String[] args) {
		Sports sports1 = new Sports("축구", 12);
		Sports sports2 = new Sports("농구", 5);
		Sports sports3 = new Sports("테니스", 2);
		
		System.out.println(sports1.getTotal());
		System.out.println(sports1.getType());
		System.out.println(sports1.toString());
		
		System.out.println(sports2.getTotal());
		System.out.println(sports2.getType());
		
		System.out.println(sports3.getTotal());
		System.out.println(sports3.getType());
		
		
	}

	
	
}
