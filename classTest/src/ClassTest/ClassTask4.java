package ClassTest;

public class ClassTask4 {
	
//	초기화 생성자만이 유일한 필드
	public ClassTask4 () {;}

//	최소값과 최대값을 구해주는 메소드 구현
//	return타입이 result타입이다. 
	
	Result getMaxAndMin (int[] arData) {
		Result result = new Result(arData[0], arData[0]);
		for(int i = 0; i <arData.length; i++) {
			if(result.min > arData[i]) {
				result.min = arData[i];
			};
			if(result.max < arData[i]) {
				result.max = arData[i];
			}
		}
        return result;
		}
	
	   public static void main(String[] args) {
		   ClassTask4 ct = new ClassTask4();
		   int[] arData = {5, 6, 8, 2, 7};
		   Result result = ct.getMaxAndMin(arData);
		   System.out.println(result.max);
		   System.out.println(result.min);
		   
		
//	      arData는 5개의 정수를 가지고 있는 배열이다.
//	      5개의 정수의 값 : 5, 6, 8, 2, 7
//	      Result result = classTask4.getMaxAndMin(arData);
//	      해당 메서드를 사용하면 최소값과 최대값을 구해준다.
		   
}
}