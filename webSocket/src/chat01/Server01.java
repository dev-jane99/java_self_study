package chat01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) {
		
//		Service + er = server (서비스를 제공하는 사용자)
//		서버 먼저 구현하기 Create the server first
		
		
//		소켓 선언 define the socket
//		서버 소켓 Server socket
		ServerSocket serverSocket = null;
//		클라이언트 소켓 client socket
		Socket socket = null;
		
//		입력 스트림을 읽기위한 BufferedReader to read the inputStream
		BufferedReader reader = null;
		
//		클라이언트 한테 1100 번방 열어놨으니 여기로 들어와 라고 얘기하기
		try {
			serverSocket = new ServerSocket(7000);
			System.out.println("The server is activated");
			
//			accept() 클라이언트가 서버에 연결 될 때까지 대기 상태
			socket = serverSocket.accept();
			
//			클라이언트가 서버에 연결 요청을 보내면 받아들인다.
			System.out.println("Client has been linked with your server");
			
//			클라이언트의 소켓으로부터 데이터를 읽기 위해 BufferedReader를 생성한다.
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String message = reader.readLine();
			System.out.println("Message from the client : " + message);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
//				열려 있어야 닫는다. 그래서 if문 사용 열려있으면~
				if(reader != null) {
					reader.close();
				}
				if(socket != null) {
					socket.close();
				}
				if(serverSocket != null) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
