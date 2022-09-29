package day2;

import java.util.Arrays;
import java.util.Collections;

public class SingleDimension {
	public static void main(String[] args) {
		Integer[] arr = new Integer[4];
		System.out.println(arr);
		
		// prints the length of the array
		System.out.println("length = " + arr.length);
		// fill in the 3rd index array 
		arr[2] = 3;
		// print the value from the 3rd index array System.out.println("value = " + arr[2]);
		// prints all values from the array
		System.out.println("all = " + Arrays.toString(arr));

		
		Integer[] intArr = {1,6,2,9};
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));

		
		Integer[] arrd = {7, 10, 4, 3, 20, 15};
		Arrays.sort(arrd, Collections.reverseOrder());
		
	}

}
