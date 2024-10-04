package castingTest;

public class StringTask2 {

	public static void main(String[] args) {





		char a ='a', j = 'j', k ='k';

		int gap = 32;

		//System.out.println((char)(a + 10));

//		 a,j,k 를 연산하여 A,J,K 출력하기

		//char를 int로 변환후 int를 다시 char로 변환

		//1. gap구하기

		System.out.println('A' - 'a');

		

	

		//System.out.println((char)(a-gap));

		

		a = (char)(a - gap);

		j = (char)(j - gap);

		k = (char)(k - gap);

		

		System.out.printf("%c, %c, %c", a, j, k);

	

		

	}

}
