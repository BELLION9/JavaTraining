package oops;

class A{
	void Combine(int a, int b) {
		System.out.println("(2a + 2b) - (a+b) = " +(a+b));
	}

	void Combine(double a, double b, double c) {
		System.out.println("3(a+b+c)/3 =  " +(a+b+c));
	}
	void Combine(String s1, String s2) {
		System.out.println("The two in my mind were " +s1+ " "+s2);
	}
}

public class CompilePoly {
	public static void main(String[] args) {
		A obj = new A();

		obj.Combine(10,20);
		obj.Combine(10, 30, 40);
		obj.Combine("Caelius","Consulting");	
	}
}
