package collections;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
//		Stack 
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		System.out.println("Stack pop: " + stack.pop());

//      Queue 
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		System.out.println("Queue remove: " + queue.remove());

//      PriorityQueue
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(30);
		pq.add(10);
		pq.add(20);
		System.out.println("PriorityQueue poll: " + pq.poll());

//      ArrayDeque 
		ArrayDeque<String> deque = new ArrayDeque<>();
		deque.addFirst("Front");
		deque.addLast("Back");
		System.out.println("ArrayDeque removeFirst: " + deque.removeFirst());

//      HashSet
		HashSet<String> hs = new HashSet<>();
		hs.add("A");
		hs.add("B");
		hs.add("A");
		System.out.println("HashSet: " + hs);

//      HashMap
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		System.out.println("HashMap get(1): " + map.get(1));

//      TreeSet
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(5);
		ts.add(1);
		ts.add(3);
		System.out.println("TreeSet (sorted): " + ts);

//      LinkedHashSet 
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("X");
		lhs.add("Y");
		lhs.add("Z");
		System.out.println("LinkedHashSet (insertion order): " + lhs);

	}

}
