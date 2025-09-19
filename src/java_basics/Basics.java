package java_basics;

public class Basics {
	int no = 10;
	
	void k1()
	{
		int no1= 10;
		System.out.println(no + no1);
	}
	void k2() {
		int no2 = 123;
		System.out.println("result: "+no + no2);
	}
	public static void main(String args[]) {
		Basics obje = new Basics();
		obje.k1();
		obje.k2();
	}
}
