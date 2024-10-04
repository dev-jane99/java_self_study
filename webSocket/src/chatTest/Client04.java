package chatTest;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//서버와 연결해서 메세지 전송하기
public class Client04 {
	public static void main(String[] args) {
		Socket socket = null;
		PrintWriter printWriter = null;
		Scanner sc = null;
		
		try {
			String serverIP = "192.168.181.7";
			String message = "";
			socket = new Socket(serverIP, 9999);
			System.out.println("서버에 접속하였습니다");
			
			printWriter = new PrintWriter(socket.getOutputStream(), true);
			sc = new Scanner(System.in);
			message = sc.nextLine();
			printWriter.println(message);
			System.out.println("당신의 메세지" + message + "가 서버로 보내졌습니다");

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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
