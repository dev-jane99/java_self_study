package prepare;

public class Prepare1 {
	public static void main(String[] args) {
	      boolean result1 = false, result2 = false, result3 = false;
	      String str1 = new String("ABC");
	      String str2 = new String("ABCD");
	      String str3 = new String("ABCD");

	      result1 = str1 == str2;
	      result2 = str2 == str3;
	      result3 = str1 == str3;

	      System.out.printf("%b, %b, %b", result1, result2, result3);
	   }
	//답은 false,false,false
}
