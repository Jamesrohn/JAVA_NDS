package Day11.Ex03_Generic;

/**
 * 제네릭 기번으로 클래스 정의 하기
 * - 클래스명 뒤에 타입 매개 변수<E>, <T>,<K,V> 등을 작성한다.
 */

public class Box<T> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
