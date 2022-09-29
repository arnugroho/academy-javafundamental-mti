package day1;

public class Persegi {
	public Integer panjang;
	public int lebar = 4;
	public static double luas;
	public static final int BANYAK_SISI = 4;

	public void cetakLuas() {
		System.out.println(this.panjang * this.lebar);
	}

	public void cetakLuas(int lebar) {
		System.out.println(this.panjang * lebar);
	}

	public void cetakKeliling() {
		int panjang = 8;
		System.out.println(2 * (panjang + lebar));
	}
	
	public static void main(String[] args) {
		Persegi persegi = new Persegi();
		
		Integer data = 5;
		int i = 6;
		
		System.out.println(persegi.panjang);
	}
}
