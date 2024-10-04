package study0812;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client04 {
	public static void main(String[] args) {
		Socket socket = null;
		PrintWriter printWriter = null;
		Scanner sc = null;

		
		try {
			String serverIp = "192.168.181.7";
			String message = null;

			socket = new Socket(serverIp, 9999);
			System.out.println("connected to server");
			
			printWriter = new PrintWriter(socket.getOutputStream(), true);
//			String guideMessage = "type a message to send";
//			System.out.println(guideMessage);
			sc = new Scanner(System.in);
			message = sc.nextLine();
			printWriter.println(message);
			System.out.println("the message [" + message + "] has been sent to server");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (socket != null) {
					socket.close();
				}
				if (printWriter != null) {
					printWriter.close();
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
