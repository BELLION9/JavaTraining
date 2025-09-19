package interfaces;

interface Printing {
	void print();
}
interface Scanning {
	void scan();
}
class PrintScanner implements Printing, Scanning{
	public void print() {
		System.out.println("Printing Doc");
	}
	public void scan() {
		System.out.println("Scan Doc");
	}
}

public class MultipleInterface {

	public static void main(String[] args) {
		PrintScanner ps = new PrintScanner();
		ps.print();
		ps.scan();
		

	}

}
