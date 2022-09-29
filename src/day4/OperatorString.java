package day4;

public class OperatorString {
	public static void main(String[] args) {

	    String greet = "Hello! ";
	    System.out.println("String: " + greet);

	    // mendapatkan panjang string
	    int length = greet.length();
	    System.out.println("Length: " + length);
	    
	    String world = "World";
	    // menggabungkan string
	    String joinConcat = greet.concat(world);
	    System.out.println(joinConcat);

	    // compare
	    String anotherWorld = "world";
	    System.out.println("compare case sensitif : " + world.equals(anotherWorld));
	    System.out.println("compare ignore case sensitif : " + world.equalsIgnoreCase(anotherWorld));
	}
}
