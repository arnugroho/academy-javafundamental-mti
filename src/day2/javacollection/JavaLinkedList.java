package day2.javacollection;

import java.util.Iterator;
import java.util.LinkedList;

public class JavaLinkedList {
	public static void main(String[] args) {
		 // Creating list using the LinkedList class
		LinkedList<Integer> numbers = new LinkedList<>();

        // Add elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List: " + numbers);

        // Access element from the list
        int number = numbers.get(2);
        System.out.println("Accessed Element: " + number);

        // Using the indexOf() method
        int index = numbers.indexOf(2);
        System.out.println("Position of 3 is " + index);

        // Remove element from the list
        int removedNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removedNumber);
        
        System.out.println("List: " + numbers);
        
        Iterator<Integer> iterate = numbers.iterator();
        System.out.print("LinkedList: ");

        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
	}

}
