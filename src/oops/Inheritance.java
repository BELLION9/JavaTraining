package oops;

class Animal{
	void eat(String dish) {
		System.out.println("The food he likes is " +dish);
	}
}
class Dog extends Animal {
	void bark(String voice) {
		System.out.println("He usually likes to "+voice);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.bark("Bow");
		obj.eat("Bones");
	}
}
