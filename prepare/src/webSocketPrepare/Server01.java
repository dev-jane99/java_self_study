package webSocketPrepare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader bufferedReader = null;
		
		try {
			serverSocket = new ServerSocket(8888);
			System.out.println("서버가 실행되었습니다");
			
			socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");
			
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String message = bufferedReader.readLine();
			System.out.println("클라이언트의 메세지 :" + message);
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
