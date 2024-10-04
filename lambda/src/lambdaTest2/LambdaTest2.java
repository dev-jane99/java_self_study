//package lambdaTest2;
//
//public class LambdaTest2 {
//	public static void main(String[] args) {
//
////	람다
////  1) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다구현 PrintString, strCount()
//		PrintString ps = (String str, char c) -> {
//			int count = 0;
//			for (int i = 0; i < str.length(); i++)
//				;
//			if (str.charAt(i) == c) {
//				count++;
//			}
//			;
//		};
//		return count;
//	};
//
////  2) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove removeStr()
////	Remove remove = (String str, char c) -> {
////		String result = "";
////		str.replaceAll(String.valueOf(c), "");
////		return result;
////	};
////  System.out.println("abcdefg".replaceAll(String.valueOf('a'), ""));
//	Remove remove = (String str, char c) -> {
//		String result = str.replaceAll(String.valueOf(c), "");
//		return result;
//	};
//
////  3) 문자열에서 중복된 값 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
////  ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"
//	System.out.println("abcdefg".contains("b"));
//
//	Dedupe de = (String str) -> {
//		String result = "";
//		for(int i =0; i <str.length(); i++) {
//			if(!result.contains(String.valueOf(str.charAt(i))));
//			result += str.charAt(i);
//		};
//	}return result;
//};System.out.println(de.getDedupe("가나다라마바사가나다라마바사가나다"));}}
