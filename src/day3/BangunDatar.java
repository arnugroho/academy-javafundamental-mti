package day3;

public class BangunDatar {
	private Integer panjang;
	
	public BangunDatar(){
		
	}
	
	public BangunDatar(Integer panjang){
		this.panjang = panjang;
		System.out.println("Cetak defult Constructor");
	}
	
	public static void main(String[] args) {
		BangunDatar bangunDatar = new BangunDatar();
		System.out.println(EnumConstructor.MEDIUM);
	}

}
