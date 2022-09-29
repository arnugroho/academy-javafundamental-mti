package day3.latinherit;

import day3.latinterface.BangunDatar;

public class Kubus extends BangunRuang {
	
	@Override
	public void hitungLuas() {
		System.out.println("Luas Kubus");
	}
	
	@Override
	public void hitungVolume() {
		System.out.println("volume Kubus");
	}

	@Override
	public void hitungKeliling() {
		// TODO Auto-generated method stub
		System.out.println(BangunDatar.PHI);
	}
}
