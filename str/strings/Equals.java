// equals, equalIgnorecase , contains
package strings;

public class Equals {

	public static void main(String[] args) {
		String storedUsername = "krish.gotte@caeliuscnsulting.com";
        String inputUsername = "Krish.Gotte@caeliuscnsulting.com";

        System.out.println("Case-sensitive login: " + storedUsername.equals(inputUsername));

        System.out.println("Case-insensitive login: " + storedUsername.equalsIgnoreCase(inputUsername));
        boolean verify = storedUsername.contains("krish");
        System.out.println("Checking if found(non-case sensitive): "+verify);
	}

}
