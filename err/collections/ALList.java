package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ALList {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);
        arrayList.remove("Banana");
        System.out.println("ArrayList after removal: " + arrayList);

        // LinkedList 
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Rabbit");
        System.out.println("LinkedList: " + linkedList);
        linkedList.addFirst("Horse");
        linkedList.addLast("Sheep");
        System.out.println("LinkedList after addFirst/addLast: " + linkedList);
        linkedList.removeLast();
        System.out.println("LinkedList after removeLast: " + linkedList);
    }
}

