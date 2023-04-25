package Day02;

public class Ex14_WhileSum {

	public static void main(String[] args) {
		//1부터 100까지의 합계를 구하시오
		// 1+2+3+....+100 = 5050
		int sum = 0;
		int a=1;
		
		//while(조건) {반복 실행문}
		while(a<=100) {
			//복합대입 연산자, 증감연산자
			sum += a++; //sum=sum+a;
						//a=a+1;
			
			//sum=sum + a;은 sum += a;랑 같고 a++;를 추가 하면 sum += a++;이 된다.
			
			System.out.println("합계 : " + sum);	
			
		}
	}
}
