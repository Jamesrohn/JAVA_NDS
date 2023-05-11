package Day11.Ex03_Generic;


class Cloth { }
class Product1 {
	
	private Cloth cloth = new Cloth();
	
	public Cloth getCloth() {
		return cloth;
	}
	
	public void setCloth(Cloth cloth) {
		this.cloth = cloth;
	}	
}

class Car { }
class Product2 {
	
	private Car car = new Car();
	
	public Car getCar() {
		return car;
	}
	public void setCar (Car car) {
		this.car = car;
	}
}

public class Nogeneric {

	public static void main(String[] args) {
		Product1 product1 = new Product1();
		product1.setCloth (new Cloth());
		System.out.println(product1.getCloth());
		
		Product2 product2 = new Product2();
		product2.setCar( new Car());
		System.out.println(product2.getCar());
		
		//클래스 상수를 정의 할때 타입이 이미 결정됨
		//product1.setCloth( new Car() );	//불가능
		//product2.setCar( new Cloth() );	//불가능
	}
	
	
}
