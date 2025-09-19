package multithreading;
// synchronized, volatile, wait, notifyAll, sleep, 
class TicketBookingSystem{
	private int ticket = 0;
	volatile boolean open = true;
	public synchronized void bookTicket(String user) {
		while (ticket <=0 && open) {try {
			System.out.println(user+" is waiting");
			wait();
		}catch(InterruptedException e) {}
		}
		if (ticket >0) {
			ticket--;
            System.out.println(user + " booked a ticket | Remaining: " + ticket);
		}else {System.out.println(user + " could not book, system closed ");}
	}
	public synchronized void addtickets(int count) {
		ticket += count;
		System.out.println("Added " + count + " tickets | Available: " + ticket);
		notifyAll();	}
	public synchronized void closeSystem() {
		open = false;
		System.out.println("Booking system closed");
		notifyAll();
	}}
public class TicketBooking {
	public static void main(String[] args) throws InterruptedException {
		TicketBookingSystem system = new TicketBookingSystem();
		Thread user1 = new Thread(() -> system.bookTicket("User1"));
        Thread user2 = new Thread(() -> system.bookTicket("User2"));
        Thread user3 = new Thread(() -> system.bookTicket("User3"));

        user1.start();
        user2.start();
        user3.start();

        Thread.sleep(1000); 
        system.addtickets(2);

        Thread.sleep(1000);
        system.closeSystem();
	}

}
