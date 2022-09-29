package day1.tugas;

import java.util.Scanner;

public class Tugas3 {
	public int n;

	public void getN() {
		Scanner s = new Scanner(System.in);
		System.out.println("Masukkan nilai n : ");
		this.n = s.nextInt();
		s.close();
	}

	public void cetakGanjil() {
		System.out.println("Mencetak Bilangan ganjil sepanjang : " + this.n);
		int counter = 0;
		int jumlahGanjil = 0;
		while (jumlahGanjil < this.n) {
			if (counter % 2 != 0) {
				System.out.printf("%3d", counter);
				jumlahGanjil++;
			}
			counter++;
		}
	}

	public void cetakGanjilFor() {
		System.out.println("Mencetak bilangan ganjil dari 0 ... " + this.n);
		for (int i = 0; i < this.n; i++) {
			if (i % 2 != 0) {
				System.out.printf("%3d", i);
			}
		}
	}

	public static void main(String[] args) {
		Tugas3 tugas = new Tugas3();
		tugas.getN();
		tugas.cetakGanjil();
		System.out.println();
		tugas.cetakGanjilFor();

	}

}
