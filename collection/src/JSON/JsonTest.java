package JSON;

import java.util.HashMap;

import org.json.JSONObject;



public class JsonTest {
	public static void main(String[] args) {
		
//		단일객체를 감싸는방법
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "jane1027");
		userMap.put("password", "1027");
		userMap.put("name", "류재은");
		userMap.put("age", 24);
		
//		JSON 은 문자열들의 집합이다. 감싸기! 생성자로 넘기기!
		JSONObject json = new JSONObject(userMap);
		System.out.println(json.toString());
		
	}
}
