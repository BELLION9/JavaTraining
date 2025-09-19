package strings;

public class CharAt {

	public static void main(String[] args) {
		String name= "Krish Gotte";
		char firstInitial = name.charAt(0);
		System.out.println("First letter of name : "+firstInitial);
		char lastInitial = name.charAt(name.lastIndexOf(' ') +1);
		System.out.println("Last name : "+lastInitial);
		//example 2
		String creditCard = "4512341234123412";
        char firstDigit = creditCard.charAt(0);
        String cardType = (firstDigit == '4') ? "Visa" : (firstDigit == '5') ? "MasterCard" : "Unknown";
        System.out.println("Card Type: " + cardType);
	}

}
