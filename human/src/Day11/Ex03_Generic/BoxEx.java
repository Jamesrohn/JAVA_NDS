package Day11.Ex03_Generic;

public class BoxEx {

	public static void main(String[] args) {
		//제네릭
		//:모든 클래스 타입을 다룰 수 있도록,
		//클래스와 메소드를 작성하는 기법
		//- 타입매개변수: 모든 클래스타입을 일반화한 변수
		//-객체를 생성할때, 타입을 결정한다.
		Box<String> box1 = new Box<String>();
		box1.setT("쿠팡택배");
		String boxName = box1.getT();
		System.out.println(boxName);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setT(100);
		int value = box2.getT();
		System.out.println(value);
		
		//제네릭 기법의 타입으로는 클래스만 사용할 수 있다.
		//기본 타입은 지정할 수 없다.
		//Box<int> box3 = new Box<int>();
		
	}
}
