package prepareTask;

public class PrepareTask2 {
	  public static void main(String[] args) {
	      int[][] arData = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//행부터, 큰곳에서 작은 곳으로 3행 4열
	      for(int i = 0; i < arData.length; i++) {
	         for(int j = 0; j < arData[i].length; j++) {
	            System.out.print(arData[i][j] + " ");
	         }
	         System.out.println("\n");
	      }

	   }
}
