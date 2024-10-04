package anonymousTest;

public class Building{
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		gangnam.register(new Form() {  //익명, 구현이 안된 상태라 일회성을 띈다.
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "카페라떼", "에이드", "디카페인"};
			}
			
			@Override
			public void sell(String menu) {
				String[] menus = getMenus();
				for(int i = 0; i < menus.length; i++) {
					if(menus[i].equals(menu)) {
						System.out.println(menus[i] + " 판매완료");
						break;
					}
				}
			
			}
		});
		
//		실습해보기
//		for문 날리기 잠실점 오픈
//		무료나눔 행사중
		
		String freeOffer;
		
		Starbucks jamshil = new Starbucks();
		jamshil.register(new Form() {
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "카페라떼", "에이드", "디카페인"};
			}
			
			@Override
//			public void sell(String free) {
//				String[] freeOffer = getMenus();
//				for(int i = 0; i < free.length(); i++) {
//					if(freeOffer[i].equals(free)) {
//						System.out.println(freeOffer[i] + " 무료나눔 행사중");
//						break;
//					}else {
//						System.out.println(freeOffer[i] + "판매중");
//						break;
			public void sell(String menu) {
				String[] menus = getMenus();
				for(int i = 0; i < menus.length; i++) {
					if(menus[i].equals(menu)) {
						System.out.println(menus[i] + " 무료나눔 행사중");
						break;
					}else {
						System.out.println(menus[i] + "판매중");
						break;
					}
				}
			}

			
					
		});
	}
}
	

