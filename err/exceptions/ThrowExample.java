package exceptions;

public class ThrowExample {
    static void checkAge(int age) {
        if(age < 18) {
            throw new ArithmeticException("Not allowed: Age < 18");
        } else {
            System.out.println("Welcome!");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}