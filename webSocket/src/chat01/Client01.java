package chat01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client01 {
	public static void main(String[] args) {

//	요청을 보내는 사용자 
		Socket socket = null;
//	PrintWriter 클래스 : 텍스트 데이터를 효율적으로 출력 할 수 있게 다양한 메소드를 제공하는 클래스
		PrintWriter writer = null;
		Scanner sc = null;

		try {
//			cmd -> ipconfig ->  IPv4 주소
			String serverIp = "192.168.181.7";
			String message = null;

			socket = new Socket(serverIp, 7000); // 이게 Bind
			System.out.println("You have connected with the server");

//		서버로 데이터를 전송하기 위해 PrintWriter 를 사용
			writer = new PrintWriter(socket.getOutputStream(), true); // true 는 autoflush 이다. 자동으로 날린다.

//		전송할 메세지 작성
			sc = new Scanner(System.in);
			message = sc.nextLine();

//		서버로 메세지 전송하기
			writer.println(message);
			System.out.println("message [" + message + "] has been sent to server.");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (socket != null) {
					socket.close();
				}
				if (writer != null) {
					writer.close();
				}
				if (sc != null) {
					sc.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
