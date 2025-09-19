package keywords;

class DeemedUniversity {
	String name = "Gitam";
	DeemedUniversity(){
		System.out.println("University constructor");
	}
	void showInfo() {
		System.out.println("University method");
	}
}
class College extends DeemedUniversity{
	String name = "Narayana";
	College(){
		super();
		System.out.println("College constructor");
	}
	void showNames() {
		System.out.println("Parent: "+super.name);
		System.out.println("Child: "+name);
	}
	void showInfo() {
		super.showInfo();
		System.out.println("College method");
	}
}

public class WordSuper{
	public static void main(String[] args) {
		College c = new College();
		c.showNames();
		c.showInfo();
	}
}
