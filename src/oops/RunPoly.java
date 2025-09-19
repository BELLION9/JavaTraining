package oops;

class Payment {
    void pay(double amount) {
        System.out.println("General payment of " + amount);
    }
}
class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
class UpiPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}
class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Net Banking.");
    }
}
public class RunPoly {
    public static void main(String[] args) {
        Payment p = new Payment();
        p = new CreditCardPayment();
        p.pay(1500);
        p = new UpiPayment();
        p.pay(750);
        p = new NetBankingPayment();
        p.pay(3200);
    }
}
