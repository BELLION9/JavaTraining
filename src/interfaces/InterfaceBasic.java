package interfaces;

interface Animal {
	void sound();
}
class Doggie implements Animal{
	public void sound() {
		System.out.println("Doggie sounds like bow");
	}
}

public class InterfaceBasic {

	public static void main(String[] args) {
		Animal d = new Doggie();
		d.sound();

	}

}
