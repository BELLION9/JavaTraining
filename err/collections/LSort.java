package collections;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class LSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.println("Enter 4 numbers:");
        for (int i = 0; i < 4; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.println("Original LinkedList: " + numbers);

        Collections.sort(numbers); // sort the list
        System.out.println("Sorted LinkedList: " + numbers);
    }
}
