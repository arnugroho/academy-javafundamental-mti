package day2;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ColQueue {
	public static void main(String[] args) {

		// Array implementation of Queue
//		ArrayDeque<String> animal2 = new ArrayDeque<>();

		// Priority Queue implementation of Queue
//		PriorityQueue<String> animal3 = new PriorityQueue<>();
		
		
		// Creating Queue using the PriorityQueue class
		/*
		 * retrieved in sorted order.
		 * heap data structure
		 */
		PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // offer elements to the Queue
//        numbers.offer(5);
        numbers.offer(1);
        numbers.offer(7);
        numbers.offer(9);
        numbers.offer(2);

        System.out.println("Queue: " + numbers);

        // Access elements of the Queue
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        // Remove elements from the Queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);
	}

}
