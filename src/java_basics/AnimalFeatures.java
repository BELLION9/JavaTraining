package java_basics;

public class AnimalFeatures {
	
	void details(String name, int distance_km) {
		System.out.println(name+ " has walked " +distance_km+ "km");
	}

	public static void main(String[] args) {
		AnimalFeatures k = new AnimalFeatures();
		k.Features("black", 2, "panther");
		k.details("panther",89);
		
		AnimalFeatures z = new AnimalFeatures();
		z.Features("orange", 2, "Cheetah");
		z.details("Cheetah", 99);
		
	}
	public void Features(String color, int no_of_eyes, String name) {
		System.out.println(name+ " is " +color+ " and has "+no_of_eyes+ " eyes.");
	}
}
