package day2.latihan;

import day2.latihan.services.BangunRuangServices;
import day2.latihan.utils.models.Kubus;

public class RunMain {
	public static void main(String[] args) {
		
		BangunRuangServices bangunRuangServices = new BangunRuangServices();
		Kubus kubus = new Kubus();
//		kubus.sisi = 4;
		Kubus responseKubus = bangunRuangServices.buildKubus(kubus);
//		System.out.println(kubus.luas);
//		System.out.println(responseKubus.luas);
	}
}
