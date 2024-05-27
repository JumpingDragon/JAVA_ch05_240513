
public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ArrayInt = {1,2,3,4,5};
		double[] ArrayDbl = {1.2, 4.7};
		String[] arrayStr = {"korea", "japa", "usa"};
		
		int[] arrayTest1 = null; // 참조하는 배열 값이 없는 배열 이름만 선언
		// list1 = []
		
		
		int[] arrayTest2 = new int[5]; // 각 원소값이 0으로 초기화되는 5칸짜리 배열이 생성됨.
		
		for(int i=0; i<arrayTest2.length; i++) {  // 배열 arrayTest2의 모든 원소를 출력
			// 배열이름.length -> 배열의 길이를 자동으로 저장
			System.out.println(arrayTest2[i]);
			
			
		}
			
	}

}
