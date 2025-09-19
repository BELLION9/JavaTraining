package asd;

abstract class Shape {
	String shapeName; double area;
	abstract void calculateArea();
	void showShape() {
		System.out.println("Shape: "+shapeName);
		System.out.println("Area: "+area);
	}
}
class Circle extends Shape {
    double radius;

    Circle(double r) {
        shapeName = "Circle";
        radius = r;
    }

    void calculateArea() {
        area = 3.14 * radius * radius;
    }
}
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        shapeName = "Rectangle";
        length = l;
        breadth = b;
    }

    void calculateArea() {
        area = length * breadth;
    }
}
public class Abstract2 {

	public static void main(String[] args) {
		Circle c = new Circle(5);
        c.calculateArea();
        c.showShape();
        Rectangle r = new Rectangle(9, 9);
        r.calculateArea();
        r.showShape();

	}

}
