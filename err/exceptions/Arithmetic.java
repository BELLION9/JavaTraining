package exceptions;

public class Arithmetic {
    public static void main(String[] args) {
        try { 
            int a = 5 / 0;
            System.out.println(a); //this doesn't run
            } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        }}}