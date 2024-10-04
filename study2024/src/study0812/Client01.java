package study0812;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client01 {
	public static void main(String[] args) {
		Socket socket = null;
		PrintWriter printWriter = null;
		Scanner sc = null;
		
		try {
			String serverIp = "192.168.181.7";
			String message = null;
			socket = new Socket(serverIp, 8888);
			System.out.println("서버에 접속되었습니다.");
			
			printWriter = new PrintWriter(socket.getOutputStream(), true);
			sc = new Scanner(System.in);
			message = sc.nextLine();
			printWriter.println(message);
			System.out.println("서버에 다음의 메세지를 보냈습니다: " + message);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(socket != null) {
					socket.close();
				}
				if(printWriter != null) {
					printWriter.close();
				}
				if(sc != null) {
					sc.close();
				}
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
