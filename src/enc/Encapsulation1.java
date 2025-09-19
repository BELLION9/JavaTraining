package enc;

class Book{
	private String title ;
	private double price ;
	Book(String t, double p){
		title = t;
		price = p;
	}
	public double getPrice() {
		return price;
	}
	public String getTitle() {
		return title;
	}
}

public class Encapsulation1 {

	public static void main(String[] args) {
		Book b = new Book("Krishna and his Leela", 999.9);
		System.out.println("Book Title: " + b.getTitle());
        System.out.println("Book Price: " + b.getPrice());
	}
}
