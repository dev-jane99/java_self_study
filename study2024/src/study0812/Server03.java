package study0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server03 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader bufferedReader = null;
		
		try {
//			open up the server port for client to connect
			serverSocket = new ServerSocket(9999);
			System.out.println("server activated");
			
//			if client connects to the server, it will automatically accept the client and show the message
			socket = serverSocket.accept();
			System.out.println("Client has connected with the server");
			
//			by using bufferReader, bring the client's message to server's console. 
//			since server brings what client sends(via output), it should be input stream.
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String message = bufferedReader.readLine();
			System.out.println("client has sent a message to the server : " + message);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
//				make sure to close all the bits and pieces using 'try-catch{} and if{}' whatever I used to run the class
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
