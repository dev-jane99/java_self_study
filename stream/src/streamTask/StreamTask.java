package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {

//  1) 1~10까지 ArrayList에 담고 출력
		ArrayList<Integer> printToTen = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).forEach(printToTen::add);
		printToTen.forEach(System.out::println);

		
//  2) ABCDEF를 각각 문자별로 출력
//		ArrayList<Character> charWord = new ArrayList<Character>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F'));
//		System.out.println(charWord);
		
//		선생님 풀이
		ArrayList<Character> alp = new ArrayList<Character>();
		IntStream.range(0, 6).forEach((n) -> {alp.add((char)(n + 65));});
		alp.forEach(System.out::println);
		

//  3) 1~100까지 중 홀수만 ArrayList에 담고 출력
		ArrayList<Integer> odd = new ArrayList<Integer>();
		IntStream.rangeClosed(0, 100).filter(n -> n % 2 != 0).forEach(odd::add);
		odd.forEach(System.out::println);
//		얘로도 가능
//		System.out.println(odd.toString());
		

//  4) A~F까지 중 D를 제외하고 출력하기
		ArrayList<Character> charExceptD = new ArrayList<Character>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F'));
		charExceptD.remove(Character.valueOf('D'));
		charExceptD.forEach(System.out::println);
		
//		선생님 풀이
		ArrayList<Character> chars = new ArrayList<Character>();
		IntStream.range('A', 'F').map(c -> c > 67 ? c + 1 : c).forEach(c -> chars.add((char)c));
		System.out.println(chars);
		

//  5) 5개의 문자열을 모두 소문자로 출력하기
//  Black, WHITE, reD, yeLLow, PINk   String.toLowerCase(), toUppercase()
//		HashSet<String> upLow = new HashSet<String>();
//		upLow.add("Black");
//		upLow.add("WHITE");
//		upLow.add("reD");
//		upLow.add("yeLLow");
//		upLow.add("PINk");
//		
//		Iterator<String> iter = upLow.iterator();
////		iter.toString().toLowerCase().toUpperCase();
//
//		if(iter.toString().toLowerCase() == null) {
//			System.out.println(String.valueOf(upLow));
//		}else {
//			System.out.println(String.valueOf(upLow));
//		}
		
//		선생님 풀이
		String[] strArr = { "Black", "WHITE", "reD", "yeLLow", "PINk" };
		ArrayList<String> datas = new ArrayList<String>(Arrays.asList(strArr));
		datas.stream().map(String::toLowerCase).forEach(System.out::println);
		
		
		
		
		
		

	}
}
