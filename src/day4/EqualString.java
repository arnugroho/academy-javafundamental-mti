package day4;

public class EqualString {
	public static void main(String[] args) {
		// String Literal vs String Object
		String name1 = new String("Programiz");
	    String name2 = new String("Programiz");

	    System.out.println("cek apakah equal");

	    // check if two strings are equal
	    // using == operator
	    boolean result1 = (name1 == name2);
	    System.out.println("Using == operator: " + result1);

	    // using equals() method
	    boolean result2 = name1.equals(name2);
	    System.out.println("Using equals(): " + result2);
	    
	    
	    String alamat1 = "bogor";
	    String alamat2 = "bogor";
	    System.out.println(alamat1 == alamat2);
	    
	}
}
