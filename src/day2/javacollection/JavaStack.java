package day2.javacollection;

import java.util.Collections;
import java.util.Stack;

public class JavaStack {
	public static void main(String[] args) {
		Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Initial Stack: " + animals);

        // Remove element stacks
        String element = animals.pop();
        System.out.println("Removed Element: " + element);
        
        System.out.println("print Stack: " + animals);
        
        animals.add("Bird");
        System.out.println("print Stack: " + animals);
        
        animals.add(0, "Cat");
        System.out.println("print Stack: " + animals);
        
        Collections.sort(animals);
        System.out.println("print Stack: " + animals);
        
	}
}
