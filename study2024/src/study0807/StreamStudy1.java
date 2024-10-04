package study0807;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class StreamStudy1 {
	public static void main(String[] args) {
		IntStream.range(0, 10).forEach(num -> {System.out.println(num + 1);});
		IntStream.range(0, 10).forEach(num -> {System.out.println(10 - num);});
		
//		Arrays.asList 초기값을 생성자로 넣어준다
		ArrayList<Integer> num1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
		System.out.println(num1);
		num1.forEach(System.out::println);
		
		
		
//		forEach (반복문) 은 순서가 있는 자료구조에서만 사용 가능, Stream 소속인데 Iterator 는 아니기 때문에 안된다..
//		forEach는 스트림의 제일 마지막에 사용된다. 
		
		
		
	}
}
