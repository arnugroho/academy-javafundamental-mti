package day2.latihan.utils;

import day2.latihan.utils.models.Balok;

public class BalokUtils implements BangunRuangInterface<Balok> {

	@Override
	public void hitungLuas(Balok object) {
		object.setLuas((2 * object.getLebar() * object.getTinggi()) 
				+ (2 * object.getLebar() * object.getPanjang())
				+ (2 * object.getPanjang() * object.getTinggi()));
	}

}
