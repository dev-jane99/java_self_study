package study0806;

public class LottoStudy {
	int[] luckyNumber() {
		int[] numArray = new int[6];
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = (int) (Math.random() * 45 + 1);
		}
		return numArray;
	}

}
