package day1;

import java.util.Scanner;

public class JavaFundamental {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Masukkan namamu : ");
		// proses instansiasi object
		Scanner scanNama = new Scanner(System.in);
		String namaSaya = scanNama.next();
		System.out.println("Nama : " + namaSaya);
		scanNama.close();
	}
}
