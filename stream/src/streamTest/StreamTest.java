package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTest {
	
//	public String addRoot(String url) {
//		return "/app" + url;
//	}
	
	public static void main(String[] args) {
//		Stream API : 한줄로 함축하여 간략하게 쓰는 문법
//		시작점과 끝점을
		
//		IntStream.range(0, 10); //0 to 9 (10 times)
//		IntStream.rangeClosed(0, 10); //0 to 10 (11 times)
//		
//		반복 forEach()
//		IntStream.range(0, 10).forEach(num -> {System.out.println(num);}); //0 부터 9 까지 출력됨
//		IntStream.range(0, 5).forEach(num -> {System.out.println(num + 10);}); //리턴이 없으면 중괄호 생략가능
////		ArrayList 선언
//		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
//		System.out.println(numbers);
		
//		일반 for문
//		for (int i = 0; i < numbers.size(); i++) {
//			System.out.println(numbers.get(i));
//		}
		
//		빠른 for문
//		for( int number : numbers) {
//			System.out.println(number);
//		}
		
//		Stream forEach
//		numbers.forEach((num) -> {System.out.println(num);}); 
		
//		받자마자 바로쓸때는 "참조형"을 쓴다 (소속::메소드)
//		numbers.forEach(System.out::println);
//		----------------------------------------------------------------------------------------
//		(순서가 있는 친구)인덱스가 있는 자료구조 (Set은 못씀. 순서가 없어서)
//		ArrayList<Integer> datas2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
//		datas2.forEach(System.out::println); //참조형
		
//		5를 10번 출력
//		ArrayList<Integer> data3 = new ArrayList<Integer>();
//		IntStream.range(0, 10).forEach((num) -> {data3.add(5);}); //반복
//		System.out.println(data3);
//		
//		
////		1. 10~1 까지 ArrayList 에 담기, 단 Arrays.asList 사용x 참조형x 연산후 add
//		ArrayList<Integer> jane = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach((num) -> {jane.add(11 - num);}); //forEach는 마지막이다
//		System.out.println(jane);
//		
////		2. ArrayList에 있는 값 출력하기
////		jane.forEach((n) -> {System.out.println(n);});
//		jane.forEach(System.out::println);
//		
////		3. 인덱스 0 부터 4 까지 삭제
//		
//		IntStream.range(0, 5).forEach((num) -> {jane.remove(0);});
//		jane.forEach(System.out::println);
//		System.out.println(jane);
		
//		---------------------------------------------------------------------------------
		
//		String datas = "ABCDEFG";
////		문자열 Stream : chars()
//		datas.chars().forEach(c -> {System.out.println((char)c);});
//		
////		map(): 기존 값을 다른 값으로 변경, 맵은 반드시 return 해야한다.
////		forEach는 기능만 사용. 마지막에만 사용 
//		ArrayList<Integer> datas2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
//		datas2.stream().map(n -> n + 10).forEach(n -> {System.out.println(n);});
////		                         중괄호가 없으므로 통쨰로 리턴
//		IntStream.range(0, 5).map(n -> n + 10).map(n -> n - 5).forEach(System.out::println);
		
//		lambda
//		() -> {};
//		() -> {return;}
//		매개변수가 1개면 () 와 자료형 생략, 리턴값이 있으면 {} 생략
//		a -> a;
//		String str1 ="ABCDE";
//		str1.chars().map(c->c+5).forEach(c->{System.out.println((char)c);});
		
//		wrapper class
//		User user1 = new User(Long.valueOf(1), "류재은", 24, "학생");
//		User user2 = new User(Long.valueOf(2),"안유림", 34, "변호사");
//		User user3 = new User(Long.valueOf(3), "박상욱", 67, "회장");
//		User user4 = new User(Long.valueOf(4), "류보명", 56, "대표");
//		User user5 = new User(Long.valueOf(5), "김서연", 46, "이사");
//		User user = new User();
//		ArrayList<User> users = new ArrayList<User>();
//		users.add(user1);
//		users.add(user2);
//		users.add(user3);
//		users.add(user4);
//		users.add(user5);
		
//		직업만 추출 (map()), 직업 앞에 "직업: " (map())붙여서 출력(forEach())
//		Stream
//		users.stream().map(u-> u.getJob()).map(job -> "직업 : " + job).forEach(System.out::println);
////		참조형
//		users.stream().map(User::getJob).map(job -> "직업 : " + job).forEach(System.out::println);
		
//		직업만 추출 Stream 문법 쓸거야 ~
//		users.stream().map(u-> u.getJob()).forEach(System.out::println);
//		실습
//		아래의 4개의 URL을 ArrayList에 담은 후 모든 경로 앞에 /app을 붙인다.
//		/news, /game, /brand, /rank
//		StreamTest streamTest = new StreamTest();
//		ArrayList<String> urls = new ArrayList<String>(Arrays.asList("/news", "/game", "/brand", "/rank"));
//		urls.stream().map(url -> "/app" + url).forEach(System.out::println);\
//		클래스가 다른 메소드의 참조형
//		urls.stream().map(streamTest::addRoot).forEach(System.out::println);
		
//		----------------------------------------------------------------------------------------------------------
		
//		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(99, 10, 27, 289));
//		오름차순 정렬 : Sorted() 작은 숫자부터 String 으로 가나다 순으로도 뽑을 수 있다.
//		numbers.stream().sorted().forEach((n) ->{System.out.println(n);}); 
		
//		내림차순 정렬 : sorted(Collections.reverseOrder()) 큰 숫자부터 순서대로 뽑을 수 있다.
//		numbers.stream().sorted(Collections.reverseOrder()).forEach((n) ->{System.out.println(n);}); 
		
//		결과를 다른 타입으로 바꾸고 싶을 떄 : collect();
//		ArrayList<Integer> numbers3 = new ArrayList<Integer>(Arrays.asList(99, 10, 27, 289));
//		List(메모리가 할당되는 한 계속 값이 증가됨) 가 ArrayList(동적으로 추가해서 값을 추가) 에게 상속됨.... 그놈이 그놈이다
//		List<Integer> list = numbers3.stream().sorted().collect(Collectors.toList());
		
//		문자열로 바꾸기
//		ArrayList<Integer> numbers3 = new ArrayList<Integer>(Arrays.asList(99, 10, 27, 289));
////		문자열로 만들어서 뽑기
//		String str = numbers3.stream().sorted().map(n -> n + 10).map(String::valueOf).collect(Collectors.joining(","));
//		System.out.println(str);
		
//		문자열을 다시 자르기
//		ArrayList<String> numbers4 = new ArrayList<String>(Arrays.asList(str.split(",")));
//		System.out.println(numbers4);
		
//		filter: return 이 필요하다. 해당 조건의 true 값만 모아서 return한다. 
//		1부터 100 까지 홀수만 출력
//		IntStream.range(1, 100).filter(num -> num % 2 != 0).forEach(System.out::println);
		
//		1 부터 100 까지 ArrayList 에 짝수만 담고 출력
	
		ArrayList <Integer> even = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 100).filter(num -> num % 2 == 0).forEach(even::add);
		even.forEach(System.out::println);
//		System.out.println(even.toString()); //[  ] 안에 넣어서 출력해줌
		
	}

}
