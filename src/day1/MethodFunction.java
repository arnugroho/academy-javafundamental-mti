package day1;

import java.util.Scanner;

public class MethodFunction {

	public void cetakNama() {
		System.out.println("nama saya akbar");
	}

	public void cetakNama(String nama) {
		System.out.println("nama saya : " + nama);
	}
	
	public String getNama() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan nama : ");
		String nama = scan.next();
		scan.close();
		return nama;
	}
	
	public void printNama() {
		String nama = getNama();
		System.out.println("nama saya : " + nama);
	}
	
	public static void main(String[] args) {
		MethodFunction methodFunction = new MethodFunction();
		methodFunction.printNama();
	}

}
