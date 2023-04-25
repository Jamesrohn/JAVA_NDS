package Day02;

public class Ex19_GugaAll {

	public static void main(String[] args) {
		//(단)x(1~9)
		//단에 대한 반복 	: 1~9
		//각 단에 곱		: 1~9
		
		//A x B
		//i :단(A)
		for (int i=2; i<=9; i++) {
			
			//j :곱(B)
			for (int j=1; j<=9; j++) {
				System.out.print(i+"*"+j+"="+i*j);
				System.out.print("\t");	//탭 (공백)
			}
			// 1*1=1	1*2=2... 1*9=9
			System.out.println();	//한단 끝--> 다음줄로
		}
		
	}
	
}
