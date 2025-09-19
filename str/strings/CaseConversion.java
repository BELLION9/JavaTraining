// lowercase and uppercase
package strings;

public class CaseConversion {

	public static void main(String[] args) {
		String title = "Best view of Dubai";
		String hashtag = "#" + title.toLowerCase().replace(" ", "");
		System.out.println("Hashtag for clip: "+hashtag);
		
		String userInput = "United Arab Emirates";
        String countryCode = userInput.toUpperCase().replace(" ", "_");
        System.out.println("Standardized country code: " + countryCode);

	}

}
