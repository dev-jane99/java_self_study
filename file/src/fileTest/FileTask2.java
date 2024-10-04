package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;

public class FileTask2 {
	public static void main(String[] args) throws IOException{
//		람다식으로 stream 문법 사용하기
//		음식 4개 출력
//		한우 갈빗살 삼겹살 항정살
		BufferedWriter meat = new BufferedWriter(new FileWriter("food2.txt"));
		String[] foods = {"한우", "갈빗살", "삼겹살", "항정살"};
		Arrays.asList(foods).stream().forEach(food -> {
			try {
				meat.write(food + "\n");
//				meat.newLine(); 비추천한다!!
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		meat.close();
		
//		4의 배수 (4 8... 32 까지)
//		Stream 문법으로 gugu.txt만들어서 출력하기!
		BufferedWriter gugudan = new BufferedWriter(new FileWriter("gugu.txt"));
		IntStream.rangeClosed(1, 9).map(n -> n * 4).forEach(n ->{
			try {
				gugudan.write(n + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		gugudan.close();
		
//		선생님 풀이
		BufferedWriter gugudan2 = new BufferedWriter(new FileWriter("gugu.txt"));
		IntStream.rangeClosed(1, 9).forEach(n -> {
			  try {
				  gugudan2.write("4" + "\tx\t" + n + "\t=\t" + String.valueOf(n * 4) + "\n");
		         } catch (IOException e) {
		            e.printStackTrace();
		         }finally {
		        	System.out.println("무언가 잘못됨");
		         }
		      });
		gugudan2.close();
		      
		      BufferedReader bufferedReader = new BufferedReader(new FileReader("gugu.txt"));
		      String line = "";
		      while((line = bufferedReader.readLine()) != null) {
		         System.out.println(line);
		      }

		
		
		
	}
}
