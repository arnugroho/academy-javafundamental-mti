package day1.tugas;

import java.util.Scanner;

public class Tugas1Cara2 {
	public void getBilangan() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan Bilangan Satu : ");
		int bilanganSatu = scan.nextInt();
		int bilanganDua = scan.nextInt();
		hitungBilangan(bilanganSatu, bilanganDua);
		scan.close();
	}
	
	public void hitungBilangan(int bilanganSatu, int bilanganDua) {
		System.out.println("Hasil Kali = " + bilanganSatu * bilanganDua);
	}
	
	public static void main(String[] args) {
		Tugas1Cara2 tugas = new Tugas1Cara2();
		tugas.getBilangan();
	}
}
