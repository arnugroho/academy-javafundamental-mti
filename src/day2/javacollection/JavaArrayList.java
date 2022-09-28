package day2.javacollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JavaArrayList {
	public static void main(String[] args) {
		// Creating list using the ArrayList class
		// cannot use primitive types
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		// Add elements to the list
		numbers.add(3);
		numbers.add(1);
		numbers.add(7);
		System.out.println("List: " + numbers);

		// Access element from the list
		int number = numbers.get(2);
		System.out.println("Accessed Element: " + number);
		
		// sort
		numbers.sort(Comparator.naturalOrder());
		System.out.println("List: " + numbers);

		// Remove element from the list
		int removedNumber = numbers.remove(1);
		System.out.println("Removed Element: " + removedNumber);
		
		System.out.println("List: " + numbers);
		
		// searching - return boolean
		System.out.println(numbers.contains(7));
		
		Collections.shuffle(numbers);
		System.out.println("List: " + numbers);
	
		
	}

}
