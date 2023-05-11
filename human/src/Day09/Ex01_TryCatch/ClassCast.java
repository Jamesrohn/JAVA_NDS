package Day09.Ex01_TryCatch;

class Animal{}

class Dog extends Animal{}

class Cat extends Animal{}

public class ClassCast {

	//(부모 클래스)  (자식 클래스)
	//Animal <-- Dog, Cat
	//Animal = Cat 으로 업캐스팅한 이후에
	//다시 Animal을 Dog로 다운 캐스팅 할 수 없다.
	// - Cat을 Dog로 타입 변환 할 수 없다.
	
	public static void changeDog (Animal animal) {
		
		//java.lang.ClassCastException
		try {
			Dog dog = (Dog) animal;
		} catch (ClassCastException e) {
			System.err.println("Cat을 Dog로 변환 할 수 없습니다.");
		}
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat); 		//cat이 전달된 경우 (Dog)로 변환 불가 --> 예외 발생
	}
	
}
