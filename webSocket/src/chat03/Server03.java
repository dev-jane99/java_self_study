package chat03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Server03 {
	public static void main(String[] args) {
//		여러 클라이언트와 연결할때 (양방향)

		ServerSocket serverSocket = null;
		List<PrintWriter> outputList = Collections.synchronizedList(new ArrayList<>());

		try {
			serverSocket = new ServerSocket(9999);
			System.out.println("[서버 실행: 클라이언트 대기중..]");

//			서버 입력 처리를 처리하는 쓰레드
			ServerInputThread serverInputThread = new ServerInputThread(outputList);
			serverInputThread.start();

			while (true) {
				Socket clientSocket = serverSocket.accept();
				System.out.println("[접속 :" + clientSocket + "]");
				ServerThread serverThread = new ServerThread(clientSocket, outputList);
				serverThread.start();

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (serverSocket != null && !serverSocket.isClosed()) {
				try {
					serverSocket.close();
					System.out.println("서버 소켓이 닫혔습니다");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}

//	서버에서 직접 메세지를 입력받아 클라이언트에게 전송하는 메소드
class ServerInputThread extends Thread {
//	서버에서 들어오는 메세지들을 가져와야한다.
	private final List<PrintWriter> outputList;

	public ServerInputThread(List<PrintWriter> outputList) {
		this.outputList = outputList;

	}

//	run 으로 자원에 접근
	@Override
	public void run() {
		try {

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			String message = "";
			while ((message = bufferedReader.readLine()) != null) {
				System.out.println("서버 : " + message);
				for (PrintWriter out : outputList) {
					out.println("서버 : " + message);
				}
			}
		} catch (IOException e) {
			System.out.println("서버 입력 처리중 오류");
			e.printStackTrace();
		}

	}
}

//	접속하는 클라이언트의 Socket을 모두 outputList에 담는다.
class ServerThread extends Thread {

	private final Socket socket;
	private final List<PrintWriter> outputList;
	private PrintWriter output;
	private BufferedReader input;

//	생성자들
	public ServerThread(Socket socket, List<PrintWriter> outputList) {
		this.socket = socket;
		this.outputList = outputList;

		try {
			output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			synchronized (output) {
				outputList.add(output);
			}
		} catch (IOException e) {
			System.out.println("스트림 초기화 중 오류");
			 closeResources();
		} 
	};

	@Override
	public void run() {
		String line = "";

		try {
			while ((line = input.readLine()) != null) {
//				서버 콘솔에 수신한 메세지를 출력
				System.out.println(line);
//				모든 클라이언트에게 메세지를 전송
				synchronized (outputList) {
					for (PrintWriter out : outputList) {
						out.println(line);
					}
				}
			}
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			closeResources(); // 메소드 사용
		}
	}

//	메소드 선언
	private void closeResources() {
		try {
			synchronized (outputList) {
				outputList.remove(output);
			}
			if (input != null) {
				input.close();
			}
			if (output != null) {
				output.close();
			}
			if (socket != null && !socket.isClosed()) {
				socket.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
