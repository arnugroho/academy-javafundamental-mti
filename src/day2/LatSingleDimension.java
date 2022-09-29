package day2;

import java.util.Arrays;
import java.util.Scanner;

public class LatSingleDimension {
	public int getN() {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Masukkan nilai n : ");
		int n = scan.nextInt();
		scan.close();
		return n;
	}
	
	public void isiArray() {
		int n = getN();
		Integer[] arrInt = new Integer[n];
		System.out.print("Panjang Array : ");
		System.out.println(arrInt.length);
		
		
		for(int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i+1;
		}
		
		for(int data: arrInt) {
			System.out.println(data);
		}
		
		System.out.println(Arrays.toString(arrInt));
	}
	
	public static void main(String[] args) {
		LatSingleDimension lat = new LatSingleDimension();
		lat.isiArray();
	}

}
