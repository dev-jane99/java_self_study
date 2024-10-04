package collectionTest.hashMapTest;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		
//		put 삽입
		userMap.put("id", "jane1027");
		userMap.put("password", "1027");
		userMap.put("address", "서울특별시 서초구");
		userMap.put("age", 24);
		userMap.put("isRich", true);
		
//		collection 자료구조는 toString 재정의가 되어있다
		System.out.println(userMap);
		
//		검색 .get()
		userMap.get("address");
		System.out.println(userMap.get("address"));
//		
//		Key 가 필요할때
//		순서가 없는 map  구조에 순서를 붙여주기 위해 Iterator 이용
		Iterator<Entry<String, Object>> iter = userMap.entrySet().iterator();
		
//		iter.hasNext()
//		iter.next()
		while(iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
//			entry타입에서 key 값을 가져올때
//			entry.getKey()
//			entry 타입에서 value값을 가져올떄
//			entry.getValue()
			
			if(entry.getKey().equals("age")) {
				System.out.println(entry.getValue());
			}
//			
		}
		
	}
}
