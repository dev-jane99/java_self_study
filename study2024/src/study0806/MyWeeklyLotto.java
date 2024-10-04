package study0806;

public class MyWeeklyLotto {

//		주석으로 설명을 다는 방법이다.
	/**
	 * 
	 * @param : void
	 * @return : String[6] 
	 * ex) getLuckyNum() 
	 * for(t-String str : Strings){
	 *     System.out(str); }
	 * 
	 * @throws ArrayIndexOfBounceException
	 * @see {@link: Math};
	 * 
	 * 
	 */
	
	
	String[] getLuckyNum() { // 메소드 만들어줌
		
		String[] luckyNumArray = new String[6]; // 6개의 인덱스 빈칸
		for (int i = 0; i < 6; i++) {
			luckyNumArray[i] = String.valueOf((int) Math.floor(Math.random() * 45 + 1));
			for (int j = 0; j < i; j++) { // 중복값 걸러주는 단계
				if (luckyNumArray[j].equals(luckyNumArray[i])) {
					i--;
					break;
				}
			}
		}
		return luckyNumArray;
	}

	public static void main(String[] args) {

		MyWeeklyLotto lotto = new MyWeeklyLotto();
		String[] lucky = null;

		String message = "★numbers★";
		lucky = lotto.getLuckyNum(); // 통채로가 리턴값이라 가져옴
		System.out.println(message);

		for (String luckyNum : lucky) {
			System.out.println(luckyNum + " ");
		}

	}
}
