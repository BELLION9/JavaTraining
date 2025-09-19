package strings;

public class Split {

	public static void main(String[] args) {
		String messageDetail = "05-09-2025, 18:30 - Krish: Hey! Do we have review on Tue?";
		String[] messageParts = messageDetail.split(" - ");
		String timeStamp = messageParts[0];
		String[] parting = messageParts[1].split(": "); 
		String sender = parting[0];
		String message = parting[1];
		System.out.println("TimeStamp: " +timeStamp);
		System.out.println("Sender: " +sender);
		System.out.println("Message: " +message);
		
	}

}
