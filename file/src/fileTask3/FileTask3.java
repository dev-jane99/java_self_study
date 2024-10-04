package fileTask3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileTask3 {
	public static void main(String[] args) throws IOException {
		ArrayList<User> users = new ArrayList<User>();
		
		User user1 = new User(1L, "Jane", 24, "Student");
		User user2 = new User(2L, "Olie", 24, "Marketer");
		User user3 = new User(3L, "Sart", 23, "Manager");
		User user4 = new User(4L, "Bi", 23, "IT Specialist");
		User user5 = new User(5L, "Alina", 22, "Restaurant Owner");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		System.out.println(users);
		
//		ooo님의 직업은 ooo 입니다. 를 jobs.txt에 쓰고 콘솔에 출력하기 (인코딩)
//		StreamAPI 이용하기
		BufferedWriter jobs = new BufferedWriter(new FileWriter("jobs.txt"));
		users.forEach((u) -> {
			try {
				jobs.write(u.getName() + "'s job is a " + u.getJob() + ".\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		jobs.close();
		
		BufferedReader readJobs = new BufferedReader(new FileReader("jobs.txt"));
		String line = "";
		while((line = readJobs.readLine()) != null) {
	         System.out.println(line);
	      }
		readJobs.close();
		
		
	}
}
