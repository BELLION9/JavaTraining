package exceptions;

public class Exceptions {

	public static void main(String[] args) {
		int balance = 2000;   
        int withdrawAmount = 2500; 

        System.out.println("Welcome to the ATM!");
        System.out.println("Your current balance: " + balance);

        try {
            
            if (withdrawAmount > balance) {
                throw new Exception("Withdrawal failed: Insufficient balance.");
            }

            balance -= withdrawAmount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } 
        catch (Exception e) {
           
            System.out.println("Exception Caught: " + e.getMessage());
        } 
        finally {
          
            System.out.println("Transaction Ended. Please collect your card.");
        }

	}

}
