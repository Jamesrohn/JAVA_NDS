package Day05;

import java.util.Scanner;

public class Ex06_Method {

	public static int plus(int a, int b) {
		int result = a+b;
		return result;
	}
	
	//메소드 정의
	//접근 지정자 (static) 반환 타입 메소드명(매개변수1,매개변수2){실행문;}
	//-접근지정자 : public.protected, default, private
	//-static : 생략, static
	//-반환타입 : 기본타입, 참조타입, void
	//			*void가 아니면, 반드시 return 을 메소드 내에 작성해야 한다.
	//			return(값); - 반환하는 (값)의 자료형을 지정
	//-메소드명 : 직접 이름을 지정, 관례적으로 카멜케이스를 사용
	//			ex) simpleExample()
	//-매개변수 : 메소드 호출시, 전달한 인자를 순서대로 가져오는 변수
	public static int minus(int a, int b) {
		int result = a-b;
		//return (값);
		//1. (값)을 메소드 호출한 자리로 반환
		//2. 메소드 종료
		//3. 메모리 해제
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a :");
		int a = sc.nextInt();
		
		System.out.print("b :");
		int b = sc.nextInt();
		
		//메소드 호출 : 메소드명 (인자1,인자2);
		// - 전달인자 (argument)
		System.out.println(plus(a,b));
		System.out.println(minus(a,b));
		
		sc.close();
		
	}
	
}
