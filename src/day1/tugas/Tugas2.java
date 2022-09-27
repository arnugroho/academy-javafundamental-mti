package day1.tugas;

import java.util.Scanner;

public class Tugas2 {
	public int getN() {
		Scanner s = new Scanner(System.in);
		System.out.println("Masukkan Bilangan Bulat : ");
		int n = s.nextInt();
		s.close();
		return n;
	}

	public void getJenisBilangan() {
		int n = getN();
		if (n % 2 == 0) {
			System.out.println("Genap");
		} else {
			System.out.println("Ganjil");
		}

		if (n % 7 == 0) {
			System.out.println("Habis dibagi 7");
		}
	}
	
	public static void main(String[] args) {
		Tugas2 t = new Tugas2();
		t.getJenisBilangan();
	}
}
