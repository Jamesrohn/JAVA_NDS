package Day10.Ex03_Util;

import java.util.StringTokenizer;

public class StringTokenSum {

	// "1,2,3,4,5"
	//"," 분리 기호 ->> 1 2 3 4 5 (String)
	//토큰을 int 타입으로 변환하여 합계를 구해 보자.
	public static void main(String[] args) {
		
		String num = "1,2,3,4,5";
		StringTokenizer st = new StringTokenizer(num,",");
		
		int sum = 0;
		
		while( st.hasMoreTokens()) {
			//"1"(String) --> 1(int) 정수로 변환
			int k = Integer.parseInt(st.nextToken());
			
			sum += k;
		}
		System.out.println("합계 : " + sum);
	}
	
}
