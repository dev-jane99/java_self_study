package JSON;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonTest2 {
	public static void main(String[] args) {
		
		User user1 = new User("1", "류재은", "1234", "010-9935-7301");
		User user2 = new User("2", "안유림", "0000", "010-3456-7890");
		User user3 = new User("3", "박상욱", "1111", "010-1223-4567");
		User user4 = new User("4", "김서연", "2222", "010-3456-3456");
		
//		단일 객체는 JSONObject로 생성자로 전달하면 JSON으로 변환시킬수 있지만,
//		ArrayList 에 들어가 있는 객체는 사용할 수 없다.
//		따라서 JSONArray 를 이용해서 전달해야한다.
		
		JSONObject userJson = new JSONObject();
		JSONArray usersJSON = new JSONArray();
		
		ArrayList<User> users = new ArrayList<User>();
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		
		System.out.println(users);
		
		
//		stream 으로 감싸서 보낸다. 
		users.stream().map(user -> new JSONObject(user)).forEach(usersJSON::put);
		
	}

}
