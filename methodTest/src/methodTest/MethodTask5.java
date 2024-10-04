package methodTest;

public class MethodTask5 {
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
        int[] getMaxtAndMin(int[] arData) {
        	int[] arResult = {arData[0], arData[0]};
        	for(int i = 0; i <arData.length; i++) {
        		if(arResult[0] < arData[i]) {
        		 arResult[0] = arData[i];
        		}
        		if(arResult[1] > arData[i]) {
        			arResult[1] = arData[1];
        		}
        	}
        	return arResult;
        }

        
	
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void)
        void getMaxtAndMinVoid(int[] arData, int[] arResult) {
        	for(int i = 0; i <arData.length; i++) {
        		if(arResult[0] < arData[i]) {
        		 arResult[0] = arData[i];
        		}
        		if(arResult[1] > arData[i]) {
        			arResult[1] = arData[1];
        		}
        	}
        }
        
        
//	String 클래스의 indexOF() 메소드 만들기, 문자열 전체와 검색할 문자형을 전달받는다.
      int indexOf (String content, char c) {
    	  for(int i = 0; i < content.length(); i++) {
  			if(content.charAt(i) == c) {
        return i;
  			}

    	  }
    	  return -1;
      }
      public static void main(String[] args) {
		MethodTask5 mt = new MethodTask5();
////	1.
//		int[] result = null;
//		mt.getMaxtAndMin(new int[] {3, 10, 20, 30, 40});
//		System.out.println(result[0]);
//		System.out.println(result[1]);
		
////		2.
//		int[] arData = {3, 6, 10, 15, 8};
//		int[] arResult = {arData[0], arData[0]};
//		mt.getMaxtAndMinVoid(arData, arResult);
//		
//		System.out.println("최대값은 :" + arResult[0]);
//		System.out.println("최소값은 :" + arResult[1]);
		
////		3.	
//		int result = 0;
//		result = mt.indexOf("apple",'p'); //1번 인덱스에 'p' 찾았으니까 return.
//		System.out.println(result);
	}
}
      
      
