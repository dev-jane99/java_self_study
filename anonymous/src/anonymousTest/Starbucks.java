package anonymousTest;

public class Starbucks {
	public void register(Form form) {
		String[] menu = form.getMenus();
			for(int i = 0; i < menu.length; i++) {
			System.out.println(i + 1 + "." + menu[i]);
			}
		
//		스벅이 판매 지점을 검토. adapter 사용 왜냐하면, sell 안쓰니까.
//		무료나눔 행사 중이라면, "무료나눔 행사 승인" 출력
//		무료나눔 행사 중이 아니라면, "판매" 출력
			if(form instanceof Form) {
				form.sell("아메리카노");
			}else if(form instanceof FormAdapter) {
				System.out.println("무료나눔 행사 승인");
			}else {
				System.out.println("다른 지점");
			}
//		boolean[] freeOffer = form.free();
//		for(int i = 0; i < freeOffer.length; i++) {
//			System.out.println(i + 1 + "." + freeOffer[i]);
//			if(freeOffer[i]) {
//				System.out.println("무료나눔 행사 승인");
//			}else {
//				System.out.println("판매");
//			}
//		}

//		form.sell("아메리카노");
	}

}
