//substring, replace, trim, indexof, lastIndexOf
package strings;

public class SubString {

	public static void main(String[] args) {
		String perplexityUrl = "https://www.perplexity.ai/search/i-need-top-3-phone-within-20k-CQ.g9qNrT6Snd9LbLbhUYQ";
		String perplexContext = perplexityUrl.substring(perplexityUrl.lastIndexOf('/')+1, perplexityUrl.lastIndexOf('-')).replace('-', ' ');

		System.out.println("Context of Url: "+perplexContext);
		
		String netflixShow = "Stranger Things - Released: 2016-07-15";
        String releaseYear = netflixShow.substring(netflixShow.indexOf("20"), netflixShow.indexOf("20") + 4);
        String movieName = netflixShow.substring(0, netflixShow.indexOf('-'));
        String trimmedName = movieName.trim();
        System.out.println("Release Year of " +trimmedName + ": " + releaseYear);

	}

}
