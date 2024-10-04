package collectionTest.hashSetTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> mbti = new HashSet<String>();
		//Set 은 검색에 대한 용도
		mbti.add("ENFP");
		mbti.add("ESFP");
		mbti.add("ESTP");
		mbti.add("ESTJ");
		mbti.add("ENFP");
		System.out.println(mbti);
		
//		데이터를 가져오고 싶을 때 순서를 부여해야한다. 
//		iterator 순서가 없을때 순서를 부여할 수 있다.
		Iterator<String> iter = mbti.iterator();
		
//		이건 하나밖에 못들고옴
//		if(iter.hasNext()) {  //있어?
//			System.out.println(iter.next()); //가져와.
//		}
		
//		얘는 끝날때까지 들고옴
//		while(iter.hasNext()) { //횟수를 모를땐 while문
//			System.out.println(iter.next());
//		}
		
//		중복된 데이터를 삭제하고싶을때 사용
//		생성자 뒤에 초기값을 넣어주고 싶으면 값인 Arrays.asList(); 를.
		ArrayList<Integer> dataArray = new ArrayList<Integer>(Arrays.asList(1, 2, 5, 3, 2, 6, 3, 8));
//		값을 넣을때 생산자로 넣으면 자료구조가 바뀐다. 먼저 HashSet 덕분에 중복된값이 없어지고, Array로 나온다.
		System.out.println(dataArray);
		dataArray= new ArrayList<Integer> (new HashSet<Integer>(dataArray));
//		new ArrayList<Integer>();
//		dataArray = new ArrayList<Integer>(new HashSet<Integer>(dataArray));
		System.out.println(dataArray);
	}	
}
