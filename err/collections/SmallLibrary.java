package collections;

import java.util.*;

public class SmallLibrary {
    public static void main(String[] args) {
//         ---------- List: Library books ----------
        List<String> books = new ArrayList<>();
        books.add("Java Basics");
        books.add("Data Structures");
        books.add("Algorithms");
        System.out.println("Library books: " + books);

//         ---------- Set: Unique borrowed books ----------
        Set<String> borrowedBooks = new HashSet<>();
        borrowedBooks.add("Java Basics");
        borrowedBooks.add("Data Structures");
        borrowedBooks.add("Java Basics"); 
        System.out.println("Borrowed books (unique): " + borrowedBooks);

//         ---------- Queue: Borrow requests ----------
        Queue<String> borrowQueue = new LinkedList<>();
        borrowQueue.add("Nikhil");
        borrowQueue.add("Priyanshu");
        System.out.println("Next to borrow: " + borrowQueue.remove()); 

//         ---------- Stack: Recently returned books ----------
        Stack<String> returnedStack = new Stack<>();
        returnedStack.push("Algorithms");
        returnedStack.push("Data Structures");
        System.out.println("Last returned: " + returnedStack.pop());

//         ---------- Map: User to borrowed books ----------
        Map<String, String> userMap = new HashMap<>();
        userMap.put("Krish", "Java Basics");
        userMap.put("Eashwanth", "Data Structures");
        System.out.println("User borrowed books: " + userMap);
    }
}
