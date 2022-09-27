package day1.tugas;

import java.util.Scanner;

public class Tugas1Cara1 {
	public int bilanganSatu;
	public int bilanganDua;
	
	
	public void getBilangan() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan Bilangan Satu : ");
		this.bilanganSatu = scan.nextInt();
		this.bilanganDua = scan.nextInt();
		scan.close();
	}
	
	public void hitungBilangan() {
		getBilangan();
		System.out.println("Hasil Kali = " + this.bilanganSatu * this.bilanganDua);
	}
	
	public static void main(String[] args) {
		Tugas1Cara1 tugas = new Tugas1Cara1();
		tugas.hitungBilangan();
	}
}
