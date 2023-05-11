package Day11.Ex03_Generic;

public class LimitedTypeMethod {

	// 제네릭 메소드 타입 제한
	// Number
	// - 자식 클래스 : Interger, Double 등의 숫자 관련 래퍼클래스
	public <T extends Number> void method(T t) {
		System.out.println(t.intValue());
		System.out.println(t.doubleValue());
	}
	
	public static void main(String[] args) {
		
		LimitedTypeMethod ltm = new LimitedTypeMethod();
		ltm.method(1234);
		ltm.method(12.34);
		
		//Number 클래스와 그 자식클래스들로 타입이 제한된다.
		//ltm.method("12.34"); //문자열은 제한된다.
	}
	
}
