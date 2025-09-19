package interfaces;

interface Calculator{
	int add(int a, int b);
	
	default void show() {
		System.out.println("Prints from default");
	}
	static void get() {
		System.out.println("Prints from static");
	}
}
class SimpleCalculator implements Calculator{
	public int add(int a, int b) {
		return a+b;
	}
}
public class InterfaceDS {

	public static void main(String[] args) {
		SimpleCalculator sc = new SimpleCalculator();
		System.out.println("Sum: " +sc.add(99, 44));
		sc.show();
		Calculator.get();
		
	}

}
