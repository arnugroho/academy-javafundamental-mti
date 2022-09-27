package day1.operator;

public class OperatorAssignment {
	public static void main(String[] args) {
		// create variables
	    int a = 4;
	    int var;

	    // assign value using =
	    var = a;
	    System.out.println("var using =: " + var);

	    // assign value using =+  :   var = var + a
	    var += a;
	    System.out.println("var using +=: " + var);

	    // assign value using =*  : var = var * a
	    var *= a;
	    System.out.println("var using *=: " + var);
	}

}
