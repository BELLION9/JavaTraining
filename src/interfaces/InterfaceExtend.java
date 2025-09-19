package interfaces;

interface Vehicle {
	void start();
}
interface Car extends Vehicle {
	void drive();
}
class Porsche implements Car{
	public void start() {
		System.out.println("Lets Start the Porsche");
	}
	public void drive() {
		System.out.println("Gonna drive untill the fuels up");
	}
}

public class InterfaceExtend {

	public static void main(String[] args) {
		Porsche p = new Porsche();
		p.start();
		p.drive();

	}

}
