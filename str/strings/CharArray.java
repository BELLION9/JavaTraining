package strings;

public class CharArray {

	public static void main(String[] args) {
		String password = "!@#$%^&*QWERTYasdfg12345";
        char[] chars = password.toCharArray();
        
        int uppercase = 0, lowercase = 0, digits = 0, special = 0;
        
        for (char c : chars) {
            if (Character.isUpperCase(c)) uppercase++;
            else if (Character.isLowerCase(c)) lowercase++;
            else if (Character.isDigit(c)) digits++;
            else special++;
        }
        
        System.out.println("Password Analysis of:" +password);
        System.out.println("Uppercase letters: " + uppercase);
        System.out.println("Lowercase letters: " + lowercase);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + special);

	}

}
