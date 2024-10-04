package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException {

//	FileWriter, FileReader 이용
//	음식 4개를 출력
//	"스테이크", "돈까스", "피자, "스파게티", "햄버거"

//		BufferedWriter foods = new BufferedWriter(new FileWriter("./food.txt", true));
//		foods.write("스테이크\n");
//		foods.write("돈까스\n");
//		foods.write("피자\n");
//		foods.write("스파게티\n");
//		foods.write("햄버거\n");
//		foods.close();

		BufferedReader printFoods = new BufferedReader(new FileReader("./food.txt"));
		String line = null;
		String temp = "";
//			while ((line = printFoods.readLine()) != null) {
//				System.out.println(line);
//		

//		값 수정하기
//		while((line = printFoods.readLine()) != null) {
//			if(line.equals("스파게티")) {
//				temp += "냉모밀\n";
//				continue;
//			}
//			temp += line +"\n";
//		}
//		printFoods.close();
//		System.out.println(temp);
//		BufferedWriter changeFood = new BufferedWriter(new FileWriter("./food.txt"));
//		changeFood.write(temp);
//		changeFood.close();

//		햄버거 삭제하기
		while ((line = printFoods.readLine()) != null) {
			if (line.equals("햄버거")) {
				continue;
			}
			temp += line + "\n";
		}
		printFoods.close();
		System.out.println(temp);
		BufferedWriter deleteFood = new BufferedWriter(new FileWriter("./food.txt"));
		deleteFood.write(temp);
		deleteFood.close();
		
		

	}

}
