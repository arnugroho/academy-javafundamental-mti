package day2.latihan;

import day2.latihan.services.BangunRuangServices;
import day2.latihan.utils.models.Kubus;

public class RunMain {
	public static void main(String[] args) {
		
		BangunRuangServices bangunRuangServices = new BangunRuangServices();
		Kubus kubus = new Kubus();
		kubus.setSisi(3);
		Kubus responseKubus = bangunRuangServices.buildKubus(kubus);
		
		System.out.println(kubus.getLuas());
		System.out.println(responseKubus.getLuas());
	}
}
