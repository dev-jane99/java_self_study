package study0812;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client03 {
	public static void main(String[] args) {
		Socket socket = null;
		PrintWriter printWriter = null;
		Scanner sc = null;
		
		try {
//			client should know both port number and the IP number for the certain server to connect
//			to get the serverIP number, (cmd -> ipconfig -> IPv4 Address)
			String serverIp ="192.168.181.7";
			
//			don't forget the message that client will type in a chat box
			String message = null;
			
//			socket is the client's socket, as explained, client needs both IP and port number of the server. and it's called 'bind'
			socket = new Socket(serverIp, 9999);
			System.out.println("you have connected to the server");
			
//			by using printWriter, client have to send(via output) the message to the server. Don't forget to flush automatically!
			printWriter = new PrintWriter(socket.getOutputStream(), true);
			
//			need to make a chat box where the client can type
			sc = new Scanner(System.in);
			message = sc.nextLine();
			
			printWriter.println(message); //fucking important!!!!since i have formed a function to send the message to server, use it!!!
			System.out.println("you have sent the following message : " + message);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
//			just as server, don't forget to close all the functions been used to create client class
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
