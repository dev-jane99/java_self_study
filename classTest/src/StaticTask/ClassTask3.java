package StaticTask;

class Market {
	String productName;
	int productPrice;
	int productStock;
	
//	기본 생성자
	public Market(){;}
//	초기화 생성자 (productNmae, productPrice, productStock); 단축키 Alt + Shift + s + o
	public Market(String productName, int productPrice, int productStock) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
	}
	
//	판매 메소드 판매할 손님 받기
	void sell(Customer customer) {
//		return buy * productPrice;
		customer.money -= productPrice - productPrice * (customer.discount / 100.0);
		productStock--;
		
		
//		int[] get = null;
//		for(int i = 0; i <get.length; i++) {
//		    get[i] = i + 1;
//		    System.out.println(get[i]* productPrice);
		}
	};
	

class Customer {
	String name;
	String mobile;
	int money;
	int discount;
	
//	기본 생성자
	public Customer() {;}
//	초기화 생성자 (name, mobile, money, discount)
	public Customer(String name, String mobile, int money, int discount) {
		this.name = name;
		this.mobile = mobile;
		this.money = money;
		this.discount = discount;
	}
}

public class ClassTask3 {
	public static void main(String[] args) {
	
//	객체화:
//	마켓 구현 emart ("감자", 7000, 300);
		Market emart = new Market("고구마 ", 5000, 50);
		System.out.println(emart.productName + "개당 " + emart.productPrice 
				+ "원" + "\n재고 상태: 총 " + emart.productStock + "개");
//	구매자 rje ("류재은", "01099357301", 10000, 300)
		Customer jane = new Customer("류재은", "010-9935-7301", 20000, 50);
		System.out.println("고객 이름: " + jane.name + "\n휴대폰 번호: " + jane.mobile + "\n고객이 갖고있는 돈: " + jane.money + "원" + "\n할인률: " + (jane.discount*0.1 + "%"));
		
		
	
//	emart.sell(rje);
//	출력 마트의 재고
		emart.sell(jane);
		System.out.println("남은 재고:" + emart.productStock);
//	출력 구매자의 남은 돈
		System.out.println("고객의 남은돈: " + jane.money + "원");
		
	}
}