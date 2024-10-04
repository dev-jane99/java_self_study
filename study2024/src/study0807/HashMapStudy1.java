package study0807;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapStudy1 {
	public static void main(String[] args) {
		HashMap<String, Object> jane = new HashMap<String, Object>();

//	put 삽입
		jane.put("condition", "my tummy hurts af");
		jane.put("pain", 6);
		jane.put("mood", "fucking hate this");
		jane.put("isOk", false);
	
		System.out.println(jane);
		System.out.println(jane.get("mood"));
		
		
//		key 하고 value 세트를 묶어라 Entry를 이용해서 쌍으로 묶어준다.
		Iterator <Entry <String, Object>> iter = jane.entrySet().iterator();
		
		
		while(iter.hasNext()) {
			Entry <String, Object> entry = iter.next();
			if(entry.getKey().equals("condition")) {
				System.out.println(entry.getValue());
				
				Set <Entry <String, Object>> set = jane.entrySet();
				set.forEach((n) -> {System.out.println(n);});
				
			}
		}
	}
}
