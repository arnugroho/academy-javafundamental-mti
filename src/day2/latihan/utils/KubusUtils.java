package day2.latihan.utils;

import day2.latihan.utils.models.Kubus;

public class KubusUtils implements BangunRuangInterface<Kubus>{

	@Override
	public void hitungLuas(Kubus object) {
		object.setLuas(object.getSisi() * object.getSisi() * 6);
		
	}

}
