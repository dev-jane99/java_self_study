package ClassTask;

import java.util.Scanner;

class SuperCar{
//	브랜드
	String brand;
//	색상
	String colour;
//	가격
	long price;
//	엔진
	boolean engine;
//	비밀번호
	String password;
//	비밍번호 오류 횟수
	int errorCount;
	
//	초기화 블록
	{
		this.password = "0000";
	}
//	스테틱 블록 (무조건 한번 실행될 문장)
	static {
		System.out.println("출고 축하드립니다~!");
	}
	
//	초기화
	public SuperCar() {;}
//	생성자
	public SuperCar(String brand, String colour, long price) {
	    super();
	    this.brand = brand;
	    this.colour = colour;
	    this.price = price;
}

	public SuperCar(String brand, String colour, long price, String password) {
		super();
		this.brand = brand;
		this.colour = colour;
		this.price = price;
		this.password = password;
	};

//  1)시동 켜기
  void engineStart() {
     engine = true;
  }
//  "ABC".equals("ABC");
//  사용자가 입력한 비밀번호가 맞을 때에만 시동켜기
//  연속 3회이상 실패하면 경찰 출동
  
//  2)시동 끄기
  void engineStop() {
     engine = false;
  }
//  3) 비밀번호 검사
  public boolean checkPassword(String password) {
     return this.password.equals(password);
  };
}

public class ClassTask1Answer {
  public static void main(String[] args) {
	  
//  프로그램 구현
     SuperCar ferrari = new SuperCar("Ferrari", "red", 5_000, "7777");
     
     String message = "1.시동 켜기\n2.시동 끄기";
     Scanner sc = new Scanner(System.in);
     String password = null;
     
     while(true) {
        System.out.println(message);
        int choice = sc.nextInt();

        if(choice == 1) {
           if(!ferrari.engine) {
              System.out.println("비밀번호를 :");
              password = sc.next();
              if(ferrari.checkPassword(password)) {
                 ferrari.errorCount = 0;
                 ferrari.engineStart();
                 System.out.println(ferrari.brand + "시동 켜짐");
              }else{
                 ferrari.errorCount++;
                 if(ferrari.errorCount > 2) {
                    System.out.println("경찰 출동");
                    break;
                 }
              }
           }else {
              System.out.println("이미 시동이 켜져 있습니다.");
           }
           
        }else if(choice == 2) {
           if(ferrari.engine) {
              ferrari.engineStop();
              System.out.println(ferrari.brand + "시동 꺼짐");
           }else {
              System.out.println(ferrari.brand + "시동 이미 꺼져있음!");
           }
        }else {
           System.out.println("다시 눌러주세요");
        }
     
     }
     
  }
}

