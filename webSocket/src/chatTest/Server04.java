package chatTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//클라이언트의 소켓과 연결하여 메세지 출력하기
public class Server04 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader bufferedReader = null;
		
		try {
			serverSocket = new ServerSocket(9999);
			System.out.println("서버가 활성화 되었습니다");
			
			socket = serverSocket.accept();
			System.out.println("클라이언트가 서버에 접속되었습니다");
					
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String message = bufferedReader.readLine();
			System.out.println("클라이언트가 메세지를 보냈습니다: " + message);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(serverSocket != null) {
					serverSocket.close();
				}
				if(socket != null) {
					socket.close();
				}
				if(bufferedReader != null) {
					bufferedReader.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}

