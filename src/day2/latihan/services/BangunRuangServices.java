package day2.latihan.services;

import day2.latihan.utils.BangunRuangUtil;
import day2.latihan.utils.models.Kubus;

public class BangunRuangServices {
	public Kubus buildKubus(Kubus kubus) {
		BangunRuangUtil.hitungLuas(kubus);
//		Kubus responseKubus = new Kubus();
//		responseKubus.sisi = kubus.sisi;
//		
//		BangunRuangUtil.hitungLuas(responseKubus);
		
		//Integer luas = BangunRuangUtil.hitungLuas(kubus.sisi);
		//kubus.luas = luas;
		return kubus;
	}

}
