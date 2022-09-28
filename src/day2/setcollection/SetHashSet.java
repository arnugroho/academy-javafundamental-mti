package day2.setcollection;

import java.util.HashSet;

public class SetHashSet {
	public static void main(String[] args) {
		// default 16 and 0.75 load factor
		// HashSet with 4 capacity and 0.50 load factor
		HashSet<Integer> evenNumber = new HashSet<Integer>(10, 0.50f);

        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(8);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();
        
        // Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);
        
        

	}
}
