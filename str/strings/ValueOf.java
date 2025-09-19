package strings;

public class ValueOf {

	public static void main(String[] args) {
		double productPrice = 299.99;
        String priceDisplay = "$" + String.valueOf(productPrice);
        System.out.println("Product price: " + priceDisplay);
        
        int userRating = 5;
        String ratingDisplay = String.valueOf(userRating) + "/5 stars";
        System.out.println("User rating: " + ratingDisplay);
        
        boolean notificationsEnabled = true;
        String settingStatus = "Notifications: " + String.valueOf(notificationsEnabled);
        System.out.println(settingStatus);
	}

}
