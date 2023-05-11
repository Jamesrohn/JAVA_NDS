package Day09.Ex01_TryCatch;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a; 		//피제수 - 나누어 지는 수
		int b; 		//제수 - 나누는 수
		
		System.out.println("a: ");
		a = sc.nextInt();
		
		System.out.println("b: ");
		b = sc.nextInt();
		
		//예외 메시지 : java.lang.ArithmeticException: / by zero
		
		//예외 처리문 : try ~ catch
		//try : ctrl + space
		try {
			//예외 발생 가능성이 있는 문자
			System.out.println("a / b = " + a / b);
		}
		//catch(예외 타입 객체명){}
		catch (Exception e) {
			// 예외 발생시 , 예외 처리 문장
			System.err.println("0으로 나누는 연산은 수학적으로 정의 되지 않습니다.");
			
		}
		//finally 블록 생략 가능
		finally {
			//예외 발생과 무관하게 실행하는 문자
			//예외 처리와 관련된 문자을 작성(메모리를 해체하는 문장등을 작성)
			sc.close();
		}
	}
	
}
