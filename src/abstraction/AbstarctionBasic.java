package abstraction;

abstract class Shape {
	abstract void draw();
}
class Circle extends Shape{
	void draw() {
		System.out.println("Draw a circle");
	}
}
public class AbstarctionBasic {
	public static void main(String[] args) {
		Shape c = new Circle();
		c.draw();
	}
}
