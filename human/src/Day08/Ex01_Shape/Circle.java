package Day08.Ex01_Shape;

public class Circle extends Shape {

	double radius;
	
	public Circle() {
		this(0);
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI;
	}

	@Override
	double round() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	
}
