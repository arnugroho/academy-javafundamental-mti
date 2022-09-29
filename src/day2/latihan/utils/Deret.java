package day2.latihan.utils;

import java.util.Arrays;

public class Deret {
	public static Integer[] bilanganFibo(int n) {
		Integer[] bil = new Integer[n];
		for(int i = 0; i < n ; i++) {
			if(i < 2) {
				bil[i] = 1;
			} else {
				bil[i] = bil[i-1] + bil[i-2];
			}
		}
		
		return bil;
	}
	
	public static String[] polaHuruf(int n) {
		Integer[] bilFiibo = bilanganFibo(n);
		String[] deret = new String[n];
		char c = 'A';
		for(int i = 0; i < n ; i++) {
			if(i%2 == 0) {
				deret[i] = bilFiibo[i].toString();
			} else {
				deret[i] = String.valueOf(c++);
			}
		}
		
		return deret;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(Deret.bilanganFibo(5)));
		System.out.println(Arrays.toString(Deret.polaHuruf(8)));
	}

}
