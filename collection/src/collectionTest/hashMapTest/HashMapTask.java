package collectionTest.hashMapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTask {
	public static void main(String[] args) {
//	HashMap 만들기
		HashMap<String, Object> user = new HashMap<String, Object>();
		
		
		
//		"userId" : 1,
//		"id" : 3,
//      "title": "오늘은 수요일",
//      "body": "오늘 점심 뭐먹지?"
		user.put("userId", 1);
		user.put("id", 3);
		user.put("title", "오늘은 수요일");
		user.put("body", "오늘 점심 뭐먹지?");
    
		
//		재정의된것 확인
		System.out.println(user);
//		System.out.println(user.get("body"));
		
//     	순서를 붙이기
		
		System.out.println(user.entrySet()); //user.entrySet();
//		 Set<Entry<String, Object>> set = user.entrySet();
		Iterator<Entry<String, Object>> inter = user.entrySet().iterator();

//		수정하기
//		HashMap 은 중복되는 것을 허용하지 않는 특성때문에 , 나중에 같은 이름으로 다른 value 를 만들시에, 이미 있는 데이터는 수정이된다. 
//		예) user.put("userId", 20);
//		System.out.println(user.get("userId"); // output: 20
		
		

////		title이 있으면 출력하기
		while(inter.hasNext()) {
			Entry<String, Object> entry = inter.next();
			if(entry.getKey().equals("title")) {
				System.out.println(entry.getValue());
			}
		}
		
		
		
		
	}
}
