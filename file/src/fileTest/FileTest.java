package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
//	throws 는 해당 메소드를 사용한 쪽으로 예외를 발생시킨다.
//	따라서 메소드 내에서는 throws 에 작성한 예외가 발생하지 않는다.
	public static void main(String[] args) throws IOException {

//		new FileWriter(경로, 이어쓰기 여부)
//		경로
//		절대 경로 : 어디에서 작성해도 찾아 갈 수 있는 경로 (보안상 위험함) 
//		예를 들어, 은행 로그인을 한 URL을 다른 사람이 검색하면 로그인한 화면이 그대로 보이면 위험하다.
//		상대 경로 : 파일의 경로는 현재 위치에 따라 바뀐다. "직진 해서 우회전 하세요.." 
//		"./(현재폴더) ,../(상위 폴더), ../../, /(최상위폴더)" 보고있는것이 다르다. (이걸 이용할거다)

//		★쓰기
//		OS에게 파일을 사용한다고 허락을 구한다.
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./test.txt", true));
		bufferedWriter.write("안녕 난 재은쓰 24살인디\n");
		bufferedWriter.write("오늘 불금인데\n");
		bufferedWriter.write("연어장에 까르보불닭 먹구\n");
		bufferedWriter.write("유튜브 봐야징");
		bufferedWriter.close(); //닫기

//		★읽기
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("./test.txt"));
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("없는 파일 경로");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("무조건 실행");
			bufferedReader.close();
		}

	}
}
